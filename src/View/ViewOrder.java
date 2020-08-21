package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ViewOrder extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar ViewOrderMenuBar;
	private JMenu FileMenu,OrderMenu;
	private JMenuItem DisconnectMItem,ClosemItem,ViewOrderMItem;
	private JTextField TxtTime;
	private JTextField TxtDeliveryDate;
	private JTextField TxtGrandtotal;
	private JLabel lblRestaurantName;
	private JTextField TxtRestaurantname;
	private JComboBox ClientComboBox,DateComboBox;
	private JComboBox TimeComboBox;
	private JTable Ordertable;
	private JLabel lblDeliveryArea;
	private JTextField TxtViewPostalCode;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel lblItemNameitem;
	private JTextArea textArea_3;
	private JLabel lblSelectClient;
	private JLabel lblSelectTime;
	private JLabel lblViewOrder;
	/**
	 * Launch the application.
	 */

	
	/**
	 * Create the frame.
	 */
	public ViewOrder() {
		
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 700);
		
		bg = new JLabel(new ImageIcon("Images/background.jpg"));
		setContentPane(bg);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 785, 650);
		bg.add(panel);
		panel.setOpaque(false);
		panel.setLayout(null);		
		
		ViewOrderMenuBar = new JMenuBar();
		ViewOrderMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ViewOrderMenuBar.setBackground(new Color(255, 204, 0));
		ViewOrderMenuBar.setBounds(0, 0, 785, 25);
		panel.add(ViewOrderMenuBar);
		
		FileMenu = new JMenu("File");
		ViewOrderMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		ClosemItem = new JMenuItem("Close");
		FileMenu.add(ClosemItem);
		
		OrderMenu = new JMenu("Order");
		ViewOrderMenuBar.add(OrderMenu);		
		
		ViewOrderMItem = new JMenuItem("View Restaurant Order");
		OrderMenu.add(ViewOrderMItem);
		
		JLabel lblCreateMenu = new JLabel("Restaurant's Order");
		lblCreateMenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCreateMenu.setBounds(68, 122, 170, 21);
		panel.add(lblCreateMenu);
		
		JLabel lblAddMenu = new JLabel("");
		lblAddMenu.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAddMenu.setBounds(170, 38, 467, 71);
		panel.add(lblAddMenu);
		
		ImageIcon icon6 = new ImageIcon("Images/RESTAURANTORDERHISTORY.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblAddMenu.setIcon(icon7);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date :");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryDate.setBounds(53, 463, 102, 14);
		panel.add(lblDeliveryDate);
		
		JLabel lblDeliveryTime = new JLabel("Delivery Time :");
		lblDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryTime.setBounds(53, 497, 102, 14);
		panel.add(lblDeliveryTime);
		
		TxtTime = new JTextField();
		TxtTime.setEditable(false);
		TxtTime.setBounds(203, 495, 148, 20);
		panel.add(TxtTime);
		TxtTime.setColumns(10);
		
		TxtDeliveryDate = new JTextField();
		TxtDeliveryDate.setEditable(false);
		TxtDeliveryDate.setColumns(10);
		TxtDeliveryDate.setBounds(203, 461, 148, 20);
		panel.add(TxtDeliveryDate);
		
		JLabel lblPostalCode = new JLabel("Grand Total :");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPostalCode.setBounds(53, 568, 102, 14);
		panel.add(lblPostalCode);
		
		TxtGrandtotal = new JTextField();
		TxtGrandtotal.setEditable(false);
		TxtGrandtotal.setColumns(10);
		TxtGrandtotal.setBounds(203, 568, 148, 20);
		panel.add(TxtGrandtotal);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRestaurantName.setBounds(53, 428, 138, 14);
		panel.add(lblRestaurantName);
		
		TxtRestaurantname = new JTextField();
		TxtRestaurantname.setEditable(false);
		TxtRestaurantname.setColumns(10);
		TxtRestaurantname.setBounds(203, 426, 148, 20);
		panel.add(TxtRestaurantname);
		
		 DateComboBox = new JComboBox();
		DateComboBox.setBounds(56, 177, 182, 29);
		panel.add(DateComboBox);
		
		ClientComboBox = new JComboBox();
		ClientComboBox.setBounds(295, 177, 182, 29);
		panel.add(ClientComboBox);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBounds(545, 174, 182, 29);
		panel.add(TimeComboBox);
		
		Ordertable = new JTable();
		Ordertable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ordertable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Ordertable.setBounds(407, 403, 333, 213);
		panel.add(Ordertable);
		
		lblDeliveryArea = new JLabel("Delivery Area :");
		lblDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryArea.setBounds(53, 532, 102, 14);
		panel.add(lblDeliveryArea);
		
		TxtViewPostalCode = new JTextField();
		TxtViewPostalCode.setEditable(false);
		TxtViewPostalCode.setColumns(10);
		TxtViewPostalCode.setBounds(203, 530, 148, 20);
		panel.add(TxtViewPostalCode);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(43, 159, 212, 190);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(528, 157, 212, 190);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(282, 159, 212, 190);
		panel.add(textArea_2);
		
		lblItemNameitem = new JLabel("Item Name |Item  Price |Item  Qty |  Total");
		lblItemNameitem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemNameitem.setBounds(404, 381, 336, 21);
		panel.add(lblItemNameitem);
		
		textArea_3 = new JTextArea();
		textArea_3.setForeground(new Color(255, 255, 204));
		textArea_3.setEditable(false);
		textArea_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_3.setBounds(43, 403, 341, 213);
		panel.add(textArea_3);
		
		lblSelectClient = new JLabel("Select Client");
		lblSelectClient.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectClient.setBounds(323, 122, 122, 21);
		panel.add(lblSelectClient);
		
		lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectTime.setBounds(577, 122, 122, 21);
		panel.add(lblSelectTime);
		
		lblViewOrder = new JLabel("View Order");
		lblViewOrder.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblViewOrder.setBounds(153, 362, 102, 21);
		panel.add(lblViewOrder);

		this.setVisible(true);
	}

	public JTextField getTxtGrandtotal() {
		return TxtGrandtotal;
	}

	public void setTxtGrandtotal(JTextField txtGrandtotal) {
		TxtGrandtotal = txtGrandtotal;
	}

	public JTextField getTxtViewPostalCode() {
		return TxtViewPostalCode;
	}

	public void setTxtViewPostalCode(JTextField txtViewPostalCode) {
		TxtViewPostalCode = txtViewPostalCode;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getLblRestaurantName() {
		return lblRestaurantName;
	}

	public void setLblRestaurantName(JLabel lblRestaurantName) {
		this.lblRestaurantName = lblRestaurantName;
	}

	public JTextField getTxtRestaurantname() {
		return TxtRestaurantname;
	}

	public void setTxtRestaurantname(JTextField txtRestaurantname) {
		TxtRestaurantname = txtRestaurantname;
	}

	public JComboBox getClientComboBox() {
		return ClientComboBox;
	}

	public void setClientComboBox(JComboBox clientComboBox) {
		ClientComboBox = clientComboBox;
	}

	public JComboBox getTimeComboBox() {
		return TimeComboBox;
	}

	public void setTimeComboBox(JComboBox timeComboBox) {
		TimeComboBox = timeComboBox;
	}

	public JTable getOrdertable() {
		return Ordertable;
	}

	public void setOrdertable(JTable ordertable) {
		Ordertable = ordertable;
	}

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @param contentPane the contentPane to set
	 */
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	/**
	 * @return the txtAreaRestOrders
	 */
	public JPanel getTxtAreaRestOrders() {
		return panel;
	}

	/**
	 * @param txtAreaRestOrders the txtAreaRestOrders to set
	 */
	public void setTxtAreaRestOrders(JPanel txtAreaRestOrders) {
		panel = txtAreaRestOrders;
	}

	/**
	 * @return the bg
	 */
	public JLabel getBg() {
		return bg;
	}

	/**
	 * @param bg the bg to set
	 */
	public void setBg(JLabel bg) {
		this.bg = bg;
	}

	/**
	 * @return the viewOrderMenuBar
	 */
	public JMenuBar getViewOrderMenuBar() {
		return ViewOrderMenuBar;
	}

	/**
	 * @param viewOrderMenuBar the viewOrderMenuBar to set
	 */
	public void setViewOrderMenuBar(JMenuBar viewOrderMenuBar) {
		ViewOrderMenuBar = viewOrderMenuBar;
	}

	/**
	 * @return the fileMenu
	 */
	public JMenu getFileMenu() {
		return FileMenu;
	}

	/**
	 * @param fileMenu the fileMenu to set
	 */
	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
	}

	/**
	 * @return the orderMenu
	 */
	public JMenu getOrderMenu() {
		return OrderMenu;
	}

	/**
	 * @param orderMenu the orderMenu to set
	 */
	public void setOrderMenu(JMenu orderMenu) {
		OrderMenu = orderMenu;
	}

	/**
	 * @return the disconnectMItem
	 */
	public JMenuItem getDisconnectMItem() {
		return DisconnectMItem;
	}

	/**
	 * @param disconnectMItem the disconnectMItem to set
	 */
	public void setDisconnectMItem(JMenuItem disconnectMItem) {
		DisconnectMItem = disconnectMItem;
	}

	/**
	 * @return the closemItem
	 */
	public JMenuItem getClosemItem() {
		return ClosemItem;
	}

	/**
	 * @param closemItem the closemItem to set
	 */
	public void setClosemItem(JMenuItem closemItem) {
		ClosemItem = closemItem;
	}

	/**
	 * @return the viewOrderMItem
	 */
	public JMenuItem getViewOrderMItem() {
		return ViewOrderMItem;
	}

	/**
	 * @param viewOrderMItem the viewOrderMItem to set
	 */
	public void setViewOrderMItem(JMenuItem viewOrderMItem) {
		ViewOrderMItem = viewOrderMItem;
	}

	/**
	 * @return the txtTime
	 */
	public JTextField getTxtTime() {
		return TxtTime;
	}

	/**
	 * @param txtTime the txtTime to set
	 */
	public void setTxtTime(JTextField txtTime) {
		TxtTime = txtTime;
	}

	/**
	 * @return the txtDeliveryDate
	 */
	public JTextField getTxtDeliveryDate() {
		return TxtDeliveryDate;
	}

	/**
	 * @param txtDeliveryDate the txtDeliveryDate to set
	 */
	public void setTxtDeliveryDate(JTextField txtDeliveryDate) {
		TxtDeliveryDate = txtDeliveryDate;
	}

	/**
	 * @return the txtPostalCode
	 */
	public JTextField getTxtPostalCode() {
		return TxtGrandtotal;
	}

	/**
	 * @param txtPostalCode the txtPostalCode to set
	 */
	public void setTxtPostalCode(JTextField txtPostalCode) {
		TxtGrandtotal = txtPostalCode;
	}

	public JComboBox getDateComboBox() {
		return DateComboBox;
	}

	public void setDateComboBox(JComboBox dateComboBox) {
		DateComboBox = dateComboBox;
	}

	
	
}
