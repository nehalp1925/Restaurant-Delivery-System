package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.ManagerBean;
import View.EditManager;

public class EditManagerController {
	EditManager view;
	DTO dto;
	public String selectedRes,selecetdManager;
	
	public EditManagerController() {
		view = new EditManager();
		view.getChefMenu().setVisible(false);
		
		view.setVisible(true);
		dto = new DTO();
		
		view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					
				
				selectedRes= view.getRestaurantComboBox().getSelectedItem().toString();
			
				dto.ReadAllManger(selectedRes);
			//	System.out.println(selectedRes);
				view.getManagerComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadAllManger(selectedRes).toArray(new String[0])));
				
				}
			
		});
		
		
		
		
		view.getManagerComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			
			
				view.getBtnEdit().setEnabled(true);	
				view.getTxtpassword().setEditable(true);
				view.getTxtcpassword().setEditable(true);
				view.getTxtLname().setEditable(true);
				view.getTxtfname().setEditable(true);
				view.getTxtAddress().setEditable(true);
				view.getTxtEmail().setEditable(true);
				view.getTxtPhoneNo().setEditable(true);
				view.getDeliveryManMenu().setEnabled(false);
				
				
				selecetdManager= view.getManagerComboBox().getSelectedItem().toString();
	
				dto.ReadDataManager(selecetdManager);
				
				view.getTxtuname().setText(dto.Musername);
				view.getTxtpassword().setText(dto.Mpassword);
				view.getTxtcpassword().setText(dto.MCpassword);
				view.getTxtLname().setText(dto.Mlastname);
				view.getTxtfname().setText(dto.Mfirstname);
				view.getTxtAddress().setText(dto.Maddress);
				view.getTxtEmail().setText(dto.Memail);
				view.getTxtPhoneNo().setText(dto.Mphone);
				}
			//}
		});
		
		


		//Save Button
		view.getBtnEdit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				String username = view.getTxtuname().getText().trim();
				String password = view.getTxtpassword().getText().trim();
				String cpassword = view.getTxtpassword().getText().trim();
				String lastname = view.getTxtLname().getText().trim();
				String firstname = view.getTxtfname().getText().trim();
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
					
					
					dto.ManagerEdit(bean,selectedRes,username);
					
					int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Edit Other Manager?");  
					 if(a==JOptionPane.YES_OPTION){ 
						 new EditManagerController();
						 view.dispose();
						 
					 } else if(a==JOptionPane.NO_OPTION){
						 view.dispose();
						 new AdminDashboardController();
					 }
				}
			}
		});
		
		//-------------File
				view.getDisconnectMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						view.dispose();
						new AdminDashboardController();
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
						view.getCreateManagerItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new AddManagerController();
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
	
//	----------------------------------------------------New Constrtuctor
	public EditManagerController(String resname,String username) {
		view = new EditManager();
		
		
		view.setVisible(true);
		dto = new DTO();
		view.getDeliveryManMenu().setVisible(false);
		view.getRestaurantComboBox().addItem(resname);
		
		view.getManagerComboBox().addItem(username);
		
		selectedRes= view.getRestaurantComboBox().getSelectedItem().toString();
			
		dto.ReadAllManger(selectedRes);
		//System.out.println(username);
		view.getDeliveryManMenu().setVisible(false);
		view.getCreateManagerItem().setVisible(false);
		view.getDeleteManagerItem().setVisible(false);
		view.getCreateRestaurantMItem().setVisible(false);
		view.getDeleteRestaurantMItem().setVisible(false);
		view.getManagerMenu().setEnabled(false);
		
		view.getManagerComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				view.getBtnEdit().setEnabled(true);	
				view.getTxtpassword().setEditable(true);
				view.getTxtcpassword().setEditable(true);
				view.getTxtLname().setEditable(true);
				view.getTxtfname().setEditable(true);
				view.getTxtAddress().setEditable(true);
				view.getTxtEmail().setEditable(true);
				view.getTxtPhoneNo().setEditable(true);
				//view.setDeliveryManMenu(null).setFocusable(false);
				
				
				selecetdManager= view.getManagerComboBox().getSelectedItem().toString();
				System.out.println(selecetdManager);
				
				dto.ReadDataManager(selecetdManager);
				
				view.getTxtuname().setText(dto.Musername);
				view.getTxtpassword().setText(dto.Mpassword);
				view.getTxtcpassword().setText(dto.MCpassword);
				view.getTxtLname().setText(dto.Mlastname);
				view.getTxtfname().setText(dto.Mfirstname);
				view.getTxtAddress().setText(dto.Maddress);
				view.getTxtEmail().setText(dto.Memail);
				view.getTxtPhoneNo().setText(dto.Mphone);
				}
			
		});
		
		


		//Save Button
		view.getBtnEdit().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				String username = view.getTxtuname().getText().trim();
				String password = view.getTxtpassword().getText().trim();
				String cpassword = view.getTxtpassword().getText().trim();
				String lastname = view.getTxtLname().getText().trim();
				String firstname = view.getTxtfname().getText().trim();
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
					
					
					dto.ManagerEdit(bean,selectedRes,username);
					view.dispose();
					new ManagerDashboardController(username);
					
				}
			}
		});
		
		//-------------File
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
				
				//-------------Restaurant CRUD
				
				
				view.getEditRestaurantMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						view.dispose();
						new EditRestaurantController(resname,username);
					}
				});	
				
				
				
				//------------- Manager CRUD
						
				
				//------------- Menu CRUD
						view.getCreateFoodMenuItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new AddMenuController(resname,username);
							}
						});
						
						view.getEditFoodMenuItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new EditMenuController(resname,username);
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
						
						

						// chef crud
						view.getCreateChefMenuItem().addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent arg0) {
								// TODO Auto-generated method stub
								view.setVisible(false);
								new AddChefController(resname,username);

							}

						});

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


				
				
	}
	
}
