/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.etsi.uri.TS102204.v1_1_2.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.etsi.uri.TS102204.v1_1_2.MSS_HandshakeReqType;

/**
 * Class MSS_HandshakeReqTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class MSS_HandshakeReqTypeDescriptor extends org.etsi.uri.TS102204.v1_1_2.descriptors.MessageAbstractTypeDescriptor {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public MSS_HandshakeReqTypeDescriptor() {
        super();
        setExtendsWithoutFlatten(new org.etsi.uri.TS102204.v1_1_2.descriptors.MessageAbstractTypeDescriptor());
        _nsURI = "http://uri.etsi.org/TS102204/v1.1.2#";
        _xmlName = "MSS_HandshakeReqType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _secureMethods
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.SecureMethods.class, "_secureMethods", "SecureMethods", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                return target.getSecureMethods();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                    target.setSecureMethods( (org.etsi.uri.TS102204.v1_1_2.SecureMethods) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.SecureMethods");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _secureMethods
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _certificates
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.Certificates.class, "_certificates", "Certificates", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                return target.getCertificates();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                    target.setCertificates( (org.etsi.uri.TS102204.v1_1_2.Certificates) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.Certificates");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _certificates
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _rootCAs
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.RootCAs.class, "_rootCAs", "RootCAs", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                return target.getRootCAs();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                    target.setRootCAs( (org.etsi.uri.TS102204.v1_1_2.RootCAs) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.RootCAs");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _rootCAs
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _signatureAlgList
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.SignatureAlgList.class, "_signatureAlgList", "SignatureAlgList", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                return target.getSignatureAlgList();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_HandshakeReqType target = (MSS_HandshakeReqType) object;
                    target.setSignatureAlgList( (org.etsi.uri.TS102204.v1_1_2.SignatureAlgList) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.SignatureAlgList");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _signatureAlgList
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        if (_identity == null) {
            return super.getIdentity();
        }
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return org.etsi.uri.TS102204.v1_1_2.MSS_HandshakeReqType.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
