package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class EditMenu extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar CreateMenusMenuBar;
	private JTextField TxtAddPrice;
	private JTextField TxtAddItem;
	private JButton btnAddItem;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu,ChefMenu;
	private JMenuItem CreateChefMenuItem,EditChefMenuItem,DeleteChefMenuItem,DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,DeleteFoodMenuItem;
	private JMenuBar RestaurantMenuBar;
	private JComboBox RestaurantComboBox,MenucomboBox;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;


	/**
	 * Create the frame.
	 */
	public EditMenu() {
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
		
		ChefMenu = new JMenu("Chef");
		RestaurantMenuBar.add(ChefMenu);
		
		CreateChefMenuItem = new JMenuItem("Create Chef");
		ChefMenu.add(CreateChefMenuItem);
		
		EditChefMenuItem = new JMenuItem("Edit Chef");
		ChefMenu.add(EditChefMenuItem);
		
		DeleteChefMenuItem = new JMenuItem("Delete Chef");
		ChefMenu.add(DeleteChefMenuItem);

		
		JLabel lblTitle1 = new JLabel("Edit Menu");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(300, 59, 163, 37);
		panel.add(lblTitle1);
		
		JLabel lblTitle2 = new JLabel("Restaurant");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle2.setBounds(103, 177, 121, 21);
		panel.add(lblTitle2);
		
		JLabel lblTitle3 = new JLabel("Edit Item");
		lblTitle3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle3.setBounds(333, 413, 113, 25);
		panel.add(lblTitle3);
		
		JLabel lblItem = new JLabel("Item :\r\n");
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblItem.setBounds(253, 473, 46, 14);
		panel.add(lblItem);
		
		btnAddItem = new JButton("Edit Item");
		btnAddItem.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddItem.setEnabled(false);
		btnAddItem.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddItem.setBounds(358, 573, 105, 37);
		panel.add(btnAddItem);
		
		JLabel lblPrice = new JLabel("Price :");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(251, 526, 52, 14);
		panel.add(lblPrice);
		
		TxtAddPrice = new JTextField();
		TxtAddPrice.setEditable(false);
		TxtAddPrice.setBounds(326, 518, 163, 25);
		panel.add(TxtAddPrice);
		TxtAddPrice.setColumns(10);
		
		TxtAddItem = new JTextField();
		TxtAddItem.setEditable(false);
		TxtAddItem.setColumns(10);
		TxtAddItem.setBounds(326, 469, 163, 25);
		panel.add(TxtAddItem);
		
		 RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(66, 229, 182, 37);
		panel.add(RestaurantComboBox);
		
		 MenucomboBox = new JComboBox();
		MenucomboBox.setBounds(508, 229, 190, 37);
		panel.add(MenucomboBox);
		
		JLabel lblSelectMenu = new JLabel("Select Menu");
		lblSelectMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectMenu.setBounds(543, 177, 129, 21);
		panel.add(lblSelectMenu);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(47, 210, 220, 190);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(491, 210, 220, 190);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(238, 447, 271, 190);
		panel.add(textArea_2);

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
	 * @return the createMenusMenuBar
	 */
	public JMenuBar getCreateMenusMenuBar() {
		return CreateMenusMenuBar;
	}


	/**
	 * @param createMenusMenuBar the createMenusMenuBar to set
	 */
	public void setCreateMenusMenuBar(JMenuBar createMenusMenuBar) {
		CreateMenusMenuBar = createMenusMenuBar;
	}


	/**
	 * @return the txtAddPrice
	 */
	public JTextField getTxtAddPrice() {
		return TxtAddPrice;
	}


	/**
	 * @param txtAddPrice the txtAddPrice to set
	 */
	public void setTxtAddPrice(JTextField txtAddPrice) {
		TxtAddPrice = txtAddPrice;
	}


	/**
	 * @return the txtAddItem
	 */
	public JTextField getTxtAddItem() {
		return TxtAddItem;
	}


	/**
	 * @param txtAddItem the txtAddItem to set
	 */
	public void setTxtAddItem(JTextField txtAddItem) {
		TxtAddItem = txtAddItem;
	}


	/**
	 * @return the btnAddItem
	 */
	public JButton getBtnAddItem() {
		return btnAddItem;
	}


	/**
	 * @param btnAddItem the btnAddItem to set
	 */
	public void setBtnAddItem(JButton btnAddItem) {
		this.btnAddItem = btnAddItem;
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
	 * @return the restaurantComboBox
	 */
	public JComboBox getRestaurantComboBox() {
		return RestaurantComboBox;
	}


	/**
	 * @param restaurantComboBox the restaurantComboBox to set
	 */
	public void setRestaurantComboBox(JComboBox restaurantComboBox) {
		RestaurantComboBox = restaurantComboBox;
	}


	/**
	 * @return the menucomboBox
	 */
	public JComboBox getMenucomboBox() {
		return MenucomboBox;
	}


	/**
	 * @param menucomboBox the menucomboBox to set
	 */
	public void setMenucomboBox(JComboBox menucomboBox) {
		MenucomboBox = menucomboBox;
	}

}
