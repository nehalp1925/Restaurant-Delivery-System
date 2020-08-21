package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import View.ViewOrder;

public class ManagerOrderHistory {
	DTO dto;
	ViewOrder view;
	public String selecteddate,selectedUser,selectedTime;
	public int count = 1,count1=0;
	public int sel=0;
	DefaultTableModel model;
	
	public ManagerOrderHistory(String restname) {
		dto = new DTO();
		view = new ViewOrder();
		
		view.getTxtRestaurantname().setText(restname);
		
		view.getDateComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOderByDateForManager(restname).toArray(new String[0])));
		
		view.getDateComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selecteddate =view.getDateComboBox().getSelectedItem().toString();
				
				view.getClientComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetClientByDateAndRestName(restname,selecteddate).toArray(new String[0])));
		
			}
		});
		
		view.getClientComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedUser =view.getClientComboBox().getSelectedItem().toString();
				view.getTimeComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOderTimeForManager(restname,selecteddate,selectedUser).toArray(new String[0])));
			}
				
		});
		
		view.getTimeComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				sel=1;
				selectedTime =view.getTimeComboBox().getSelectedItem().toString();
				
				if(sel==1) {
					
					model = (DefaultTableModel)view.getOrdertable().getModel();
					model.setRowCount(0);
			
			count=dto.GetItemNameForManager(restname,selecteddate,selectedUser,selectedTime).size();
			
			
			for(int i=0;i<count;i++) {
				
				Object[] row= {dto.GetItemNameForManager(restname,selecteddate,selectedUser,selectedTime).get(i),dto.GetItemPriceForManager(restname,selecteddate,selectedUser,selectedTime).get(i),dto.GetItemQtyForManager(restname,selecteddate,selectedUser,selectedTime).get(i),dto.GetItemTotalForManager(restname,selecteddate,selectedUser,selectedTime).get(i)};
				model = (DefaultTableModel)view.getOrdertable().getModel();
				model.addRow(row);
		
			}
			
			
			dto.ReadOrderDetailForManager(restname,selecteddate,selectedUser,selectedTime);
			
			view.getTxtDeliveryDate().setText(selecteddate);
			view.getTxtTime().setText(selectedTime);
			view.getTxtViewPostalCode().setText(dto.Mpostalcode);
			view.getTxtGrandtotal().setText(dto.Mgrandtotal);
			
		}
		
		sel=0;
		
		}
				
			
		});
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.dispose();
				new LoginController();
			}
		});

		view.getClosemItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
			}
		});
	}
		
}
