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
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AddManager extends JFrame {

	//private JPanel contentPane;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel bg;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	
	private JTextField txtuname;
	
	private JTextField LastNametextField;
	private JTextField FirstNametextField;
	private JTextField AddresstextField;
	private JTextField EmailtextField;
	private JTextField TxtPhoneNo;
	private JButton btnVerify;
	private JButton btnSave;
	private JComboBox RestaurantComboBox;
	private JPasswordField PasswordField;
	private JPasswordField ConfrimPasswordField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddManager() {
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
		
		EditManagerItem = new JMenuItem("Edit Manager");
		ManagerMenu.add(EditManagerItem);
		
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
		lblNewLabel.setBounds(166, 57, 495, 84);
		panel.add(lblNewLabel);
		

		ImageIcon icon6 = new ImageIcon("Images/NEWMANAGER.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblNewLabel.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(251, 191, 102, 33);
		panel.add(lblUserName);
		
		txtuname = new JTextField();
		txtuname.setColumns(12);
		txtuname.setBounds(451, 198, 191, 22);
		panel.add(txtuname);
	
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(251, 241, 102, 33);
		panel.add(lblPassword);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(451, 250, 191, 20);
		panel.add(PasswordField);
		
		
		JLabel lblcPassword = new JLabel("Confirm Password :");
		lblcPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblcPassword.setBounds(251, 284, 172, 33);
		panel.add(lblcPassword); 
		
		ConfrimPasswordField = new JPasswordField();
		ConfrimPasswordField.setBounds(451, 293, 191, 20);
		panel.add(ConfrimPasswordField);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(251, 330, 183, 33);
		panel.add(lblLastName);
		
		LastNametextField = new JTextField();
		LastNametextField.setColumns(12);
		LastNametextField.setBounds(451, 337, 191, 22);
		panel.add(LastNametextField);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(251, 376, 183, 33);
		panel.add(lblFirstName);
		
		FirstNametextField = new JTextField();
		FirstNametextField.setColumns(12);
		FirstNametextField.setBounds(451, 383, 191, 22);
		panel.add(FirstNametextField);
		
		
		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(251, 420, 183, 33);
		panel.add(lblAddress);
		
		AddresstextField = new JTextField();
		AddresstextField.setColumns(12);
		AddresstextField.setBounds(451, 427, 191, 22);
		panel.add(AddresstextField);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(251, 466, 183, 33);
		panel.add(lblEmail);
		
		EmailtextField = new JTextField();
		EmailtextField.setColumns(12);
		EmailtextField.setBounds(451, 473, 191, 22);
		panel.add(EmailtextField);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(251, 506, 183, 33);
		panel.add(lblPhoneNumber);
		
		btnVerify = new JButton("Verify");
		btnVerify.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVerify.setBounds(657, 196, 97, 25);
		panel.add(btnVerify);
		
		btnSave = new JButton("Save");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setBounds(493, 577, 124, 25);
		panel.add(btnSave);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(451, 514, 191, 22);
		panel.add(TxtPhoneNo);		
		
		JLabel lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantName.setBounds(48, 154, 159, 33);
		panel.add(lblRestaurantName);
		
		RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(48, 215, 164, 29);
		panel.add(RestaurantComboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(28, 200, 198, 177);
		panel.add(textArea);

		this.setVisible(true);
	}

	public JPasswordField getPasswordField() {
		return PasswordField;
	}



	public void setPasswordField(JPasswordField PasswordField) {
		this.PasswordField = PasswordField;
	}



	public JPasswordField getConfrimPasswordField() {
		return ConfrimPasswordField;
	}



	public void setPasswordField_1(JPasswordField ConfrimPasswordField) {
		this.ConfrimPasswordField = ConfrimPasswordField;
	}

	public JComboBox getRestaurantComboBox() {
		return RestaurantComboBox;
	}



	public void setRestaurantComboBox(JComboBox restaurantComboBox) {
		RestaurantComboBox = restaurantComboBox;
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
	 * @return the deliveryManMenu
	 */
	public JMenu getDeliveryManMenu() {
		return DeliveryManMenu;
	}

	/**
	 * @param deliveryManMenu the deliveryManMenu to set
	 */
	public void setDeliveryManMenu(JMenu deliveryManMenu) {
		DeliveryManMenu = deliveryManMenu;
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
	 * @return the createRestaurantMItem
	 */
	public JMenuItem getCreateRestaurantMItem() {
		return CreateRestaurantMItem;
	}

	/**
	 * @param createRestaurantMItem the createRestaurantMItem to set
	 */
	public void setCreateRestaurantMItem(JMenuItem createRestaurantMItem) {
		CreateRestaurantMItem = createRestaurantMItem;
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
	 * @return the deleteRestaurantMItem
	 */
	public JMenuItem getDeleteRestaurantMItem() {
		return DeleteRestaurantMItem;
	}

	/**
	 * @param deleteRestaurantMItem the deleteRestaurantMItem to set
	 */
	public void setDeleteRestaurantMItem(JMenuItem deleteRestaurantMItem) {
		DeleteRestaurantMItem = deleteRestaurantMItem;
	}

	/**
	 * @return the createDeliveryManMItem
	 */
	public JMenuItem getCreateDeliveryManMItem() {
		return CreateDeliveryManMItem;
	}

	/**
	 * @param createDeliveryManMItem the createDeliveryManMItem to set
	 */
	public void setCreateDeliveryManMItem(JMenuItem createDeliveryManMItem) {
		CreateDeliveryManMItem = createDeliveryManMItem;
	}

	/**
	 * @return the editDeliveryManMItem
	 */
	public JMenuItem getEditDeliveryManMItem() {
		return EditDeliveryManMItem;
	}

	/**
	 * @param editDeliveryManMItem the editDeliveryManMItem to set
	 */
	public void setEditDeliveryManMItem(JMenuItem editDeliveryManMItem) {
		EditDeliveryManMItem = editDeliveryManMItem;
	}

	/**
	 * @return the deleteDeliveryManMItem
	 */
	public JMenuItem getDeleteDeliveryManMItem() {
		return DeleteDeliveryManMItem;
	}

	/**
	 * @param deleteDeliveryManMItem the deleteDeliveryManMItem to set
	 */
	public void setDeleteDeliveryManMItem(JMenuItem deleteDeliveryManMItem) {
		DeleteDeliveryManMItem = deleteDeliveryManMItem;
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
	 * @return the deleteManagerItem
	 */
	public JMenuItem getDeleteManagerItem() {
		return DeleteManagerItem;
	}

	/**
	 * @param deleteManagerItem the deleteManagerItem to set
	 */
	public void setDeleteManagerItem(JMenuItem deleteManagerItem) {
		DeleteManagerItem = deleteManagerItem;
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
	 * @param confrimPasswordField the confrimPasswordField to set
	 */
	public void setConfrimPasswordField(JPasswordField confrimPasswordField) {
		ConfrimPasswordField = confrimPasswordField;
	}

	public JMenu getFileMenu() {
		return FileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
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
