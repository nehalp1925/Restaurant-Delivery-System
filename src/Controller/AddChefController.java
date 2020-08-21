package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ChefBean;
import Model.ManagerBean;
import View.AddChef;

public class AddChefController {
	DTO dto;
	AddChef view;
	
	public AddChefController(String resname,String username) {
		dto = new DTO();
		view = new AddChef();
		
		
		view.setVisible(true);
		view.getBtnSave().setEnabled(false);
		view.getOrderMenu().setVisible(false);
		//System.out.println(mname);
		view.getTxtRestName().setText(resname);

		view.getBtnVerify().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnSave().setEnabled(false);
				String uname=view.getTxtUserName().getText();
				
				if(uname.trim().isEmpty()) {
					// TODO Show error message Please insert username first
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName To Verify", "Registration Error",0);
					return;
				}
				 
				if(null == dto.getClient(uname.trim())) {
					//System.out.println("Username available");
					JOptionPane.showMessageDialog(view.getPanel(), "Good To Go !!", "Registration Error",0);
					view.getTxtUserName().setEnabled(false);
					view.getBtnSave().setEnabled(true);

				
				}else {
					JOptionPane.showMessageDialog(view.getPanel(), "OOPPS !!! UserName Already Exist!!", "Registration Error",0);
				}
				
			}
		});
		
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String restaurantname = view.getTxtRestName().getText().trim();
				String username = view.getTxtUserName().getText().trim();
			/*	String password = view.getTxtPassword().getText().trim();
				String cpassword = view.getTxtConfrimPassword().getText().trim();*/
				String password=String.valueOf(view.getPasswordField().getPassword());
				String cpassword=String.valueOf(view.getConfrimPasswordField().getPassword());
				String lastname = view.getTxtLastName().getText().trim();
				String firstname = view.getTxtFirstName().getText().trim();
				String address = view.getTxtAddress().getText().trim();
				String email = view.getTxtEmail().getText().trim();
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
				}else if(lastname.trim().isEmpty() || lastname.length()<=5 ) {
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
					ChefBean bean = new ChefBean();
					bean.setRestaurantname(restaurantname);
					bean.setUsername(username);
					bean.setPassword(password);
					bean.setCpassword(cpassword);
					bean.setLastname(lastname);
					bean.setFirstname(firstname);			
					bean.setAddress(address);
					bean.setEmail(email);
					bean.setPhonenumber(phoneno);
					
					
					dto.ChefInsert(bean);
					
					int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Add Other Chef?");  
					 if(a==JOptionPane.YES_OPTION){ 
						 new AddChefController(resname,username);
						 view.dispose();
						 
					 } else if(a==JOptionPane.NO_OPTION){
						 view.dispose();
						 new ManagerDashboardController(username);
					 }
				
				}
				
				
			}
		});
		
		
		
		
		
		
		// restaurant crud
		view.getEditRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new EditRestaurantController(resname,username);

				view.setVisible(false);
			}

		});
//-------------------  chef crud
		
		view.getEditChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new EditChefController(resname,username);

			}

		});

		view.getDeleteChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new DeleteChefController(resname,username);

			}

		});

		
		// -------------------menu crud
		

		view.getEditFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditMenuController(resname,username);
			}
		});
		
		view.getCreateFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddMenuController(resname,username);
			}
		});
		
		view.getDeleteFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteMenuController(resname,username);
			}
		});

		
		

		//------------- Manager CRUD
				
				view.getEditManagerItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						view.dispose();
						new EditManagerController(resname,username);
					}
				});	
		
		// -------------File
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.dispose();
				new ManagerDashboardController(username);
			}
		});

		view.getCloseMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
			}
		});	
		
	}
	
	
	
	

}
