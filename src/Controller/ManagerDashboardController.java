package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DBManager.DTO;

import View.ManagerDashboard;

public class ManagerDashboardController {

	DTO dto;
	ManagerDashboard view;

	public ManagerDashboardController(String username) {
		dto = new DTO();
		view = new ManagerDashboard();

		view.setVisible(true);

		dto.ReadDataManager(username);

		view.getRestaurantComboBox().addItem(dto.Mresname);
		view.getTxtuname().setText(dto.Musername);
		//w.getTxtpassword().setText(dto.Mpassword);
		//view.getTxtcpassword().setText(dto.MCpassword);
		view.getTxtLname().setText(dto.Mlastname);
		view.getTxtfname().setText(dto.Mfirstname);
		view.getTxtAddress().setText(dto.Maddress);
		view.getTxtEmail().setText(dto.Memail);
		view.getTxtPhoneNo().setText(dto.Mphone);

		
		// restaurant crud
		view.getEditRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new EditRestaurantController(dto.Mresname,username);

				view.setVisible(false);
			}

		});

		// chef crud
		view.getCreateChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new AddChefController(dto.Mresname,username);

			}

		});

		view.getEditChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new EditChefController(dto.Mresname,username);

			}

		});

		view.getDeleteChefMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new DeleteChefController(dto.Mresname,username);

			}

		});

		// manager crud
		view.getEditManagerItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
				new EditManagerController(dto.Mresname,username);

			}

		});
		// -------------------menu crud
		view.getCreateFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddMenuController(dto.Mresname,username);
			}
		});

		view.getEditFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditMenuController(dto.Mresname,username);
			}
		});

		view.getDeleteFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteMenuController(dto.Mresname,username);
			}
		});

		// -------------File
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				view.dispose();
				new LoginController();
			}
		});

		view.getCloseMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
			}
		});
		
		view.getHistoryMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new ManagerOrderHistory(dto.Mresname);
				view.dispose();
			}
		});


	}
	// }

}
