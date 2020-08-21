package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import View.DeleteChef;

public class DeleteChefController {
	DeleteChef view;
	DTO dto;
	public String selectedChef;

	public DeleteChefController(String resname,String username) {
		dto = new DTO();
		view = new DeleteChef();
		view.getOrderMenu().setVisible(false);
		view.setVisible(true);
		view.getTxtRestName().setText(resname);
		view.getChefComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadAllChef(resname).toArray(new String[0])));
		
		view.getChefComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				selectedChef=view.getChefComboBox().getSelectedItem().toString();
				//dto.ReadDataChef(resname,selectedChef);
				dto.ReadDataChef(resname);
				view.getTxtRestName().setText(resname);
				view.getTxtUserName().setText(dto.Cusername);
				view.getTxtLastName().setText(dto.Clastname);
				view.getTxtFirstName().setText(dto.Cfirstname);
				view.getTxtAddress().setText(dto.Caddress);
				view.getTxtEmail().setText(dto.Cemail);
				view.getTxtPhoneNo().setText(dto.Cphone);
				
				view.getBtnDelete().setEnabled(true);
			}
		});
		



//Delete Button
		view.getBtnDelete().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				dto.ChefDelete(dto.Cusername);
				//JOptionPane.showMessageDialog(view.getPanel(), "Account Delee Sucessfully");
				
				
				int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Delete Other Chef");  
				 if(a==JOptionPane.YES_OPTION){ 
					 new DeleteChefController(resname,username);
					 view.dispose();
					 
				 } else if(a==JOptionPane.NO_OPTION){
					 view.dispose();
					 new ManagerDashboardController(username);
				 }

			}
		});
		
		

		// restaurant crud
		view.getEditRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new EditRestaurantController(resname,username);

				view.setVisible(false);
			}

		});
//-------------------  chef crud
		
		view.getCreateChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new AddChefController(resname,username);

			}

		});

		view.getEditChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new EditChefController(resname,username);

			}

		});

		
		// -------------------menu crud
		

		view.getEditFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditMenuController(resname,username);
			}
		});
		
		view.getCreateFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddMenuController(resname,username);
			}
		});
		
		view.getDeleteFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteMenuController(resname,username);
			}
		});

		
		

		//------------- Manager CRUD
				
				view.getEditManagerItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						view.dispose();
						new EditManagerController(resname,username);
					}
				});	
		
		// -------------File
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.dispose();
				new ManagerDashboardController(username);
			}
		});

		view.getCloseMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
			}
		});	

	}

}
