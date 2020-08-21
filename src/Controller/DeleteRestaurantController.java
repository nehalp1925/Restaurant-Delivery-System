package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.RestaurantBean;
import View.DeleteRestaurant;


public class DeleteRestaurantController {
	DTO dto;
	DeleteRestaurant view;
	public String selectedRes;
	
	public DeleteRestaurantController() {
		dto = new DTO();
		view = new DeleteRestaurant();
		view.setVisible(true);
		
		view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		
		view.getBtnSave().setEnabled(false);
		view.getTxtRestaurantName().setEditable(false);
		view.getTxtRestaurantAddress().setEditable(false);
		view.getTxtRestaurantPhoneNo().setEditable(false);
		
		view.getComBoxOpenH1().setEnabled(false);
		view.getComBoxOpenM1().setEnabled(false);
		view.getComBoxCloseH1().setEnabled(false);
		view.getComBoxCloseM1().setEnabled(false);
		
		view.getComBoxOpenH2().setEnabled(false);
		view.getComBoxOpenM2().setEnabled(false);
		view.getComBoxCloseH2().setEnabled(false);
		view.getComBoxCloseM2().setEnabled(false);
		
		view.getComBoxOpenH3().setEnabled(false);
		view.getComBoxOpenM3().setEnabled(false);
		view.getComBoxCloseH3().setEnabled(false);
		view.getComBoxCloseM3().setEnabled(false);
		
		view.getComBoxOpenH4().setEnabled(false);
		view.getComBoxOpenM4().setEnabled(false);
		view.getComBoxCloseH4().setEnabled(false);
		view.getComBoxCloseM4().setEnabled(false);
		
		view.getComBoxOpenH5().setEnabled(false);
		view.getComBoxOpenM5().setEnabled(false);
		view.getComBoxCloseH5().setEnabled(false);
		view.getComBoxCloseM5().setEnabled(false);
		
		view.getComBoxOpenH6().setEnabled(false);
		view.getComBoxOpenM6().setEnabled(false);
		view.getComBoxCloseH6().setEnabled(false);
		view.getComBoxCloseM6().setEnabled(false);
		
		view.getComBoxOpenH7().setEnabled(false);
		view.getComBoxOpenM7().setEnabled(false);
		view.getComBoxCloseH7().setEnabled(false);
		view.getComBoxCloseM7().setEnabled(false);
		view.getTxtAreaDeliveryArea().setEditable(false);

		
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				selectedRes= view.getRestaurantComboBox().getSelectedItem().toString();
				//System.out.println(selectedRes);
				dto.RestaurantData(selectedRes);
				
				view.getBtnSave().setEnabled(true);
				view.getTxtRestaurantName().setText(dto.RestaurantName);
				view.getTxtRestaurantAddress().setText(dto.RestaurantAddress);
				view.getTxtRestaurantPhoneNo().setText(dto.RestarantNo);
				
				view.getComBoxOpenH1().setSelectedItem(dto.Sunday_Open_hour);
				view.getComBoxOpenM1().setSelectedItem(dto.Sunday_Open_mintue);
				view.getComBoxCloseH1().setSelectedItem(dto.Sunday_Close_hour);
				view.getComBoxCloseM1().setSelectedItem(dto.Sunday_Close_mintue);
				
				view.getComBoxOpenH2().setSelectedItem(dto.Monday_Open_hour);
				view.getComBoxOpenM2().setSelectedItem(dto.Monday_Open_mintue);
				view.getComBoxCloseH2().setSelectedItem(dto.Monday_Close_hour);
				view.getComBoxCloseM2().setSelectedItem(dto.Monday_Close_mintue);
				
				view.getComBoxOpenH3().setSelectedItem(dto.Tuesday_Open_hour);
				view.getComBoxOpenM3().setSelectedItem(dto.Tuesday_Open_mintue);
				view.getComBoxCloseH3().setSelectedItem(dto.Tuesday_Close_hour);
				view.getComBoxCloseM3().setSelectedItem(dto.Tuesday_Close_mintue);
				
				view.getComBoxOpenH4().setSelectedItem(dto.Wednesday_Open_hour);
				view.getComBoxOpenM4().setSelectedItem(dto.Wednesday_Open_mintue);
				view.getComBoxCloseH4().setSelectedItem(dto.Wednesday_Close_hour);
				view.getComBoxCloseM4().setSelectedItem(dto.Wednesday_Close_mintue);
				
				view.getComBoxOpenH5().setSelectedItem(dto.Thursday_Open_hour);
				view.getComBoxOpenM5().setSelectedItem(dto.Thursday_Open_mintue);
				view.getComBoxCloseH5().setSelectedItem(dto.Thursday_Close_hour);
				view.getComBoxCloseM5().setSelectedItem(dto.Thursday_Close_mintue);
				
				view.getComBoxOpenH6().setSelectedItem(dto.Friday_Open_hour);
				view.getComBoxOpenM6().setSelectedItem(dto.Friday_Open_mintue);
				view.getComBoxCloseH6().setSelectedItem(dto.Friday_Close_hour);
				view.getComBoxCloseM6().setSelectedItem(dto.Friday_Close_mintue);
				
				view.getComBoxOpenH7().setSelectedItem(dto.Saturday_Open_hour);
				view.getComBoxOpenM7().setSelectedItem(dto.Saturday_Open_mintue);
				view.getComBoxCloseH7().setSelectedItem(dto.Saturday_Close_hour);
				view.getComBoxCloseM7().setSelectedItem(dto.Saturday_Close_mintue);
				
				view.getTxtAreaDeliveryArea().setText(dto.RestaurantDeliveryArea);
				}
			
		});
		
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					 dto.DeleteRestaurant(selectedRes);	 
					 
					 int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Delete Other Restaurant?");  
					 if(a==JOptionPane.YES_OPTION){ 
						 new DeleteRestaurantController();
						 view.dispose();
						 
					 } else if(a==JOptionPane.NO_OPTION){
						 view.dispose();
						 new AdminDashboardController();
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
