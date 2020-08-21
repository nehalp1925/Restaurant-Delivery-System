package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class ClientOrderFood extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar OrderFoodMenuBar;
	private JMenu FileMenu,OrderMenu,AccountMenu;
	private JMenuItem DisconnectMItem,ClosemItem,OrderHistoryMItem,ProfileMItem,EditMItem,DeleteMItem;
	private JTextField TxtOrderDeliveryDate;
	private JTextField TxtHour;
	private JTextField TxtMeal;
	private JTextField TxtPrice;
	private JTextField TxtQuantity;
	private JTextField TxtTotal;
	private JButton btnDeleteItem,btnAddItem,btnOrder;
	private JComboBox RestaurantComboBox,MenuComboBox;
	private JComboBox PostalCodeComboBox;
	private JTable OrderTable;
	private DefaultTableModel model;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel label_2;

	



	public ClientOrderFood() {
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
		
		OrderFoodMenuBar = new JMenuBar();
		OrderFoodMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		OrderFoodMenuBar.setBackground(new Color(255, 204, 0));
		OrderFoodMenuBar.setBounds(0, 0, 785, 25);
		panel.add(OrderFoodMenuBar);
		
		FileMenu = new JMenu("File");
		OrderFoodMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		ClosemItem = new JMenuItem("Close");
		FileMenu.add(ClosemItem);
		
		AccountMenu = new JMenu("Account");
		OrderFoodMenuBar.add(AccountMenu);		
		
		ProfileMItem = new JMenuItem("Profile Account");
		AccountMenu.add(ProfileMItem);
		
		EditMItem = new JMenuItem("Edit Account");
		AccountMenu.add(EditMItem);
		
		DeleteMItem = new JMenuItem("Delete Account");
		AccountMenu.add(DeleteMItem);
		
		OrderMenu = new JMenu("Order");
		OrderFoodMenuBar.add(OrderMenu);		
		
		
		OrderHistoryMItem = new JMenuItem("Order History");
		OrderMenu.add(OrderHistoryMItem);		
		
		JLabel lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(160, 34, 424, 55);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/ORDERFOOD.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 60, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		JLabel lblDeliveryDate = new JLabel("Delivery Date(yy/mm/dd) :");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDeliveryDate.setBounds(51, 96, 247, 33);
		panel.add(lblDeliveryDate);
		
		TxtOrderDeliveryDate = new JTextField();
		TxtOrderDeliveryDate.setEditable(false);
		TxtOrderDeliveryDate.setColumns(12);
		TxtOrderDeliveryDate.setBounds(310, 103, 191, 27);
		panel.add(TxtOrderDeliveryDate);
	
		
		JLabel lblPostalCode = new JLabel("Delivery Time :");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPostalCode.setBounds(51, 142, 161, 33);
		panel.add(lblPostalCode);
		
		TxtHour = new JTextField();
		TxtHour.setEditable(false);
		TxtHour.setColumns(10);
		TxtHour.setBounds(312, 148, 189, 27);
		panel.add(TxtHour);
		
		JLabel label = new JLabel("Postal Code :");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(51, 188, 161, 33);
		panel.add(label);
		
		JLabel lblRes = new JLabel("Restaurant");
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRes.setBounds(596, 71, 103, 33);
		panel.add(lblRes);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMenu.setBounds(122, 240, 66, 33);
		panel.add(lblMenu);
		
		JLabel lblMeal = new JLabel("Item Name:");
		lblMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMeal.setBounds(284, 292, 98, 33);
		panel.add(lblMeal);
		
		TxtMeal = new JTextField();
		TxtMeal.setEditable(false);
		TxtMeal.setColumns(12);
		TxtMeal.setBounds(392, 303, 126, 22);
		panel.add(TxtMeal);
		
		JLabel lblPrice = new JLabel("Item Price :");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(284, 340, 98, 33);
		panel.add(lblPrice);
		
		TxtPrice = new JTextField();
		TxtPrice.setEditable(false);
		TxtPrice.setColumns(12);
		TxtPrice.setBounds(392, 346, 126, 22);
		panel.add(TxtPrice);
		
		JLabel lblQuantity = new JLabel("Quantity :");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQuantity.setBounds(284, 383, 98, 33);
		panel.add(lblQuantity);
		
		TxtQuantity = new JTextField();
		TxtQuantity.setEditable(false);
		TxtQuantity.setColumns(12);
		TxtQuantity.setBounds(392, 394, 126, 22);
		panel.add(TxtQuantity);
		
		btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDeleteItem.setEnabled(false);
		btnDeleteItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDeleteItem.setBounds(576, 382, 123, 33);
		panel.add(btnDeleteItem);
		
		btnAddItem = new JButton("Add Item");
		btnAddItem.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddItem.setEnabled(false);
		btnAddItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddItem.setBounds(581, 297, 118, 33);
		panel.add(btnAddItem);
		
		JLabel lblTotal = new JLabel("Total (no taxes) :");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotal.setBounds(481, 506, 123, 33);
		panel.add(lblTotal);
		
		TxtTotal = new JTextField();
		TxtTotal.setEditable(false);
		TxtTotal.setColumns(12);
		TxtTotal.setBounds(619, 512, 103, 22);
		panel.add(TxtTotal);
		
		JLabel label_1 = new JLabel("$");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(732, 513, 19, 16);
		panel.add(label_1);
		
		btnOrder = new JButton("Order Food");
		btnOrder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnOrder.setEnabled(false);
		btnOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnOrder.setBounds(522, 561, 181, 33);
		panel.add(btnOrder);
		
		 RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(567, 117, 181, 27);
		panel.add(RestaurantComboBox);
		
		MenuComboBox = new JComboBox();
		MenuComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		MenuComboBox.setBounds(60, 284, 181, 27);
		panel.add(MenuComboBox);
		
		PostalCodeComboBox = new JComboBox();
		
		PostalCodeComboBox.setBounds(310, 197, 191, 27);
		panel.add(PostalCodeComboBox);
		
		OrderTable = new JTable();
		OrderTable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		OrderTable.setFont(new Font("Tahoma", Font.BOLD, 14));
		OrderTable.setRowHeight(25);
		OrderTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		OrderTable.setBounds(51, 496, 402, 133);
		panel.add(OrderTable);
		
		textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setEditable(false);
		textArea.setBounds(546, 104, 211, 162);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setEditable(false);
		textArea_1.setBounds(51, 273, 201, 162);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setEditable(false);
		textArea_2.setBounds(272, 273, 269, 162);
		panel.add(textArea_2);
		
		label_2 = new JLabel("Item Name |Item  Price |Item  Qty | Item Total");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(55, 462, 424, 21);
		panel.add(label_2);
		
		this.setVisible(true);
		
	}

	

	/**
	 * @return the orderTable
	 */
	public JTable getOrderTable() {
		return OrderTable;
	}

	/**
	 * @param orderTable the orderTable to set
	 */
	public void setOrderTable(JTable orderTable) {
		OrderTable = orderTable;
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
	 * @return the orderFoodMenuBar
	 */
	public JMenuBar getOrderFoodMenuBar() {
		return OrderFoodMenuBar;
	}

	/**
	 * @param orderFoodMenuBar the orderFoodMenuBar to set
	 */
	public void setOrderFoodMenuBar(JMenuBar orderFoodMenuBar) {
		OrderFoodMenuBar = orderFoodMenuBar;
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
	 * @return the orderHistoryMItem
	 */
	public JMenuItem getOrderHistoryMItem() {
		return OrderHistoryMItem;
	}

	/**
	 * @param orderHistoryMItem the orderHistoryMItem to set
	 */
	public void setOrderHistoryMItem(JMenuItem orderHistoryMItem) {
		OrderHistoryMItem = orderHistoryMItem;
	}

	/**
	 * @return the menu2MItem
	 */
	public JMenuItem getProfileMItem() {
		return ProfileMItem;
	}

	/**
	 * @param menu2mItem the menu2MItem to set
	 */
	public void setProfileMItem(JMenuItem profileMItem) {
		ProfileMItem = profileMItem;
	}


	/**
	 * @return the txtOrderDeliveryDate
	 */
	public JTextField getTxtOrderDeliveryDate() {
		return TxtOrderDeliveryDate;
	}

	/**
	 * @param txtOrderDeliveryDate the txtOrderDeliveryDate to set
	 */
	public void setTxtOrderDeliveryDate(JTextField txtOrderDeliveryDate) {
		TxtOrderDeliveryDate = txtOrderDeliveryDate;
	}

	
	/**
	 * @return the postalCodeComboBox
	 */
	public JComboBox getPostalCodeComboBox() {
		return PostalCodeComboBox;
	}

	/**
	 * @param postalCodeComboBox the postalCodeComboBox to set
	 */
	public void setPostalCodeComboBox(JComboBox postalCodeComboBox) {
		PostalCodeComboBox = postalCodeComboBox;
	}

	/**
	 * @return the txtHour
	 */
	public JTextField getTxtHour() {
		return TxtHour;
	}

	/**
	 * @param txtHour the txtHour to set
	 */
	public void setTxtHour(JTextField txtHour) {
		TxtHour = txtHour;
	}

	

	/**
	 * @return the txtMeal
	 */
	public JTextField getTxtMeal() {
		return TxtMeal;
	}

	/**
	 * @param txtMeal the txtMeal to set
	 */
	public void setTxtMeal(JTextField txtMeal) {
		TxtMeal = txtMeal;
	}

	/**
	 * @return the txtPrice
	 */
	public JTextField getTxtPrice() {
		return TxtPrice;
	}

	/**
	 * @param txtPrice the txtPrice to set
	 */
	public void setTxtPrice(JTextField txtPrice) {
		TxtPrice = txtPrice;
	}

	/**
	 * @return the txtQuantity
	 */
	public JTextField getTxtQuantity() {
		return TxtQuantity;
	}

	/**
	 * @param txtQuantity the txtQuantity to set
	 */
	public void setTxtQuantity(JTextField txtQuantity) {
		TxtQuantity = txtQuantity;
	}

	/**
	 * @return the txtTotal
	 */
	public JTextField getTxtTotal() {
		return TxtTotal;
	}

	/**
	 * @param txtTotal the txtTotal to set
	 */
	public void setTxtTotal(JTextField txtTotal) {
		TxtTotal = txtTotal;
	}

	/**
	 * @return the btnDeleteItem
	 */
	public JButton getBtnDeleteItem() {
		return btnDeleteItem;
	}

	/**
	 * @param btnDeleteItem the btnDeleteItem to set
	 */
	public void setBtnDeleteItem(JButton btnDeleteItem) {
		this.btnDeleteItem = btnDeleteItem;
	}

	/**
	 * @return the btnAddItem
	 */
	public JButton getBtnAddItem() {
		return btnAddItem;
	}

	/**
	 * @param btnAddItem the btnAddItem to set
	 */
	public void setBtnAddItem(JButton btnAddItem) {
		this.btnAddItem = btnAddItem;
	}

	/**
	 * @return the btnOrder
	 */
	public JButton getBtnOrder() {
		return btnOrder;
	}

	/**
	 * @param btnOrder the btnOrder to set
	 */
	public void setBtnOrder(JButton btnOrder) {
		this.btnOrder = btnOrder;
	}
	
	/**
	 * @return the restaurantComboBox
	 */
	public JComboBox getRestaurantComboBox() {
		return RestaurantComboBox;
	}

	/**
	 * @param restaurantComboBox the restaurantComboBox to set
	 */
	public void setRestaurantComboBox(JComboBox restaurantComboBox) {
		RestaurantComboBox = restaurantComboBox;
	}

	/**
	 * @return the menuComboBox
	 */
	public JComboBox getMenuComboBox() {
		return MenuComboBox;
	}

	/**
	 * @param menuComboBox the menuComboBox to set
	 */
	public void setMenuComboBox(JComboBox menuComboBox) {
		MenuComboBox = menuComboBox;
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
	
	/**
	 * @return the model
	 */
	public DefaultTableModel getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(DefaultTableModel model) {
		this.model = model;
	}
}
