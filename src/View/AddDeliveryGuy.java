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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AddDeliveryGuy extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JLabel lblTitle1,lblRestaurantName,lblRestaurantAddress,lblTelephoneNumber,lblTitle2,lblDay;
	private JTextField TxtDArea;
	private JButton btnAddDeliveryArea,btnDeleteDeliveryArea,btnSave,btnVerify;
	private JTextArea TxtAreaDeliveryArea;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	private JTextField txtuname,TxtPhoneNo;
	private JPasswordField PasswordField;
	private JPasswordField ConfrimPasswordField;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public AddDeliveryGuy() {
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
		
		EditDeliveryManMItem = new JMenuItem("Edit DeliveryMan");
		DeliveryManMenu.add(EditDeliveryManMItem);
		
		DeleteDeliveryManMItem = new JMenuItem("Delete DeliveryMan");
		DeliveryManMenu.add(DeleteDeliveryManMItem);
		
		JLabel lblCreateMenu = new JLabel("");
		lblCreateMenu.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCreateMenu.setBounds(175, 61, 462, 68);
		panel.add(lblCreateMenu);
		

		ImageIcon icon6 = new ImageIcon("Images/NEWDELIVERYGUY.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblCreateMenu.setIcon(icon7);
		
		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(188, 188, 102, 33);
		panel.add(lblUserName);
		
		txtuname = new JTextField();
		txtuname.setColumns(12);
		txtuname.setBounds(388, 195, 115, 22);
		panel.add(txtuname);
	
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPassword.setBounds(188, 238, 102, 33);
		panel.add(lblPassword);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password :");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblConfirmPassword.setBounds(188, 282, 183, 33);
		panel.add(lblConfirmPassword);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(188, 326, 183, 33);
		panel.add(lblPhoneNumber);
		
		btnVerify = new JButton("Verify");
		btnVerify.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerify.setBounds(513, 193, 79, 25);
		panel.add(btnVerify);
		
		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(388, 334, 204, 22);
		panel.add(TxtPhoneNo);
		
		JLabel label_5 = new JLabel("Delivery Area");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_5.setBounds(309, 392, 157, 37);
		panel.add(label_5);
		
		TxtAreaDeliveryArea = new JTextArea();
		TxtAreaDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		TxtAreaDeliveryArea.setBounds(188, 440, 404, 68);
		panel.add(TxtAreaDeliveryArea);
		
		TxtDArea = new JTextField();
		TxtDArea.setColumns(10);
		TxtDArea.setBounds(325, 532, 115, 25);
		panel.add(TxtDArea);
		
		JLabel label_6 = new JLabel("Delivery Area :");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		label_6.setBounds(188, 532, 147, 21);
		panel.add(label_6);
		
		btnAddDeliveryArea = new JButton("Add Delivery Area");
		btnAddDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAddDeliveryArea.setBounds(452, 519, 140, 38);
		panel.add(btnAddDeliveryArea);
		
		btnDeleteDeliveryArea = new JButton("Delete Delivery Area");
		btnDeleteDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnDeleteDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnDeleteDeliveryArea.setBounds(287, 574, 152, 38);
		panel.add(btnDeleteDeliveryArea);
		
		btnSave = new JButton("Save\r\n");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSave.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSave.setBounds(454, 577, 138, 33);
		panel.add(btnSave);
	
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(388, 245, 202, 24);
		panel.add(PasswordField);
		
		ConfrimPasswordField = new JPasswordField();
		ConfrimPasswordField.setBounds(388, 289, 202, 24);
		panel.add(ConfrimPasswordField);
		
		this.setVisible(true);
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

	public JPasswordField getPasswordField() {
		return PasswordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		PasswordField = passwordField;
	}

	public JPasswordField getConfrimPasswordField() {
		return ConfrimPasswordField;
	}

	public void setConfrimPasswordField(JPasswordField confrimPasswordField) {
		ConfrimPasswordField = confrimPasswordField;
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
	 * @return the txtDArea
	 */
	public JTextField getTxtDArea() {
		return TxtDArea;
	}

	/**
	 * @param txtDArea the txtDArea to set
	 */
	public void setTxtDArea(JTextField txtDArea) {
		TxtDArea = txtDArea;
	}

	/**
	 * @return the btnAddDeliveryArea
	 */
	public JButton getBtnAddDeliveryArea() {
		return btnAddDeliveryArea;
	}

	/**
	 * @param btnAddDeliveryArea the btnAddDeliveryArea to set
	 */
	public void setBtnAddDeliveryArea(JButton btnAddDeliveryArea) {
		this.btnAddDeliveryArea = btnAddDeliveryArea;
	}

	/**
	 * @return the btnDeleteDeliveryArea
	 */
	public JButton getBtnDeleteDeliveryArea() {
		return btnDeleteDeliveryArea;
	}

	/**
	 * @param btnDeleteDeliveryArea the btnDeleteDeliveryArea to set
	 */
	public void setBtnDeleteDeliveryArea(JButton btnDeleteDeliveryArea) {
		this.btnDeleteDeliveryArea = btnDeleteDeliveryArea;
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

	/**
	 * @return the btnVerify
	 */
	public JButton getBtnVerify() {
		return btnVerify;
	}

	/**
	 * @param btnVerify the btnVerify to set
	 */
	public void setBtnVerify(JButton btnVerify) {
		this.btnVerify = btnVerify;
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
