package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class AcceptingDelivery extends JFrame {

	private JPanel contentPane,panel;	
	private JLabel bg;
	private JMenuBar AcceptDeliveryMenuBar;
	private JMenu MenuFile;
	private JMenu MenuDelivery;
	private JMenuItem JMenuItemDiscount;
	private JMenuItem JMenuItemQuit;
	private JMenuItem JMenuItemAcceptDelivery;
	private JLabel lblTitle,lblRestaurant,lblDeliveryAddress,lblDeliveryPostalCode;
	private JLabel lblRestaurantAns,lblDeliveryAddressAns,lblDeliveryPostalCodeAns;
	private JButton btnAcceptDelivery;
	private JComboBox ClientComboBox,PostalCodeComboBox;
	private JComboBox TimeComboBox;
	private JTable Ordertable;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextArea textArea_3;
	
	
	public AcceptingDelivery() {
		//setFont(new Font("Dialog", Font.BOLD, 15));
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
		
		AcceptDeliveryMenuBar = new JMenuBar();
		AcceptDeliveryMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	//	AcceptDeliveryMenuBar.setFont(new Font("Segoe UI", Font.BOLD, 19));
		AcceptDeliveryMenuBar.setBackground(new Color(255, 204, 0));
		AcceptDeliveryMenuBar.setBounds(0, 0, 785, 25);
		panel.add(AcceptDeliveryMenuBar);
		
		MenuFile = new JMenu("File");
		AcceptDeliveryMenuBar.add(MenuFile);
		
		JMenuItemDiscount = new JMenuItem("Disconnet");
		MenuFile.add(JMenuItemDiscount);
		
		JMenuItemQuit = new JMenuItem("Close");
		MenuFile.add(JMenuItemQuit);
		
		MenuDelivery = new JMenu("Profile");
		AcceptDeliveryMenuBar.add(MenuDelivery);
		
		JMenuItemAcceptDelivery = new JMenuItem("Dashboard");
		MenuDelivery.add(JMenuItemAcceptDelivery);
		
		lblTitle = new JLabel("");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitle.setBounds(167, 38, 448, 70);
		panel.add(lblTitle);
		
		ImageIcon icon8 = new ImageIcon("Images/ACCEPTINGDELIVERY.png");
		Image img3 = icon8.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon9 = new ImageIcon(img3);
		lblTitle.setIcon(icon9);
		
		lblRestaurant = new JLabel("Restaurant Name :");
		lblRestaurant.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblRestaurant.setBounds(80, 395, 138, 21);
		panel.add(lblRestaurant);
		
		lblDeliveryAddress = new JLabel("Delivery Address :");
		lblDeliveryAddress.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblDeliveryAddress.setBounds(80, 498, 133, 21);
		panel.add(lblDeliveryAddress);
		
		lblDeliveryPostalCode = new JLabel("Restaurant Address :");
		lblDeliveryPostalCode.setFont(new Font("Ebrima", Font.BOLD, 14));
		lblDeliveryPostalCode.setBounds(80, 445, 138, 21);
		panel.add(lblDeliveryPostalCode);
		
		btnAcceptDelivery = new JButton("Accept Delivery");
		btnAcceptDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAcceptDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAcceptDelivery.setBounds(239, 583, 307, 29);
		panel.add(btnAcceptDelivery);
		
		lblRestaurantAns = new JLabel("");
		lblRestaurantAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblRestaurantAns.setBounds(228, 397, 147, 14);
		panel.add(lblRestaurantAns);
		
		lblDeliveryAddressAns = new JLabel("");
		lblDeliveryAddressAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDeliveryAddressAns.setBounds(228, 501, 147, 14);
		panel.add(lblDeliveryAddressAns);
		
		lblDeliveryPostalCodeAns = new JLabel("");
		lblDeliveryPostalCodeAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDeliveryPostalCodeAns.setBounds(228, 448, 137, 14);
		panel.add(lblDeliveryPostalCodeAns);		
		
		ClientComboBox = new JComboBox();
		ClientComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		ClientComboBox.setBounds(304, 166, 158, 29);
		panel.add(ClientComboBox);
		
		PostalCodeComboBox = new JComboBox();
		PostalCodeComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		PostalCodeComboBox.setBounds(83, 166, 158, 29);
		panel.add(PostalCodeComboBox);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		TimeComboBox.setBounds(513, 166, 168, 29);
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
		Ordertable.setBounds(407, 382, 293, 177);
		panel.add(Ordertable);
		
		textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setEditable(false);
		textArea.setBounds(496, 143, 204, 177);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setEditable(false);
		textArea_1.setBounds(289, 143, 195, 177);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setEditable(false);
		textArea_2.setBounds(68, 143, 198, 177);
		panel.add(textArea_2);
		
		textArea_3 = new JTextArea();
		textArea_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_3.setEditable(false);
		textArea_3.setBounds(68, 382, 307, 177);
		panel.add(textArea_3);
		
		JLabel lblPostalCode = new JLabel("Postal Code");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPostalCode.setBounds(110, 111, 110, 21);
		panel.add(lblPostalCode);
		
		JLabel lblSelectClient = new JLabel("Select Client");
		lblSelectClient.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectClient.setBounds(323, 111, 116, 21);
		panel.add(lblSelectClient);
		
		JLabel lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectTime.setBounds(536, 111, 110, 21);
		panel.add(lblSelectTime);
		
		JLabel lblRestaurantDetail = new JLabel("Restaurant Detail");
		lblRestaurantDetail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantDetail.setBounds(146, 350, 158, 21);
		panel.add(lblRestaurantDetail);
		
		JLabel lblItemName = new JLabel("Name   |  Price  |   Qty   |   Total");
		lblItemName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblItemName.setBounds(413, 350, 287, 21);
		panel.add(lblItemName);
		
		this.setVisible(true);
	}
	public JTable getOrdertable() {
		return Ordertable;
	}
	public void setOrdertable(JTable ordertable) {
		Ordertable = ordertable;
	}
	public JComboBox getTimeComboBox() {
		return TimeComboBox;
	}
	public void setTimeComboBox(JComboBox timeComboBox) {
		TimeComboBox = timeComboBox;
	}
	public JPanel getContentPane() {
		return contentPane;
	}
	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}
	public JPanel getPanel() {
		return panel;
	}
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	public JLabel getBg() {
		return bg;
	}
	public void setBg(JLabel bg) {
		this.bg = bg;
	}
	
	public JMenuBar getAcceptDeliveryMenuBar() {
		return AcceptDeliveryMenuBar;
	}
	public void setAcceptDeliveryMenuBar(JMenuBar acceptDeliveryMenuBar) {
		AcceptDeliveryMenuBar = acceptDeliveryMenuBar;
	}
	public JMenu getMenuFile() {
		return MenuFile;
	}
	public void setMenuFile(JMenu menuFile) {
		MenuFile = menuFile;
	}
	public JMenu getMenuDelivery() {
		return MenuDelivery;
	}
	public void setMenuDelivery(JMenu menuDelivery) {
		MenuDelivery = menuDelivery;
	}
	public JMenuItem getJMenuItemDiscount() {
		return JMenuItemDiscount;
	}
	public void setJMenuItemDiscount(JMenuItem jMenuItemDiscount) {
		JMenuItemDiscount = jMenuItemDiscount;
	}
	public JMenuItem getJMenuItemQuit() {
		return JMenuItemQuit;
	}
	public void setJMenuItemQuit(JMenuItem jMenuItemQuit) {
		JMenuItemQuit = jMenuItemQuit;
	}
	
	public JMenuItem getJMenuItemAcceptDelivery() {
		return JMenuItemAcceptDelivery;
	}
	public void setJMenuItemAcceptDelivery(JMenuItem jMenuItemAcceptDelivery) {
		JMenuItemAcceptDelivery = jMenuItemAcceptDelivery;
	}
	
	public JLabel getLblTitle() {
		return lblTitle;
	}
	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}
	
	
	public JLabel getLblRestaurant() {
		return lblRestaurant;
	}
	public void setLblRestaurant(JLabel lblRestaurant) {
		this.lblRestaurant = lblRestaurant;
	}
	public JLabel getLblDeliveryAddress() {
		return lblDeliveryAddress;
	}
	public void setLblDeliveryAddress(JLabel lblDeliveryAddress) {
		this.lblDeliveryAddress = lblDeliveryAddress;
	}
	public JLabel getLblDeliveryPostalCode() {
		return lblDeliveryPostalCode;
	}
	public void setLblDeliveryPostalCode(JLabel lblDeliveryPostalCode) {
		this.lblDeliveryPostalCode = lblDeliveryPostalCode;
	}
	
	public JLabel getLblRestaurantAns() {
		return lblRestaurantAns;
	}
	public void setLblRestaurantAns(JLabel lblRestaurantAns) {
		this.lblRestaurantAns = lblRestaurantAns;
	}
	public JLabel getLblDeliveryAddressAns() {
		return lblDeliveryAddressAns;
	}
	public void setLblDeliveryAddressAns(JLabel lblDeliveryAddressAns) {
		this.lblDeliveryAddressAns = lblDeliveryAddressAns;
	}
	public JLabel getLblDeliveryPostalCodeAns() {
		return lblDeliveryPostalCodeAns;
	}
	public void setLblDeliveryPostalCodeAns(JLabel lblDeliveryPostalCodeAns) {
		this.lblDeliveryPostalCodeAns = lblDeliveryPostalCodeAns;
	}
		public JButton getBtnAcceptDelivery() {
		return btnAcceptDelivery;
	}
	public void setBtnAcceptDelivery(JButton btnAcceptDelivery) {
		this.btnAcceptDelivery = btnAcceptDelivery;
	}
	public JComboBox getClientComboBox() {
		return ClientComboBox;
	}
	public void setClientComboBox(JComboBox clientComboBox) {
		ClientComboBox = clientComboBox;
	}
	public JComboBox getPostalCodeComboBox() {
		return PostalCodeComboBox;
	}
	public void setPostalCodeComboBox(JComboBox postalCodeComboBox) {
		PostalCodeComboBox = postalCodeComboBox;
	}
}
