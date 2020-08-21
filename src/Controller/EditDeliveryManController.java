package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.DeliveryGuyBean;
import View.EditDeliveryGuy;

public class EditDeliveryManController {

	DTO dto;
	EditDeliveryGuy view;
	public String selectedGuy;
	
	public EditDeliveryManController() {
		dto = new DTO();
		view = new EditDeliveryGuy();
		view.setVisible(true);
		
		view.getDeliveryManComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadDeliveryMan().toArray(new String[0])));
		
		view.getDeliveryManComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedGuy= view.getDeliveryManComboBox().getSelectedItem().toString();
				dto.ReadDataDeliveryGuy(selectedGuy);
				
					
					view.getBtnEdit().setEnabled(true);
					view.getBtnAddDeliveryArea().setEnabled(true);
					view.getBtnDeleteDeliveryArea().setEnabled(true);
					view.getPasswordField().setEditable(true);
					view.getCpasswordField().setEditable(true);
					view.getTxtPhoneNo().setEditable(true);
					view.getTxtDArea().setEditable(true);
					view.getTxtAreaDeliveryArea().setEditable(true);
					
					view.getTxtuname().setText(dto.Gusername);
					view.getPasswordField().setText(dto.Gpassword);
					view.getCpasswordField().setText(dto.GCpassword);
					view.getTxtPhoneNo().setText(dto.Gphone);
					view.getTxtAreaDeliveryArea().setText(dto.GDeliveryarea);

					
	
				
			}
		});
	
		view.getBtnEdit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = view.getTxtuname().getText().trim();
				String password = String.valueOf(view.getPasswordField().getPassword());
				String Cpassword = String.valueOf(view.getCpasswordField().getPassword());
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
			}else if(password.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Password", "Registration Error",0);
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
					
					
					
					dto.DeliveryGuyEdit(bean,selectedGuy);
					
					int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Edit Other Delivery Guy?");  
					 if(a==JOptionPane.YES_OPTION){ 
						 new EditDeliveryManController();
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
				String DeliveryArea = view.getTxtDArea().getText();
				if(!DeliveryArea.trim().matches("^[A-Z0-9A-Z ]+$")) {
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
				view.getCreateDeliveryManMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						view.dispose();
						new AddDeliveryManController();
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
