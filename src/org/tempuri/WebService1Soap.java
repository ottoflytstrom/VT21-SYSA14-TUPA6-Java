/**
 * WebService1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebService1Soap extends java.rmi.Remote {
    public java.lang.String[][] getEmployeeMetaData() throws java.rmi.RemoteException;
    public java.lang.Object[][] getContentFromTable(java.lang.String tableName) throws java.rmi.RemoteException;
    public java.lang.Object[][] informationAboutRelatives() throws java.rmi.RemoteException;
    public java.lang.Object[][] findSickEmployeesFrom2004() throws java.rmi.RemoteException;
    public java.lang.Object[][] findMostAbsentEmployee() throws java.rmi.RemoteException;
    public java.lang.Object[][] getAllTables() throws java.rmi.RemoteException;
    public java.lang.Object[][] getAllKeys() throws java.rmi.RemoteException;
    public java.lang.Object[][] getAllIndexes() throws java.rmi.RemoteException;
    public java.lang.Object[][] getAllConstraints() throws java.rmi.RemoteException;
    public java.lang.Object[][] getAllEmployeeColumns() throws java.rmi.RemoteException;
}
