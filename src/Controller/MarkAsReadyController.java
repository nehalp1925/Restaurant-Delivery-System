package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import View.AcceptOrder;
import View.MarkOrderAsReady;

public class MarkAsReadyController {
	DTO dto;
	MarkOrderAsReady view;
	public String selectedUser,date,selectedTime;
	public int count = 1,count1=0;
	public int sel=0;
	DefaultTableModel model;
	
	public MarkAsReadyController(String restaurantname,String username) {
		dto = new DTO();
		view = new MarkOrderAsReady();
		
		 view.getTxtDate().setText(new java.sql.Date(System.currentTimeMillis()).toString());
		 date=view.getTxtDate().getText();
		 
		 view.getOrderComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetClientForMarkAsReady(date,restaurantname).toArray(new String[0])));
		 
		 view.getOrderComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedUser = view.getOrderComboBox().getSelectedItem().toString();
				view.getTimeComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOrderTimeForMarkAsReady(date,restaurantname,selectedUser).toArray(new String[0])));
						
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
				
				count=dto.GetItemNameForMarkAsReady(date,restaurantname,selectedUser,selectedTime).size();
				
				
				for(int i=0;i<count;i++) {
					
					Object[] row= {dto.GetItemNameForMarkAsReady(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemPriceForMarkAsReady(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemQtyForMarkAsReady(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemNameForMarkAsReady(date,restaurantname,selectedUser,selectedTime).get(i)};
					model = (DefaultTableModel)view.getOrdertable().getModel();
					model.addRow(row);
			
				}
				
				
				dto.ReadOrderDetail(date,restaurantname,selectedTime);
				
				view.getTxtDate().setText(date);
				view.getTxtTimeHour().setText(dto.OrderTime);
				view.getTxtPostalCode().setText(dto.OrderDeliveryArea);
				//view.getTxtViewRestaurantName().setText(dto.OrderRestName);
				//view.getTxtGrandTotal().setText(dto.OrderGrandTotal);
				
			}
			
			sel=0;
			
			}
					
				
			});
		 
		 view.getBtnOrderReady().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=view.getOrdertable().getRowCount();
				
				//	System.out.println(count);
						for(int i=0;i<row;i++) {
							String str= view.getOrdertable().getValueAt(i, 0).toString();
							dto.UpdateOrderStatusAsReady(str,selectedUser,date,restaurantname,selectedTime);
							//System.out.println(str);
						}
			
			}
		});
		 
		 view.getDisconnectMItem().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					view.dispose();
					new ChefDashboardController(username);
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
