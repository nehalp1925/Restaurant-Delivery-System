package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import DBManager.DTO;
import Model.OrderBean;
import View.ClientOrderFood;

public class ClientOrderFoodController {
	DTO dto;
	ClientOrderFood view;
	String str ="";
	public int count = 1;
	DefaultTableModel model;
	
	public ClientOrderFoodController(int id) {
		
		 dto = new DTO();
		view = new ClientOrderFood();
		
		
		dto.ReadData(id);
		
		view.setVisible(true);
		view.getPostalCodeComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadDistinctPostalCode()));
		view.getTxtOrderDeliveryDate().setText(new java.sql.Date(System.currentTimeMillis()).toString());
		view.getTxtHour().setText(java.time.LocalTime.now().toString());
		
	//	String postalcode = view.getTxtOrderFoodPostalCode().toString().trim();
		
		
		
		
		view.getPostalCodeComboBox().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String pc = view.getPostalCodeComboBox().getSelectedItem().toString();
				
				if(view.getPostalCodeComboBox().getSelectedIndex() > 0) {
					view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.selectRestaurantByPostalCode(pc)));
				
				}
			}
			
		});
		
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String resname = view.getRestaurantComboBox().getSelectedItem().toString();
				
					view.getMenuComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadMenuItemName(resname).toArray(new String[0])));
				
				
			}
			
		});
		
		view.getMenuComboBox().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String menuitem = view.getMenuComboBox().getSelectedItem().toString();
				
					dto.ReadItemDetail(menuitem);
					view.getTxtQuantity().setEditable(true);
					view.getBtnAddItem().setEnabled(true);
					view.getTxtMeal().setText(dto.MenuItemname);
					view.getTxtPrice().setText(dto.MenuItemprice);
					
					
			
			}
			
		});
		
		
		
		view.getBtnAddItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(view.getTxtQuantity().getText().equals("")) {
					System.out.println("error");
				}else {
				// TODO Auto-generated method stub
				
				view.getBtnDeleteItem().setEnabled(true);
				view.getBtnOrder().setEnabled(true);
				count++;
				double price = Double.parseDouble(view.getTxtPrice().getText()); 
				double qnty = Double.parseDouble(view.getTxtQuantity().getText());
				double total = price*qnty;
				String strtotal=String.valueOf(total);

				Object[] row= {view.getTxtMeal().getText(),view.getTxtPrice().getText(),view.getTxtQuantity().getText(),strtotal};
				
				 model = (DefaultTableModel)view.getOrderTable().getModel();
				
				model.addRow(row);
				
				
				try {
					double ttl = Double.parseDouble((model.getValueAt(model.getRowCount()-1,3)).toString());
					double ttl1 = Double.parseDouble(view.getTxtTotal().getText().isEmpty()?"0":view.getTxtTotal().getText());
				//	System.out.println(ttl1);
					view.getTxtTotal().setText((ttl1 + ttl)+"");
			
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				
			
				
				view.getTxtMeal().setText("");
				view.getTxtPrice().setText("");
				view.getTxtQuantity().setText("");
				}
			}
		});
		
		view.getOrderTable().addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				
				int row = view.getOrderTable().getSelectedRow();
				view.getTxtMeal().setText(model.getValueAt(row, 0).toString());
				view.getTxtPrice().setText(model.getValueAt(row, 1).toString());
				view.getTxtQuantity().setText(model.getValueAt(row, 2).toString());
				
			}
		});
		
		view.getBtnDeleteItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int i = view.getOrderTable().getSelectedRow();
				if(i > -1) {
				//	model.removeRow(i);
					System.out.println(i);
				double price = Double.parseDouble(view.getTxtPrice().getText()); 
				double qnty = Double.parseDouble(view.getTxtQuantity().getText());
				double total = price*qnty;
				String strtotal=String.valueOf(total);

			
				try {
					double ttl = Double.parseDouble((model.getValueAt(model.getRowCount()-1,3)).toString());
					double ttl1 = Double.parseDouble(view.getTxtTotal().getText().isEmpty()?"0":view.getTxtTotal().getText());
					System.out.println(ttl1);
					view.getTxtTotal().setText((ttl1 - total)+"");
			
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				model.removeRow(i);
				view.getTxtMeal().setText("");
				view.getTxtPrice().setText("");
				view.getTxtQuantity().setText("");
				}else {
					//JOptionPane.showMessageDialog(CenterPanel, "Select row you want to delete!!!");
				}
			}
		});
		
		view.getBtnOrder().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double ttl1 = Double.parseDouble(view.getTxtTotal().getText().isEmpty()?"0":view.getTxtTotal().getText());
				System.out.println(ttl1);
				// TODO Auto-generated method stub
				if(ttl1==0.0) {
					//System.out.println("error");
				}else {
					//System.out.println("good");
					
					String date = view.getTxtOrderDeliveryDate().getText().toString().trim();
					String time = view.getTxtHour().getText().toString().trim();
					String restname=view.getRestaurantComboBox().getSelectedItem().toString().trim();
					String postalcode=view.getPostalCodeComboBox().getSelectedItem().toString().trim();
					String grandtotal=view.getTxtTotal().getText().toString().trim();
					
					int rows=view.getOrderTable().getRowCount();
					String Final="";
					String Itemname="",ItemPrice="",ItemQty="",ItemTotal="";
					
					for(int i=0;i<rows;i++) {
						Itemname = (String)view.getOrderTable().getValueAt(i, 0);
						ItemPrice = (String)view.getOrderTable().getValueAt(i, 1);
						 ItemQty = (String)view.getOrderTable().getValueAt(i, 2);
						 ItemTotal = (String)view.getOrderTable().getValueAt(i, 3);
						
						OrderBean order = new OrderBean();
						
						order.setClientName(dto.username);
						order.setRestaurantName(restname);
						order.setDeliveryArea(postalcode);
						order.setDate(date);
						order.setTime(time);
						order.setItemname(Itemname);
						order.setItemprice(ItemPrice);
						order.setItemqty(ItemQty);
						order.setItemtotal(ItemTotal);
						order.setGrandtotal(grandtotal);
						
							
						dto.OrderInsert(order);
					}
					System.out.println(Final);
				}
			}
		});
		
		
		
	
		// File Disconnect
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new LoginController();

			}
		});

		// Quit
		view.getClosemItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				
			}
		});

		// Profile Account
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

		//Food History
		view.getOrderHistoryMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new ClientOrderHistroyController(id);
			}
		});

	}
	
	  

}
