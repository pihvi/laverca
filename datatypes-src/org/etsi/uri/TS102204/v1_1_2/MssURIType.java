/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.etsi.uri.TS102204.v1_1_2;

/**
 * Class MssURIType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public abstract class MssURIType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mssURI.
     */
    private java.lang.String _mssURI;

    /**
     * Field _digestAlgAndValue.
     */
    private org.etsi.uri.TS102204.v1_1_2.DigestAlgAndValue _digestAlgAndValue;

    /**
     * Field _anyObject.
     */
    private java.util.List<java.lang.Object> _anyObject;


      //----------------/
     //- Constructors -/
    //----------------/

    public MssURIType() {
        super();
        this._anyObject = new java.util.ArrayList<java.lang.Object>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAnyObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAnyObject(
            final java.lang.Object vAnyObject)
    throws java.lang.IndexOutOfBoundsException {
        this._anyObject.add(vAnyObject);
    }

    /**
     * 
     * 
     * @param index
     * @param vAnyObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAnyObject(
            final int index,
            final java.lang.Object vAnyObject)
    throws java.lang.IndexOutOfBoundsException {
        this._anyObject.add(index, vAnyObject);
    }

    /**
     * Method enumerateAnyObject.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.Object> enumerateAnyObject(
    ) {
        return java.util.Collections.enumeration(this._anyObject);
    }

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

        if (obj instanceof MssURIType) {

            MssURIType temp = (MssURIType)obj;
            boolean thcycle;
            boolean tmcycle;
            if (this._mssURI != null) {
                if (temp._mssURI == null) return false;
                if (this._mssURI != temp._mssURI) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._mssURI);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._mssURI);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mssURI); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mssURI); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._mssURI.equals(temp._mssURI)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mssURI);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mssURI);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._mssURI);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._mssURI);
                    }
                }
            } else if (temp._mssURI != null)
                return false;
            if (this._digestAlgAndValue != null) {
                if (temp._digestAlgAndValue == null) return false;
                if (this._digestAlgAndValue != temp._digestAlgAndValue) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._digestAlgAndValue);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._digestAlgAndValue);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._digestAlgAndValue); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._digestAlgAndValue); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._digestAlgAndValue.equals(temp._digestAlgAndValue)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._digestAlgAndValue);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._digestAlgAndValue);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._digestAlgAndValue);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._digestAlgAndValue);
                    }
                }
            } else if (temp._digestAlgAndValue != null)
                return false;
            if (this._anyObject != null) {
                if (temp._anyObject == null) return false;
                if (this._anyObject != temp._anyObject) {
                    thcycle=org.castor.core.util.CycleBreaker.startingToCycle(this._anyObject);
                    tmcycle=org.castor.core.util.CycleBreaker.startingToCycle(temp._anyObject);
                    if (thcycle!=tmcycle) {
                        if (!thcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(this._anyObject); };
                        if (!tmcycle) { org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._anyObject); };
                        return false;
                    }
                    if (!thcycle) {
                        if (!this._anyObject.equals(temp._anyObject)) {
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(this._anyObject);
                            org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._anyObject);
                            return false;
                        }
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(this._anyObject);
                        org.castor.core.util.CycleBreaker.releaseCycleHandle(temp._anyObject);
                    }
                }
            } else if (temp._anyObject != null)
                return false;
            return true;
        }
        return false;
    }

    /**
     * Method getAnyObject.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.Object at the given index
     */
    public java.lang.Object getAnyObject(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._anyObject.size()) {
            throw new IndexOutOfBoundsException("getAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
        }

        return (java.lang.Object) _anyObject.get(index);
    }

    /**
     * Method getAnyObject.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.Object[] getAnyObject(
    ) {
        java.lang.Object[] array = new java.lang.Object[0];
        return (java.lang.Object[]) this._anyObject.toArray(array);
    }

    /**
     * Method getAnyObjectCount.
     * 
     * @return the size of this collection
     */
    public int getAnyObjectCount(
    ) {
        return this._anyObject.size();
    }

    /**
     * Returns the value of field 'digestAlgAndValue'.
     * 
     * @return the value of field 'DigestAlgAndValue'.
     */
    public org.etsi.uri.TS102204.v1_1_2.DigestAlgAndValue getDigestAlgAndValue(
    ) {
        return this._digestAlgAndValue;
    }

    /**
     * Returns the value of field 'mssURI'.
     * 
     * @return the value of field 'MssURI'.
     */
    public java.lang.String getMssURI(
    ) {
        return this._mssURI;
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
        int result = 17;

        long tmp;
        if (_mssURI != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_mssURI)) {
           result = 37 * result + _mssURI.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_mssURI);
        }
        if (_digestAlgAndValue != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_digestAlgAndValue)) {
           result = 37 * result + _digestAlgAndValue.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_digestAlgAndValue);
        }
        if (_anyObject != null
               && !org.castor.core.util.CycleBreaker.startingToCycle(_anyObject)) {
           result = 37 * result + _anyObject.hashCode();
           org.castor.core.util.CycleBreaker.releaseCycleHandle(_anyObject);
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
     * Method iterateAnyObject.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.Object> iterateAnyObject(
    ) {
        return this._anyObject.iterator();
    }

    /**
     */
    public void removeAllAnyObject(
    ) {
        this._anyObject.clear();
    }

    /**
     * Method removeAnyObject.
     * 
     * @param vAnyObject
     * @return true if the object was removed from the collection.
     */
    public boolean removeAnyObject(
            final java.lang.Object vAnyObject) {
        boolean removed = _anyObject.remove(vAnyObject);
        return removed;
    }

    /**
     * Method removeAnyObjectAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.Object removeAnyObjectAt(
            final int index) {
        java.lang.Object obj = this._anyObject.remove(index);
        return (java.lang.Object) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAnyObject
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAnyObject(
            final int index,
            final java.lang.Object vAnyObject)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._anyObject.size()) {
            throw new IndexOutOfBoundsException("setAnyObject: Index value '" + index + "' not in range [0.." + (this._anyObject.size() - 1) + "]");
        }

        this._anyObject.set(index, vAnyObject);
    }

    /**
     * 
     * 
     * @param vAnyObjectArray
     */
    public void setAnyObject(
            final java.lang.Object[] vAnyObjectArray) {
        //-- copy array
        _anyObject.clear();

        for (int i = 0; i < vAnyObjectArray.length; i++) {
                this._anyObject.add(vAnyObjectArray[i]);
        }
    }

    /**
     * Sets the value of field 'digestAlgAndValue'.
     * 
     * @param digestAlgAndValue the value of field
     * 'digestAlgAndValue'.
     */
    public void setDigestAlgAndValue(
            final org.etsi.uri.TS102204.v1_1_2.DigestAlgAndValue digestAlgAndValue) {
        this._digestAlgAndValue = digestAlgAndValue;
    }

    /**
     * Sets the value of field 'mssURI'.
     * 
     * @param mssURI the value of field 'mssURI'.
     */
    public void setMssURI(
            final java.lang.String mssURI) {
        this._mssURI = mssURI;
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
