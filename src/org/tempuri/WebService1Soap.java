/**
 * WebService1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebService1Soap extends java.rmi.Remote {
    public java.lang.String[][] getEmployeeMetaData() throws java.rmi.RemoteException;
    public java.lang.String[][] getContentFromTable(java.lang.String tableName) throws java.rmi.RemoteException;
    public java.lang.String[][] informationAboutRelatives() throws java.rmi.RemoteException;
    public java.lang.String[][] findSickEmployeesFrom2004() throws java.rmi.RemoteException;
    public java.lang.String findMostAbsentEmployee() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllTables() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllKeys() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllIndexes() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllConstraints() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllEmployeeColumns() throws java.rmi.RemoteException;
    public java.lang.String[] getNamesOfEmployeeTables() throws java.rmi.RemoteException;
}
