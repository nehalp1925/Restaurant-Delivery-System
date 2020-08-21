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

public class ClientOrderHistory extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar ClientOrderHistoryMenuBar;
	private JMenu FileMenu,OrderMenu,AccountMenu;
	private JMenuItem DisconnectMItem,ClosemItem,OrderFoodMItem,ProfileMItem,EditMItem,DeleteMItem;
	private JTextField TxtViewDeliveryDate;
	private JTextField TxtViewPostalCode;
	private JTextField TxtViewHours;
	private JComboBox DateComboBox,RestaurantComboBox;
	

	private JLabel lblRestaurantName;
	private JTextField TxtViewRestaurantName;
	private JTable Ordertable;
	private JTextField TxtGrandtotal;
	private JComboBox TimeComboBox;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel label_1;
	private JLabel lblRestaurant;
	private JLabel lblSelectTime;


	/**
	 * Create the frame.
	 */
	public ClientOrderHistory() {
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
		
		ClientOrderHistoryMenuBar = new JMenuBar();
		ClientOrderHistoryMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ClientOrderHistoryMenuBar.setBackground(new Color(255, 204, 0));
		ClientOrderHistoryMenuBar.setBounds(0, 0, 785, 25);
		panel.add(ClientOrderHistoryMenuBar);
		
		FileMenu = new JMenu("File");
		ClientOrderHistoryMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		ClosemItem = new JMenuItem("Close");
		FileMenu.add(ClosemItem);
		
		AccountMenu = new JMenu("Account");
		ClientOrderHistoryMenuBar.add(AccountMenu);
			
		ProfileMItem = new JMenuItem("Profile Account");
		AccountMenu.add(ProfileMItem);		
		
		EditMItem = new JMenuItem("Edit Account");
		AccountMenu.add(EditMItem);
		
		DeleteMItem = new JMenuItem("Delete Account");
		AccountMenu.add(DeleteMItem);
		
		
		OrderMenu = new JMenu("Order");
		ClientOrderHistoryMenuBar.add(OrderMenu);		
		
		OrderFoodMItem = new JMenuItem("Order Food");
		OrderMenu.add(OrderFoodMItem);
		
		
		JLabel lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(246, 32, 429, 63);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/ORDERHISTORY.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 60, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date(yy/mm/dd) :");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDeliveryDate.setBounds(294, 108, 247, 33);
		panel.add(lblDeliveryDate);
		
		TxtViewDeliveryDate = new JTextField();
		TxtViewDeliveryDate.setEditable(false);
		TxtViewDeliveryDate.setColumns(12);
		TxtViewDeliveryDate.setBounds(553, 115, 191, 22);
		panel.add(TxtViewDeliveryDate);
	
		
		JLabel lblPostalCode = new JLabel("Delivery Time :");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPostalCode.setBounds(294, 154, 161, 33);
		panel.add(lblPostalCode);
		
		TxtViewHours = new JTextField();
		TxtViewHours.setEditable(false);
		TxtViewHours.setColumns(10);
		TxtViewHours.setBounds(553, 162, 191, 20);
		panel.add(TxtViewHours);
		
		JLabel label = new JLabel("Postal Code :");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(294, 200, 161, 33);
		panel.add(label);
		
		TxtViewPostalCode = new JTextField();
		TxtViewPostalCode.setEditable(false);
		TxtViewPostalCode.setColumns(12);
		TxtViewPostalCode.setBounds(553, 207, 191, 22);
		panel.add(TxtViewPostalCode);
		
		JLabel lblOrder = new JLabel("Meal in Order");
		lblOrder.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrder.setBounds(431, 346, 140, 33);
		panel.add(lblOrder);
		
		JLabel lblTitle2 = new JLabel("Your Orders");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle2.setBounds(73, 82, 120, 33);
		panel.add(lblTitle2);
		
		DateComboBox = new JComboBox();
		DateComboBox.setBounds(50, 128, 181, 33);
		panel.add(DateComboBox);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantName.setBounds(294, 246, 161, 33);
		panel.add(lblRestaurantName);
		
		TxtViewRestaurantName = new JTextField();
		TxtViewRestaurantName.setEditable(false);
		TxtViewRestaurantName.setColumns(12);
		TxtViewRestaurantName.setBounds(553, 253, 191, 22);
		panel.add(TxtViewRestaurantName);
		
		Ordertable = new JTable();
		Ordertable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ordertable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Ordertable.setBounds(294, 432, 450, 205);
		panel.add(Ordertable);
		
		RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(50, 325, 181, 33);
		panel.add(RestaurantComboBox);
		
		JLabel lblGrandTotal = new JLabel("Grand Total :");
		lblGrandTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGrandTotal.setBounds(294, 292, 161, 33);
		panel.add(lblGrandTotal);
		
		TxtGrandtotal = new JTextField();
		TxtGrandtotal.setEditable(false);
		TxtGrandtotal.setColumns(12);
		TxtGrandtotal.setBounds(553, 299, 191, 22);
		panel.add(TxtGrandtotal);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBounds(50, 524, 181, 33);
		panel.add(TimeComboBox);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(39, 117, 201, 132);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(39, 311, 201, 142);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(39, 512, 201, 125);
		panel.add(textArea_2);
		
		label_1 = new JLabel("Item Name |Item  Price |Item  Qty | Item Total");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(303, 392, 424, 21);
		panel.add(label_1);
		
		lblRestaurant = new JLabel("Restaurant ");
		lblRestaurant.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurant.setBounds(86, 279, 107, 33);
		panel.add(lblRestaurant);
		
		lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectTime.setBounds(86, 476, 107, 33);
		panel.add(lblSelectTime);
		this.setVisible(true);
	}

	public JComboBox getTimeComboBox() {
		return TimeComboBox;
	}

	public void setTimeComboBox(JComboBox timeComboBox) {
		TimeComboBox = timeComboBox;
	}

	public JTextField getTxtGrandtotal() {
		return TxtGrandtotal;
	}

	public void setTxtGrandtotal(JTextField txtGrandtotal) {
		TxtGrandtotal = txtGrandtotal;
	}

	public JTable getOrdertable() {
		return Ordertable;
	}

	public void setOrdertable(JTable ordertable) {
		Ordertable = ordertable;
	}

	public JTextField getTxtViewRestaurantName() {
		return TxtViewRestaurantName;
	}

	public void setTxtViewRestaurantName(JTextField txtViewRestaurantName) {
		TxtViewRestaurantName = txtViewRestaurantName;
	}

	public JComboBox getDateComboBox() {
		return DateComboBox;
	}

	public void setDateComboBox(JComboBox dateComboBox) {
		DateComboBox = dateComboBox;
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
	 * @return the panel
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * @param panel the panel to set
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
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
	 * @return the clientOrderHistoryMenuBar
	 */
	public JMenuBar getClientOrderHistoryMenuBar() {
		return ClientOrderHistoryMenuBar;
	}

	/**
	 * @param clientOrderHistoryMenuBar the clientOrderHistoryMenuBar to set
	 */
	public void setClientOrderHistoryMenuBar(JMenuBar clientOrderHistoryMenuBar) {
		ClientOrderHistoryMenuBar = clientOrderHistoryMenuBar;
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
	 * @return the accountMenu
	 */
	public JMenu getAccountMenu() {
		return AccountMenu;
	}

	/**
	 * @param accountMenu the accountMenu to set
	 */
	public void setAccountMenu(JMenu accountMenu) {
		AccountMenu = accountMenu;
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
	 * @return the orderFoodMItem
	 */
	public JMenuItem getOrderFoodMItem() {
		return OrderFoodMItem;
	}

	/**
	 * @param orderFoodMItem the orderFoodMItem to set
	 */
	public void setOrderFoodMItem(JMenuItem orderFoodMItem) {
		OrderFoodMItem = orderFoodMItem;
	}



	/**
	 * @return the editMItem
	 */
	public JMenuItem getProfileMItem() {
		return ProfileMItem;
	}

	/**
	 * @param editMItem the editMItem to set
	 */
	public void setProfileMItem(JMenuItem profileMItem) {
		ProfileMItem = profileMItem;
	}



	/**
	 * @return the txtViewDeliveryDate
	 */
	public JTextField getTxtViewDeliveryDate() {
		return TxtViewDeliveryDate;
	}

	/**
	 * @param txtViewDeliveryDate the txtViewDeliveryDate to set
	 */
	public void setTxtViewDeliveryDate(JTextField txtViewDeliveryDate) {
		TxtViewDeliveryDate = txtViewDeliveryDate;
	}

	/**
	 * @return the txtViewPostalCode
	 */
	public JTextField getTxtViewPostalCode() {
		return TxtViewPostalCode;
	}

	/**
	 * @param txtViewPostalCode the txtViewPostalCode to set
	 */
	public void setTxtViewPostalCode(JTextField txtViewPostalCode) {
		TxtViewPostalCode = txtViewPostalCode;
	}

	/**
	 * @return the txtViewHours
	 */
	public JTextField getTxtViewHours() {
		return TxtViewHours;
	}

	/**
	 * @param txtViewHours the txtViewHours to set
	 */
	public void setTxtViewHours(JTextField txtViewHours) {
		TxtViewHours = txtViewHours;
	}
	
	public JComboBox getRestaurantComboBox() {
		return RestaurantComboBox;
	}

	public JMenuItem getEditMItem() {
		return EditMItem;
	}

	public void setEditMItem(JMenuItem editMItem) {
		EditMItem = editMItem;
	}

	public JMenuItem getDeleteMItem() {
		return DeleteMItem;
	}

	public void setDeleteMItem(JMenuItem deleteMItem) {
		DeleteMItem = deleteMItem;
	}

	public void setRestaurantComboBox(JComboBox restaurantComboBox) {
		RestaurantComboBox = restaurantComboBox;
	}
}
