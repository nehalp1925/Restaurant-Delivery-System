package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DBManager.DTO;
import Model.ClientBean;
import View.ClientPage;


public class ClientPageController {
	
	DTO dto;
	ClientPage cview;
	//int i;

	public ClientPageController(int id) {
		dto = new DTO();
		cview = new ClientPage();
		
		
		cview.setVisible(true);
		

		
		dto.ReadData(id);
	
		
		// SET Values
		
		cview.getTxtUserName().setText(dto.username);
		cview.getTxtLastName().setText(dto.lastname);
		cview.getTxtFirstName().setText(dto.firstname);
		cview.getTxtAddress().setText(dto.address);
		cview.getTxtEmail().setText(dto.email);
		cview.getTxtPhoneNo().setText(dto.phone);
		
		
		
		//File Disconnect
				cview.getDisconnectMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cview.dispose();
						new LoginController();
					}
				});
				
		//Quit
				cview.getCloseMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cview.dispose();
						
					}
				});
		
		//Edit Account
				cview.getEditMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cview.dispose();
						new ClientEditAccountController(id);
					}
				});
		
		
		//Delete Account
		cview.getDeleteMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cview.dispose();
				new ClientDeleteAccountController(id);
			}
		});
		
		//Food Order
				cview.getOrderFoodMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cview.dispose();
						new ClientOrderFoodController(id);
					}
				});
				
		//Food History
				cview.getOrderHistoryMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						cview.dispose();
						new ClientOrderHistroyController(id);
					}
				});
	}
}
