/**
 * FindSickEmployeesFrom2004Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FindSickEmployeesFrom2004Response  implements java.io.Serializable {
    private java.lang.Object[][] findSickEmployeesFrom2004Result;

    public FindSickEmployeesFrom2004Response() {
    }

    public FindSickEmployeesFrom2004Response(
           java.lang.Object[][] findSickEmployeesFrom2004Result) {
           this.findSickEmployeesFrom2004Result = findSickEmployeesFrom2004Result;
    }


    /**
     * Gets the findSickEmployeesFrom2004Result value for this FindSickEmployeesFrom2004Response.
     * 
     * @return findSickEmployeesFrom2004Result
     */
    public java.lang.Object[][] getFindSickEmployeesFrom2004Result() {
        return findSickEmployeesFrom2004Result;
    }


    /**
     * Sets the findSickEmployeesFrom2004Result value for this FindSickEmployeesFrom2004Response.
     * 
     * @param findSickEmployeesFrom2004Result
     */
    public void setFindSickEmployeesFrom2004Result(java.lang.Object[][] findSickEmployeesFrom2004Result) {
        this.findSickEmployeesFrom2004Result = findSickEmployeesFrom2004Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindSickEmployeesFrom2004Response)) return false;
        FindSickEmployeesFrom2004Response other = (FindSickEmployeesFrom2004Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findSickEmployeesFrom2004Result==null && other.getFindSickEmployeesFrom2004Result()==null) || 
             (this.findSickEmployeesFrom2004Result!=null &&
              java.util.Arrays.equals(this.findSickEmployeesFrom2004Result, other.getFindSickEmployeesFrom2004Result())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFindSickEmployeesFrom2004Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFindSickEmployeesFrom2004Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFindSickEmployeesFrom2004Result(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FindSickEmployeesFrom2004Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">FindSickEmployeesFrom2004Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findSickEmployeesFrom2004Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FindSickEmployeesFrom2004Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfAnyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfAnyType"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
