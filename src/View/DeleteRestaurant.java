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

public class DeleteRestaurant extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JLabel lblTitle1,lblRestaurantName,lblRestaurantAddress,lblTelephoneNumber,lblTitle2,lblDay;
	private JTextField TxtRestaurantName,TxtRestaurantAddress,TxtRestaurantPhoneNo;
	private JComboBox ComBoxOpenH1,ComBoxOpenH2,ComBoxOpenH3,ComBoxOpenH4,ComBoxOpenH5,ComBoxOpenH6,ComBoxOpenH7;
	private JComboBox ComBoxCloseH1,ComBoxCloseH2,ComBoxCloseH3,ComBoxCloseH4,ComBoxCloseH5,ComBoxCloseH6,ComBoxCloseH7;
	private JComboBox ComBoxOpenM1,ComBoxOpenM2,ComBoxOpenM3,ComBoxOpenM4,ComBoxOpenM5,ComBoxOpenM6,ComBoxOpenM7;
	private JComboBox ComBoxCloseM1,ComBoxCloseM2,ComBoxCloseM3,ComBoxCloseM4,ComBoxCloseM5,ComBoxCloseM6,ComBoxCloseM7;
	private JTextArea TxtAreaDeliveryArea;
	private JButton btnAddDeliveryArea,btnSave,btnDeleteDeliveryArea,btnModifyAtOnce;
	private JTextField TxtDeliveryArea;
	private JComboBox RestaurantComboBox;
	private JMenuBar RestaurantMenuBar;
	private JMenu FileMenu,RestaurantMenu,ManagerMenu,DeliveryManMenu,FoodMenu;
	private JMenuItem DisconnectMItem,CloseMItem,CreateRestaurantMItem,EditRestaurantMItem,CreateDeliveryManMItem,EditDeliveryManMItem,DeleteDeliveryManMItem,CreateManagerItem,EditManagerItem,DeleteManagerItem,CreateFoodMenuItem,EditFoodMenuItem,DeleteFoodMenuItem;
	private JTextArea textArea;
	

	
	public DeleteRestaurant() {
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 700);


		 bg = new JLabel(new ImageIcon("Images/background.jpg"));

		setContentPane(bg);

		panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.setToolTipText("");
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
		lblTitle1.setBounds(303, 32, 427, 68);
		panel.add(lblTitle1);
		

		ImageIcon icon6 = new ImageIcon("Images/DELETERESTAURANT.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		lblRestaurantName = new JLabel("Restaurant Name :");
		lblRestaurantName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRestaurantName.setBounds(338, 122, 130, 14);
		panel.add(lblRestaurantName);
		
		TxtRestaurantName = new JTextField();
		TxtRestaurantName.setEditable(false);
		TxtRestaurantName.setBounds(511, 120, 187, 20);
		panel.add(TxtRestaurantName);
		TxtRestaurantName.setColumns(10);
		
		 lblRestaurantAddress = new JLabel("Restaurant Address :");
		lblRestaurantAddress.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRestaurantAddress.setBounds(338, 160, 161, 14);
		panel.add(lblRestaurantAddress);
		
		TxtRestaurantAddress = new JTextField();
		TxtRestaurantAddress.setEditable(false);
		TxtRestaurantAddress.setColumns(10);
		TxtRestaurantAddress.setBounds(511, 158, 187, 20);
		panel.add(TxtRestaurantAddress);
		
		lblTelephoneNumber = new JLabel("Telephone Number :");
		lblTelephoneNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelephoneNumber.setBounds(338, 199, 145, 14);
		panel.add(lblTelephoneNumber);
		
		lblTitle2 = new JLabel("Working Hours");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle2.setBounds(451, 242, 180, 37);
		panel.add(lblTitle2);
		
		lblDay = new JLabel("Day");
		lblDay.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDay.setBounds(350, 290, 33, 21);
		panel.add(lblDay);
		
		JLabel lblOpeningTime_1 = new JLabel("Opening Time");
		lblOpeningTime_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOpeningTime_1.setBounds(437, 290, 101, 21);
		panel.add(lblOpeningTime_1);
		
		JLabel lblClosingTime = new JLabel("Closing Time");
		lblClosingTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblClosingTime.setBounds(573, 290, 94, 21);
		panel.add(lblClosingTime);
		
		JLabel lblSunday = new JLabel("Sunday");
		lblSunday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSunday.setBounds(350, 329, 59, 21);
		panel.add(lblSunday);
		
		ComBoxOpenH1 = new JComboBox();
		ComBoxOpenH1.setEnabled(false);
		ComBoxOpenH1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH1.setBounds(437, 331, 44, 28);
		panel.add(ComBoxOpenH1);
		
		JLabel lblH = new JLabel("h");
		lblH.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblH.setBounds(483, 335, 12, 21);
		panel.add(lblH);
		
		ComBoxOpenM1 = new JComboBox();
		ComBoxOpenM1.setEnabled(false);
		ComBoxOpenM1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM1.setBounds(502, 331, 44, 28);
		panel.add(ComBoxOpenM1);
		
		JLabel lblM = new JLabel("m");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM.setBounds(548, 335, 12, 21);
		panel.add(lblM);
		
		ComBoxCloseH1 = new JComboBox();
		ComBoxCloseH1.setEnabled(false);
		ComBoxCloseH1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH1.setBounds(573, 331, 44, 28);
		panel.add(ComBoxCloseH1);
		
		JLabel label_1 = new JLabel("h");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_1.setBounds(619, 335, 12, 21);
		panel.add(label_1);
		
		ComBoxCloseM1 = new JComboBox();
		ComBoxCloseM1.setEnabled(false);
		ComBoxCloseM1.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM1.setBounds(638, 331, 44, 28);
		panel.add(ComBoxCloseM1);
		
		JLabel lblM_7 = new JLabel("m");
		lblM_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_7.setBounds(684, 335, 12, 21);
		panel.add(lblM_7);
		
		JLabel lblMonday = new JLabel("Monday");
		lblMonday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMonday.setBounds(350, 370, 59, 21);
		panel.add(lblMonday);
		
		ComBoxOpenH2 = new JComboBox();
		ComBoxOpenH2.setEnabled(false);
		ComBoxOpenH2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH2.setBounds(437, 372, 44, 28);
		panel.add(ComBoxOpenH2);
		
		JLabel label_4 = new JLabel("h");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_4.setBounds(483, 376, 12, 21);
		panel.add(label_4);
		
		ComBoxOpenM2 = new JComboBox();
		ComBoxOpenM2.setEnabled(false);
		ComBoxOpenM2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM2.setBounds(502, 372, 44, 28);
		panel.add(ComBoxOpenM2);
		
		JLabel lblM_1 = new JLabel("m");
		lblM_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_1.setBounds(548, 379, 12, 21);
		panel.add(lblM_1);
		
		ComBoxCloseH2 = new JComboBox();
		ComBoxCloseH2.setEnabled(false);
		ComBoxCloseH2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH2.setBounds(573, 375, 44, 28);
		panel.add(ComBoxCloseH2);
		
		JLabel label_6 = new JLabel("h");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_6.setBounds(619, 379, 12, 21);
		panel.add(label_6);
		
		ComBoxCloseM2 = new JComboBox();
		ComBoxCloseM2.setEnabled(false);
		ComBoxCloseM2.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM2.setBounds(638, 375, 44, 28);
		panel.add(ComBoxCloseM2);
		
		JLabel lblM_8 = new JLabel("m");
		lblM_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_8.setBounds(684, 379, 12, 21);
		panel.add(lblM_8);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		lblTuesday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTuesday.setBounds(350, 414, 59, 21);
		panel.add(lblTuesday);
		
		ComBoxOpenH3 = new JComboBox();
		ComBoxOpenH3.setEnabled(false);
		ComBoxOpenH3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH3.setBounds(437, 416, 44, 28);
		panel.add(ComBoxOpenH3);
		
		JLabel label_9 = new JLabel("h");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_9.setBounds(483, 420, 12, 21);
		panel.add(label_9);
		
		 ComBoxOpenM3 = new JComboBox();
		 ComBoxOpenM3.setEnabled(false);
		 ComBoxOpenM3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		 ComBoxOpenM3.setBounds(502, 416, 44, 28);
		panel.add(ComBoxOpenM3);
		
		JLabel lblM_2 = new JLabel("m");
		lblM_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_2.setBounds(548, 420, 12, 21);
		panel.add(lblM_2);
		
		ComBoxCloseH3 = new JComboBox();
		ComBoxCloseH3.setEnabled(false);
		ComBoxCloseH3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH3.setBounds(573, 416, 44, 28);
		panel.add(ComBoxCloseH3);
		
		JLabel label_11 = new JLabel("h");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_11.setBounds(619, 420, 12, 21);
		panel.add(label_11);
		
		ComBoxCloseM3 = new JComboBox();
		ComBoxCloseM3.setEnabled(false);
		ComBoxCloseM3.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM3.setBounds(638, 416, 44, 28);
		panel.add(ComBoxCloseM3);
		
		JLabel lblM_9 = new JLabel("m");
		lblM_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_9.setBounds(684, 420, 12, 21);
		panel.add(lblM_9);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWednesday.setBounds(350, 455, 77, 21);
		panel.add(lblWednesday);
		
		ComBoxOpenH4 = new JComboBox();
		ComBoxOpenH4.setEnabled(false);
		ComBoxOpenH4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH4.setBounds(437, 457, 44, 28);
		panel.add(ComBoxOpenH4);
		
		JLabel label_14 = new JLabel("h");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_14.setBounds(483, 461, 12, 21);
		panel.add(label_14);
		
		ComBoxOpenM4 = new JComboBox();
		ComBoxOpenM4.setEnabled(false);
		ComBoxOpenM4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM4.setBounds(502, 457, 44, 28);
		panel.add(ComBoxOpenM4);
		
		JLabel lblM_4 = new JLabel("m");
		lblM_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_4.setBounds(548, 461, 12, 21);
		panel.add(lblM_4);
		
		ComBoxCloseH4 = new JComboBox();
		ComBoxCloseH4.setEnabled(false);
		ComBoxCloseH4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH4.setBounds(573, 457, 44, 28);
		panel.add(ComBoxCloseH4);
		
		JLabel label_16 = new JLabel("h");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_16.setBounds(619, 461, 12, 21);
		panel.add(label_16);
		
		ComBoxCloseM4 = new JComboBox();
		ComBoxCloseM4.setEnabled(false);
		ComBoxCloseM4.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM4.setBounds(638, 457, 44, 28);
		panel.add(ComBoxCloseM4);
		
		JLabel lblM_10 = new JLabel("m");
		lblM_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_10.setBounds(684, 461, 12, 21);
		panel.add(lblM_10);
		
		JLabel lblThursday = new JLabel("Thursday");
		lblThursday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblThursday.setBounds(350, 496, 77, 21);
		panel.add(lblThursday);
		
		ComBoxOpenH5 = new JComboBox();
		ComBoxOpenH5.setEnabled(false);
		ComBoxOpenH5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH5.setBounds(437, 498, 44, 28);
		panel.add(ComBoxOpenH5);
		
		JLabel label_19 = new JLabel("h");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_19.setBounds(483, 502, 12, 21);
		panel.add(label_19);
		
		ComBoxOpenM5 = new JComboBox();
		ComBoxOpenM5.setEnabled(false);
		ComBoxOpenM5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM5.setBounds(502, 498, 44, 28);
		panel.add(ComBoxOpenM5);
		
		JLabel lblM_3 = new JLabel("m");
		lblM_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_3.setBounds(548, 502, 12, 21);
		panel.add(lblM_3);
		
		 ComBoxCloseH5 = new JComboBox();
		 ComBoxCloseH5.setEnabled(false);
		 ComBoxCloseH5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		 ComBoxCloseH5.setBounds(573, 498, 44, 28);
		panel.add(ComBoxCloseH5);
		
		JLabel label_21 = new JLabel("h");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_21.setBounds(619, 502, 12, 21);
		panel.add(label_21);
		
		ComBoxCloseM5 = new JComboBox();
		ComBoxCloseM5.setEnabled(false);
		ComBoxCloseM5.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM5.setBounds(638, 498, 44, 28);
		panel.add(ComBoxCloseM5);
		
		JLabel lblM_11 = new JLabel("m");
		lblM_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_11.setBounds(684, 502, 12, 21);
		panel.add(lblM_11);
		
		JLabel lblFriday = new JLabel("Friday");
		lblFriday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFriday.setBounds(350, 537, 59, 21);
		panel.add(lblFriday);
		
		ComBoxOpenH6 = new JComboBox();
		ComBoxOpenH6.setEnabled(false);
		ComBoxOpenH6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH6.setBounds(437, 539, 44, 28);
		panel.add(ComBoxOpenH6);
		
		JLabel label_24 = new JLabel("h");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_24.setBounds(483, 543, 12, 21);
		panel.add(label_24);
		
		ComBoxOpenM6 = new JComboBox();
		ComBoxOpenM6.setEnabled(false);
		ComBoxOpenM6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM6.setBounds(502, 539, 44, 28);
		panel.add(ComBoxOpenM6);
		
		JLabel lblM_5 = new JLabel("m");
		lblM_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_5.setBounds(548, 543, 12, 21);
		panel.add(lblM_5);
		
		ComBoxCloseH6 = new JComboBox();
		ComBoxCloseH6.setEnabled(false);
		ComBoxCloseH6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH6.setBounds(573, 539, 44, 28);
		panel.add(ComBoxCloseH6);
		
		JLabel label_26 = new JLabel("h");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_26.setBounds(619, 543, 12, 21);
		panel.add(label_26);
		
		ComBoxCloseM6 = new JComboBox();
		ComBoxCloseM6.setEnabled(false);
		ComBoxCloseM6.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM6.setBounds(638, 539, 44, 28);
		panel.add(ComBoxCloseM6);
		
		JLabel lblM_12 = new JLabel("m");
		lblM_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_12.setBounds(684, 543, 12, 21);
		panel.add(lblM_12);
		
		JLabel lblSaturday = new JLabel("Saturday");
		lblSaturday.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaturday.setBounds(350, 578, 77, 21);
		panel.add(lblSaturday);
		
		ComBoxOpenH7 = new JComboBox();
		ComBoxOpenH7.setEnabled(false);
		ComBoxOpenH7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxOpenH7.setBounds(437, 580, 44, 28);
		panel.add(ComBoxOpenH7);
		
		JLabel label_29 = new JLabel("h");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_29.setBounds(483, 584, 12, 21);
		panel.add(label_29);
		
		ComBoxOpenM7 = new JComboBox();
		ComBoxOpenM7.setEnabled(false);
		ComBoxOpenM7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxOpenM7.setBounds(502, 580, 44, 28);
		panel.add(ComBoxOpenM7);
		
		JLabel lblM_6 = new JLabel("m");
		lblM_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_6.setBounds(548, 584, 12, 21);
		panel.add(lblM_6);
		
		ComBoxCloseH7 = new JComboBox();
		ComBoxCloseH7.setEnabled(false);
		ComBoxCloseH7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24"}));
		ComBoxCloseH7.setBounds(573, 580, 44, 28);
		panel.add(ComBoxCloseH7);
		
		JLabel label_31 = new JLabel("h");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		label_31.setBounds(619, 584, 12, 21);
		panel.add(label_31);
		
		ComBoxCloseM7 = new JComboBox();
		ComBoxCloseM7.setEnabled(false);
		ComBoxCloseM7.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60"}));
		ComBoxCloseM7.setBounds(638, 580, 44, 28);
		panel.add(ComBoxCloseM7);
		
		JLabel lblM_13 = new JLabel("m");
		lblM_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblM_13.setBounds(684, 584, 12, 21);
		panel.add(lblM_13);
		
		JButton btnModifyAllThe = new JButton("Modify All The Time At Once");
		btnModifyAllThe.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnModifyAllThe.setEnabled(false);
		btnModifyAllThe.setFont(new Font("Dialog", Font.BOLD, 12));
		btnModifyAllThe.setBounds(437, 621, 245, 29);
		panel.add(btnModifyAllThe);
		
		JLabel lblDeliveryArea = new JLabel("Delivery Area");
		lblDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeliveryArea.setBounds(77, 348, 157, 37);
		panel.add(lblDeliveryArea);
		
		TxtAreaDeliveryArea = new JTextArea();
		TxtAreaDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		TxtAreaDeliveryArea.setEnabled(false);
		TxtAreaDeliveryArea.setEditable(false);
		TxtAreaDeliveryArea.setBounds(34, 399, 247, 68);
		panel.add(TxtAreaDeliveryArea);
		
		JLabel lblAddDeliveryArea = new JLabel("Delivery Area :");
		lblAddDeliveryArea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddDeliveryArea.setBounds(34, 491, 101, 21);
		panel.add(lblAddDeliveryArea);
		
		TxtDeliveryArea = new JTextField();
		TxtDeliveryArea.setEditable(false);
		TxtDeliveryArea.setBounds(133, 492, 148, 20);
		panel.add(TxtDeliveryArea);
		TxtDeliveryArea.setColumns(10);
		
		btnAddDeliveryArea = new JButton("Add Delivery Area");
		btnAddDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAddDeliveryArea.setEnabled(false);
		btnAddDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnAddDeliveryArea.setBounds(136, 533, 145, 28);
		panel.add(btnAddDeliveryArea);
		
		btnDeleteDeliveryArea = new JButton("Delete Delivery Area");
		btnDeleteDeliveryArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnDeleteDeliveryArea.setEnabled(false);
		btnDeleteDeliveryArea.setFont(new Font("Dialog", Font.BOLD, 12));
		btnDeleteDeliveryArea.setBounds(133, 567, 148, 28);
		panel.add(btnDeleteDeliveryArea);
		
		btnSave = new JButton("Delete Restaurant");
		btnSave.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnSave.setFont(new Font("Dialog", Font.BOLD, 12));
		btnSave.setBounds(94, 621, 187, 28);
		panel.add(btnSave);
		
		TxtRestaurantPhoneNo = new JTextField();
		TxtRestaurantPhoneNo.setEditable(false);
		TxtRestaurantPhoneNo.setColumns(10);
		TxtRestaurantPhoneNo.setBounds(511, 199, 187, 20);
		panel.add(TxtRestaurantPhoneNo);
		
		JLabel lblRestaurant = new JLabel("Selecet Restaurant\r\n");
		lblRestaurant.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRestaurant.setBounds(69, 70, 212, 48);
		panel.add(lblRestaurant);
		
		RestaurantComboBox = new JComboBox();
		RestaurantComboBox.setBounds(59, 139, 187, 37);
		panel.add(RestaurantComboBox);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(34, 119, 247, 199);
		panel.add(textArea);

		this.setVisible(true);
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
	}
