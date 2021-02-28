package applicationClient;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.tempuri.WebService1SoapProxy;

public class Controller {
	private ClientFrame client;
	private WebService1SoapProxy proxy;

	public Controller(ClientFrame client) {
		proxy = new WebService1SoapProxy();
		this.client = client;
		this.initialize();
	}

	public void initialize() {
		try {
			String[][] dataAndColumnNames = proxy.getEmployeeMetaData();
			fillTable(dataAndColumnNames, client.getTableMetadata());

			dataAndColumnNames = proxy.informationAboutRelatives();
			fillTable(dataAndColumnNames, client.getTableRealtives());

			dataAndColumnNames = proxy.findSickEmployeesFrom2004();
			fillTable(dataAndColumnNames, client.getTableSickness());

			dataAndColumnNames = proxy.getAllTables();
			fillTable(dataAndColumnNames, client.getTableAllTables());

			dataAndColumnNames = proxy.getAllEmployeeColumns();
			fillTable(dataAndColumnNames, client.getTableColumns());

			dataAndColumnNames = proxy.getAllKeys();
			fillTable(dataAndColumnNames, client.getTableKeys());

			dataAndColumnNames = proxy.getAllIndexes();
			fillTable(dataAndColumnNames, client.getTableIndexes());

			dataAndColumnNames = proxy.getAllConstraints();
			fillTable(dataAndColumnNames, client.getTableTableConstraints());
			
			fillComboBox();
			addListenerForComboBox ();
			//Fill the Jtable tableContents with the default selected table name.
			fillTableContents();
			
			updateMostAbsentEmployee();

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public void addListenerForComboBox (){

		client.getComboBoxTableName().addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				fillTableContents();
			}
		});
	}
	public void fillTableContents() {
		String tableName = client.getComboBoxTableName().getSelectedItem().toString();

		String[][] dataAndColumnNames;
		try {
			dataAndColumnNames = proxy.getContentFromTable(tableName);
			fillTable(dataAndColumnNames, client.getTableContents());
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void fillComboBox() {
		ComboBoxModel<String> model;
		try {
			model = new DefaultComboBoxModel<String>(proxy.getNamesOfEmployeeTables());
			client.getComboBoxTableName().setModel(model);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fillTable(String[][] dataAndColumnNames, JTable table) {


		ArrayList<String[]> dataAsList = new ArrayList<String[]>();
		Collections.addAll(dataAsList, dataAndColumnNames);
		String[] columnNames = dataAsList.get(0);
		dataAsList.remove(0);
		String[][] data = new String[dataAsList.size()][];
		String[][] template = new String[0][];
		data = dataAsList.toArray(template);

		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
		table.setModel(tableModel);
	}
	public void updateMostAbsentEmployee() {
		try {
			client.getLblAbsentEmployee().setText("The first name of the employee who has been absent the most: " + proxy.findMostAbsentEmployee());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
