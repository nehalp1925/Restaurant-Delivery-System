package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ClientDeleteAccount extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar ClientMenuBar;
	private JMenu FileMenu,OrderMenu,AccountMenu;
	private JMenuItem DisconnectMItem,CloseMItem,EditMItem,ProfileMItem,OrderFoodMItem,OrderHistoryMItem;
	private JTextField TxtUserName;
	private JTextField TxtLastName;
	private JTextField TxtFirstName;
	private JTextField TxtAddress;
	private JTextField TxtEmail;
	private JTextField TxtPhoneNo;
	private JButton btnDelete;

	
	/**
	 * Create the frame.
	 */
	public ClientDeleteAccount() {
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
		
		ProfileMItem = new JMenuItem("Profile Account");
		AccountMenu.add(ProfileMItem);
		
		EditMItem = new JMenuItem("Edit Account");
		AccountMenu.add(EditMItem);
		
		OrderMenu = new JMenu("Order");
		ClientMenuBar.add(OrderMenu);
		
		OrderFoodMItem = new JMenuItem("Order Food");
		OrderMenu.add(OrderFoodMItem);
		
		OrderHistoryMItem = new JMenuItem("Order History");
		OrderMenu.add(OrderHistoryMItem);
		
		
		JLabel lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(175, 77, 463, 74);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/CLIENTDELETE.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(203, 198, 102, 33);
		panel.add(lblUserName);
		
		TxtUserName = new JTextField();
		TxtUserName.setEditable(false);
		TxtUserName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtUserName.setColumns(12);
		TxtUserName.setBounds(403, 205, 191, 22);
		panel.add(TxtUserName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(203, 242, 183, 33);
		panel.add(lblLastName);
		
		TxtLastName = new JTextField();
		TxtLastName.setEditable(false);
		TxtLastName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtLastName.setColumns(12);
		TxtLastName.setBounds(403, 249, 191, 22);
		panel.add(TxtLastName);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(203, 288, 183, 33);
		panel.add(lblFirstName);
		
		TxtFirstName = new JTextField();
		TxtFirstName.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtFirstName.setEditable(false);
		TxtFirstName.setColumns(12);
		TxtFirstName.setBounds(403, 295, 191, 22);
		panel.add(TxtFirstName);
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(203, 332, 183, 33);
		panel.add(lblAddress);
		
		TxtAddress = new JTextField();
		TxtAddress.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtAddress.setEditable(false);
		TxtAddress.setColumns(12);
		TxtAddress.setBounds(403, 339, 191, 22);
		panel.add(TxtAddress);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(203, 378, 183, 33);
		panel.add(lblEmail);
		
		TxtEmail = new JTextField();
		TxtEmail.setEditable(false);
		TxtEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtEmail.setColumns(12);
		TxtEmail.setBounds(403, 385, 191, 22);
		panel.add(TxtEmail);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(203, 429, 183, 33);
		panel.add(lblPhoneNumber);
		
		btnDelete = new JButton("Delete");	
		btnDelete.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(403, 496, 191, 33);
		panel.add(btnDelete);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(403, 438, 191, 22);
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

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}
	public JMenu getAccountMenu() {
		return AccountMenu;
	}

	public void setAccountMenu(JMenu accountMenu) {
		AccountMenu = accountMenu;
	}

	public JMenuItem getEditMItem() {
		return EditMItem;
	}

	public void setEditMItem(JMenuItem editMItem) {
		EditMItem = editMItem;
	}

	public JMenuItem getProfileMItem() {
		return ProfileMItem;
	}

	public void setProfileMItem(JMenuItem profileMItem) {
		ProfileMItem = profileMItem;
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
}
