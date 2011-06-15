package fi.laverca.ws;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.ser.castor.CastorDeserializerFactory;
import org.apache.axis.encoding.ser.castor.CastorSerializerFactory;

public class MSS_SignatureBindingStub extends org.apache.axis.client.Stub
implements MSS_SignaturePortType
{
    private java.util.Vector<Class>  cachedSerClasses     = new java.util.Vector<Class>();
    private java.util.Vector<QName>  cachedSerQNames      = new java.util.Vector<QName>();
    private java.util.Vector<Object> cachedSerFactories   = new java.util.Vector<Object>();
    private java.util.Vector<Object> cachedDeserFactories = new java.util.Vector<Object>();

    static OperationDesc [] _operations;

    static {
        _operations = new OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        OperationDesc oper;
        oper = new OperationDesc();
        oper.setName("MSS_Signature");
        oper.addParameter(new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureReq"),
                          new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureReqType"),
                          org.etsi.uri.TS102204.v1_1_2.MSS_SignatureReq.class,
                          ParameterDesc.IN, false, false);
        oper.setReturnType(new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureRespType"));
        oper.setReturnClass(org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType.class);
        oper.setReturnQName(new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureResp"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public MSS_SignatureBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public MSS_SignatureBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public MSS_SignatureBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        Class cls;
        QName qName;
        Class beansf = CastorSerializerFactory.class;
        Class beandf = CastorDeserializerFactory.class;

        //
        // NOTE: Because of Castor serialization and deserialization only top level types needs to be mapped.
        //       The castor marshalling takes care of the rest.
        //
        qName = new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_MessageSignature");
        cachedSerQNames.add(qName);
        cls = org.etsi.uri.TS102204.v1_1_2.MSS_MessageSignature.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureReqType");
        cachedSerQNames.add(qName);
        cls = org.etsi.uri.TS102204.v1_1_2.MSS_SignatureReq.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new QName("http://uri.etsi.org/TS102204/v1.1.2#", "MSS_SignatureRespType");
        cachedSerQNames.add(qName);
        cls = org.etsi.uri.TS102204.v1_1_2.MSS_SignatureResp.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);
    }

    protected Call createCall() throws java.rmi.RemoteException {
        try {
            if (super._call == null)
                super._call = super._createCall();

            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls   = (Class) cachedSerClasses.get(i);
                        QName qName = (QName) cachedSerQNames.get(i);
                        Class sf    = (Class) cachedSerFactories.get(i);
                        Class df    = (Class) cachedDeserFactories.get(i);
                        _call.registerTypeMapping(cls, qName, sf, df, false);
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType MSS_Signature(org.etsi.uri.TS102204.v1_1_2.MSS_SignatureReqType MSS_SignatureReq) throws java.rmi.RemoteException {

        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setEncodingStyle(null);
        _call.setProperty(Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new QName("", "MSS_Signature"));

        setRequestHeaders(_call);
        setAttachments(_call);
        Object _resp = _call.invoke(new Object[] {MSS_SignatureReq});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType) _resp;
            } catch (Exception _exception) {
                return (org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType) org.apache.axis.utils.JavaUtils.convert(_resp, org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType.class);
            }
        }
    }
}
