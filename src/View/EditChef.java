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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class EditChef extends JFrame {

	private JPanel contentPane;
	private JPanel panel;	
	private JMenuBar chefMenuBar ;
	private JMenu OrderMenu,FileMenu,RestaurantMenu,ManagerMenu,FoodMenu,ChefMenu;
	private JMenuItem AcceptOrderMenuItem,DisconnectMItem,PreparedOrderMenuItem,CloseMItem,EditRestaurantMItem,EditManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem,CreateChefMenuItem,DeleteChefMenuItem;
	private JLabel bg,lblTitle1,lblUserName,lblPassword,lblConfirmPassword,lblLastName,lblFirstName,lblAddress,lblEmail,lblPhoneNumber;
	private JTextField TxtUserName,TxtPassword,TxtConfrimPassword,TxtLastName,TxtFirstName,TxtAddress,TxtEmail,TxtPhoneNo;	
	private JButton btnSave;
	private JTextField TxtRestName;
	private JLabel lblRestaurantName;
	private JLabel lblChefName;
	private JComboBox ChefComboBox;
	private JTextArea textArea;
	




	/**
	 * Create the frame.
	 */
	public EditChef() {
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

		chefMenuBar = new JMenuBar();
		chefMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		chefMenuBar.setBackground(new Color(255, 204, 0));
		chefMenuBar.setBounds(0, 0, 785, 25);
		panel.add(chefMenuBar);

		FileMenu = new JMenu("File");
		chefMenuBar.add(FileMenu);
		
		DisconnectMItem = new JMenuItem("Disconnet");
		FileMenu.add(DisconnectMItem);
		
		CloseMItem = new JMenuItem("Close");
		FileMenu.add(CloseMItem);
		
		RestaurantMenu = new JMenu("Restaurant");
		chefMenuBar.add(RestaurantMenu);
		
		EditRestaurantMItem = new JMenuItem("Edit Restaurant");
		RestaurantMenu.add(EditRestaurantMItem);
		
		ManagerMenu = new JMenu("Manager");
		chefMenuBar.add(ManagerMenu);
		
		EditManagerItem = new JMenuItem("Edit Manager");
		ManagerMenu.add(EditManagerItem);
		
		FoodMenu = new JMenu("Menu");
		chefMenuBar.add(FoodMenu);
		
		CreateFoodMenuItem = new JMenuItem("Create Menu");
		FoodMenu.add(CreateFoodMenuItem);
		
		EditFoodMenuItem = new JMenuItem("Edit Menu");
		FoodMenu.add(EditFoodMenuItem);
		
		DeleteFoodMenuItem = new JMenuItem("Delete Menu");
		FoodMenu.add(DeleteFoodMenuItem);
		
		ChefMenu = new JMenu("Chef");
		chefMenuBar.add(ChefMenu);
		
		CreateChefMenuItem = new JMenuItem("Create Chef");
		ChefMenu.add(CreateChefMenuItem);
		
		DeleteChefMenuItem = new JMenuItem("Delete Chef");
		ChefMenu.add(DeleteChefMenuItem);
		
		OrderMenu = new JMenu("Order");
		chefMenuBar.add(OrderMenu);

		AcceptOrderMenuItem = new JMenuItem("Accept Order");
		OrderMenu.add(AcceptOrderMenuItem);

		PreparedOrderMenuItem = new JMenuItem("Prepared Order");
		OrderMenu.add(PreparedOrderMenuItem);	

		lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(278, 49, 468, 69);
		panel.add(lblTitle1);

		ImageIcon icon6 = new ImageIcon("Images/EDITCHEF.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(343, 180, 102, 33);
		panel.add(lblUserName);

		TxtUserName = new JTextField();
		TxtUserName.setEditable(false);
		TxtUserName.setColumns(12);
		TxtUserName.setBounds(543, 187, 191, 22);
		panel.add(TxtUserName);

		lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(343, 230, 102, 33);
		panel.add(lblPassword);

		TxtPassword = new JTextField();
		TxtPassword.setEditable(false);
		TxtPassword.setColumns(12);
		TxtPassword.setBounds(543, 237, 191, 22);
		panel.add(TxtPassword);	
		
		lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfirmPassword.setBounds(343, 273, 183, 33);
		panel.add(lblConfirmPassword);

		TxtConfrimPassword = new JTextField();
		TxtConfrimPassword.setEditable(false);
		TxtConfrimPassword.setColumns(12);
		TxtConfrimPassword.setBounds(543, 280, 191, 22);
		panel.add(TxtConfrimPassword);

		lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(343, 319, 183, 33);
		panel.add(lblLastName);

		TxtLastName = new JTextField();
		TxtLastName.setEditable(false);
		TxtLastName.setColumns(12);
		TxtLastName.setBounds(543, 326, 191, 22);
		panel.add(TxtLastName);

		lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(343, 365, 183, 33);
		panel.add(lblFirstName);

		TxtFirstName = new JTextField();
		TxtFirstName.setEditable(false);
		TxtFirstName.setColumns(12);
		TxtFirstName.setBounds(543, 372, 191, 22);
		panel.add(TxtFirstName);

		lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(343, 409, 183, 33);
		panel.add(lblAddress);

		TxtAddress = new JTextField();
		TxtAddress.setEditable(false);
		TxtAddress.setColumns(12);
		TxtAddress.setBounds(543, 416, 191, 22);
		panel.add(TxtAddress);

		lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(343, 455, 183, 33);
		panel.add(lblEmail);

		TxtEmail = new JTextField();
		TxtEmail.setEditable(false);
		TxtEmail.setColumns(12);
		TxtEmail.setBounds(543, 462, 191, 22);
		panel.add(TxtEmail);

		lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(343, 495, 183, 33);
		panel.add(lblPhoneNumber);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(543, 503, 191, 22);
		panel.add(TxtPhoneNo);

		btnSave = new JButton("Save");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSave.setEnabled(false);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSave.setBounds(543, 558, 191, 33);
		panel.add(btnSave);		
		
		TxtRestName = new JTextField();
		TxtRestName.setEditable(false);
		TxtRestName.setColumns(12);
		TxtRestName.setBounds(543, 141, 191, 22);
		panel.add(TxtRestName);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantName.setBounds(343, 134, 183, 33);
		panel.add(lblRestaurantName);
		
		lblChefName = new JLabel("Select Chef :");
		lblChefName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblChefName.setBounds(81, 93, 143, 33);
		panel.add(lblChefName);
		
		ChefComboBox = new JComboBox();
		ChefComboBox.setBounds(54, 154, 191, 33);
		panel.add(ChefComboBox);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(26, 141, 247, 199);
		panel.add(textArea);

		this.setVisible(true);
	}

	
	/**
	 * @return the chefMenuBar
	 */
	public JMenuBar getChefMenuBar() {
		return chefMenuBar;
	}


	/**
	 * @param chefMenuBar the chefMenuBar to set
	 */
	public void setChefMenuBar(JMenuBar chefMenuBar) {
		this.chefMenuBar = chefMenuBar;
	}


	/**
	 * @return the restaurantMenu
	 */
	public JMenu getRestaurantMenu() {
		return RestaurantMenu;
	}


	/**
	 * @param restaurantMenu the restaurantMenu to set
	 */
	public void setRestaurantMenu(JMenu restaurantMenu) {
		RestaurantMenu = restaurantMenu;
	}


	/**
	 * @return the managerMenu
	 */
	public JMenu getManagerMenu() {
		return ManagerMenu;
	}


	/**
	 * @param managerMenu the managerMenu to set
	 */
	public void setManagerMenu(JMenu managerMenu) {
		ManagerMenu = managerMenu;
	}


	/**
	 * @return the foodMenu
	 */
	public JMenu getFoodMenu() {
		return FoodMenu;
	}


	/**
	 * @param foodMenu the foodMenu to set
	 */
	public void setFoodMenu(JMenu foodMenu) {
		FoodMenu = foodMenu;
	}


	/**
	 * @return the chefMenu
	 */
	public JMenu getChefMenu() {
		return ChefMenu;
	}


	/**
	 * @param chefMenu the chefMenu to set
	 */
	public void setChefMenu(JMenu chefMenu) {
		ChefMenu = chefMenu;
	}


	/**
	 * @return the editRestaurantMItem
	 */
	public JMenuItem getEditRestaurantMItem() {
		return EditRestaurantMItem;
	}


	/**
	 * @param editRestaurantMItem the editRestaurantMItem to set
	 */
	public void setEditRestaurantMItem(JMenuItem editRestaurantMItem) {
		EditRestaurantMItem = editRestaurantMItem;
	}


	/**
	 * @return the editManagerItem
	 */
	public JMenuItem getEditManagerItem() {
		return EditManagerItem;
	}


	/**
	 * @param editManagerItem the editManagerItem to set
	 */
	public void setEditManagerItem(JMenuItem editManagerItem) {
		EditManagerItem = editManagerItem;
	}


	/**
	 * @return the createFoodMenuItem
	 */
	public JMenuItem getCreateFoodMenuItem() {
		return CreateFoodMenuItem;
	}


	/**
	 * @param createFoodMenuItem the createFoodMenuItem to set
	 */
	public void setCreateFoodMenuItem(JMenuItem createFoodMenuItem) {
		CreateFoodMenuItem = createFoodMenuItem;
	}


	/**
	 * @return the editFoodMenuItem
	 */
	public JMenuItem getEditFoodMenuItem() {
		return EditFoodMenuItem;
	}


	/**
	 * @param editFoodMenuItem the editFoodMenuItem to set
	 */
	public void setEditFoodMenuItem(JMenuItem editFoodMenuItem) {
		EditFoodMenuItem = editFoodMenuItem;
	}


	/**
	 * @return the deleteFoodMenuItem
	 */
	public JMenuItem getDeleteFoodMenuItem() {
		return DeleteFoodMenuItem;
	}


	/**
	 * @param deleteFoodMenuItem the deleteFoodMenuItem to set
	 */
	public void setDeleteFoodMenuItem(JMenuItem deleteFoodMenuItem) {
		DeleteFoodMenuItem = deleteFoodMenuItem;
	}


	/**
	 * @return the createChefMenuItem
	 */
	public JMenuItem getCreateChefMenuItem() {
		return CreateChefMenuItem;
	}


	/**
	 * @param createChefMenuItem the createChefMenuItem to set
	 */
	public void setCreateChefMenuItem(JMenuItem createChefMenuItem) {
		CreateChefMenuItem = createChefMenuItem;
	}


	/**
	 * @return the deleteChefMenuItem
	 */
	public JMenuItem getDeleteChefMenuItem() {
		return DeleteChefMenuItem;
	}


	/**
	 * @param deleteChefMenuItem the deleteChefMenuItem to set
	 */
	public void setDeleteChefMenuItem(JMenuItem deleteChefMenuItem) {
		DeleteChefMenuItem = deleteChefMenuItem;
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
	 * @return the lblChefName
	 */
	public JLabel getLblChefName() {
		return lblChefName;
	}


	/**
	 * @param lblChefName the lblChefName to set
	 */
	public void setLblChefName(JLabel lblChefName) {
		this.lblChefName = lblChefName;
	}


	/**
	 * @return the cehfComboBox
	 */
	public JComboBox getChefComboBox() {
		return ChefComboBox;
	}

	/**
	 * @param cehfComboBox the cehfComboBox to set
	 */
	public void setChefComboBox(JComboBox chefComboBox) {
		ChefComboBox = chefComboBox;
	}

	public JTextField getTxtRestName() {
		return TxtRestName;
	}

	public void setTxtRestName(JTextField txtRestName) {
		TxtRestName = txtRestName;
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
	 * @return the lblPassword
	 */
	public JLabel getLblPassword() {
		return lblPassword;
	}

	/**
	 * @param lblPassword the lblPassword to set
	 */
	public void setLblPassword(JLabel lblPassword) {
		this.lblPassword = lblPassword;
	}

	/**
	 * @return the lblConfirmPassword
	 */
	public JLabel getLblConfirmPassword() {
		return lblConfirmPassword;
	}

	/**
	 * @param lblConfirmPassword the lblConfirmPassword to set
	 */
	public void setLblConfirmPassword(JLabel lblConfirmPassword) {
		this.lblConfirmPassword = lblConfirmPassword;
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

	/**
	 * @return the txtPassword
	 */
	public JTextField getTxtPassword() {
		return TxtPassword;
	}

	/**
	 * @param txtPassword the txtPassword to set
	 */
	public void setTxtPassword(JTextField txtPassword) {
		TxtPassword = txtPassword;
	}

	/**
	 * @return the txtConfrimPassword
	 */
	public JTextField getTxtConfrimPassword() {
		return TxtConfrimPassword;
	}

	/**
	 * @param txtConfrimPassword the txtConfrimPassword to set
	 */
	public void setTxtConfrimPassword(JTextField txtConfrimPassword) {
		TxtConfrimPassword = txtConfrimPassword;
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

	
	/**
	 * @return the btnSave
	 */
	public JButton getBtnSave() {
		return btnSave;
	}

	/**
	 * @param btnSave the btnSave to set
	 */
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	
	
}
