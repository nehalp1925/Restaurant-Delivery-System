package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
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
public class AddRestaurant extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,EditRestaurantMItem,DeleteRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	private JButton btnVerify;
	private JLabel lblTitle1,lblRestaurantName,lblRestaurantAddress,lblTelephoneNumber,lblTitle2,lblDay;
	private JTextField TxtRestaurantName,TxtRestaurantAddress,TxtRestaurantPhoneNo;
	private JComboBox ComBoxOpenH1,ComBoxOpenH2,ComBoxOpenH3,ComBoxOpenH4,ComBoxOpenH5,ComBoxOpenH6,ComBoxOpenH7;
	private JComboBox ComBoxCloseH1,ComBoxCloseH2,ComBoxCloseH3,ComBoxCloseH4,ComBoxCloseH5,ComBoxCloseH6,ComBoxCloseH7;
	private JComboBox ComBoxOpenM1,ComBoxOpenM2,ComBoxOpenM3,ComBoxOpenM4,ComBoxOpenM5,ComBoxOpenM6,ComBoxOpenM7;
	private JComboBox ComBoxCloseM1,ComBoxCloseM2,ComBoxCloseM3,ComBoxCloseM4,ComBoxCloseM5,ComBoxCloseM6,ComBoxCloseM7;
	private JTextArea TxtAreaDeliveryArea;
	private JButton btnAddDeliveryArea,btnSave,btnDeleteDeliveryArea,btnModifyAtOnce;
	private JTextField TxtDeliveryArea;
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public AddRestaurant() {
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
		lblTitle1.setBounds(182, 38, 440, 67);
		panel.add(lblTitle1);

		ImageIcon icon6 = new ImageIcon("Images/NEWRESTAURANT.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRestaurantName.setBounds(32, 120, 130, 14);
		panel.add(lblRestaurantName);
		
		TxtRestaurantName = new JTextField();
		TxtRestaurantName.setBounds(182, 118, 187, 20);
		panel.add(TxtRestaurantName);
		TxtRestaurantName.setColumns(10);
		
		lblRestaurantAddress = new JLabel("Restaurant Address :");
		lblRestaurantAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRestaurantAddress.setBounds(32, 164, 160, 14);
		panel.add(lblRestaurantAddress);
		
		TxtRestaurantAddress = new JTextField();
		TxtRestaurantAddress.setColumns(10);
		TxtRestaurantAddress.setBounds(182, 162, 187, 20);
		panel.add(TxtRestaurantAddress);
		
		lblTelephoneNumber = new JLabel("Telephone Number :");
		lblTelephoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelephoneNumber.setBounds(421, 164, 145, 18);
		panel.add(lblTelephoneNumber);
		
		TxtRestaurantPhoneNo = new JTextField();
		TxtRestaurantPhoneNo.setColumns(10);
		TxtRestaurantPhoneNo.setBounds(573, 162, 187, 20);
		panel.add(TxtRestaurantPhoneNo);
		
		lblTitle2 = new JLabel("Working Hours");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle2.setBounds(140, 215, 145, 37);
		panel.add(lblTitle2);
		
		lblDay = new JLabel("Day");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDay.setBounds(32, 263, 33, 21);
		panel.add(lblDay);
		
		JLabel lblOpeningTime = new JLabel("Opening Time");
		lblOpeningTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOpeningTime.setBounds(119, 263, 101, 21);
		panel.add(lblOpeningTime);
		
		JLabel lblClosingTime = new JLabel("Closing Time");
		lblClosingTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClosingTime.setBounds(255, 263, 94, 21);
		panel.add(lblClosingTime);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSunday.setBounds(32, 302, 59, 21);
		panel.add(lblSunday);
		
		ComBoxOpenH1 = new JComboBox();
		ComBoxOpenH1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH1.setBounds(119, 304, 44, 28);
		panel.add(ComBoxOpenH1);
		
		JLabel lblH1 = new JLabel("h");
		lblH1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH1.setBounds(165, 308, 12, 21);
		panel.add(lblH1);
		
		ComBoxOpenM1 = new JComboBox();
		ComBoxOpenM1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM1.setBounds(184, 304, 44, 28);
		panel.add(ComBoxOpenM1);
		
		ComBoxCloseH1 = new JComboBox();
		ComBoxCloseH1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH1.setBounds(255, 304, 44, 28);
		panel.add(ComBoxCloseH1);
		
		JLabel lblCloseH1 = new JLabel("h");
		lblCloseH1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH1.setBounds(301, 308, 12, 21);
		panel.add(lblCloseH1);
		
		ComBoxCloseM1 = new JComboBox();
		ComBoxCloseM1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM1.setBounds(320, 304, 44, 28);
		panel.add(ComBoxCloseM1);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonday.setBounds(32, 343, 59, 21);
		panel.add(lblMonday);
		
		ComBoxOpenH2 = new JComboBox();
		ComBoxOpenH2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH2.setBounds(119, 345, 44, 28);
		panel.add(ComBoxOpenH2);
		
		JLabel lblH2 = new JLabel("h");
		lblH2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH2.setBounds(165, 349, 12, 21);
		panel.add(lblH2);
		
		ComBoxOpenM2 = new JComboBox();
		ComBoxOpenM2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM2.setBounds(184, 345, 44, 28);
		panel.add(ComBoxOpenM2);
		
		ComBoxCloseH2 = new JComboBox();
		ComBoxCloseH2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH2.setBounds(255, 345, 44, 28);
		panel.add(ComBoxCloseH2);
		
		JLabel lblCloseH2 = new JLabel("h");
		lblCloseH2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH2.setBounds(301, 349, 12, 21);
		panel.add(lblCloseH2);
		
		ComBoxCloseM2 = new JComboBox();
		ComBoxCloseM2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM2.setBounds(320, 345, 44, 28);
		panel.add(ComBoxCloseM2);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTuesday.setBounds(32, 384, 59, 21);
		panel.add(lblTuesday);
		
		ComBoxOpenH3 = new JComboBox();
		ComBoxOpenH3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH3.setBounds(119, 386, 44, 28);
		panel.add(ComBoxOpenH3);
		
		JLabel lblH3 = new JLabel("h");
		lblH3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH3.setBounds(165, 390, 12, 21);
		panel.add(lblH3);
		
		ComBoxOpenM3 = new JComboBox();
		ComBoxOpenM3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM3.setBounds(184, 386, 44, 28);
		panel.add(ComBoxOpenM3);
		
		ComBoxCloseH3 = new JComboBox();
		ComBoxCloseH3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH3.setBounds(255, 386, 44, 28);
		panel.add(ComBoxCloseH3);
		
		JLabel lblCloseH3 = new JLabel("h");
		lblCloseH3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH3.setBounds(301, 390, 12, 21);
		panel.add(lblCloseH3);
		
		ComBoxCloseM3 = new JComboBox();
		ComBoxCloseM3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM3.setBounds(320, 386, 44, 28);
		panel.add(ComBoxCloseM3);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWednesday.setBounds(32, 425, 77, 21);
		panel.add(lblWednesday);
		
		ComBoxOpenH4 = new JComboBox();
		ComBoxOpenH4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH4.setBounds(119, 427, 44, 28);
		panel.add(ComBoxOpenH4);
		
		JLabel lblH4 = new JLabel("h");
		lblH4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH4.setBounds(165, 431, 12, 21);
		panel.add(lblH4);
		
		ComBoxOpenM4 = new JComboBox();
		ComBoxOpenM4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM4.setBounds(184, 427, 44, 28);
		panel.add(ComBoxOpenM4);
		
		ComBoxCloseH4 = new JComboBox();
		ComBoxCloseH4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH4.setBounds(255, 427, 44, 28);
		panel.add(ComBoxCloseH4);
		
		JLabel lblCloseH4 = new JLabel("h");
		lblCloseH4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH4.setBounds(301, 431, 12, 21);
		panel.add(lblCloseH4);
		
		ComBoxCloseM4 = new JComboBox();
		ComBoxCloseM4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM4.setBounds(320, 427, 44, 28);
		panel.add(ComBoxCloseM4);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThursday.setBounds(32, 466, 77, 21);
		panel.add(lblThursday);
		
		ComBoxOpenH5 = new JComboBox();
		ComBoxOpenH5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH5.setBounds(119, 468, 44, 28);
		panel.add(ComBoxOpenH5);
		
		JLabel lblH5 = new JLabel("h");
		lblH5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH5.setBounds(165, 472, 12, 21);
		panel.add(lblH5);
		
		ComBoxOpenM5 = new JComboBox();
		ComBoxOpenM5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM5.setBounds(184, 468, 44, 28);
		panel.add(ComBoxOpenM5);
		
		ComBoxCloseH5 = new JComboBox();
		ComBoxCloseH5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH5.setBounds(255, 468, 44, 28);
		panel.add(ComBoxCloseH5);
		
		JLabel lblCloseH5 = new JLabel("h");
		lblCloseH5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH5.setBounds(301, 472, 12, 21);
		panel.add(lblCloseH5);
		
		ComBoxCloseM5 = new JComboBox();
		ComBoxCloseM5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM5.setBounds(320, 468, 44, 28);
		panel.add(ComBoxCloseM5);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFriday.setBounds(32, 507, 59, 21);
		panel.add(lblFriday);
		
		ComBoxOpenH6 = new JComboBox();
		ComBoxOpenH6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH6.setBounds(119, 509, 44, 28);
		panel.add(ComBoxOpenH6);
		
		JLabel lblH6 = new JLabel("h");
		lblH6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH6.setBounds(165, 513, 12, 21);
		panel.add(lblH6);
		
		ComBoxOpenM6 = new JComboBox();
		ComBoxOpenM6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM6.setBounds(184, 509, 44, 28);
		panel.add(ComBoxOpenM6);
		
		ComBoxCloseH6 = new JComboBox();
		ComBoxCloseH6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH6.setBounds(255, 509, 44, 28);
		panel.add(ComBoxCloseH6);
		
		JLabel lblCloseH6 = new JLabel("h");
		lblCloseH6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH6.setBounds(301, 513, 12, 21);
		panel.add(lblCloseH6);
		
		ComBoxCloseM6 = new JComboBox();
		ComBoxCloseM6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM6.setBounds(320, 509, 44, 28);
		panel.add(ComBoxCloseM6);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaturday.setBounds(32, 548, 77, 21);
		panel.add(lblSaturday);
		
		ComBoxOpenH7 = new JComboBox();
		ComBoxOpenH7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH7.setBounds(119, 550, 44, 28);
		panel.add(ComBoxOpenH7);
		
		JLabel lblH17 = new JLabel("h");
		lblH17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH17.setBounds(165, 554, 12, 21);
		panel.add(lblH17);
		
		ComBoxOpenM7 = new JComboBox();
		ComBoxOpenM7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM7.setBounds(184, 550, 44, 28);
		panel.add(ComBoxOpenM7);
		
		ComBoxCloseH7 = new JComboBox();
		ComBoxCloseH7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH7.setBounds(255, 550, 44, 28);
		panel.add(ComBoxCloseH7);
		
		JLabel lblCloseH7 = new JLabel("h");
		lblCloseH7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCloseH7.setBounds(301, 554, 12, 21);
		panel.add(lblCloseH7);
		
		ComBoxCloseM7 = new JComboBox();
		ComBoxCloseM7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM7.setBounds(320, 550, 44, 28);
		panel.add(ComBoxCloseM7);
		
		btnModifyAtOnce = new JButton("Modify All The Time At Once");
		btnModifyAtOnce.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnModifyAtOnce.setFont(new Font("Dialog", Font.BOLD, 12));
		btnModifyAtOnce.setBounds(119, 609, 252, 28);
		panel.add(btnModifyAtOnce);
		
		JLabel lblTitle3 = new JLabel("Delivery Area");
		lblTitle3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle3.setBounds(516, 232, 157, 37);
		panel.add(lblTitle3);
		
		TxtAreaDeliveryArea = new JTextArea();
		TxtAreaDeliveryArea.setEditable(false);
		TxtAreaDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		TxtAreaDeliveryArea.setBounds(421, 302, 339, 68);
		panel.add(TxtAreaDeliveryArea);
		
		JLabel lblDeliveryArea = new JLabel("Delivery Area :");
		lblDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryArea.setBounds(421, 384, 101, 21);
		panel.add(lblDeliveryArea);		
		
		TxtDeliveryArea = new JTextField();
		TxtDeliveryArea.setColumns(10);
		TxtDeliveryArea.setBounds(542, 390, 218, 20);
		panel.add(TxtDeliveryArea);
				
		btnAddDeliveryArea = new JButton("Add Delivery Area");
		btnAddDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAddDeliveryArea.setBounds(621, 437, 139, 28);
		panel.add(btnAddDeliveryArea);
		
		btnDeleteDeliveryArea = new JButton("Delete Delivery Area");
		btnDeleteDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDeleteDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnDeleteDeliveryArea.setBounds(454, 437, 157, 28);
		panel.add(btnDeleteDeliveryArea);
		
		btnSave = new JButton("Save\r\n");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSave.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSave.setBounds(516, 507, 194, 30);
		panel.add(btnSave);	
		
		 btnVerify = new JButton("Verify");
		 btnVerify.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnVerify.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVerify.setBounds(395, 116, 77, 23);
		panel.add(btnVerify);
		
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

	public JMenu getMenusMenu() {
		return ManagerMenu;
	}

	public void setMenusMenu(JMenu menusMenu) {
		ManagerMenu = menusMenu;
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

	public JLabel getLblTitle1() {
		return lblTitle1;
	}

	public void setLblTitle1(JLabel lblTitle1) {
		this.lblTitle1 = lblTitle1;
	}

	public JLabel getLblRestaurantName() {
		return lblRestaurantName;
	}

	public void setLblRestaurantName(JLabel lblRestaurantName) {
		this.lblRestaurantName = lblRestaurantName;
	}

	public JLabel getLblRestaurantAddress() {
		return lblRestaurantAddress;
	}

	public void setLblRestaurantAddress(JLabel lblRestaurantAddress) {
		this.lblRestaurantAddress = lblRestaurantAddress;
	}

	public JLabel getLblTelephoneNumber() {
		return lblTelephoneNumber;
	}

	public void setLblTelephoneNumber(JLabel lblTelephoneNumber) {
		this.lblTelephoneNumber = lblTelephoneNumber;
	}

	public JLabel getLblTitle2() {
		return lblTitle2;
	}

	public void setLblTitle2(JLabel lblTitle2) {
		this.lblTitle2 = lblTitle2;
	}

	public JLabel getLblDay() {
		return lblDay;
	}

	public void setLblDay(JLabel lblDay) {
		this.lblDay = lblDay;
	}

	public JTextField getTxtRestaurantName() {
		return TxtRestaurantName;
	}

	public void setTxtRestaurantName(JTextField txtRestaurantName) {
		TxtRestaurantName = txtRestaurantName;
	}

	public JTextField getTxtRestaurantAddress() {
		return TxtRestaurantAddress;
	}

	public void setTxtRestaurantAddress(JTextField txtRestaurantAddress) {
		TxtRestaurantAddress = txtRestaurantAddress;
	}

	public JTextField getTxtRestaurantPhoneNo() {
		return TxtRestaurantPhoneNo;
	}

	public void setTxtRestaurantPhoneNo(JTextField txtRestaurantPhoneNo) {
		TxtRestaurantPhoneNo = txtRestaurantPhoneNo;
	}

	public JComboBox getComBoxOpenH1() {
		return ComBoxOpenH1;
	}

	public void setComBoxOpenH1(JComboBox comBoxOpenH1) {
		ComBoxOpenH1 = comBoxOpenH1;
	}

	public JComboBox getComBoxOpenH2() {
		return ComBoxOpenH2;
	}

	public void setComBoxOpenH2(JComboBox comBoxOpenH2) {
		ComBoxOpenH2 = comBoxOpenH2;
	}

	public JComboBox getComBoxOpenH3() {
		return ComBoxOpenH3;
	}

	public void setComBoxOpenH3(JComboBox comBoxOpenH3) {
		ComBoxOpenH3 = comBoxOpenH3;
	}

	public JComboBox getComBoxOpenH4() {
		return ComBoxOpenH4;
	}

	public void setComBoxOpenH4(JComboBox comBoxOpenH4) {
		ComBoxOpenH4 = comBoxOpenH4;
	}

	public JComboBox getComBoxOpenH5() {
		return ComBoxOpenH5;
	}

	public void setComBoxOpenH5(JComboBox comBoxOpenH5) {
		ComBoxOpenH5 = comBoxOpenH5;
	}

	public JComboBox getComBoxOpenH6() {
		return ComBoxOpenH6;
	}

	public void setComBoxOpenH6(JComboBox comBoxOpenH6) {
		ComBoxOpenH6 = comBoxOpenH6;
	}

	public JComboBox getComBoxOpenH7() {
		return ComBoxOpenH7;
	}

	public void setComBoxOpenH7(JComboBox comBoxOpenH7) {
		ComBoxOpenH7 = comBoxOpenH7;
	}

	public JComboBox getComBoxCloseH1() {
		return ComBoxCloseH1;
	}

	public void setComBoxCloseH1(JComboBox comBoxCloseH1) {
		ComBoxCloseH1 = comBoxCloseH1;
	}

	public JComboBox getComBoxCloseH2() {
		return ComBoxCloseH2;
	}

	public void setComBoxCloseH2(JComboBox comBoxCloseH2) {
		ComBoxCloseH2 = comBoxCloseH2;
	}

	public JComboBox getComBoxCloseH3() {
		return ComBoxCloseH3;
	}

	public void setComBoxCloseH3(JComboBox comBoxCloseH3) {
		ComBoxCloseH3 = comBoxCloseH3;
	}

	public JComboBox getComBoxCloseH4() {
		return ComBoxCloseH4;
	}

	public void setComBoxCloseH4(JComboBox comBoxCloseH4) {
		ComBoxCloseH4 = comBoxCloseH4;
	}

	public JComboBox getComBoxCloseH5() {
		return ComBoxCloseH5;
	}

	public void setComBoxCloseH5(JComboBox comBoxCloseH5) {
		ComBoxCloseH5 = comBoxCloseH5;
	}

	public JComboBox getComBoxCloseH6() {
		return ComBoxCloseH6;
	}

	public void setComBoxCloseH6(JComboBox comBoxCloseH6) {
		ComBoxCloseH6 = comBoxCloseH6;
	}

	public JComboBox getComBoxCloseH7() {
		return ComBoxCloseH7;
	}

	public void setComBoxCloseH7(JComboBox comBoxCloseH7) {
		ComBoxCloseH7 = comBoxCloseH7;
	}

	public JComboBox getComBoxOpenM1() {
		return ComBoxOpenM1;
	}

	public void setComBoxOpenM1(JComboBox comBoxOpenM1) {
		ComBoxOpenM1 = comBoxOpenM1;
	}

	public JComboBox getComBoxOpenM2() {
		return ComBoxOpenM2;
	}

	public void setComBoxOpenM2(JComboBox comBoxOpenM2) {
		ComBoxOpenM2 = comBoxOpenM2;
	}

	public JComboBox getComBoxOpenM3() {
		return ComBoxOpenM3;
	}

	public void setComBoxOpenM3(JComboBox comBoxOpenM3) {
		ComBoxOpenM3 = comBoxOpenM3;
	}

	public JComboBox getComBoxOpenM4() {
		return ComBoxOpenM4;
	}

	public void setComBoxOpenM4(JComboBox comBoxOpenM4) {
		ComBoxOpenM4 = comBoxOpenM4;
	}

	public JComboBox getComBoxOpenM5() {
		return ComBoxOpenM5;
	}

	public void setComBoxOpenM5(JComboBox comBoxOpenM5) {
		ComBoxOpenM5 = comBoxOpenM5;
	}

	public JComboBox getComBoxOpenM6() {
		return ComBoxOpenM6;
	}

	public void setComBoxOpenM6(JComboBox comBoxOpenM6) {
		ComBoxOpenM6 = comBoxOpenM6;
	}

	public JComboBox getComBoxOpenM7() {
		return ComBoxOpenM7;
	}

	public void setComBoxOpenM7(JComboBox comBoxOpenM7) {
		ComBoxOpenM7 = comBoxOpenM7;
	}

	public JComboBox getComBoxCloseM1() {
		return ComBoxCloseM1;
	}

	public void setComBoxCloseM1(JComboBox comBoxCloseM1) {
		ComBoxCloseM1 = comBoxCloseM1;
	}

	public JComboBox getComBoxCloseM2() {
		return ComBoxCloseM2;
	}

	public void setComBoxCloseM2(JComboBox comBoxCloseM2) {
		ComBoxCloseM2 = comBoxCloseM2;
	}

	public JComboBox getComBoxCloseM3() {
		return ComBoxCloseM3;
	}

	public void setComBoxCloseM3(JComboBox comBoxCloseM3) {
		ComBoxCloseM3 = comBoxCloseM3;
	}

	public JComboBox getComBoxCloseM4() {
		return ComBoxCloseM4;
	}

	public void setComBoxCloseM4(JComboBox comBoxCloseM4) {
		ComBoxCloseM4 = comBoxCloseM4;
	}

	public JComboBox getComBoxCloseM5() {
		return ComBoxCloseM5;
	}

	public void setComBoxCloseM5(JComboBox comBoxCloseM5) {
		ComBoxCloseM5 = comBoxCloseM5;
	}

	public JComboBox getComBoxCloseM6() {
		return ComBoxCloseM6;
	}

	public void setComBoxCloseM6(JComboBox comBoxCloseM6) {
		ComBoxCloseM6 = comBoxCloseM6;
	}

	public JComboBox getComBoxCloseM7() {
		return ComBoxCloseM7;
	}

	public void setComBoxCloseM7(JComboBox comBoxCloseM7) {
		ComBoxCloseM7 = comBoxCloseM7;
	}

	public JTextArea getTxtAreaDeliveryArea() {
		return TxtAreaDeliveryArea;
	}

	public void setTxtAreaDeliveryArea(JTextArea txtAreaDeliveryArea) {
		TxtAreaDeliveryArea = txtAreaDeliveryArea;
	}

	public JButton getBtnAddDeliveryArea() {
		return btnAddDeliveryArea;
	}

	public void setBtnAddDeliveryArea(JButton btnAddDeliveryArea) {
		this.btnAddDeliveryArea = btnAddDeliveryArea;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JButton getBtnDeleteDeliveryArea() {
		return btnDeleteDeliveryArea;
	}

	public void setBtnDeleteDeliveryArea(JButton btnDeleteDeliveryArea) {
		this.btnDeleteDeliveryArea = btnDeleteDeliveryArea;
	}

	public JButton getBtnModifyAtOnce() {
		return btnModifyAtOnce;
	}

	public void setBtnModifyAtOnce(JButton btnModifyAtOnce) {
		this.btnModifyAtOnce = btnModifyAtOnce;
	}

	public JTextField getTxtDeliveryArea() {
		return TxtDeliveryArea;
	}

	public void setTxtDeliveryArea(JTextField txtDeliveryArea) {
		TxtDeliveryArea = txtDeliveryArea;
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
