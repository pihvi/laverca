/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id$
 */

package oasis.names.tc.SAML.v2_0.protocol.types;

/**
 * Enumeration AuthnContextComparisonType.
 * 
 * @version $Revision$ $Date$
 */
public enum AuthnContextComparisonType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant EXACT
     */
    EXACT("exact"),
    /**
     * Constant MINIMUM
     */
    MINIMUM("minimum"),
    /**
     * Constant MAXIMUM
     */
    MAXIMUM("maximum"),
    /**
     * Constant BETTER
     */
    BETTER("better");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, AuthnContextComparisonType> enumConstants = new java.util.HashMap<java.lang.String, AuthnContextComparisonType>();


    static {
        for (AuthnContextComparisonType c: AuthnContextComparisonType.values()) {
            AuthnContextComparisonType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private AuthnContextComparisonType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static oasis.names.tc.SAML.v2_0.protocol.types.AuthnContextComparisonType fromValue(
            final java.lang.String value) {
        AuthnContextComparisonType c = AuthnContextComparisonType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
