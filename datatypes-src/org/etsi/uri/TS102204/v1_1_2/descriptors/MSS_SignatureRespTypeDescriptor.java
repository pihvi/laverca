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

import org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType;

/**
 * Class MSS_SignatureRespTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class MSS_SignatureRespTypeDescriptor extends org.etsi.uri.TS102204.v1_1_2.descriptors.MessageAbstractTypeDescriptor {


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

    public MSS_SignatureRespTypeDescriptor() {
        super();
        setExtendsWithoutFlatten(new org.etsi.uri.TS102204.v1_1_2.descriptors.MessageAbstractTypeDescriptor());
        _nsURI = "http://uri.etsi.org/TS102204/v1.1.2#";
        _xmlName = "MSS_SignatureRespType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _MSSP_TransID
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.String.class, "_MSSP_TransID", "MSSP_TransID", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                return target.getMSSP_TransID();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                    target.setMSSP_TransID( (java.lang.String) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new java.lang.String();
            }
        };
        desc.setSchemaType("NCName");
        desc.setHandler(handler);
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _MSSP_TransID
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
            org.exolab.castor.xml.validators.NameValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.NameValidator(
                org.exolab.castor.xml.XMLConstants.NAME_TYPE_NCNAME);
            fieldValidator.setValidator(typeValidator);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _mobileUser
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.MobileUser.class, "_mobileUser", "MobileUser", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                return target.getMobileUser();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                    target.setMobileUser( (org.etsi.uri.TS102204.v1_1_2.MobileUser) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.MobileUser");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _mobileUser
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _MSS_Signature
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.MSS_Signature.class, "_MSS_Signature", "MSS_Signature", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                return target.getMSS_Signature();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                    target.setMSS_Signature( (org.etsi.uri.TS102204.v1_1_2.MSS_Signature) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.MSS_Signature");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _MSS_Signature
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _signatureProfile
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.SignatureProfile.class, "_signatureProfile", "SignatureProfile", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                return target.getSignatureProfile();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                    target.setSignatureProfile( (org.etsi.uri.TS102204.v1_1_2.SignatureProfile) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.SignatureProfile");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _signatureProfile
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _status
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.Status.class, "_status", "Status", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                return target.getStatus();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    MSS_SignatureRespType target = (MSS_SignatureRespType) object;
                    target.setStatus( (org.etsi.uri.TS102204.v1_1_2.Status) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.Status");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _status
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
        return org.etsi.uri.TS102204.v1_1_2.MSS_SignatureRespType.class;
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
