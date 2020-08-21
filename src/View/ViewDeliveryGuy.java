package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ViewDeliveryGuy extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JLabel lblTitle1,lblRestaurantName,lblRestaurantAddress,lblTelephoneNumber,lblTitle2,lblDay;
	private JTextArea TxtAreaDeliveryArea;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu;
	private JMenuItem DisconnectMItem,CloseMItem;
	private JTextField txtuname,TxtPhoneNo;
	private JMenu DeliveryMenu;
	private JMenuItem AcceptDeliveryMItem;

	
	/**
	 * Create the frame.
	 */
	public ViewDeliveryGuy() {
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
		
		RestaurantMenuBar = new JMenuBar();
		RestaurantMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		RestaurantMenuBar.setBackground(new Color(255, 204, 0));
		RestaurantMenuBar.setBounds(0, 0, 785, 25);
		panel.add(RestaurantMenuBar);
		
		FileMenu = new JMenu("File");
		RestaurantMenuBar.add(FileMenu);
		
		DisconnectMItem = new JMenuItem("Disconnet");
		FileMenu.add(DisconnectMItem);
		
		CloseMItem = new JMenuItem("Close");
		FileMenu.add(CloseMItem);
		
		DeliveryMenu = new JMenu("Delivery");
		RestaurantMenuBar.add(DeliveryMenu);
		
		AcceptDeliveryMItem = new JMenuItem("Accept Delivery");
		DeliveryMenu.add(AcceptDeliveryMItem);
		
		JLabel lblCreateMenu = new JLabel("");
		lblCreateMenu.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCreateMenu.setBounds(170, 68, 422, 74);
		panel.add(lblCreateMenu);
		
		ImageIcon icon6 = new ImageIcon("Images/DELIVERYGUYDASHBOARD.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblCreateMenu.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(188, 188, 102, 33);
		panel.add(lblUserName);
		
		txtuname = new JTextField();
		txtuname.setEditable(false);
		txtuname.setColumns(12);
		txtuname.setBounds(388, 195, 204, 22);
		panel.add(txtuname);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(188, 258, 183, 33);
		panel.add(lblPhoneNumber);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(388, 266, 204, 22);
		panel.add(TxtPhoneNo);
		
		JLabel label_5 = new JLabel("Delivery Area");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(317, 328, 146, 37);
		panel.add(label_5);
		
		TxtAreaDeliveryArea = new JTextArea();
		TxtAreaDeliveryArea.setEditable(false);
		TxtAreaDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		TxtAreaDeliveryArea.setBounds(188, 401, 404, 68);
		panel.add(TxtAreaDeliveryArea);

		this.setVisible(true);
	}

	/**
	 * @return the deliveryMenu
	 */
	public JMenu getDeliveryMenu() {
		return DeliveryMenu;
	}

	/**
	 * @param deliveryMenu the deliveryMenu to set
	 */
	public void setDeliveryMenu(JMenu deliveryMenu) {
		DeliveryMenu = deliveryMenu;
	}

	/**
	 * @return the acceptDeliveryMItem
	 */
	public JMenuItem getAcceptDeliveryMItem() {
		return AcceptDeliveryMItem;
	}

	/**
	 * @param acceptDeliveryMItem the acceptDeliveryMItem to set
	 */
	public void setAcceptDeliveryMItem(JMenuItem acceptDeliveryMItem) {
		AcceptDeliveryMItem = acceptDeliveryMItem;
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
	 * @return the lblTitle1
	 */
	public JLabel getLblTitle1() {
		return lblTitle1;
	}

	/**
	 * @param lblTitle1 the lblTitle1 to set
	 */
	public void setLblTitle1(JLabel lblTitle1) {
		this.lblTitle1 = lblTitle1;
	}

	/**
	 * @return the lblRestaurantName
	 */
	public JLabel getLblRestaurantName() {
		return lblRestaurantName;
	}

	/**
	 * @param lblRestaurantName the lblRestaurantName to set
	 */
	public void setLblRestaurantName(JLabel lblRestaurantName) {
		this.lblRestaurantName = lblRestaurantName;
	}

	/**
	 * @return the lblRestaurantAddress
	 */
	public JLabel getLblRestaurantAddress() {
		return lblRestaurantAddress;
	}

	/**
	 * @param lblRestaurantAddress the lblRestaurantAddress to set
	 */
	public void setLblRestaurantAddress(JLabel lblRestaurantAddress) {
		this.lblRestaurantAddress = lblRestaurantAddress;
	}

	/**
	 * @return the lblTelephoneNumber
	 */
	public JLabel getLblTelephoneNumber() {
		return lblTelephoneNumber;
	}

	/**
	 * @param lblTelephoneNumber the lblTelephoneNumber to set
	 */
	public void setLblTelephoneNumber(JLabel lblTelephoneNumber) {
		this.lblTelephoneNumber = lblTelephoneNumber;
	}

	/**
	 * @return the lblTitle2
	 */
	public JLabel getLblTitle2() {
		return lblTitle2;
	}

	/**
	 * @param lblTitle2 the lblTitle2 to set
	 */
	public void setLblTitle2(JLabel lblTitle2) {
		this.lblTitle2 = lblTitle2;
	}

	/**
	 * @return the lblDay
	 */
	public JLabel getLblDay() {
		return lblDay;
	}

	/**
	 * @param lblDay the lblDay to set
	 */
	public void setLblDay(JLabel lblDay) {
		this.lblDay = lblDay;
	}

		
	

	

	/**
	 * @return the txtAreaDeliveryArea
	 */
	public JTextArea getTxtAreaDeliveryArea() {
		return TxtAreaDeliveryArea;
	}

	/**
	 * @param txtAreaDeliveryArea the txtAreaDeliveryArea to set
	 */
	public void setTxtAreaDeliveryArea(JTextArea txtAreaDeliveryArea) {
		TxtAreaDeliveryArea = txtAreaDeliveryArea;
	}

	/**
	 * @return the restaurantMenuBar
	 */
	public JMenuBar getRestaurantMenuBar() {
		return RestaurantMenuBar;
	}

	/**
	 * @param restaurantMenuBar the restaurantMenuBar to set
	 */
	public void setRestaurantMenuBar(JMenuBar restaurantMenuBar) {
		RestaurantMenuBar = restaurantMenuBar;
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
	 * @return the closeMItem
	 */
	public JMenuItem getCloseMItem() {
		return CloseMItem;
	}

	/**
	 * @param closeMItem the closeMItem to set
	 */
	public void setCloseMItem(JMenuItem closeMItem) {
		CloseMItem = closeMItem;
	}

	

	/**
	 * @return the txtuname
	 */
	public JTextField getTxtuname() {
		return txtuname;
	}

	/**
	 * @param txtuname the txtuname to set
	 */
	public void setTxtuname(JTextField txtuname) {
		this.txtuname = txtuname;
	}

	
	/**
	 * @return the txtPhoneNo
	 */
	public JTextField getTxtPhoneNo() {
		return TxtPhoneNo;
	}

	/**
	 * @param txtPhoneNo the txtPhoneNo to set
	 */
	public void setTxtPhoneNo(JTextField txtPhoneNo) {
		TxtPhoneNo = txtPhoneNo;
	}

	
}
