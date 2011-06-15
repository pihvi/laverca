package fi.laverca;

import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import javax.naming.InvalidNameException;
import javax.naming.ldap.LdapName;
import javax.naming.ldap.Rdn;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERInteger;
import org.bouncycastle.asn1.DERObject;
import org.bouncycastle.asn1.DERObjectIdentifier;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.IssuerAndSerialNumber;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.SignedData;
import org.bouncycastle.asn1.pkcs.SignerInfo;
import org.bouncycastle.asn1.x509.X509Name;


/** 
 * A PKCS7 SignedData element.
 */ 
public class FiComPkcs7 {
    private static final Log log = LogFactory.getLog(FiComPkcs7.class);

    private SignedData _sd;

    /** 
     * @param bytes In general, you get this from an MSS_SignatureResp.getSignature() call.
     * @throws IllegalArgumentException
     */
    public FiComPkcs7(byte[] bytes) throws IllegalArgumentException {
        if(bytes == null) {
            throw new IllegalArgumentException("can't construct a PKCS7 SignedData element from null input.");
        }

        this._sd = bytesToPkcs7SignedData(bytes);

        if(this._sd.getSignerInfos() == null || this._sd.getSignerInfos().size() != 1) {
            throw new IllegalArgumentException("This only works with exactly one SignerInfo.");
        }
    }

    /**
     * Look up the Certificate of the signer of this signature. 
     * Note that this only looks up the first signer. In MSSP signatures,
     * there is only one, but in a general Pkcs7 case, there can be several.
     * 
     */
    public X509Certificate getSignerCert() throws FiComException {

        try {
            List<X509Certificate> allSignerCerts = getSignerCerts(this._sd);
            return allSignerCerts.get(0);
        }
        catch(RuntimeException e) {
            log.error("", e);
            throw new FiComException(e);
        }
        
    }

    /**
     * Convenience method. Equivalent to calling getSignerCert and
     * then parsing out the CN from the certificate's Subject field.
     * @return null if there's a problem.
     */
    public String getSignerCn() {
        try {
            X509Certificate signerCert = this.getSignerCert();
            String dn = signerCert.getSubjectX500Principal().getName();

            //System.out.println("getSignerCn");
            //System.out.println(dn);
            String cn = null;
            try {
                LdapName ldapDn = new LdapName(dn);
                List<Rdn> rdns = ldapDn.getRdns();
                for(Rdn r : rdns) {
                    //System.out.println(r.getType());
                    //System.out.println(r.getValue());
                    if("CN".equals(r.getType())) {
                        cn = r.getValue().toString();
                    }
                }
            }
            catch(InvalidNameException e) {
                // TODO
            }

            return cn;
        }
        catch(Throwable t) {
            log.error("",t);
            return null;
        }
    }

    public static SignedData bytesToPkcs7SignedData(byte[] bytes) {

        if(bytes == null) {
            throw new IllegalArgumentException("null bytes");
        }

        ASN1InputStream ais = new ASN1InputStream(bytes);
        DERObject der = null;
        try {
            der = ais.readObject();
        }
        catch(IOException ioe) {
            throw new IllegalArgumentException("not a pkcs7 signature");
        }

        ContentInfo ci = ContentInfo.getInstance(der);

        DERObjectIdentifier typeId = ci.getContentType();
        if( ! typeId.equals(PKCSObjectIdentifiers.signedData)) {
            throw new IllegalArgumentException("not a pkcs7 signature");
        }

        SignedData sd = SignedData.getInstance(ci.getContent());

        return sd;
    }

