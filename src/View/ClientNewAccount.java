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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ClientNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField txtuname;
	private JTextField LastNametextField;
	private JTextField FirstNametextField;
	private JTextField AddresstextField;
	private JTextField EmailtextField;
	private JTextField TxtPhoneNo;
	private JButton btnVerify;
	private JButton btnSave;
	private JPanel panel;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JMenuBar ClientMenuBar;
	private JMenu FileMenu;
	private JMenuItem DisconnectMItem,CloseMItem;
	

	
	
	
	/**
	 * Create the frame.
	 */
	public ClientNewAccount() {
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 700);


		JLabel bg = new JLabel(new ImageIcon("Images/background.jpg"));

		setContentPane(bg);

		panel = new JPanel();
		panel.setBounds(0, 0, 790, 650);
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
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(141, 57, 471, 75);
		panel.add(lblNewLabel);
		

		ImageIcon icon6 = new ImageIcon("Images/CLIENTNEW.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblNewLabel.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(141, 145, 102, 33);
		panel.add(lblUserName);
		
		txtuname = new JTextField();
		txtuname.setColumns(12);
		txtuname.setBounds(341, 152, 191, 22);
		panel.add(txtuname);
	
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(141, 195, 102, 33);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfirmPassword.setBounds(141, 238, 183, 33);
		panel.add(lblConfirmPassword);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(141, 284, 183, 33);
		panel.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setColumns(12);
		LastNametextField.setBounds(341, 291, 191, 22);
		panel.add(LastNametextField);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(141, 330, 183, 33);
		panel.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setColumns(12);
		FirstNametextField.setBounds(341, 337, 191, 22);
		panel.add(FirstNametextField);
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(141, 374, 183, 33);
		panel.add(lblAddress);
		
		AddresstextField = new JTextField();
		AddresstextField.setColumns(12);
		AddresstextField.setBounds(341, 381, 191, 22);
		panel.add(AddresstextField);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(141, 420, 183, 33);
		panel.add(lblEmail);
		
		EmailtextField = new JTextField();
		EmailtextField.setColumns(12);
		EmailtextField.setBounds(341, 427, 191, 22);
		panel.add(EmailtextField);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(141, 460, 183, 33);
		panel.add(lblPhoneNumber);
		
		btnVerify = new JButton("Verify");
		btnVerify.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVerify.setBounds(568, 152, 114, 25);
		panel.add(btnVerify);
		
		btnSave = new JButton("Save");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSave.setBounds(341, 519, 191, 33);
		panel.add(btnSave);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(341, 468, 191, 22);
		panel.add(TxtPhoneNo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(341, 204, 191, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(341, 247, 191, 20);
		panel.add(passwordField_1);
		
		
		
		this.setVisible(true);
	}



	/**
	 * @return the clientMenuBar
	 */
	public JMenuBar getClientMenuBar() {
		return ClientMenuBar;
	}



	/**
	 * @param clientMenuBar the clientMenuBar to set
	 */
	public void setClientMenuBar(JMenuBar clientMenuBar) {
		ClientMenuBar = clientMenuBar;
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



	public JPanel getPanel() {
		return panel;
	}



	public void setPanel(JPanel panel) {
		this.panel = panel;
	}



	public JPanel getContentPane() {
		return contentPane;
	}



	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}



	public JTextField getTxtuname() {
		return txtuname;
	}



	public void setTxtuname(JTextField txtuname) {
		this.txtuname = txtuname;
	}



	


	public JTextField getLastNametextField() {
		return LastNametextField;
	}



	public void setLastNametextField(JTextField lastNametextField) {
		LastNametextField = lastNametextField;
	}



	public JTextField getFirstNametextField() {
		return FirstNametextField;
	}



	public JPasswordField getPasswordField() {
		return passwordField;
	}



	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}



	public JPasswordField getPasswordField_1() {
		return passwordField_1;
	}



	public void setPasswordField_1(JPasswordField passwordField_1) {
		this.passwordField_1 = passwordField_1;
	}



	public void setFirstNametextField(JTextField firstNametextField) {
		FirstNametextField = firstNametextField;
	}



	public JTextField getAddresstextField() {
		return AddresstextField;
	}



	public void setAddresstextField(JTextField addresstextField) {
		AddresstextField = addresstextField;
	}



	public JTextField getEmailtextField() {
		return EmailtextField;
	}



	public void setEmailtextField(JTextField emailtextField) {
		EmailtextField = emailtextField;
	}



	public JTextField getTxtPhoneNo() {
		return TxtPhoneNo;
	}



	public void setTxtPhoneNo(JTextField txtPhoneNo) {
		TxtPhoneNo = txtPhoneNo;
	}



	public JButton getBtnVerify() {
		return btnVerify;
	}



	public void setBtnVerify(JButton btnVerify) {
		this.btnVerify = btnVerify;
	}



	public JButton getBtnSave() {
		return btnSave;
	}



	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	


}
