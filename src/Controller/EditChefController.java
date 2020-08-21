package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ChefBean;
import Model.ClientBean;
import View.ClientEditAccount;
import View.EditChef;

public class EditChefController {
	EditChef view;
	DTO dto;
	public String selectedChef;
	
	public EditChefController(String resname,String username) {
		view = new EditChef();
		
		
		view.setVisible(true);
		dto = new DTO();
		view.getOrderMenu().setVisible(false);
		view.getTxtRestName().setText(resname);
		view.getChefComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadAllChef(resname).toArray(new String[0])));
		
		view.getChefComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedChef=view.getChefComboBox().getSelectedItem().toString();
				//dto.ReadDataChef(resname,selectedChef);
				dto.ReadDataChef(resname);
				
				view.getTxtRestName().setText(resname);
				view.getTxtUserName().setText(dto.Cusername);
				view.getTxtPassword().setText(dto.Cpassword);
				view.getTxtConfrimPassword().setText(dto.CCpassword);
				view.getTxtLastName().setText(dto.Clastname);
				view.getTxtFirstName().setText(dto.Cfirstname);
				view.getTxtAddress().setText(dto.Caddress);
				view.getTxtEmail().setText(dto.Cemail);
				view.getTxtPhoneNo().setText(dto.Cphone);
				
				view.getBtnSave().setEnabled(true);
				view.getTxtPassword().setEditable(true);
				view.getTxtConfrimPassword().setEditable(true);
				view.getTxtLastName().setEditable(true);
				view.getTxtFirstName().setEditable(true);
				view.getTxtAddress().setEditable(true);;
				view.getTxtEmail().setEditable(true);
				view.getTxtPhoneNo().setEditable(true);
			}
		});
		
		
		
		
	
		

		
//Save Button
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String username =	view.getTxtUserName().getText().trim();
				String password = 	view.getTxtPassword().getText().trim();
				String cpassword = view.getTxtConfrimPassword().getText().trim();
				String lastname = view.getTxtLastName().getText().trim();
				String firstname = view.getTxtFirstName().getText().trim();
				String address = view.getTxtAddress().getText().trim();
				String email = view.getTxtEmail().getText().trim();
				String phoneno = view.getTxtPhoneNo().getText().trim();
				
				
				
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
				}else if(firstname.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your First Name", "Registration Error",0);
				}else if(address.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Current Address", "Registration Error",0);
				}else if(email.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Email-ID", "Registration Error",0);
				}else if(phoneno.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Phone Number", "Registration Error",0);
				}else {
					
					ChefBean bean = new ChefBean();
					bean.setRestaurantname(resname);
					bean.setUsername(username);
					bean.setPassword(password);
					bean.setCpassword(cpassword);
					bean.setLastname(lastname);
					bean.setFirstname(firstname);			
					bean.setAddress(address);
					bean.setEmail(email);
					bean.setPhonenumber(phoneno);
					
					
					dto.ChefEdit(bean,resname,username);
					view.dispose();
				
					int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Edit Other Chef?");  
					 if(a==JOptionPane.YES_OPTION){ 
						 new EditChefController(resname,username);
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
		
		view.getCreateChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new AddChefController(resname,username);

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
