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
import javax.swing.border.LineBorder;

public class AdminDashboard extends JFrame{
	private JPanel contentPane,panel;
	private JLabel bg,lblTitle1;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	
	
	public AdminDashboard() {
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
		
		DeleteDeliveryManMItem = new JMenuItem("Delete DeliveryMan");
		DeliveryManMenu.add(DeleteDeliveryManMItem);
		
		
		lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTitle1.setBounds(197, 76, 448, 81);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/ADMINDASHBOARD.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
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

	public JLabel getLblTitle1() {
		return lblTitle1;
	}

	public void setLblTitle1(JLabel lblTitle1) {
		this.lblTitle1 = lblTitle1;
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



	public JMenu getDeliveryManMenu() {
		return DeliveryManMenu;
	}

	public void setDeliveryManMenu(JMenu deliveryManMenu) {
		DeliveryManMenu = deliveryManMenu;
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
	public JMenu getManagerMenu() {
		return ManagerMenu;
	}

	public void setManagerMenu(JMenu managerMenu) {
		ManagerMenu = managerMenu;
	}

	public JMenu getFoodMenu() {
		return FoodMenu;
	}

	public void setFoodMenu(JMenu foodMenu) {
		FoodMenu = foodMenu;
	}

	public JMenuItem getCreateManagerItem() {
		return CreateManagerItem;
	}

	public void setCreateManagerItem(JMenuItem createManagerItem) {
		CreateManagerItem = createManagerItem;
	}

	public JMenuItem getEditManagerItem() {
		return EditManagerItem;
	}

	public void setEditManagerItem(JMenuItem editManagerItem) {
		EditManagerItem = editManagerItem;
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

}