    /**
     * Return the certificates used to sign a PKCS7 SignedData.
     */
    public static List<X509Certificate> getSignerCerts(SignedData sd) {

        // 0. Setup. 
        // 1. Read PKCS7.Certificates to get all possible certs.
        // 2. Read PKCS7.SignerInfo to get all signers.
        // 3. Look up matching certificates.
        // 4. Return the list.

        // 0. Setup. 
        if(sd == null) {
            throw new IllegalArgumentException("null input");
        }
        LinkedList<X509Certificate> signerCerts = new LinkedList<X509Certificate>();

        // 1. Read PKCS7.Certificates to get all possible certs.
        log.debug("read all certs");
        List<X509Certificate> certs = readCerts(sd);
        // In FiCom signatures, there's only one cert
        if(certs.size() != 1) {
            throw new IllegalArgumentException("#certs != 1");
        }

        // 2. Read PKCS7.SignerInfo to get all signers.
        log.debug("read signerinfo");
        List<SignerInfo> signerInfos = readSignerInfos(sd);

        // 3. Verify that signerInfo cert details match the cert on hand
        log.debug("matching cert and signerinfo details");
        for(SignerInfo si : signerInfos) {
            String siIssuer = readIssuer(si);
            String siSerial = readSerial(si);

            X509Certificate theCert = certs.get(0);
            String cIssuer = theCert.getIssuerDN().toString();
            String cSerial = theCert.getSerialNumber().toString();

            if(dnsEqual(siIssuer, cIssuer) && siSerial.equals(cSerial)) {
                signerCerts.add(theCert);
            }
            else {
                log.debug("cert does not match signerinfo");
                log.debug(siIssuer);
                log.debug(siSerial);
                log.debug(cIssuer);
                log.debug(cSerial);
            }
        }

        // 4. Return the list.
        log.debug("returning "+signerCerts.size()+" certs");
        return signerCerts;
    }

    public static List<X509Certificate> readCerts(SignedData sd) {
        if(sd == null) {
            return null;
        }

        LinkedList<X509Certificate> certs = new LinkedList<X509Certificate>();

        ASN1Set certSet = sd.getCertificates();
        Enumeration e = certSet.getObjects();
        while(e.hasMoreElements()) {
            Object o = e.nextElement();
            try {
                byte[] certDer = ((DERSequence)o).getEncoded();
                X509Certificate cert = X509Util.DERtoX509Certificate(certDer);
                certs.add(cert);
            }
            catch(IOException e2) {
                // TODO
            }
        }

        //for(X509Certificate c : certs) {
        //    System.out.println(c);
        //}

        return certs;
    }

    public static List<SignerInfo> readSignerInfos(SignedData sd) {
        if(sd == null) {
            return null;
        }

        LinkedList<SignerInfo> signerInfos = new LinkedList<SignerInfo>();

        ASN1Set siSet = sd.getSignerInfos();
        Enumeration e = siSet.getObjects();
        while(e.hasMoreElements()) {
            Object o = e.nextElement();
            try {
                //byte[] siDer = ((DERSequence)o).getEncoded();
                SignerInfo si = SignerInfo.getInstance(o);
                signerInfos.add(si);
            }
            catch(RuntimeException ex) {
                // TODO
            }
        }

        //for(SignerInfo si : signerInfos) {
        //    System.out.println("issuer "+readIssuer(si));
        //    System.out.println("serial "+readSerial(si));
        //}

        return signerInfos;
    }

    public static String readSerial(SignerInfo si) {
        if(si == null) {
            return null;
        }

        IssuerAndSerialNumber ias = si.getIssuerAndSerialNumber();

        DERInteger serialDER  = ias.getCertificateSerialNumber();
        X509Name   issuerName = ias.getName();

        return serialDER.getPositiveValue().toString();
    }

    public static String readIssuer(SignerInfo si) {
        if(si == null) {
            return null;
        }

        IssuerAndSerialNumber ias = si.getIssuerAndSerialNumber();

        DERInteger serialDER  = ias.getCertificateSerialNumber();
        X509Name   issuerName = ias.getName();

        return issuerName.toString();
    }


    /** Return true if two Distinguished Names are equal, ignoring 
     *  delimiters and order of elements.
     */
    public static boolean dnsEqual(String dn1, String dn2) {
        if(dn1 == null || dn2 == null) {
            return false;
        }

        X509Name n1 = new X509Name(dn1);
        X509Name n2 = new X509Name(dn2);

        //System.out.println("comparing n1 with n2 "+n1+" "+n2);
        boolean eq = n1.equals(n2, false);
        //System.out.println(" "+eq);

        return eq;
    }

}
