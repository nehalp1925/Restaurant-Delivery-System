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

public class EditManager extends JFrame {

	// private JPanel contentPane;
	private JPanel contentPane;
	private JTextField txtuname, txtpassword, txtcpassword, txtLname, txtfname,
			txtAddress, txtEmail, TxtPhoneNo;
	private JButton btnEdit;
	private JPanel panel;
	//private JLabel bg;
	private JMenuBar RestaurantMenuBar ;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu,ChefMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem,CreateChefMenuItem,EditChefMenuItem,DeleteChefMenuItem;
	private JComboBox RestaurantComboBox,ManagerComboBox;
	private JLabel label;
	private JTextArea textArea;
	private JLabel label_1;
	private JTextArea textArea_1;
	



	/**
	 * Create the frame.
	 */
	public EditManager() {
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 700);

		JLabel bg = new JLabel(new ImageIcon("Images/background.jpg"));

		setContentPane(bg);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 800, 650);
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
		
		RestaurantMenu = new JMenu("Restaurant");
		RestaurantMenuBar.add(RestaurantMenu);
		
		CreateRestaurantMItem = new JMenuItem("Create Restaurant");
		RestaurantMenu.add(CreateRestaurantMItem);
		
		EditRestaurantMItem = new JMenuItem("Edit Restaurant");
		RestaurantMenu.add(EditRestaurantMItem);
		
		DeleteRestaurantMItem = new JMenuItem("Delete Restaurant");
		RestaurantMenu.add(DeleteRestaurantMItem);
		
		ManagerMenu = new JMenu("Manager");
		RestaurantMenuBar.add(ManagerMenu);
		
		CreateManagerItem = new JMenuItem("Create Manager");
		ManagerMenu.add(CreateManagerItem);
		
		DeleteManagerItem = new JMenuItem("Delete Manager");
		ManagerMenu.add(DeleteManagerItem);
		
		FoodMenu = new JMenu("Menu");
		RestaurantMenuBar.add(FoodMenu);
		
		CreateFoodMenuItem = new JMenuItem("Create Menu");
		FoodMenu.add(CreateFoodMenuItem);
		
		EditFoodMenuItem = new JMenuItem("Edit Menu");
		FoodMenu.add(EditFoodMenuItem);
		
		DeleteFoodMenuItem = new JMenuItem("Delete Menu");
		FoodMenu.add(DeleteFoodMenuItem);
		
		ChefMenu = new JMenu("Chef");
		RestaurantMenuBar.add(ChefMenu);
		
		CreateChefMenuItem = new JMenuItem("Create Chef");
		ChefMenu.add(CreateChefMenuItem);
		
		EditChefMenuItem = new JMenuItem("Edit Chef");
		ChefMenu.add(EditChefMenuItem);
		
		DeleteChefMenuItem = new JMenuItem("Delete Chef");
		ChefMenu.add(DeleteChefMenuItem);

		
		DeliveryManMenu = new JMenu("Delivery Man");
		RestaurantMenuBar.add(DeliveryManMenu);
		
		CreateDeliveryManMItem = new JMenuItem("Create DeliveryMan");
		DeliveryManMenu.add(CreateDeliveryManMItem);
		
		EditDeliveryManMItem = new JMenuItem("Edit DeliveryMan");
		DeliveryManMenu.add(EditDeliveryManMItem);
		
		DeleteDeliveryManMItem = new JMenuItem("Delete DeliveryMan");
		DeliveryManMenu.add(DeleteDeliveryManMItem);
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(250, 47, 468, 69);
		panel.add(lblNewLabel);

		ImageIcon icon6 = new ImageIcon("Images/EDITMANAGER.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblNewLabel.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(327, 156, 102, 33);
		panel.add(lblUserName);

		txtuname = new JTextField();
		txtuname.setEditable(false);
		txtuname.setColumns(12);
		txtuname.setBounds(527, 163, 191, 22);
		panel.add(txtuname);

		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(327, 206, 102, 33);
		panel.add(lblPassword);

		txtpassword = new JTextField();
		txtpassword.setEditable(false);
		txtpassword.setColumns(12);
		txtpassword.setBounds(527, 213, 191, 22);
		panel.add(txtpassword);

		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfirmPassword.setBounds(327, 249, 183, 33);
		panel.add(lblConfirmPassword);

		txtcpassword = new JTextField();
		txtcpassword.setEditable(false);
		txtcpassword.setColumns(12);
		txtcpassword.setBounds(527, 256, 191, 22);
		panel.add(txtcpassword);

		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(327, 295, 183, 33);
		panel.add(lblLastName);

		txtLname = new JTextField();
		txtLname.setEditable(false);
		txtLname.setColumns(12);
		txtLname.setBounds(527, 302, 191, 22);
		panel.add(txtLname);

		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(327, 341, 183, 33);
		panel.add(lblFirstName);

		txtfname = new JTextField();
		txtfname.setEditable(false);
		txtfname.setColumns(12);
		txtfname.setBounds(527, 348, 191, 22);
		panel.add(txtfname);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(327, 385, 183, 33);
		panel.add(lblAddress);

		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setColumns(12);
		txtAddress.setBounds(527, 392, 191, 22);
		panel.add(txtAddress);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(327, 431, 183, 33);
		panel.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(12);
		txtEmail.setBounds(527, 438, 191, 22);
		panel.add(txtEmail);

		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(327, 471, 183, 33);
		panel.add(lblPhoneNumber);

		btnEdit = new JButton("Edit");
		btnEdit.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnEdit.setEnabled(false);

		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.setBounds(527, 539, 191, 33);
		panel.add(btnEdit);

		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(527, 479, 191, 22);
		panel.add(TxtPhoneNo);
		
		RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(60, 178, 191, 33);
		panel.add(RestaurantComboBox);
		
		ManagerComboBox = new JComboBox();
		ManagerComboBox.setBounds(60, 459, 191, 33);
		panel.add(ManagerComboBox);
		
		label = new JLabel("Restaurant Name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(60, 110, 162, 33);
		panel.add(label);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(41, 156, 231, 177);
		panel.add(textArea);
		
		label_1 = new JLabel("Manager Name:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_1.setBounds(60, 388, 162, 33);
		panel.add(label_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(41, 434, 231, 177);
		panel.add(textArea_1);

		this.setVisible(true);
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
	 * @return the editChefMenuItem
	 */
	public JMenuItem getEditChefMenuItem() {
		return EditChefMenuItem;
	}


	/**
	 * @param editChefMenuItem the editChefMenuItem to set
	 */
	public void setEditChefMenuItem(JMenuItem editChefMenuItem) {
		EditChefMenuItem = editChefMenuItem;
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
	 * @return the txtpassword
	 */
	public JTextField getTxtpassword() {
		return txtpassword;
	}


	/**
	 * @param txtpassword the txtpassword to set
	 */
	public void setTxtpassword(JTextField txtpassword) {
		this.txtpassword = txtpassword;
	}


	/**
	 * @return the txtcpassword
	 */
	public JTextField getTxtcpassword() {
		return txtcpassword;
	}


	/**
	 * @param txtcpassword the txtcpassword to set
	 */
	public void setTxtcpassword(JTextField txtcpassword) {
		this.txtcpassword = txtcpassword;
	}


	/**
	 * @return the txtLname
	 */
	public JTextField getTxtLname() {
		return txtLname;
	}


	/**
	 * @param txtLname the txtLname to set
	 */
	public void setTxtLname(JTextField txtLname) {
		this.txtLname = txtLname;
	}


	/**
	 * @return the txtfname
	 */
	public JTextField getTxtfname() {
		return txtfname;
	}


	/**
	 * @param txtfname the txtfname to set
	 */
	public void setTxtfname(JTextField txtfname) {
		this.txtfname = txtfname;
	}


	/**
	 * @return the txtAddress
	 */
	public JTextField getTxtAddress() {
		return txtAddress;
	}


	/**
	 * @param txtAddress the txtAddress to set
	 */
	public void setTxtAddress(JTextField txtAddress) {
		this.txtAddress = txtAddress;
	}


	/**
	 * @return the txtEmail
	 */
	public JTextField getTxtEmail() {
		return txtEmail;
	}


	/**
	 * @param txtEmail the txtEmail to set
	 */
	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
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
	 * @return the btnEdit
	 */
	public JButton getBtnEdit() {
		return btnEdit;
	}


	/**
	 * @param btnEdit the btnEdit to set
	 */
	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
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


	public JMenuBar getRestaurantMenuBar() {
		return RestaurantMenuBar;
	}


	public void setRestaurantMenuBar(JMenuBar restaurantMenuBar) {
		RestaurantMenuBar = restaurantMenuBar;
	}


	public JMenu getFileMenu() {
		return FileMenu;
	}


	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
	}


	public JMenu getRestaurantMenu() {
		return RestaurantMenu;
	}


	public void setRestaurantMenu(JMenu restaurantMenu) {
		RestaurantMenu = restaurantMenu;
	}


	public JMenu getManagerMenu() {
		return ManagerMenu;
	}


	public void setManagerMenu(JMenu managerMenu) {
		ManagerMenu = managerMenu;
	}


	public JMenu getDeliveryManMenu() {
		return DeliveryManMenu;
	}


	public void setDeliveryManMenu(JMenu deliveryManMenu) {
		DeliveryManMenu = deliveryManMenu;
	}


	public JMenu getFoodMenu() {
		return FoodMenu;
	}


	public void setFoodMenu(JMenu foodMenu) {
		FoodMenu = foodMenu;
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


	public JMenuItem getCreateRestaurantMItem() {
		return CreateRestaurantMItem;
	}


	public void setCreateRestaurantMItem(JMenuItem createRestaurantMItem) {
		CreateRestaurantMItem = createRestaurantMItem;
	}


	public JMenuItem getEditRestaurantMItem() {
		return EditRestaurantMItem;
	}


	public void setEditRestaurantMItem(JMenuItem editRestaurantMItem) {
		EditRestaurantMItem = editRestaurantMItem;
	}


	public JMenuItem getDeleteRestaurantMItem() {
		return DeleteRestaurantMItem;
	}


	public void setDeleteRestaurantMItem(JMenuItem deleteRestaurantMItem) {
		DeleteRestaurantMItem = deleteRestaurantMItem;
	}


	public JMenuItem getCreateDeliveryManMItem() {
		return CreateDeliveryManMItem;
	}


	public void setCreateDeliveryManMItem(JMenuItem createDeliveryManMItem) {
		CreateDeliveryManMItem = createDeliveryManMItem;
	}


	public JMenuItem getEditDeliveryManMItem() {
		return EditDeliveryManMItem;
	}


	public void setEditDeliveryManMItem(JMenuItem editDeliveryManMItem) {
		EditDeliveryManMItem = editDeliveryManMItem;
	}


	public JMenuItem getDeleteDeliveryManMItem() {
		return DeleteDeliveryManMItem;
	}


	public void setDeleteDeliveryManMItem(JMenuItem deleteDeliveryManMItem) {
		DeleteDeliveryManMItem = deleteDeliveryManMItem;
	}


	public JMenuItem getCreateManagerItem() {
		return CreateManagerItem;
	}


	public void setCreateManagerItem(JMenuItem createManagerItem) {
		CreateManagerItem = createManagerItem;
	}



	public JMenuItem getDeleteManagerItem() {
		return DeleteManagerItem;
	}


	public void setDeleteManagerItem(JMenuItem deleteManagerItem) {
		DeleteManagerItem = deleteManagerItem;
	}


	public JMenuItem getCreateFoodMenuItem() {
		return CreateFoodMenuItem;
	}


	public void setCreateFoodMenuItem(JMenuItem createFoodMenuItem) {
		CreateFoodMenuItem = createFoodMenuItem;
	}


	public JMenuItem getEditFoodMenuItem() {
		return EditFoodMenuItem;
	}


	public void setEditFoodMenuItem(JMenuItem editFoodMenuItem) {
		EditFoodMenuItem = editFoodMenuItem;
	}


	public JMenuItem getDeleteFoodMenuItem() {
		return DeleteFoodMenuItem;
	}


	public void setDeleteFoodMenuItem(JMenuItem deleteFoodMenuItem) {
		DeleteFoodMenuItem = deleteFoodMenuItem;
	}
	
	public JComboBox getRestaurantComboBox() {
		return RestaurantComboBox;
	}


	public void setRestaurantComboBox(JComboBox restaurantComboBox) {
		RestaurantComboBox = restaurantComboBox;
	}


	/**
	 * @return the managerComboBox
	 */
	public JComboBox getManagerComboBox() {
		return ManagerComboBox;
	}


	/**
	 * @param managerComboBox the managerComboBox to set
	 */
	public void setManagerComboBox(JComboBox managerComboBox) {
		ManagerComboBox = managerComboBox;
	}
	
	
}
	
