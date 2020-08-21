package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ManagerDashboard extends JFrame {



	
	// private JPanel contentPane;
		private JPanel contentPane;
		private JTextField txtuname, txtLname, txtfname,
				txtAddress, txtEmail, TxtPhoneNo;
		private JPanel panel;
		//private JLabel bg;
		private JMenuBar RestaurantMenuBar ;
		private JMenu FileMenu,RestaurantMenu,ManagerMenu,FoodMenu,ChefMenu,OrderMenu;
		private JMenuItem HistoryMItem,DisconnectMItem,CloseMItem,EditRestaurantMItem,EditManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem,CreateChefMenuItem,EditChefMenuItem,DeleteChefMenuItem;
		/**
		 * @return the orderMenu
		 */
		public JMenu getOrderMenu() {
			return OrderMenu;
		}


		/**
		 * @param orderMenu the orderMenu to set
		 */
		public void setOrderMenu(JMenu orderMenu) {
			OrderMenu = orderMenu;
		}


		/**
		 * @return the historyMItem
		 */
		public JMenuItem getHistoryMItem() {
			return HistoryMItem;
		}


		/**
		 * @param historyMItem the historyMItem to set
		 */
		public void setHistoryMItem(JMenuItem historyMItem) {
			HistoryMItem = historyMItem;
		}


		/**
		 * @return the chefMenu
		 */
		public JMenu getChefMenu() {
			return ChefMenu;
		}


		private JComboBox RestaurantComboBox;
	/**
	 * Create the frame.
	 */	
	 
	public ManagerDashboard() {
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 700);

		JLabel bg = new JLabel(new ImageIcon("Images/background.jpg"));

		setContentPane(bg);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 790, 650);
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
		
		EditRestaurantMItem = new JMenuItem("Edit Restaurant");
		RestaurantMenu.add(EditRestaurantMItem);
		
		ManagerMenu = new JMenu("Manager");
		RestaurantMenuBar.add(ManagerMenu);
		
		EditManagerItem = new JMenuItem("Edit Manager");
		ManagerMenu.add(EditManagerItem);
		
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
		

		OrderMenu = new JMenu("Order");
		RestaurantMenuBar.add(OrderMenu);
		
		HistoryMItem = new JMenuItem("History");
		OrderMenu.add(HistoryMItem);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(179, 58, 445, 68);
		panel.add(lblNewLabel);
		
		ImageIcon icon6 = new ImageIcon("Images/MANAGERDASHBOARD.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblNewLabel.setIcon(icon7);

		JLabel lblUserName = new JLabel("UserName :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblUserName.setBounds(190, 198, 102, 33);
		panel.add(lblUserName);

		txtuname = new JTextField();
		txtuname.setEditable(false);
		txtuname.setColumns(12);
		txtuname.setBounds(390, 205, 191, 22);
		panel.add(txtuname);

		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLastName.setBounds(190, 244, 183, 33);
		panel.add(lblLastName);

		txtLname = new JTextField();
		txtLname.setEditable(false);
		txtLname.setColumns(12);
		txtLname.setBounds(390, 251, 191, 22);
		panel.add(txtLname);

		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblFirstName.setBounds(190, 290, 183, 33);
		panel.add(lblFirstName);

		txtfname = new JTextField();
		txtfname.setEditable(false);
		txtfname.setColumns(12);
		txtfname.setBounds(390, 297, 191, 22);
		panel.add(txtfname);

		JLabel lblAddress = new JLabel("Address :");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAddress.setBounds(190, 334, 183, 33);
		panel.add(lblAddress);

		txtAddress = new JTextField();
		txtAddress.setEditable(false);
		txtAddress.setColumns(12);
		txtAddress.setBounds(390, 341, 191, 22);
		panel.add(txtAddress);

		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(190, 380, 183, 33);
		panel.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setEditable(false);
		txtEmail.setColumns(12);
		txtEmail.setBounds(390, 387, 191, 22);
		panel.add(txtEmail);

		JLabel lblPhoneNumber = new JLabel("Phone Number :");
		lblPhoneNumber.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPhoneNumber.setBounds(190, 420, 183, 33);
		panel.add(lblPhoneNumber);

		TxtPhoneNo = new JTextField();
		TxtPhoneNo.setEditable(false);
		TxtPhoneNo.setColumns(12);
		TxtPhoneNo.setBounds(390, 428, 191, 22);
		panel.add(TxtPhoneNo);
		
		JLabel lblRestaurantName = new JLabel("Restaurant Name:");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblRestaurantName.setBounds(190, 152, 162, 33);
		panel.add(lblRestaurantName);
		
		RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setEnabled(false);
		RestaurantComboBox.setBounds(390, 159, 191, 22);
		panel.add(RestaurantComboBox);

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


	

	public void setChefMenu(JMenu chefMenu) {
		ChefMenu = chefMenu;
	}


	public JMenuItem getCreateChefMenuItem() {
		return CreateChefMenuItem;
	}


	public void setCreateChefMenuItem(JMenuItem createChefMenuItem) {
		CreateChefMenuItem = createChefMenuItem;
	}


	public JMenuItem getEditChefMenuItem() {
		return EditChefMenuItem;
	}


	public void setEditChefMenuItem(JMenuItem editChefMenuItem) {
		EditChefMenuItem = editChefMenuItem;
	}


	public JMenuItem getDeleteChefMenuItem() {
		return DeleteChefMenuItem;
	}


	public void setDeleteChefMenuItem(JMenuItem deleteChefMenuItem) {
		DeleteChefMenuItem = deleteChefMenuItem;
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


	


	public JMenuItem getEditRestaurantMItem() {
		return EditRestaurantMItem;
	}


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
	
}
