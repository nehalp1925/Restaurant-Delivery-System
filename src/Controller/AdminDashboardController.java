package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DBManager.DTO;
import View.AdminDashboard;

public class AdminDashboardController {

	AdminDashboard view;
	DTO dto;
	
	public AdminDashboardController() {
		
		view = new AdminDashboard();
		dto = new DTO();
		view.setVisible(true);
		
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
