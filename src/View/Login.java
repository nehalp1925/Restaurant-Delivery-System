package View;

import java.awt.Font;
import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import DBManager.DatabaseConnection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoginUname;
	private JButton btnlogin;
	private JButton btnregister;
	private JButton btnclose;
	private JPanel panel;
	private JPasswordField passwordField;
	private JLabel lblLogo;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	/**
	 * 
	 */
	public Login() {
		setTitle("Grab Hunger");
		ImageIcon imgicon = new ImageIcon("Images/logo.png");    
	    this.setIconImage(imgicon.getImage());
		setResizable(false);
	//	new DatabaseConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 700);

		JLabel bg = new JLabel(new ImageIcon("Images/background.jpg"));
		
		setContentPane(bg);
		
		 panel = new JPanel();
		 panel.setBounds(0,0,800,650);
		bg.add(panel);
		panel.setOpaque(false);
		panel.setLayout(null);
		

		
		
		JLabel lblLogin = new JLabel("");
		lblLogin.setFont(new Font("Dialog", Font.PLAIN, 60));
		lblLogin.setBounds(506, 32, 231, 94);
		panel.add(lblLogin);
		
		ImageIcon icon6 = new ImageIcon("Images/LOGIN.png");
		Image img3 = icon6.getImage().getScaledInstance(250, 100, Image.SCALE_SMOOTH);
		ImageIcon icon7 = new ImageIcon(img3);
		lblLogin.setIcon(icon7);
		
		JLabel lbluname = new JLabel("login");
		
		lbluname.setBounds(422, 152, 48, 46);
		panel.add(lbluname);
		
		ImageIcon icon = new ImageIcon("Images/user1.png");
		Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon2 = new ImageIcon(img);
		lbluname.setIcon(icon2);
		
		txtLoginUname = new JTextField();
		txtLoginUname.setBounds(493, 159, 244, 33);
		panel.add(txtLoginUname);
		txtLoginUname.setColumns(10);
		
		JLabel lblpwd = new JLabel("login");
		lblpwd.setBounds(422, 240, 48, 52);
		panel.add(lblpwd);
		
		ImageIcon icon1 = new ImageIcon("Images/password.png");
		Image img1 = icon1.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon3 = new ImageIcon(img1);
		lblpwd.setIcon(icon3);
		
		btnlogin = new JButton("Login");
		btnlogin.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		
		btnlogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnlogin.setBounds(494, 315, 101, 46);
		panel.add(btnlogin);
		
		btnregister = new JButton("Register");
		btnregister.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		btnregister.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnregister.setBounds(626, 315, 111, 46);
		panel.add(btnregister);
		
		btnclose = new JButton("Close");	
		btnclose.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnclose.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnclose.setBounds(553, 387, 111, 46);
		panel.add(btnclose);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(493, 248, 244, 36);
		panel.add(passwordField);
		
		lblLogo = new JLabel("");
		lblLogo.setBounds(66, 111, 273, 217);
		panel.add(lblLogo);
		
		ImageIcon icon4 = new ImageIcon("Images/logo.png");
		Image img2 = icon4.getImage().getScaledInstance(220, 220, Image.SCALE_SMOOTH);
		ImageIcon icon5 = new ImageIcon(img2);
		lblLogo.setIcon(icon5);
		
		this.setVisible(true);
		
		
		
		
	}

	public JTextField getTxtLoginUname() {
		return txtLoginUname;
	}

	public void setTxtLoginUname(JTextField txtLoginUname) {
		this.txtLoginUname = txtLoginUname;
	}

	

	public JButton getBtnclose() {
		return btnclose;
	}

	public void setBtnclose(JButton btnclose) {
		this.btnclose = btnclose;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JTextField gettxtLoginUname() {
		return txtLoginUname;
	}

	public void settxtLoginUname(JTextField textField) {
		this.txtLoginUname = textField;
	}

	

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public JButton getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(JButton btnlogin) {
		this.btnlogin = btnlogin;
	}

	public JButton getBtnregister() {
		return btnregister;
	}

	public void setBtnregister(JButton btnregister) {
		this.btnregister = btnregister;
	}
}
