/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.etsi.uri.TS102204.v1_1_2;

/**
 * Class MSS_RegistrationReqType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class MSS_RegistrationReqType extends org.etsi.uri.TS102204.v1_1_2.MessageAbstractType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mobileUser.
     */
    private org.etsi.uri.TS102204.v1_1_2.MobileUser _mobileUser;

    /**
     * Field _encryptedData.
     */
    private org.etsi.uri.TS102204.v1_1_2.EncryptedData _encryptedData;

    /**
     * Field _encryptResponseBy.
     */
    private java.lang.String _encryptResponseBy;

    /**
     * Field _certificateURI.
     */
    private java.lang.String _certificateURI;

    /**
     * Field _x509Certificate.
     */
    private byte[] _x509Certificate;


      //----------------/
     //- Constructors -/
    //----------------/

    public MSS_RegistrationReqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Overrides the java.lang.Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override()
    public boolean equals(
            final java.lang.Object obj) {
        if ( this == obj )
            return true;

        if (super.equals(obj)==false)
            return false;

        if (obj instanceof MSS_RegistrationReqType) {

            MSS_RegistrationReqType temp = (MSS_RegistrationReqType)obj;
            boolean thcycle;
            boolean tmcycle;
            if (this._mobileUser != null) {
                if (temp._mobileUser == null) return false;
                if (this._mobileUser != temp._mobileUser) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._mobileUser);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._mobileUser);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mobileUser); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mobileUser); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._mobileUser.equals(temp._mobileUser)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mobileUser);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mobileUser);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mobileUser);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mobileUser);
                    }
                }
            } else if (temp._mobileUser != null)
                return false;
            if (this._encryptedData != null) {
                if (temp._encryptedData == null) return false;
                if (this._encryptedData != temp._encryptedData) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._encryptedData);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._encryptedData);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptedData); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptedData); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._encryptedData.equals(temp._encryptedData)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptedData);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptedData);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptedData);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptedData);
                    }
                }
            } else if (temp._encryptedData != null)
                return false;
            if (this._encryptResponseBy != null) {
                if (temp._encryptResponseBy == null) return false;
                if (this._encryptResponseBy != temp._encryptResponseBy) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._encryptResponseBy);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._encryptResponseBy);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptResponseBy); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptResponseBy); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._encryptResponseBy.equals(temp._encryptResponseBy)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptResponseBy);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptResponseBy);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._encryptResponseBy);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._encryptResponseBy);
                    }
                }
            } else if (temp._encryptResponseBy != null)
                return false;
            if (this._certificateURI != null) {
                if (temp._certificateURI == null) return false;
                if (this._certificateURI != temp._certificateURI) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._certificateURI);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._certificateURI);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._certificateURI); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._certificateURI); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._certificateURI.equals(temp._certificateURI)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._certificateURI);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._certificateURI);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._certificateURI);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._certificateURI);
                    }
                }
            } else if (temp._certificateURI != null)
                return false;
            if (this._x509Certificate != null) {
                if (temp._x509Certificate == null) return false;
                if (this._x509Certificate != temp._x509Certificate) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._x509Certificate);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._x509Certificate);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._x509Certificate); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._x509Certificate); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!java.util.Arrays.equals(this._x509Certificate, temp._x509Certificate)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._x509Certificate);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._x509Certificate);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._x509Certificate);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._x509Certificate);
                    }
                }
            } else if (temp._x509Certificate != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Returns the value of field 'certificateURI'.
     * 
     * @return the value of field 'CertificateURI'.
     */
    public java.lang.String getCertificateURI(
    ) {
        return this._certificateURI;
    }

    /**
     * Returns the value of field 'encryptResponseBy'.
     * 
     * @return the value of field 'EncryptResponseBy'.
     */
    public java.lang.String getEncryptResponseBy(
    ) {
        return this._encryptResponseBy;
    }

    /**
     * Returns the value of field 'encryptedData'.
     * 
     * @return the value of field 'EncryptedData'.
     */
    public org.etsi.uri.TS102204.v1_1_2.EncryptedData getEncryptedData(
    ) {
        return this._encryptedData;
    }

    /**
     * Returns the value of field 'mobileUser'.
     * 
     * @return the value of field 'MobileUser'.
     */
    public org.etsi.uri.TS102204.v1_1_2.MobileUser getMobileUser(
    ) {
        return this._mobileUser;
    }

    /**
     * Returns the value of field 'x509Certificate'.
     * 
     * @return the value of field 'X509Certificate'.
     */
    public byte[] getX509Certificate(
    ) {
        return this._x509Certificate;
    }

    /**
     * Overrides the java.lang.Object.hashCode method.
     * <p>
     * The following steps came from <b>Effective Java Programming
     * Language Guide</b> by Joshua Bloch, Chapter 3
     * 
     * @return a hash code value for the object.
     */
    public int hashCode(
    ) {
        int result = super.hashCode();

        long tmp;
        if (_mobileUser != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_mobileUser)) {
           result = 37 * result + _mobileUser.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_mobileUser);
        }
        if (_encryptedData != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_encryptedData)) {
           result = 37 * result + _encryptedData.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_encryptedData);
        }
        if (_encryptResponseBy != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_encryptResponseBy)) {
           result = 37 * result + _encryptResponseBy.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_encryptResponseBy);
        }
        if (_certificateURI != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_certificateURI)) {
           result = 37 * result + _certificateURI.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_certificateURI);
        }
        if (_x509Certificate != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_x509Certificate)) {
           result = 37 * result + _x509Certificate.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_x509Certificate);
        }

        return result;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * Sets the value of field 'certificateURI'.
     * 
     * @param certificateURI the value of field 'certificateURI'.
     */
    public void setCertificateURI(
            final java.lang.String certificateURI) {
        this._certificateURI = certificateURI;
    }

    /**
     * Sets the value of field 'encryptResponseBy'.
     * 
     * @param encryptResponseBy the value of field
     * 'encryptResponseBy'.
     */
    public void setEncryptResponseBy(
            final java.lang.String encryptResponseBy) {
        this._encryptResponseBy = encryptResponseBy;
    }

    /**
     * Sets the value of field 'encryptedData'.
     * 
     * @param encryptedData the value of field 'encryptedData'.
     */
    public void setEncryptedData(
            final org.etsi.uri.TS102204.v1_1_2.EncryptedData encryptedData) {
        this._encryptedData = encryptedData;
    }

    /**
     * Sets the value of field 'mobileUser'.
     * 
     * @param mobileUser the value of field 'mobileUser'.
     */
    public void setMobileUser(
            final org.etsi.uri.TS102204.v1_1_2.MobileUser mobileUser) {
        this._mobileUser = mobileUser;
    }

    /**
     * Sets the value of field 'x509Certificate'.
     * 
     * @param x509Certificate the value of field 'x509Certificate'.
     */
    public void setX509Certificate(
            final byte[] x509Certificate) {
        this._x509Certificate = x509Certificate;
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
