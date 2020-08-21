package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ClientBean;
import View.ClientEditAccount;

public class ClientEditAccountController {
	ClientEditAccount view;
	DTO dto;
	
	public ClientEditAccountController(int id) {
		view = new ClientEditAccount();
		
		
		view.setVisible(true);
		dto = new DTO();
		
		//System.out.println(id);
		dto.ReadData(id);
		view.getTxtUserName().setText(dto.username);
		view.getPasswordField().setText(dto.password);
		view.getConfrimPasswordField().setText(dto.password);
		view.getTxtLastName().setText(dto.lastname);
		view.getTxtFirstName().setText(dto.firstname);
		view.getTxtAddress().setText(dto.address);
		view.getTxtEmail().setText(dto.email);
		view.getTxtPhoneNo().setText(dto.phone);
		
		//File Disconnect
		view.getDisconnectMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new LoginController();
			}
		});
		
		//Quit
		view.getCloseMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				
			}
		});

	//Profile Account
view.getProfileMItem().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		view.dispose();
		new ClientPageController(id);
	}
});

//Delete Account
view.getDeleteMItem().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		view.dispose();
		new ClientDeleteAccountController(id);
	}
});

//Food Order
		view.getOrderFoodMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new ClientOrderFoodController(id);					}
		});
		
//Food History
		view.getOrderHistoryMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new ClientOrderHistroyController(id);
			}
		});
		
//Save Button
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				String username = view.getTxtUserName().getText().trim();

String password=String.valueOf(view.getPasswordField().getPassword());
String cpassword=String.valueOf(view.getConfrimPasswordField().getPassword());
				//String password = view.getTxtPassword().getText().trim();
				//String cpassword = view.getTxtConfrimPassword().getText().trim();
				String lastname = view.getTxtLastName().getText().trim();
				String firstname = view.getTxtFirstName().getText().trim();
				String address = view.getTxtAddress().getText().trim();
				String email = view.getTxtEmail().getText().trim();
				String phoneno = view.getTxtPhoneNo().getText().trim();
				
				//Validation
				
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
					
					
					dto.ClientEdit(bean,id);
					view.dispose();
					new ClientPageController(id);
					//view.getBtnSave().setEnabled(false);
				}
			}
		});
		
	}
	
	
}

