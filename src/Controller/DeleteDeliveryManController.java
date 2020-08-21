package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.DeliveryGuyBean;
import View.DeleteDeliveryGuy;
import View.EditDeliveryGuy;

public class DeleteDeliveryManController {
	DTO dto;
	DeleteDeliveryGuy view;
	public String selectedGuy;
	
	public DeleteDeliveryManController() {
		dto = new DTO();
		view = new DeleteDeliveryGuy();
		view.setVisible(true);
		
		view.getDeliveryManComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadDeliveryMan().toArray(new String[0])));
		
		view.getDeliveryManComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedGuy= view.getDeliveryManComboBox().getSelectedItem().toString();
				dto.ReadDataDeliveryGuy(selectedGuy);
				
					view.getBtnDelete().setEnabled(true);
					
					
					view.getTxtuname().setText(dto.Gusername);
					view.getPasswordField().setText(dto.Gpassword);
					view.getCpasswordField().setText(dto.GCpassword);
					view.getTxtPhoneNo().setText(dto.Gphone);
					view.getTxtAreaDeliveryArea().setText(dto.GDeliveryarea);

					
	
			
			}
		});
	
		view.getbtnDelete().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dto.DeliveryGuyDelete(dto.Gusername);
				view.dispose();
				
				
				int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Delete Other Delivery Guy");  
				 if(a==JOptionPane.YES_OPTION){ 
					 new DeleteDeliveryManController();
					 view.dispose();
					 
				 } else if(a==JOptionPane.NO_OPTION){
					 view.dispose();
					 new AdminDashboardController();
				 }
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
