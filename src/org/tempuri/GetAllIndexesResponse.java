/**
 * GetAllIndexesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllIndexesResponse  implements java.io.Serializable {
    private java.lang.Object[][] getAllIndexesResult;

    public GetAllIndexesResponse() {
    }

    public GetAllIndexesResponse(
           java.lang.Object[][] getAllIndexesResult) {
           this.getAllIndexesResult = getAllIndexesResult;
    }


    /**
     * Gets the getAllIndexesResult value for this GetAllIndexesResponse.
     * 
     * @return getAllIndexesResult
     */
    public java.lang.Object[][] getGetAllIndexesResult() {
        return getAllIndexesResult;
    }


    /**
     * Sets the getAllIndexesResult value for this GetAllIndexesResponse.
     * 
     * @param getAllIndexesResult
     */
    public void setGetAllIndexesResult(java.lang.Object[][] getAllIndexesResult) {
        this.getAllIndexesResult = getAllIndexesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllIndexesResponse)) return false;
        GetAllIndexesResponse other = (GetAllIndexesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllIndexesResult==null && other.getGetAllIndexesResult()==null) || 
             (this.getAllIndexesResult!=null &&
              java.util.Arrays.equals(this.getAllIndexesResult, other.getGetAllIndexesResult())));
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
        if (getGetAllIndexesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllIndexesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllIndexesResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllIndexesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllIndexesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllIndexesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllIndexesResult"));
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
