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
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ChefInfo extends JFrame {

	private JPanel contentPane;
	private JPanel panel;	
	private JMenuBar ChefMenu;
	private JMenu FileMenu,OrderMenu;
	private JMenuItem DisconnectMItem,CloseMItem,AcceptOrderMenuItem,PreparedOrderMenuItem;
	private JLabel bg,lblTitle1,lblUserName,lblLastName,lblFirstName,lblAddress,lblEmail,lblPhoneNumber;
	private JTextField TxtUserName,TxtLastName,TxtFirstName,TxtAddress,TxtEmail,TxtPhoneNo;	
	private JLabel lblRestaurantName;
	private JTextField TxtRestaurantName;
	

	

	/**
	 * Create the frame.
	 */
	public ChefInfo() {
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

		ChefMenu = new JMenuBar();
		ChefMenu.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ChefMenu.setBackground(new Color(255, 204, 0));
		ChefMenu.setBounds(0, 0, 785, 25);
		panel.add(ChefMenu);

		FileMenu = new JMenu("File");
		ChefMenu.add(FileMenu);

		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);

		CloseMItem = new JMenuItem("Close");
		FileMenu.add(CloseMItem);	
		
		OrderMenu = new JMenu("Order");
		ChefMenu.add(OrderMenu);

		AcceptOrderMenuItem = new JMenuItem("Accept Order");
		OrderMenu.add(AcceptOrderMenuItem);

		PreparedOrderMenuItem = new JMenuItem("Prepared Order");
		OrderMenu.add(PreparedOrderMenuItem);	

		lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(190, 61, 414, 76);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/CHEFDASHBOARD.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);

		lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(190, 252, 102, 33);
		panel.add(lblUserName);

		TxtUserName = new JTextField();
		TxtUserName.setEditable(false);
		TxtUserName.setColumns(12);
		TxtUserName.setBounds(390, 259, 191, 22);
		panel.add(TxtUserName);

		lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(190, 308, 183, 33);
		panel.add(lblLastName);

		TxtLastName = new JTextField();
		TxtLastName.setEditable(false);
		TxtLastName.setColumns(12);
		TxtLastName.setBounds(390, 315, 191, 22);
		panel.add(TxtLastName);

		lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(190, 363, 183, 33);
		panel.add(lblFirstName);

		TxtFirstName = new JTextField();
		TxtFirstName.setEditable(false);
		TxtFirstName.setColumns(12);
		TxtFirstName.setBounds(390, 370, 191, 22);
		panel.add(TxtFirstName);

		lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(190, 420, 183, 33);
		panel.add(lblAddress);

		TxtAddress = new JTextField();
		TxtAddress.setEditable(false);
		TxtAddress.setColumns(12);
		TxtAddress.setBounds(390, 427, 191, 22);
		panel.add(TxtAddress);

		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(190, 473, 183, 33);
		panel.add(lblEmail);

		TxtEmail = new JTextField();
		TxtEmail.setEditable(false);
		TxtEmail.setColumns(12);
		TxtEmail.setBounds(390, 480, 191, 22);
		panel.add(TxtEmail);

		lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(190, 529, 183, 33);
		panel.add(lblPhoneNumber);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(390, 537, 191, 22);
		panel.add(TxtPhoneNo);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantName.setBounds(190, 193, 183, 33);
		panel.add(lblRestaurantName);
		
		TxtRestaurantName = new JTextField();
		TxtRestaurantName.setEditable(false);
		TxtRestaurantName.setColumns(12);
		TxtRestaurantName.setBounds(390, 200, 191, 22);
		panel.add(TxtRestaurantName);

		this.setVisible(true);
	}

	public JMenu getOrderMenu() {
		return OrderMenu;
	}

	public void setOrderMenu(JMenu orderMenu) {
		OrderMenu = orderMenu;
	}

	public JMenuItem getAcceptOrderMenuItem() {
		return AcceptOrderMenuItem;
	}

	public void setAcceptOrderMenuItem(JMenuItem acceptOrderMenuItem) {
		AcceptOrderMenuItem = acceptOrderMenuItem;
	}

	public JMenuItem getPreparedOrderMenuItem() {
		return PreparedOrderMenuItem;
	}

	public void setPreparedOrderMenuItem(JMenuItem preparedOrderMenuItem) {
		PreparedOrderMenuItem = preparedOrderMenuItem;
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
	 * @return the chefMenu
	 */
	public JMenuBar getChefMenu() {
		return ChefMenu;
	}

	/**
	 * @param chefMenu the chefMenu to set
	 */
	public void setChefMenu(JMenuBar chefMenu) {
		ChefMenu = chefMenu;
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
	 * @return the lblUserName
	 */
	public JLabel getLblUserName() {
		return lblUserName;
	}

	/**
	 * @param lblUserName the lblUserName to set
	 */
	public void setLblUserName(JLabel lblUserName) {
		this.lblUserName = lblUserName;
	}

	
	/**
	 * @return the lblLastName
	 */
	public JLabel getLblLastName() {
		return lblLastName;
	}

	/**
	 * @param lblLastName the lblLastName to set
	 */
	public void setLblLastName(JLabel lblLastName) {
		this.lblLastName = lblLastName;
	}

	/**
	 * @return the lblFirstName
	 */
	public JLabel getLblFirstName() {
		return lblFirstName;
	}

	/**
	 * @param lblFirstName the lblFirstName to set
	 */
	public void setLblFirstName(JLabel lblFirstName) {
		this.lblFirstName = lblFirstName;
	}

	/**
	 * @return the lblAddress
	 */
	public JLabel getLblAddress() {
		return lblAddress;
	}

	/**
	 * @param lblAddress the lblAddress to set
	 */
	public void setLblAddress(JLabel lblAddress) {
		this.lblAddress = lblAddress;
	}

	/**
	 * @return the lblEmail
	 */
	public JLabel getLblEmail() {
		return lblEmail;
	}

	/**
	 * @param lblEmail the lblEmail to set
	 */
	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}

	/**
	 * @return the lblPhoneNumber
	 */
	public JLabel getLblPhoneNumber() {
		return lblPhoneNumber;
	}

	/**
	 * @param lblPhoneNumber the lblPhoneNumber to set
	 */
	public void setLblPhoneNumber(JLabel lblPhoneNumber) {
		this.lblPhoneNumber = lblPhoneNumber;
	}

	/**
	 * @return the txtUserName
	 */
	public JTextField getTxtUserName() {
		return TxtUserName;
	}

	/**
	 * @param txtUserName the txtUserName to set
	 */
	public void setTxtUserName(JTextField txtUserName) {
		TxtUserName = txtUserName;
	}



	public JTextField getTxtRestaurantName() {
		return TxtRestaurantName;
	}

	public void setTxtRestaurantName(JTextField txtRestaurantName) {
		TxtRestaurantName = txtRestaurantName;
	}

	/**
	 * @return the txtLastName
	 */
	public JTextField getTxtLastName() {
		return TxtLastName;
	}

	/**
	 * @param txtLastName the txtLastName to set
	 */
	public void setTxtLastName(JTextField txtLastName) {
		TxtLastName = txtLastName;
	}

	/**
	 * @return the txtFirstName
	 */
	public JTextField getTxtFirstName() {
		return TxtFirstName;
	}

	/**
	 * @param txtFirstName the txtFirstName to set
	 */
	public void setTxtFirstName(JTextField txtFirstName) {
		TxtFirstName = txtFirstName;
	}

	/**
	 * @return the txtAddress
	 */
	public JTextField getTxtAddress() {
		return TxtAddress;
	}

	/**
	 * @param txtAddress the txtAddress to set
	 */
	public void setTxtAddress(JTextField txtAddress) {
		TxtAddress = txtAddress;
	}

	/**
	 * @return the txtEmail
	 */
	public JTextField getTxtEmail() {
		return TxtEmail;
	}

	/**
	 * @param txtEmail the txtEmail to set
	 */
	public void setTxtEmail(JTextField txtEmail) {
		TxtEmail = txtEmail;
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

