package applicationClient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ClientFrame extends JFrame {

	private JPanel contentPane;
	private JTable tableMetadata;
	private JLabel lblAbsentEmployee;
	public JLabel getLblAbsentEmployee() {
		return lblAbsentEmployee;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTable getTableMetadata() {
		return tableMetadata;
	}

	public JTable getTableRealtives() {
		return tableRealtives;
	}

	public JTable getTableSickness() {
		return tableSickness;
	}

	public JTable getTableAllTables() {
		return tableAllTables;
	}

	public JTable getTableColumns() {
		return tableColumns;
	}

	public JTable getTableTableConstraints() {
		return tableTableConstraints;
	}

	public JTable getTableContents() {
		return tableContents;
	}

	public JTable getTableKeys() {
		return tableKeys;
	}

	public JTable getTableIndexes() {
		return tableIndexes;
	}

	public JComboBox<String> getComboBoxTableName() {
		return comboBoxTableName;
	}

	private JTable tableRealtives;
	private JTable tableSickness;
	private JTable tableAllTables;
	private JTable tableColumns;
	private JTable tableTableConstraints;
	private JTable tableContents;
	private JTable tableKeys;
	private JTable tableIndexes;
	private JComboBox<String> comboBoxTableName;

	

	/**
	 * Create the frame.
	 */
	public ClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 580, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 549, 251);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Metadata", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 32, 524, 191);
		panel.add(scrollPane);
		
		tableMetadata = new JTable();
		scrollPane.setViewportView(tableMetadata);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Relatives", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 32, 524, 191);
		panel_1.add(scrollPane_1);
		
		tableRealtives = new JTable();
		scrollPane_1.setViewportView(tableRealtives);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Sickness/Absence", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 32, 524, 191);
		panel_2.add(scrollPane_2);
		
		tableSickness = new JTable();
		scrollPane_2.setViewportView(tableSickness);
		
		lblAbsentEmployee = new JLabel("The first name of the employee who has been absent the most: ");
		lblAbsentEmployee.setBounds(10, 7, 524, 14);
		panel_2.add(lblAbsentEmployee);
		
		JPanel panel_1_1 = new JPanel();
		tabbedPane.addTab("All Tables", null, panel_1_1, null);
		panel_1_1.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 32, 524, 191);
		panel_1_1.add(scrollPane_3);
		
		tableAllTables = new JTable();
		scrollPane_3.setViewportView(tableAllTables);
		
		JPanel panel_1_2 = new JPanel();
		tabbedPane.addTab("TableConstraints/Columns", null, panel_1_2, null);
		panel_1_2.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 32, 231, 191);
		panel_1_2.add(scrollPane_4);
		
		tableTableConstraints = new JTable();
		scrollPane_4.setViewportView(tableTableConstraints);
		
		JScrollPane scrollPane_4_1 = new JScrollPane();
		scrollPane_4_1.setBounds(313, 32, 231, 191);
		panel_1_2.add(scrollPane_4_1);
		
		tableColumns = new JTable();
		scrollPane_4_1.setViewportView(tableColumns);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Contents", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 32, 524, 160);
		panel_4.add(scrollPane_5);
		
		tableContents = new JTable();
		tableContents.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		scrollPane_5.setViewportView(tableContents);
		
		comboBoxTableName = new JComboBox<String>();
		
		comboBoxTableName.setBounds(285, 5, 249, 22);
		panel_4.add(comboBoxTableName);
		
		JLabel lblChooseATable = new JLabel("Choose a table to display its contents");
		lblChooseATable.setBounds(10, 9, 249, 14);
		panel_4.add(lblChooseATable);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Keys/indexes", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_4_2 = new JScrollPane();
		scrollPane_4_2.setBounds(10, 32, 231, 191);
		panel_3.add(scrollPane_4_2);
		
		tableKeys = new JTable();
		scrollPane_4_2.setViewportView(tableKeys);
		
		JScrollPane scrollPane_4_1_1 = new JScrollPane();
		scrollPane_4_1_1.setBounds(313, 32, 231, 191);
		panel_3.add(scrollPane_4_1_1);
		
		tableIndexes = new JTable();
		scrollPane_4_1_1.setViewportView(tableIndexes);
	}
}
