package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.DeliveryGuyBean;
import View.AddDeliveryGuy;

public class AddDeliveryManController {
	DTO dto;
	AddDeliveryGuy view;
	
	
	
	public AddDeliveryManController() {
		dto = new DTO();
		view = new AddDeliveryGuy();
		view.setVisible(true);
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
			public void actionPerformed(ActionEvent e) {
				String username = view.getTxtuname().getText().trim();
				String password=String.valueOf(view.getPasswordField().getPassword());
				String Cpassword=String.valueOf(view.getConfrimPasswordField().getPassword());
				
				String phoneno = view.getTxtPhoneNo().getText().trim();
				String DeliveryArea = view.getTxtAreaDeliveryArea().getText();
				
				
				
				
			//validation
			
			if(username.trim().isEmpty() && phoneno.trim().isEmpty() && DeliveryArea.trim().isEmpty() ) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName To Verify", "Registration Error",0);		
			}else if(password.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Password", "Registration Error",0);
			}else if(Cpassword.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Confirm Password", "Registration Error",0);
			}else if(password.length()<=5) {
				JOptionPane.showMessageDialog(view.getPanel(), "Password Should Be Greates Than Five Character", "Registration Error",0);
			}else if(!password.equals(Cpassword)) {
				JOptionPane.showMessageDialog(view.getPanel(), "Password And Confirm Password Must Be Same", "Registration Error",0);
			}else if(DeliveryArea.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Delivery Area", "Delivery Guy Error",0);
			}else if(DeliveryArea.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Delivery Area", "Delivery Guy Error",0);
			}else if(Cpassword.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Confirm Password", "Registration Error",0);
			}else if(password.length()<=5) {
				JOptionPane.showMessageDialog(view.getPanel(), "Password Should Be Greates Than Five Character", "Registration Error",0);
			}else if(!password.equals(Cpassword)) {
				JOptionPane.showMessageDialog(view.getPanel(), "Password And Confirm Password Must Be Same", "Registration Error",0);
			}else if(phoneno.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Phone Number", "Registration Error",0);
			}else if(!phoneno.matches("\\d{10}")) {
				JOptionPane.showMessageDialog(view.getPanel(), "Opps !! Please Enter Valid Number (MUST BE 10 DIGIT) ", "Registration Error",0);
			}else {
					DeliveryGuyBean bean = new DeliveryGuyBean();
					bean.setUsername(username);
					bean.setPassword(password);
					bean.setCpassword(Cpassword);
					bean.setPhonenumber(phoneno);
					bean.setDeliveryarea(DeliveryArea);
					
					
					//view.dispose();
					
					dto.DeliveryGuyInsert(bean);
					
					int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Add Other Delivery Guy?");  
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
		
		view.getBtnAddDeliveryArea().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String DeliveryArea = view.getTxtDArea().getText();
				if(!DeliveryArea.matches("^[A-Z0-9A-Z ]+$")) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Value like A2A", "Registration Error",0);
				}else {
				String Area=view.getTxtDArea().getText();
				String dArea=view.getTxtAreaDeliveryArea().getText();
				
				view.getTxtAreaDeliveryArea().setText(Area+" "+dArea);
				view.getTxtDArea().setText("");
				}
				}
		});
		
		view.getBtnDeleteDeliveryArea().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String DeleteArea = view.getTxtAreaDeliveryArea().getSelectedText();
				String dArea=view.getTxtAreaDeliveryArea().getText().trim();
				
				dArea = dArea.replace(DeleteArea, "");
				
				view.getTxtAreaDeliveryArea().setText(dArea);
				//System.out.println(DeleteArea);
			}
		});
		
		//------------- Delivery Man CRUD
				
				
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
	}

}
