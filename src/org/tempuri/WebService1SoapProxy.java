package org.tempuri;

public class WebService1SoapProxy implements org.tempuri.WebService1Soap {
  private String _endpoint = null;
  private org.tempuri.WebService1Soap webService1Soap = null;
  
  public WebService1SoapProxy() {
    _initWebService1SoapProxy();
  }
  
  public WebService1SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService1SoapProxy();
  }
  
  private void _initWebService1SoapProxy() {
    try {
      webService1Soap = (new org.tempuri.WebService1Locator()).getWebService1Soap();
      if (webService1Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService1Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService1Soap != null)
      ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebService1Soap getWebService1Soap() {
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap;
  }
  
  public java.lang.String[][] getEmployeeMetaData() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getEmployeeMetaData();
  }
  
  public java.lang.String[][] getContentFromTable(java.lang.String tableName) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getContentFromTable(tableName);
  }
  
  public java.lang.String[][] informationAboutRelatives() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.informationAboutRelatives();
  }
  
  public java.lang.String[][] findSickEmployeesFrom2004() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.findSickEmployeesFrom2004();
  }
  
  public java.lang.String findMostAbsentEmployee() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.findMostAbsentEmployee();
  }
  
  public java.lang.String[][] getAllTables() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAllTables();
  }
  
  public java.lang.String[][] getAllKeys() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAllKeys();
  }
  
  public java.lang.String[][] getAllIndexes() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAllIndexes();
  }
  
  public java.lang.String[][] getAllConstraints() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAllConstraints();
  }
  
  public java.lang.String[][] getAllEmployeeColumns() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getAllEmployeeColumns();
  }
  
  public java.lang.String[] getNamesOfEmployeeTables() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getNamesOfEmployeeTables();
  }
  
  
}