package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ClientBean;
import Model.ManagerBean;
import View.AddManager;


public class AddManagerController {
	DTO dto;
	AddManager view;
	public String selectedRes;
	
	public AddManagerController() {
		dto = new DTO();
		view = new AddManager();
		
		//System.out.println(Restaurant_name);
		
		view.setVisible(true);
		view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		view.getBtnSave().setEnabled(false);

		
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
					String password=String.valueOf(view.getPasswordField().getPassword());
					String cpassword=String.valueOf(view.getConfrimPasswordField().getPassword());
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
						ManagerBean bean = new ManagerBean();
						bean.setRestaurantname(selectedRes);
						bean.setUsername(username);
						bean.setPassword(password);
						bean.setCpassword(cpassword);
						bean.setLastname(lastname);
						bean.setFirstname(firstname);			
						bean.setAddress(address);
						bean.setEmail(email);
						bean.setPhonenumber(phoneno);
						
						
						dto.ManagerInsert(bean);
						//new LoginController();
						int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Add Other Manager?");  
						 if(a==JOptionPane.YES_OPTION){ 
							 new AddDeliveryManController();
							 view.dispose();
							 
						 } else if(a==JOptionPane.NO_OPTION){
							 view.dispose();
							 new AdminDashboardController();
						 }
						
					
					
					}
					
					
				}
			});
		
		
		
	view.getRestaurantComboBox().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			

			selectedRes= view.getRestaurantComboBox().getSelectedItem().toString();

		}
	});
	
	//-------------File
			view.getDisconnectMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					view.dispose();
					new LoginController();
				}
			});
			
			view.getCloseMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
				}
			});
			
			//-------------Restaurant CRUD
			
			view.getCreateRestaurantMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new AddRestaurantController();
				}
			});
			
			view.getEditRestaurantMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new EditRestaurantController();
				}
			});	
			
			view.getDeleteRestaurantMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new DeleteRestaurantController();
				}
			});	
			
			//------------- Manager CRUD
					
					
					view.getEditManagerItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							view.dispose();
							new EditManagerController();
						}
					});	
					
					view.getDeleteManagerItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							//view.dispose();
							new DeleteManagerController();
							System.out.println("delete"+dto.i);
							view.dispose();
						}
					});	
					
			//------------- Menu CRUD
					view.getCreateFoodMenuItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							view.dispose();
							new AddMenuController();
						}
					});
					
					view.getEditFoodMenuItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							view.dispose();
							new EditMenuController();
						}
					});	
					
					view.getDeleteFoodMenuItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							
							view.dispose();
							new DeleteMenuController();
						}
					});	
			//------------- Delivery Man CRUD
			view.getCreateDeliveryManMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new AddDeliveryManController();
				}
			});
			
			view.getEditDeliveryManMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new EditDeliveryManController();
				}
			});	
			
			view.getDeleteDeliveryManMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					view.dispose();
					new DeleteDeliveryManController();
				}
			});	
	
	}
}
