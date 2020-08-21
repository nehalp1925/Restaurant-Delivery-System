package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import View.AcceptOrder;

public class ChefAcceptingOrderController {
	
	DTO dto;
	AcceptOrder view;
	public String selectedUser,date,selectedTime;
	public int count = 1,count1=0;
	public int sel=0;
	DefaultTableModel model;
	
	public ChefAcceptingOrderController(String restaurantname,String username) {
		dto = new DTO();
		view = new AcceptOrder();
		
		 view.getTxtDeliveryDate().setText(new java.sql.Date(System.currentTimeMillis()).toString());
		 date=view.getTxtDeliveryDate().getText();
		 
		 view.getOrderComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetClientByDateAndRestname(date,restaurantname).toArray(new String[0])));
		 
		 System.out.println(dto.GetClientByDateAndRestname(date,restaurantname)	);
		 view.getOrderComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				selectedUser = view.getOrderComboBox().getSelectedItem().toString();
				view.getTimeComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOrderTimeByDateAndRestname(date,restaurantname,selectedUser).toArray(new String[0])));
						
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
				
				count=dto.GetItemNameForChef(date,restaurantname,selectedUser,selectedTime).size();
				
				
				for(int i=0;i<count;i++) {
					
					Object[] row= {dto.GetItemNameForChef(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemPriceForChef(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemQtyForChef(date,restaurantname,selectedUser,selectedTime).get(i),dto.GetItemTotalOderForChef(date,restaurantname,selectedUser,selectedTime).get(i)};
					model = (DefaultTableModel)view.getOrdertable().getModel();
					model.addRow(row);
			
				}
				
				
				dto.ReadOrderDetail(date,restaurantname,selectedTime);
				
				view.getTxtDeliveryDate().setText(date);
				view.getTxtHour().setText(dto.OrderTime);
				view.getTxtPostalCode().setText(dto.OrderDeliveryArea);
				//view.getTxtViewRestaurantName().setText(dto.OrderRestName);
				view.getTxtGrandTotal().setText(dto.OrderGrandTotal);
				
			}
			
			sel=0;
			
			}
					
				
			});
		 
		 view.getBtnAcceptOrder().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int row=view.getOrdertable().getRowCount();
				
				//	System.out.println(count);
						for(int i=0;i<row;i++) {
							String str= view.getOrdertable().getValueAt(i, 0).toString();
							dto.UpdateOrderStatus(str,selectedUser,date,restaurantname,selectedTime);
							//System.out.println(str);
						}
			
			}
		});
		 
			
			//File Disconnect
					view.getDisconnectMItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							view.dispose();
							new LoginController();
						}
					});
					
			//Quit
					view.getClosemItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							view.dispose();
							
						}
					});
					
			//Accept order
					
					view.getOrderReadyMItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							view.dispose();
							new MarkAsReadyController(dto.CRestaurant_Name,username);
							
						}
					});
					
					view.getAcceptOrderMItem().addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							view.dispose();
							
							new ChefAcceptingOrderController(dto.CRestaurant_Name,username);
						}
					});
		 
		 
		 
		 
	}

}
