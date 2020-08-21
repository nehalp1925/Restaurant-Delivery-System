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

public class ClientPage extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar ClientMenuBar;
	private JMenu FileMenu,OrderMenu,AccountMenu;
	private JMenuItem DisconnectMItem,CloseMItem,OrderFoodMItem,OrderHistoryMItem,EditMItem,DeleteMItem;
	private JTextField TxtUserName;
	private JTextField TxtLastName;
	private JTextField TxtFirstName;
	private JTextField TxtAddress;
	private JTextField TxtEmail;
	private JTextField TxtPhoneNo;
	private JTextField tc;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ClientPage() {
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
		
		ClientMenuBar = new JMenuBar();
		ClientMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ClientMenuBar.setBackground(new Color(255, 204, 0));
		ClientMenuBar.setBounds(0, 0, 785, 25);
		panel.add(ClientMenuBar);
		
		FileMenu = new JMenu("File");
		ClientMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		CloseMItem = new JMenuItem("Close");
		FileMenu.add(CloseMItem);
		
		AccountMenu = new JMenu("Account");
		ClientMenuBar.add(AccountMenu);
		
		EditMItem = new JMenuItem("Edit Account");
		AccountMenu.add(EditMItem);
		
		DeleteMItem = new JMenuItem("Delete Account");
		AccountMenu.add(DeleteMItem);
		
		OrderMenu = new JMenu("Order");
		ClientMenuBar.add(OrderMenu);
		
		OrderFoodMItem = new JMenuItem("Order Food");
		OrderMenu.add(OrderFoodMItem);
		
		OrderHistoryMItem = new JMenuItem("Order History");
		OrderMenu.add(OrderHistoryMItem);
		
		JLabel lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(185, 70, 423, 75);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/CLIENTPAGE.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(202, 188, 102, 33);
		panel.add(lblUserName);
		
		TxtUserName = new JTextField();
		TxtUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtUserName.setEditable(false);
		TxtUserName.setColumns(12);
		TxtUserName.setBounds(402, 195, 191, 22);
		panel.add(TxtUserName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(202, 234, 183, 33);
		panel.add(lblLastName);
		
		TxtLastName = new JTextField();
		TxtLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtLastName.setEditable(false);
		TxtLastName.setColumns(12);
		TxtLastName.setBounds(402, 241, 191, 22);
		panel.add(TxtLastName);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(202, 280, 183, 33);
		panel.add(lblFirstName);
		
		TxtFirstName = new JTextField();
		TxtFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtFirstName.setEditable(false);
		TxtFirstName.setColumns(12);
		TxtFirstName.setBounds(402, 287, 191, 22);
		panel.add(TxtFirstName);
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(202, 326, 183, 33);
		panel.add(lblAddress);
		
		TxtAddress = new JTextField();
		TxtAddress.setEditable(false);
		TxtAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtAddress.setColumns(12);
		TxtAddress.setBounds(402, 333, 191, 22);
		panel.add(TxtAddress);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(202, 372, 183, 33);
		panel.add(lblEmail);
		
		TxtEmail = new JTextField();
		TxtEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtEmail.setEditable(false);
		TxtEmail.setColumns(12);
		TxtEmail.setBounds(402, 379, 191, 22);
		panel.add(TxtEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(202, 418, 183, 33);
		panel.add(lblPhoneNumber);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(402, 425, 191, 22);
		panel.add(TxtPhoneNo);
		
		this.setVisible(true);
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

	public JMenuBar getClientMenuBar() {
		return ClientMenuBar;
	}

	public void setClientMenuBar(JMenuBar clientMenuBar) {
		ClientMenuBar = clientMenuBar;
	}

	public JMenu getFileMenu() {
		return FileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
	}

	public JMenu getOrderMenu() {
		return OrderMenu;
	}

	public void setOrderMenu(JMenu orderMenu) {
		OrderMenu = orderMenu;
	}

	public JMenu getAccountMenu() {
		return AccountMenu;
	}

	public void setAccountMenu(JMenu accountMenu) {
		AccountMenu = accountMenu;
	}

	public JMenuItem getDisconnectMItem() {
		return DisconnectMItem;
	}

	public void setDisconnectMItem(JMenuItem disconnectMItem) {
		DisconnectMItem = disconnectMItem;
	}

	public JMenuItem getCloseMItem() {
		return CloseMItem;
	}

	public void setCloseMItem(JMenuItem closeMItem) {
		CloseMItem = closeMItem;
	}

	public JMenuItem getOrderFoodMItem() {
		return OrderFoodMItem;
	}

	public void setOrderFoodMItem(JMenuItem orderFoodMItem) {
		OrderFoodMItem = orderFoodMItem;
	}

	public JMenuItem getOrderHistoryMItem() {
		return OrderHistoryMItem;
	}

	public void setOrderHistoryMItem(JMenuItem orderHistoryMItem) {
		OrderHistoryMItem = orderHistoryMItem;
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

	public JTextField getTxtUserName() {
		return TxtUserName;
	}

	public void setTxtUserName(JTextField txtUserName) {
		TxtUserName = txtUserName;
	}

	

	public JTextField getTxtLastName() {
		return TxtLastName;
	}

	public void setTxtLastName(JTextField txtLastName) {
		TxtLastName = txtLastName;
	}

	public JTextField getTxtFirstName() {
		return TxtFirstName;
	}

	public void setTxtFirstName(JTextField txtFirstName) {
		TxtFirstName = txtFirstName;
	}

	public JTextField getTxtAddress() {
		return TxtAddress;
	}

	public void setTxtAddress(JTextField txtAddress) {
		TxtAddress = txtAddress;
	}

	public JTextField getTxtEmail() {
		return TxtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		TxtEmail = txtEmail;
	}

	public JTextField getTxtPhoneNo() {
		return TxtPhoneNo;
	}

	public void setTxtPhoneNo(JTextField txtPhoneNo) {
		TxtPhoneNo = txtPhoneNo;
	}

	
}
