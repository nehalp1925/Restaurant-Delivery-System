package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ClientBean;
import View.ClientNewAccount;

public class ClientNewAccountController {
	DTO dto;
	ClientNewAccount view;
	
	public ClientNewAccountController() {
		dto = new DTO();
		view = new ClientNewAccount();
		
		
		view.setVisible(true);
		view.getBtnSave().setEnabled(false);
		setEvents();
	}
	
	public void setEvents() {
		view.getBtnVerify().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnSave().setEnabled(false);
				String uname=view.getTxtuname().getText();
				
				if(uname.trim().isEmpty()) {
					// TODO Show error message Please insert username first
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName To Verify", "Registration Error",0);
					return;
				}
				 
				if(null == dto.getClient(uname.trim())) {
					//System.out.println("Username available");
					JOptionPane.showMessageDialog(view.getPanel(), "Good To Go !!", "Registration Error",0);
					view.getTxtuname().setEnabled(false);
					view.getBtnSave().setEnabled(true);
					
					
				
				}else {
					JOptionPane.showMessageDialog(view.getPanel(), "OOPPS !!! UserName Already Exist!!", "Registration Error",0);
				}
				
			}
		});
		
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = view.getTxtuname().getText().trim();
				//String password = view.getPasswordtextField().getText().trim();
				//String cpassword = view.getConfirmPasswordetextField().getText().trim();

				String password=String.valueOf(view.getPasswordField().getPassword());
				String cpassword=String.valueOf(view.getPasswordField_1().getPassword());
				String lastname = view.getLastNametextField().getText().trim();
				String firstname = view.getFirstNametextField().getText().trim();
				String address = view.getAddresstextField().getText().trim();
				String email = view.getEmailtextField().getText().trim();
				String phoneno = view.getTxtPhoneNo().getText().trim();
				
				
				
				//validation
				
				if(username.trim().isEmpty() && password.trim().isEmpty() && lastname.trim().isEmpty() && firstname.trim().isEmpty() && 
						address.trim().isEmpty() && email.trim().isEmpty() && phoneno.trim().isEmpty()) {
						JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName To Verify", "Registration Error",0);
					
				}else if(password.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Password", "Registration Error",0);
				}else if(cpassword.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Confirm Password", "Registration Error",0);
				}else if(password.length()<=5) {
					JOptionPane.showMessageDialog(view.getPanel(), "Password Should Be Greates Than Five Character", "Registration Error",0);
				}else if(!password.equals(cpassword)) {
					JOptionPane.showMessageDialog(view.getPanel(), "Password And Confirm Password Must Be Same", "Registration Error",0);
				}else if(lastname.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Last Name", "Registration Error",0);
				}
				else if((!lastname.trim().matches("\\p{Lower}+\\s?"))) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Valid Last Name", "Registration Error",0);
				}
				else if(firstname.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your First Name", "Registration Error",0);
				}
				else if((!firstname.trim().matches("\\p{Lower}+\\s?"))) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Valid First Name", "Registration Error",0);
				}
				else if(address.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Current Address", "Registration Error",0);
				}else if(email.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Email-ID", "Registration Error",0);
				}else if(phoneno.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Phone Number", "Registration Error",0);
				}else if(!phoneno.matches("\\d{10}")) {
					JOptionPane.showMessageDialog(view.getPanel(), "Opps !! Please Enter Valid Number (MUST BE 10 DIGIT) ", "Registration Error",0);
				}else {
					ClientBean bean = new ClientBean();
					bean.setUsername(username);
					bean.setPassword(password);
					bean.setCpassword(cpassword);
					bean.setLastname(lastname);
					bean.setFirstname(firstname);			
					bean.setAddress(address);
					bean.setEmail(email);
					bean.setPhonenumber(phoneno);
					
					
					dto.Clientinsert(bean);
					view.dispose();
					new LoginController();
					
					//view.getBtnSave().setEnabled(false);
				}
				
				/*view.dispose();
				new LoginController();*/
				
			}
		});
		
	
		
		
	}
	
	

}
