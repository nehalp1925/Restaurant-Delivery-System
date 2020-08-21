package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import View.ClientOrderHistory;



public class ClientOrderHistroyController {
	DTO dto;
ClientOrderHistory view;
public String seleteddate,seletedRest,selectedTime;
public int count = 1,count1=0;
public int sel=0;
DefaultTableModel model;
	public ClientOrderHistroyController(int id) {
		dto = new DTO();
		view = new ClientOrderHistory();
		
		dto.ReadData(id);
		
		view.setVisible(true);
		view.getDateComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOderByDate(dto.username).toArray(new String[0])));
		
		view.getDateComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				seleteddate =view.getDateComboBox().getSelectedItem().toString();
				
				view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOderByDateAndRestName(dto.username,seleteddate).toArray(new String[0])));
				
				
				
			}
		});
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				seletedRest =view.getRestaurantComboBox().getSelectedItem().toString();
				view.getTimeComboBox().setModel(new DefaultComboBoxModel<String>(dto.GetOderByDateAndRestNameAndTime(dto.username,seleteddate,seletedRest).toArray(new String[0])));
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
			
			count=dto.GetItemNameOderByDate(seleteddate,seletedRest,selectedTime).size();
			
			
			for(int i=0;i<count;i++) {
				
				Object[] row= {dto.GetItemNameOderByDate(seleteddate,seletedRest,selectedTime).get(i),dto.GetItemPriceOderByDate(seleteddate,seletedRest,selectedTime).get(i),dto.GetItemQtyOderByDate(seleteddate,seletedRest,selectedTime).get(i),dto.GetItemTotalOderByDate(seleteddate,seletedRest,selectedTime).get(i)};
				model = (DefaultTableModel)view.getOrdertable().getModel();
				model.addRow(row);
		
			}
			
			
			dto.ReadOrderDetail(seleteddate,seletedRest,selectedTime);
			
			view.getTxtViewDeliveryDate().setText(seleteddate);
			view.getTxtViewHours().setText(dto.OrderTime);
			view.getTxtViewPostalCode().setText(dto.OrderDeliveryArea);
			view.getTxtViewRestaurantName().setText(dto.OrderRestName);
			view.getTxtGrandtotal().setText(dto.OrderGrandTotal);
			
		}
		
		sel=0;
		
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

	//Profile Account
	view.getProfileMItem().addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			view.dispose();
			new ClientPageController(id);
		}
	});
	
	//Delete Account
			view.getDeleteMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					view.dispose();
					new ClientDeleteAccountController(id);
				}
			});
			
			//Edit Account
			view.getEditMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					view.dispose();
					new ClientEditAccountController(id);
				}
			});
			
			//Food Order
			view.getOrderFoodMItem().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					view.dispose();
					new ClientOrderFoodController(id);
				}
			});



		
	}
	

}
