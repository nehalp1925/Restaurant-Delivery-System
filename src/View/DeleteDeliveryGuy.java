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

public class DeleteDeliveryGuy extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JLabel lblTitle1,lblRestaurantName,lblRestaurantAddress,lblTelephoneNumber,lblTitle2,lblDay;
	private JButton btnDelete;
	private JTextArea TxtAreaDeliveryArea;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	private JTextField TxtPhoneNo;
	private JPasswordField passwordField;
	private JPasswordField cpasswordField;
	private JComboBox DeliveryManComboBox;
	private JPasswordField Txtuname;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public DeleteDeliveryGuy() {
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
		
		CreateManagerItem = new JMenuItem("Create Manager");
		ManagerMenu.add(CreateManagerItem);
		
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
		
		JLabel lblCreateMenu = new JLabel("");
		lblCreateMenu.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCreateMenu.setBounds(143, 60, 491, 68);
		panel.add(lblCreateMenu);
		

		ImageIcon icon6 = new ImageIcon("Images/DELETEDELIVERYGUY.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblCreateMenu.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(335, 171, 102, 33);
		panel.add(lblUserName);
	
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(335, 221, 102, 33);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfirmPassword.setBounds(335, 265, 183, 33);
		panel.add(lblConfirmPassword);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(335, 309, 183, 33);
		panel.add(lblPhoneNumber);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(535, 317, 204, 22);
		panel.add(TxtPhoneNo);
		
		JLabel label_5 = new JLabel("Delivery Area");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(456, 375, 157, 37);
		panel.add(label_5);
		
		TxtAreaDeliveryArea = new JTextArea();
		TxtAreaDeliveryArea.setEditable(false);
		TxtAreaDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		TxtAreaDeliveryArea.setBounds(335, 423, 404, 68);
		panel.add(TxtAreaDeliveryArea);
		
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDelete.setBounds(466, 517, 157, 38);
		panel.add(btnDelete);	
		
		passwordField = new JPasswordField();
		passwordField.setEditable(false);
		passwordField.setBounds(536, 230, 203, 24);
		panel.add(passwordField);
		
		cpasswordField = new JPasswordField();
		cpasswordField.setEditable(false);
		cpasswordField.setBounds(535, 274, 203, 24);
		panel.add(cpasswordField);
		
		DeliveryManComboBox = new JComboBox();
		DeliveryManComboBox.setBounds(54, 201, 188, 33);
		panel.add(DeliveryManComboBox);
		
		Txtuname = new JPasswordField();
		Txtuname.setEditable(false);
		Txtuname.setBounds(535, 180, 203, 24);
		panel.add(Txtuname);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(41, 180, 220, 177);
		panel.add(textArea);
		
		JLabel lblSelectDeliveryGuy = new JLabel("Select Delivery Guy :");
		lblSelectDeliveryGuy.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSelectDeliveryGuy.setBounds(54, 128, 188, 33);
		panel.add(lblSelectDeliveryGuy);

		this.setVisible(true);
	}

	
	
	/**
	 * @return the txtuname
	 */
	public JPasswordField getTxtuname() {
		return Txtuname;
	}

	/**
	 * @param txtuname the txtuname to set
	 */
	public void setTxtuname(JPasswordField txtuname) {
		Txtuname = txtuname;
	}

	public JMenuItem getEditDeliveryManMItem() {
		return EditDeliveryManMItem;
	}

	public void setEditDeliveryManMItem(JMenuItem editDeliveryManMItem) {
		EditDeliveryManMItem = editDeliveryManMItem;
	}

	public JComboBox getDeliveryManComboBox() {
		return DeliveryManComboBox;
	}

	public void setDeliveryManComboBox(JComboBox deliveryManComboBox) {
		DeliveryManComboBox = deliveryManComboBox;
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
	 * @return the btnSave
	 */
	public JButton getbtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnSave the btnSave to set
	 */
	public void setbtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
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
	 * @return the deleteDeliveryManMItem
	 */
	public JMenuItem getEditDeliveryManMItemMItem() {
		return EditDeliveryManMItem;
	}

	/**
	 * @param deleteDeliveryManMItem the deleteDeliveryManMItem to set
	 */
	public void setEditDeliveryManMItemMItem(JMenuItem editDeliveryManMItem) {
		EditDeliveryManMItem = editDeliveryManMItem;
	}

	/**
	 * @return the createManagerItem
	 */
	public JMenuItem getCreateManagerItem() {
		return CreateManagerItem;
	}

	/**
	 * @param createManagerItem the createManagerItem to set
	 */
	public void setCreateManagerItem(JMenuItem createManagerItem) {
		CreateManagerItem = createManagerItem;
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
	 * @return the btnDelete
	 */
	public JButton getBtnDelete() {
		return btnDelete;
	}

	/**
	 * @param btnDelete the btnDelete to set
	 */
	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	/**
	 * @return the passwordField
	 */
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	/**
	 * @param passwordField the passwordField to set
	 */
	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	/**
	 * @return the cpasswordField
	 */
	public JPasswordField getCpasswordField() {
		return cpasswordField;
	}

	/**
	 * @param cpasswordField the cpasswordField to set
	 */
	public void setCpasswordField(JPasswordField cpasswordField) {
		this.cpasswordField = cpasswordField;
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
