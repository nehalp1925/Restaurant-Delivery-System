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
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class MarkOrderAsReady extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar MarkAsOrderReadyMenuBar;
	private JMenu FileMenu,OrderMenu;
	private JMenuItem DisconnectMItem,ClosemItem,ViewOrderMItem;
	private JTextField TxtDate;
	private JTextField TxtTimeHour;
	private JTextField TxtPostalCode;
	private JButton btnOrderReady;
	private JComboBox OrderComboBox;
	private JTable Ordertable;
	private JComboBox TimeComboBox;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JLabel lblSelectTime;
	private JTextArea textArea_2;
	private JLabel lblDeliveryDetail;


	
	/**
	 * Create the frame.
	 */
	public MarkOrderAsReady() {
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
		
		MarkAsOrderReadyMenuBar = new JMenuBar();
		MarkAsOrderReadyMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		MarkAsOrderReadyMenuBar.setBackground(new Color(255, 204, 0));
		MarkAsOrderReadyMenuBar.setBounds(0, 0, 785, 25);
		panel.add(MarkAsOrderReadyMenuBar);
		
		FileMenu = new JMenu("File");
		MarkAsOrderReadyMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		ClosemItem = new JMenuItem("Close");
		FileMenu.add(ClosemItem);		
		
		JLabel lblTitle1 = new JLabel("");
		lblTitle1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle1.setBounds(200, 38, 415, 62);
		panel.add(lblTitle1);
		
		ImageIcon icon6 = new ImageIcon("Images/MARKASREADY.png");
		Image img3 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblTitle1.setIcon(icon7);
		
		JLabel lblName = new JLabel("Delivery Date :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(355, 190, 106, 14);
		panel.add(lblName);
		
		TxtDate = new JTextField();
		TxtDate.setEditable(false);
		TxtDate.setColumns(10);
		TxtDate.setBounds(472, 184, 187, 28);
		panel.add(TxtDate);
		
		JLabel lblDeliveryTime = new JLabel("Delivery Time :");
		lblDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryTime.setBounds(355, 237, 114, 14);
		panel.add(lblDeliveryTime);
		
		TxtTimeHour = new JTextField();
		TxtTimeHour.setEditable(false);
		TxtTimeHour.setColumns(10);
		TxtTimeHour.setBounds(472, 231, 187, 28);
		panel.add(TxtTimeHour);
		
		btnOrderReady = new JButton("Order Ready");
		btnOrderReady.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnOrderReady.setFont(new Font("Dialog", Font.BOLD, 20));
		btnOrderReady.setBounds(331, 599, 194, 38);
		panel.add(btnOrderReady);
		
		JLabel lblTitle2 = new JLabel("Order Accepted");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitle2.setBounds(79, 96, 158, 48);
		panel.add(lblTitle2);
		
		JLabel lblPostalCode = new JLabel("Postal Code :");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPostalCode.setBounds(355, 286, 106, 14);
		panel.add(lblPostalCode);
		
		TxtPostalCode = new JTextField();
		TxtPostalCode.setEditable(false);
		TxtPostalCode.setColumns(10);
		TxtPostalCode.setBounds(472, 280, 187, 28);
		panel.add(TxtPostalCode);
		
		JLabel lblMealInOrder = new JLabel("Meal in Order ");
		lblMealInOrder.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMealInOrder.setBounds(331, 355, 166, 21);
		panel.add(lblMealInOrder);		
		
		OrderComboBox = new JComboBox();
		OrderComboBox.setBounds(79, 178, 184, 38);
		panel.add(OrderComboBox);
		
		Ordertable = new JTable();
		Ordertable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ordertable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Ordertable.setBounds(331, 387, 391, 191);
		panel.add(Ordertable);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBounds(79, 407, 184, 38);
		panel.add(TimeComboBox);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(255, 255, 204));
		textArea.setEditable(false);
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(63, 147, 212, 190);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(63, 388, 212, 190);
		panel.add(textArea_1);
		
		lblSelectTime = new JLabel("Select Time");
		lblSelectTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSelectTime.setBounds(103, 348, 134, 48);
		panel.add(lblSelectTime);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(327, 149, 395, 190);
		panel.add(textArea_2);
		
		lblDeliveryDetail = new JLabel("Delivery Detail \r\n");
		lblDeliveryDetail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeliveryDetail.setBounds(457, 96, 158, 48);
		panel.add(lblDeliveryDetail);
		
		

		this.setVisible(true);
	}

	public JComboBox getTimeComboBox() {
		return TimeComboBox;
	}

	public void setTimeComboBox(JComboBox timeComboBox) {
		TimeComboBox = timeComboBox;
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
	 * @return the markAsOrderReadyMenuBar
	 */
	public JMenuBar getMarkAsOrderReadyMenuBar() {
		return MarkAsOrderReadyMenuBar;
	}

	/**
	 * @param markAsOrderReadyMenuBar the markAsOrderReadyMenuBar to set
	 */
	public void setMarkAsOrderReadyMenuBar(JMenuBar markAsOrderReadyMenuBar) {
		MarkAsOrderReadyMenuBar = markAsOrderReadyMenuBar;
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
	 * @return the closemItem
	 */
	public JMenuItem getClosemItem() {
		return ClosemItem;
	}

	/**
	 * @param closemItem the closemItem to set
	 */
	public void setClosemItem(JMenuItem closemItem) {
		ClosemItem = closemItem;
	}

	/**
	 * @return the viewOrderMItem
	 */
	public JMenuItem getViewOrderMItem() {
		return ViewOrderMItem;
	}

	/**
	 * @param viewOrderMItem the viewOrderMItem to set
	 */
	public void setViewOrderMItem(JMenuItem viewOrderMItem) {
		ViewOrderMItem = viewOrderMItem;
	}

	/**
	 * @return the txtDate
	 */
	public JTextField getTxtDate() {
		return TxtDate;
	}

	/**
	 * @param txtDate the txtDate to set
	 */
	public void setTxtDate(JTextField txtDate) {
		TxtDate = txtDate;
	}

	/**
	 * @return the txtTimeHour
	 */
	public JTextField getTxtTimeHour() {
		return TxtTimeHour;
	}

	/**
	 * @param txtTimeHour the txtTimeHour to set
	 */
	public void setTxtTimeHour(JTextField txtTimeHour) {
		TxtTimeHour = txtTimeHour;
	}

	

	/**
	 * @return the txtPostalCode
	 */
	public JTextField getTxtPostalCode() {
		return TxtPostalCode;
	}

	/**
	 * @param txtPostalCode the txtPostalCode to set
	 */
	public void setTxtPostalCode(JTextField txtPostalCode) {
		TxtPostalCode = txtPostalCode;
	}

	

	

	public JComboBox getOrderComboBox() {
		return OrderComboBox;
	}

	public void setOrderComboBox(JComboBox orderComboBox) {
		OrderComboBox = orderComboBox;
	}

	public JTable getOrdertable() {
		return Ordertable;
	}

	public void setOrdertable(JTable ordertable) {
		Ordertable = ordertable;
	}

	/**
	 * @return the btnOrderReady
	 */
	public JButton getBtnOrderReady() {
		return btnOrderReady;
	}

	/**
	 * @param btnOrderReady the btnOrderReady to set
	 */
	public void setBtnOrderReady(JButton btnOrderReady) {
		this.btnOrderReady = btnOrderReady;
	}

	
	
}
