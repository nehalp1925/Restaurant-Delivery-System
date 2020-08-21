package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import View.AcceptingDelivery;

public class DeliveryGuyAcceptOrderController {
	
	DTO dto;
	AcceptingDelivery view;
	public String date,pc,selectedTime,selectedUser;
	public int count = 1,count1=0;
	public int sel=0;
	DefaultTableModel model;
	
	public DeliveryGuyAcceptOrderController(String username) {
		
		dto = new DTO();
		view = new AcceptingDelivery();
	
		 date=new java.sql.Date(System.currentTimeMillis()).toString();
		 view.getPostalCodeComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadDistinctPostalCodeOfGuy(username)));
		
		 view.getPostalCodeComboBox().addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 pc = view.getPostalCodeComboBox().getSelectedItem().toString();
					
					if(view.getPostalCodeComboBox().getSelectedIndex() > 0) {
						view.getClientComboBox().setModel(new DefaultComboBoxModel<String>(dto.selectClientByPostalCode(pc,date)));
						System.out.println(dto.selectClientByPostalCode(pc,date));
					
					}
				}
				
			});
		 
		 view.getClientComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedUser = view.getClientComboBox().getSelectedItem().toString();
				view.getTimeComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOrderTimeByDateAndPCAndCname(pc,date,selectedUser).toArray(new String[0])));
				//view.getLblOrderAns().setText(selectedUser);
				
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
				
				count=dto.GetItemNameForGuy(date,selectedUser,selectedTime).size();
				
				
				for(int i=0;i<count;i++) {
					
					Object[] row= {dto.GetItemNameForGuy(date,selectedUser,selectedTime).get(i),dto.GetItemPriceForGuy(date,selectedUser,selectedTime).get(i),dto.GetItemQtyForGuy(date,selectedUser,selectedTime).get(i),dto.GetItemTotalOderForGuy(date,selectedUser,selectedTime).get(i)};
					model = (DefaultTableModel)view.getOrdertable().getModel();
					model.addRow(row);
			
				}
				
				
				dto.ReadOrderDetailForGuy(date,selectedUser,selectedTime);
				dto.ReadClientAddressForGuy(selectedUser);
				dto.ReadRestaurantAddressForGuy(dto.Grestname);
				view.getLblRestaurantAns().setText(dto.Grestname);
				view.getLblDeliveryPostalCodeAns().setText(dto.Gpostalcode);
				view.getLblDeliveryAddressAns().setText(dto.Gadsress);
			
				
			}
			
			sel=0;
			
			}
					
				
			});
		 
		 view.getBtnAcceptDelivery().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int row=view.getOrdertable().getRowCount();
				
				//	System.out.println(count);
						for(int i=0;i<row;i++) {
							String str= view.getOrdertable().getValueAt(i, 0).toString();
							dto.UpdateDeliveryGuyName(username,str,selectedUser,date, dto.Grestname, selectedTime);
							//System.out.println(str);
						}
				
			}
		});
		 
		 
	}
	
}
