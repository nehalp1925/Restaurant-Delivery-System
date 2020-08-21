
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
import java.awt.Image;

import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class AcceptOrder extends JFrame {

	private JPanel contentPane,panel;
	private JLabel bg;
	private JMenuBar AcceptOrderMenuBar;
	private JMenu FileMenu,OrderMenu;
	private JMenuItem DisconnectMItem,ClosemItem,AcceptOrderMItem,OrderReadyMItem;
	private JLabel lblTitle,lblDeliveryDate,lblDeliveryTime,lblPostalCode,lblTitle2;
	private JTextField TxtDeliveryDate,TxtHour,TxtPostalCode;
	private JButton btnAcceptOrder;	
	private JTable Ordertable;
	private JComboBox OrderComboBox;
	private JLabel lblGrandTotal;
	private JTextField TxtGrandTotal;
	private JComboBox TimeComboBox;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JLabel lblOrderDetail;
	private JLabel lblItemNameitem;
	private JLabel label;
	
	

	/**
	 * Create the frame.
	 */
	public AcceptOrder() {	
		
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
		
		AcceptOrderMenuBar = new JMenuBar();
		AcceptOrderMenuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		AcceptOrderMenuBar.setBackground(new Color(255, 204, 0));
		AcceptOrderMenuBar.setBounds(0, 0, 785, 25);
		panel.add(AcceptOrderMenuBar);
		
		FileMenu = new JMenu("File");
		AcceptOrderMenuBar.add(FileMenu);
			
		DisconnectMItem = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMItem);		
		
		ClosemItem = new JMenuItem("Close");
		FileMenu.add(ClosemItem);
		
		OrderMenu = new JMenu("Order");
		AcceptOrderMenuBar.add(OrderMenu);		
		
		AcceptOrderMItem = new JMenuItem("Accept Order");
		OrderMenu.add(AcceptOrderMItem);
		
		OrderReadyMItem = new JMenuItem("Order Ready");
		OrderMenu.add(OrderReadyMItem);
		
		
		lblTitle = new JLabel("");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle.setBounds(167, 38, 492, 71);
		panel.add(lblTitle);
		
		ImageIcon icon6 = new ImageIcon("Images/ACCEPTORDER.png");
		Image img4 = icon6.getImage().getScaledInstance(450, 70, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img4);
		lblTitle.setIcon(icon7);
		
		lblDeliveryDate = new JLabel("Delivery Date :");
		lblDeliveryDate.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryDate.setBounds(365, 178, 112, 14);
		panel.add(lblDeliveryDate);
		
		lblDeliveryTime = new JLabel("Delivery Time :");
		lblDeliveryTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeliveryTime.setBounds(365, 217, 112, 14);
		panel.add(lblDeliveryTime);
		
		lblPostalCode = new JLabel("Postal Code :");
		lblPostalCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPostalCode.setBounds(365, 258, 98, 14);
		panel.add(lblPostalCode);
		
		TxtDeliveryDate = new JTextField();
		TxtDeliveryDate.setEditable(false);
		TxtDeliveryDate.setColumns(10);
		TxtDeliveryDate.setBounds(511, 211, 190, 28);
		panel.add(TxtDeliveryDate);		
		
		TxtHour = new JTextField();
		TxtHour.setEditable(false);
		TxtHour.setColumns(10);
		TxtHour.setBounds(511, 172, 190, 28);
		panel.add(TxtHour);
		
		TxtPostalCode = new JTextField();
		TxtPostalCode.setEditable(false);
		TxtPostalCode.setColumns(10);
		TxtPostalCode.setBounds(511, 252, 190, 28);
		panel.add(TxtPostalCode);
		
		btnAcceptOrder = new JButton("Accept Order");
		btnAcceptOrder.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnAcceptOrder.setFont(new Font("Dialog", Font.BOLD, 17));
		btnAcceptOrder.setBounds(534, 612, 210, 38);
		panel.add(btnAcceptOrder);
		
		lblTitle2 = new JLabel("Pendding Orders");
		lblTitle2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTitle2.setBounds(93, 103, 154, 48);
		panel.add(lblTitle2);
		
		Ordertable = new JTable();
		Ordertable.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		Ordertable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		Ordertable.setBounds(348, 402, 396, 179);
		panel.add(Ordertable);
		
		OrderComboBox = new JComboBox();
		OrderComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		OrderComboBox.setBounds(67, 172, 210, 38);
		panel.add(OrderComboBox);
		
		lblGrandTotal = new JLabel("Grand Total :");
		lblGrandTotal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGrandTotal.setBounds(365, 299, 98, 14);
		panel.add(lblGrandTotal);
		
		TxtGrandTotal = new JTextField();
		TxtGrandTotal.setEditable(false);
		TxtGrandTotal.setColumns(10);
		TxtGrandTotal.setBounds(511, 293, 190, 28);
		panel.add(TxtGrandTotal);
		
		TimeComboBox = new JComboBox();
		TimeComboBox.setBorder(new LineBorder(new Color(171, 173, 179)));
		TimeComboBox.setBounds(67, 424, 210, 38);
		panel.add(TimeComboBox);
		
		textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(341, 153, 403, 190);
		panel.add(textArea);
		
		textArea_1 = new JTextArea();
		textArea_1.setForeground(new Color(255, 255, 204));
		textArea_1.setEditable(false);
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(53, 402, 235, 177);
		panel.add(textArea_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setForeground(new Color(255, 255, 204));
		textArea_2.setEditable(false);
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(53, 153, 235, 190);
		panel.add(textArea_2);
		
		lblOrderDetail = new JLabel("Order Detail");
		lblOrderDetail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrderDetail.setBounds(486, 103, 119, 48);
		panel.add(lblOrderDetail);
		
		lblItemNameitem = new JLabel("Item Name |Item  Price |Item  Qty | Item Total");
		lblItemNameitem.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemNameitem.setBounds(348, 375, 381, 21);
		panel.add(lblItemNameitem);
		
		label = new JLabel("Select Time");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(116, 370, 110, 21);
		panel.add(label);

		this.setVisible(true);
	}

	public JComboBox getTimeComboBox() {
		return TimeComboBox;
	}

	public void setTimeComboBox(JComboBox timeComboBox) {
		TimeComboBox = timeComboBox;
	}

	public JTable getOrdertable() {
		return Ordertable;
	}

	public void setOrdertable(JTable ordertable) {
		Ordertable = ordertable;
	}

	public JComboBox getOrderComboBox() {
		return OrderComboBox;
	}

	public void setOrderComboBox(JComboBox orderComboBox) {
		OrderComboBox = orderComboBox;
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

	public JMenuBar getAcceptOrderMenuBar() {
		return AcceptOrderMenuBar;
	}

	public void setAcceptOrderMenuBar(JMenuBar acceptOrderMenuBar) {
		AcceptOrderMenuBar = acceptOrderMenuBar;
	}

	public JMenu getFileMenu() {
		return FileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		FileMenu = fileMenu;
	}

	public JMenu getOrderMenu() {
		return OrderMenu;
	}

	public void setOrderMenu(JMenu orderMenu) {
		OrderMenu = orderMenu;
	}

	public JMenuItem getDisconnectMItem() {
		return DisconnectMItem;
	}

	public void setDisconnectMItem(JMenuItem disconnectMItem) {
		DisconnectMItem = disconnectMItem;
	}

	public JMenuItem getClosemItem() {
		return ClosemItem;
	}

	public void setClosemItem(JMenuItem closemItem) {
		ClosemItem = closemItem;
	}

	public JMenuItem getAcceptOrderMItem() {
		return AcceptOrderMItem;
	}

	public void setAcceptOrderMItem(JMenuItem acceptOrderMItem) {
		AcceptOrderMItem = acceptOrderMItem;
	}

	public JMenuItem getOrderReadyMItem() {
		return OrderReadyMItem;
	}

	public void setOrderReadyMItem(JMenuItem orderReadyMItem) {
		OrderReadyMItem = orderReadyMItem;
	}

	public JLabel getLblTitle() {
		return lblTitle;
	}

	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}

	public JLabel getLblDeliveryDate() {
		return lblDeliveryDate;
	}

	public void setLblDeliveryDate(JLabel lblDeliveryDate) {
		this.lblDeliveryDate = lblDeliveryDate;
	}

	public JLabel getLblDeliveryTime() {
		return lblDeliveryTime;
	}

	public void setLblDeliveryTime(JLabel lblDeliveryTime) {
		this.lblDeliveryTime = lblDeliveryTime;
	}



	public JLabel getLblPostalCode() {
		return lblPostalCode;
	}

	public void setLblPostalCode(JLabel lblPostalCode) {
		this.lblPostalCode = lblPostalCode;
	}

	

	public JLabel getLblTitle2() {
		return lblTitle2;
	}

	public void setLblTitle2(JLabel lblTitle2) {
		this.lblTitle2 = lblTitle2;
	}

	public JTextField getTxtDeliveryDate() {
		return TxtDeliveryDate;
	}

	public void setTxtDeliveryDate(JTextField txtDeliveryDate) {
		TxtDeliveryDate = txtDeliveryDate;
	}

	public JTextField getTxtHour() {
		return TxtHour;
	}

	public void setTxtHour(JTextField txtHour) {
		TxtHour = txtHour;
	}



	public JTextField getTxtPostalCode() {
		return TxtPostalCode;
	}

	public void setTxtPostalCode(JTextField txtPostalCode) {
		TxtPostalCode = txtPostalCode;
	}


	public JButton getBtnAcceptOrder() {
		return btnAcceptOrder;
	}

	public void setBtnAcceptOrder(JButton btnAcceptOrder) {
		this.btnAcceptOrder = btnAcceptOrder;
	}

	public JTextField getTxtGrandTotal() {
		return TxtGrandTotal;
	}

	public void setTxtGrandTotal(JTextField txtGrandTotal) {
		TxtGrandTotal = txtGrandTotal;
	}

	
}
