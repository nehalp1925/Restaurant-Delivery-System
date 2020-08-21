package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DBManager.DTO;
import View.ChefInfo;


public class ChefDashboardController {
	DTO dto;
	ChefInfo view;
	
	public ChefDashboardController(String username) {
		dto = new DTO();
		view = new ChefInfo();
		
		
		view.setVisible(true);
		
		dto.ReadDataChefByUName(username);
	
		
		// SET Values
		
		view.getTxtUserName().setText(dto.Cusername);
		view.getTxtRestaurantName().setText(dto.CRestaurant_Name);
		view.getTxtLastName().setText(dto.Clastname);
		view.getTxtFirstName().setText(dto.Cfirstname);
		view.getTxtAddress().setText(dto.Caddress);
		view.getTxtEmail().setText(dto.Cemail);
		view.getTxtPhoneNo().setText(dto.Cphone);
		
		
		
		//File Disconnect
				view.getDisconnectMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						view.dispose();
						new LoginController();
					}
				});
				
		//Quit
				view.getCloseMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						view.dispose();
						
					}
				});
				
		//Accept order
				
				view.getAcceptOrderMenuItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						view.dispose();
						new ChefAcceptingOrderController(dto.CRestaurant_Name,username);
						
					}
				});
				
				view.getPreparedOrderMenuItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						view.dispose();
						new MarkAsReadyController(dto.CRestaurant_Name,username);
					}
				});
		
	}
	
	
}
