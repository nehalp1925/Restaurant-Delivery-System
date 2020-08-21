package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.MenuBean;
import View.AddMenu;

public class AddMenuController {
	
 DTO dto;
 AddMenu view;
 public String selectedRes;
 
	public AddMenuController() {

		 
		dto = new DTO();
		view = new AddMenu();
		view.getChefMenu().setVisible(false);

			
		view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedRes = view.getRestaurantComboBox().getSelectedItem().toString();
			//	System.out.println(selectedRes);
				if(!selectedRes.isEmpty()) {
					view.getMenucomboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadMenuItemName(selectedRes).toArray(new String[0])));
				}

				 
			}
		});
			
		
		view.getBtnAddItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String ItemName = view.getTxtAddItem().getText().toString();
				String ItemPrice = view.getTxtAddPrice().getText().toString();
				
				MenuBean bean = new MenuBean();
				
				bean.setItemName(ItemName);
				bean.setItemPrice(ItemPrice);
				bean.setRestaurantName(selectedRes);
				
				dto.MenuInsert(bean);
				
				 view.getTxtAddItem().setText("");
				 view.getTxtAddPrice().setText("");
				
				 view.getMenucomboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadMenuItemName(selectedRes).toArray(new String[0])));
			
				 int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Add Other Item?");  
				 if(a==JOptionPane.YES_OPTION){ 
					 new AddMenuController();
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
	
	
	//----------------------------------------------------- new constructor
	
	
	public AddMenuController(String resname,String username) {

		 
		dto = new DTO();
		view = new AddMenu();
		
		view.getDeliveryManMenu().setVisible(false);
		view.getCreateManagerItem().setVisible(false);
		view.getDeleteManagerItem().setVisible(false);
		view.getDeleteRestaurantMItem().setVisible(false);
		view.getCreateRestaurantMItem().setVisible(false);
		
		
         view.getRestaurantComboBox().addItem(resname);
		
		//view.getRestaurantComboBox().addItem(username);
		//view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedRes = view.getRestaurantComboBox().getSelectedItem().toString();
			//	System.out.println(selectedRes);
				if(!selectedRes.isEmpty()) {
					view.getMenucomboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadMenuItemName(selectedRes).toArray(new String[0])));
				}

				 
			}
		});
			
		
		view.getBtnAddItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String ItemName = view.getTxtAddItem().getText().toString();
				String ItemPrice = view.getTxtAddPrice().getText().toString();
				
				MenuBean bean = new MenuBean();
				
				bean.setItemName(ItemName);
				bean.setItemPrice(ItemPrice);
				bean.setRestaurantName(selectedRes);
				
				dto.MenuInsert(bean);
				
				 view.getTxtAddItem().setText("");
				 view.getTxtAddPrice().setText("");
				
				 view.getMenucomboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadMenuItemName(selectedRes).toArray(new String[0])));
				 
				 int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Add Other Item?");  
				 if(a==JOptionPane.YES_OPTION){ 
					 new AddMenuController(resname,username);
					 view.dispose();
					 
				 } else if(a==JOptionPane.NO_OPTION){
					 view.dispose();
					 new ManagerDashboardController(username);
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
