/**
 * GetEmployeeMetaDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetEmployeeMetaDataResponse  implements java.io.Serializable {
    private java.lang.String[][] getEmployeeMetaDataResult;

    public GetEmployeeMetaDataResponse() {
    }

    public GetEmployeeMetaDataResponse(
           java.lang.String[][] getEmployeeMetaDataResult) {
           this.getEmployeeMetaDataResult = getEmployeeMetaDataResult;
    }


    /**
     * Gets the getEmployeeMetaDataResult value for this GetEmployeeMetaDataResponse.
     * 
     * @return getEmployeeMetaDataResult
     */
    public java.lang.String[][] getGetEmployeeMetaDataResult() {
        return getEmployeeMetaDataResult;
    }


    /**
     * Sets the getEmployeeMetaDataResult value for this GetEmployeeMetaDataResponse.
     * 
     * @param getEmployeeMetaDataResult
     */
    public void setGetEmployeeMetaDataResult(java.lang.String[][] getEmployeeMetaDataResult) {
        this.getEmployeeMetaDataResult = getEmployeeMetaDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetEmployeeMetaDataResponse)) return false;
        GetEmployeeMetaDataResponse other = (GetEmployeeMetaDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getEmployeeMetaDataResult==null && other.getGetEmployeeMetaDataResult()==null) || 
             (this.getEmployeeMetaDataResult!=null &&
              java.util.Arrays.equals(this.getEmployeeMetaDataResult, other.getGetEmployeeMetaDataResult())));
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
        if (getGetEmployeeMetaDataResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetEmployeeMetaDataResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetEmployeeMetaDataResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetEmployeeMetaDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetEmployeeMetaDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getEmployeeMetaDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetEmployeeMetaDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
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
