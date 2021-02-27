/**
 * FindMostAbsentEmployeeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class FindMostAbsentEmployeeResponse  implements java.io.Serializable {
    private java.lang.Object[][] findMostAbsentEmployeeResult;

    public FindMostAbsentEmployeeResponse() {
    }

    public FindMostAbsentEmployeeResponse(
           java.lang.Object[][] findMostAbsentEmployeeResult) {
           this.findMostAbsentEmployeeResult = findMostAbsentEmployeeResult;
    }


    /**
     * Gets the findMostAbsentEmployeeResult value for this FindMostAbsentEmployeeResponse.
     * 
     * @return findMostAbsentEmployeeResult
     */
    public java.lang.Object[][] getFindMostAbsentEmployeeResult() {
        return findMostAbsentEmployeeResult;
    }


    /**
     * Sets the findMostAbsentEmployeeResult value for this FindMostAbsentEmployeeResponse.
     * 
     * @param findMostAbsentEmployeeResult
     */
    public void setFindMostAbsentEmployeeResult(java.lang.Object[][] findMostAbsentEmployeeResult) {
        this.findMostAbsentEmployeeResult = findMostAbsentEmployeeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FindMostAbsentEmployeeResponse)) return false;
        FindMostAbsentEmployeeResponse other = (FindMostAbsentEmployeeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.findMostAbsentEmployeeResult==null && other.getFindMostAbsentEmployeeResult()==null) || 
             (this.findMostAbsentEmployeeResult!=null &&
              java.util.Arrays.equals(this.findMostAbsentEmployeeResult, other.getFindMostAbsentEmployeeResult())));
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
        if (getFindMostAbsentEmployeeResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFindMostAbsentEmployeeResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFindMostAbsentEmployeeResult(), i);
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
        new org.apache.axis.description.TypeDesc(FindMostAbsentEmployeeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">FindMostAbsentEmployeeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("findMostAbsentEmployeeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FindMostAbsentEmployeeResult"));
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
