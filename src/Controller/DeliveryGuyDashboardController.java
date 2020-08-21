package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.DeliveryGuyBean;
import View.EditDeliveryGuy;
import View.ViewDeliveryGuy;

public class DeliveryGuyDashboardController {

	DTO dto;
	ViewDeliveryGuy view;
	public String selectedGuy;
	
	public DeliveryGuyDashboardController(String username) {
		dto = new DTO();
		view = new ViewDeliveryGuy();
		view.setVisible(true);
		
		
			view.getTxtuname().setText(username);
			dto.ReadDataDeliveryGuy(username);
			view.getTxtPhoneNo().setText(dto.Gphone);
			view.getTxtAreaDeliveryArea().setText(dto.GDeliveryarea);
		
		
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
				
				view.getAcceptDeliveryMItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						new DeliveryGuyAcceptOrderController(username);
					}
				});
				
	}
}
