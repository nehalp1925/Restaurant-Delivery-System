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
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ViewDeliveries extends JFrame {

	private JPanel contentPane,panel;	
	private JLabel bg;
	private JMenuBar AcceptDeliveryMenuBar;
	private JMenu MenuFile;
	private JMenu MenuDelivery;
	private JMenuItem JMenuItemDiscount;
	private JMenuItem JMenuItemQuit;
	private JMenuItem JMenuItemViewDelivery;
	private JMenuItem JMenuItemAcceptDelivery;
	private JMenuItem JMenuItemDeliveryMade;
	private JLabel lblTitle,lblOrderTitle,lblRestaurant,lblDeliveryAddress,lblDeliveryPostalCode;
	private JLabel lblRestaurantAns,lblDeliveryAddressAns,lblDeliveryPostalCodeAns;
	private JButton btnAcceptDelivery;
	private JComboBox ClientComboBox;
	private JComboBox TimeComboBox;
	private JTable Ordertable;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblSelectTime;
	
	
	/**
	 * Create the frame.
	 */
	public ViewDeliveries() {
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
		AcceptDeliveryMenuBar.setBackground(new Color(255, 204, 0));
		AcceptDeliveryMenuBar.setBounds(0, 0, 785, 25);
		panel.add(AcceptDeliveryMenuBar);
		
		MenuFile = new JMenu("File");
		AcceptDeliveryMenuBar.add(MenuFile);
		
		JMenuItemDiscount = new JMenuItem("Disconnet");
		MenuFile.add(JMenuItemDiscount);
		
		JMenuItemQuit = new JMenuItem("Close");
		MenuFile.add(JMenuItemQuit);
		
		MenuDelivery = new JMenu("Delivery");
		AcceptDeliveryMenuBar.add(MenuDelivery);
		
		JMenuItemViewDelivery = new JMenuItem("View Delivery");
		MenuDelivery.add(JMenuItemViewDelivery);
		
		JMenuItemAcceptDelivery = new JMenuItem("Accept Delivery");
		MenuDelivery.add(JMenuItemAcceptDelivery);
		
		JMenuItemDeliveryMade = new JMenuItem("Delivery Made");
		MenuDelivery.add(JMenuItemDeliveryMade);		
		
		lblTitle = new JLabel("");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTitle.setBounds(177, 29, 472, 67);
		panel.add(lblTitle);
		
		ImageIcon icon6 = new ImageIcon("Images/VIEWDELIVERIES.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle.setIcon(icon7);
		
		lblOrderTitle = new JLabel("Select Client");
		lblOrderTitle.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrderTitle.setBounds(115, 91, 119, 37);
		panel.add(lblOrderTitle);
		
		lblRestaurant = new JLabel("Restaurant Name :");
		lblRestaurant.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblRestaurant.setBounds(337, 155, 166, 21);
		panel.add(lblRestaurant);
		
		lblDeliveryAddress = new JLabel("Delivery Address :");
		lblDeliveryAddress.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblDeliveryAddress.setBounds(337, 259, 179, 21);
		panel.add(lblDeliveryAddress);
		
		lblDeliveryPostalCode = new JLabel("Restaurant Address :");
		lblDeliveryPostalCode.setFont(new Font("Ebrima", Font.BOLD, 17));
		lblDeliveryPostalCode.setBounds(337, 205, 204, 21);
		panel.add(lblDeliveryPostalCode);
		
		btnAcceptDelivery = new JButton("Delivery Made");
		btnAcceptDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAcceptDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAcceptDelivery.setBounds(322, 592, 221, 29);
		panel.add(btnAcceptDelivery);
		
		lblRestaurantAns = new JLabel("");
		lblRestaurantAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblRestaurantAns.setBounds(542, 160, 147, 14);
		panel.add(lblRestaurantAns);
		
		lblDeliveryAddressAns = new JLabel("");
		lblDeliveryAddressAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDeliveryAddressAns.setBounds(542, 259, 147, 14);
		panel.add(lblDeliveryAddressAns);
		
		lblDeliveryPostalCodeAns = new JLabel("");
		lblDeliveryPostalCodeAns.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblDeliveryPostalCodeAns.setBounds(542, 210, 137, 14);
		panel.add(lblDeliveryPostalCodeAns);		
		
		ClientComboBox = new JComboBox();
		ClientComboBox.setBounds(64, 150, 204, 37);
		panel.add(ClientComboBox);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBounds(64, 399, 204, 37);
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
		Ordertable.setBounds(322, 380, 401, 190);
		panel.add(Ordertable);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(51, 134, 235, 190);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(51, 380, 235, 190);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(322, 133, 401, 190);
		panel.add(textArea_2);
		
		label = new JLabel("Item Name |Item  Price |Item  Qty | Item Total");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(329, 348, 381, 21);
		panel.add(label);
		
		label_1 = new JLabel("Order Detail");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(476, 85, 119, 48);
		panel.add(label_1);
		
		lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectTime.setBounds(115, 337, 119, 37);
		panel.add(lblSelectTime);
		
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
	public JMenuItem getJMenuItemViewDelivery() {
		return JMenuItemViewDelivery;
	}
	public void setJMenuItemViewDelivery(JMenuItem jMenuItemViewDelivery) {
		JMenuItemViewDelivery = jMenuItemViewDelivery;
	}
	public JMenuItem getJMenuItemAcceptDelivery() {
		return JMenuItemAcceptDelivery;
	}
	public void setJMenuItemAcceptDelivery(JMenuItem jMenuItemAcceptDelivery) {
		JMenuItemAcceptDelivery = jMenuItemAcceptDelivery;
	}
	public JMenuItem getJMenuItemDeliveryMade() {
		return JMenuItemDeliveryMade;
	}
	public void setJMenuItemDeliveryMade(JMenuItem jMenuItemDeliveryMade) {
		JMenuItemDeliveryMade = jMenuItemDeliveryMade;
	}
	public JLabel getLblTitle() {
		return lblTitle;
	}
	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}
	public JLabel getLblOrderTitle() {
		return lblOrderTitle;
	}
	public void setLblOrderTitle(JLabel lblOrderTitle) {
		this.lblOrderTitle = lblOrderTitle;
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
	
}
