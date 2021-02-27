package applicationClient;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

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
	}
	public void updateMetaDataTable() {
		try {
			String[][] dataAndColumnNames = proxy.getEmployeeMetaData();
			List<String[]> dataAsList = Arrays.asList(data);
			String[] columnNames = dataAsList.get(0);
			dataAsList.remove(0);
			Object[] dataIn1D = dataAsList.toArray();
			String[][] data = new String[dataIn1D.length][columnNames.length];
			
			DefaultTableModel tableModel = new DefaultTableModel(dataAsList,
		         new Object[] { "Items", "Quantity" }
		      );
		      JTable table = new JTable(tableModel);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ActionListener onReadFileAction() {
		return new ActionListener() {
			public void actionPerformed(ActionEvent arg){
				String fileName = client.getTextFieldFileName().getText();
				String contents = "";
				try {
					client.getLblFeedback().setText("Reading...");
					contents = data.readFile(fileName);
					client.getLblFeedback().setText("File read.");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					client.getLblFeedback().setText("File not found. Please try again with a different file name.");
				}
				client.getTextAreaForFileReading().setText(contents);
			}
		};
	}
}
