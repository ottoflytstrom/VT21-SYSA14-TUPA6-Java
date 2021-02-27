/**
 * WebService1Locator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class WebService1Locator extends org.apache.axis.client.Service implements org.tempuri.WebService1 {

    public WebService1Locator() {
    }


    public WebService1Locator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebService1Locator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebService1Soap
    private java.lang.String WebService1Soap_address = "http://localhost/WebServiceTUPA6/WebService1.asmx";

    public java.lang.String getWebService1SoapAddress() {
        return WebService1Soap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebService1SoapWSDDServiceName = "WebService1Soap";

    public java.lang.String getWebService1SoapWSDDServiceName() {
        return WebService1SoapWSDDServiceName;
    }

    public void setWebService1SoapWSDDServiceName(java.lang.String name) {
        WebService1SoapWSDDServiceName = name;
    }

    public org.tempuri.WebService1Soap getWebService1Soap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebService1Soap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebService1Soap(endpoint);
    }

    public org.tempuri.WebService1Soap getWebService1Soap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.WebService1SoapStub _stub = new org.tempuri.WebService1SoapStub(portAddress, this);
            _stub.setPortName(getWebService1SoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebService1SoapEndpointAddress(java.lang.String address) {
        WebService1Soap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.WebService1Soap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.WebService1SoapStub _stub = new org.tempuri.WebService1SoapStub(new java.net.URL(WebService1Soap_address), this);
                _stub.setPortName(getWebService1SoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebService1Soap".equals(inputPortName)) {
            return getWebService1Soap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebService1");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebService1Soap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebService1Soap".equals(portName)) {
            setWebService1SoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
