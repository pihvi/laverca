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

import org.etsi.uri.TS102204.v1_1_2.AdditionalServiceType;

/**
 * Class AdditionalServiceTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class AdditionalServiceTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public AdditionalServiceTypeDescriptor() {
        super();
        _nsURI = "http://uri.etsi.org/TS102204/v1.1.2#";
        _xmlName = "AdditionalServiceType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _description
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.Description.class, "_description", "Description", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AdditionalServiceType target = (AdditionalServiceType) object;
                return target.getDescription();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AdditionalServiceType target = (AdditionalServiceType) object;
                    target.setDescription( (org.etsi.uri.TS102204.v1_1_2.Description) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.Description");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setRequired(true);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _description
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        fieldValidator.setMinOccurs(1);
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _entity
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.Entity.class, "_entity", "Entity", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AdditionalServiceType target = (AdditionalServiceType) object;
                return target.getEntity();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AdditionalServiceType target = (AdditionalServiceType) object;
                    target.setEntity( (org.etsi.uri.TS102204.v1_1_2.Entity) value);
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
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.Entity");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _entity
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _additionalServiceTypeChoice
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.etsi.uri.TS102204.v1_1_2.AdditionalServiceTypeChoice.class, "_additionalServiceTypeChoice", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AdditionalServiceType target = (AdditionalServiceType) object;
                return target.getAdditionalServiceTypeChoice();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AdditionalServiceType target = (AdditionalServiceType) object;
                    target.setAdditionalServiceTypeChoice( (org.etsi.uri.TS102204.v1_1_2.AdditionalServiceTypeChoice) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.etsi.uri.TS102204.v1_1_2.AdditionalServiceTypeChoice();
            }
        };
        desc.setSchemaType("org.etsi.uri.TS102204.v1_1_2.AdditionalServiceTypeChoice");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.etsi.uri.TS102204.v1_1_2.descriptors.AdditionalServiceTypeChoiceDescriptor());
        desc.setNameSpaceURI("http://uri.etsi.org/TS102204/v1.1.2#");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _additionalServiceTypeChoice
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
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
        return org.etsi.uri.TS102204.v1_1_2.AdditionalServiceType.class;
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
