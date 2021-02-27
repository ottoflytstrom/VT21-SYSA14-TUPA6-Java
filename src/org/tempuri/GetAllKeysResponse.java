/**
 * GetAllKeysResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllKeysResponse  implements java.io.Serializable {
    private java.lang.Object[][] getAllKeysResult;

    public GetAllKeysResponse() {
    }

    public GetAllKeysResponse(
           java.lang.Object[][] getAllKeysResult) {
           this.getAllKeysResult = getAllKeysResult;
    }


    /**
     * Gets the getAllKeysResult value for this GetAllKeysResponse.
     * 
     * @return getAllKeysResult
     */
    public java.lang.Object[][] getGetAllKeysResult() {
        return getAllKeysResult;
    }


    /**
     * Sets the getAllKeysResult value for this GetAllKeysResponse.
     * 
     * @param getAllKeysResult
     */
    public void setGetAllKeysResult(java.lang.Object[][] getAllKeysResult) {
        this.getAllKeysResult = getAllKeysResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllKeysResponse)) return false;
        GetAllKeysResponse other = (GetAllKeysResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllKeysResult==null && other.getGetAllKeysResult()==null) || 
             (this.getAllKeysResult!=null &&
              java.util.Arrays.equals(this.getAllKeysResult, other.getGetAllKeysResult())));
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
        if (getGetAllKeysResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllKeysResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllKeysResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllKeysResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllKeysResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllKeysResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllKeysResult"));
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
