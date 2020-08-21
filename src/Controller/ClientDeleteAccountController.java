package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DBManager.DTO;
import View.ClientDeleteAccount;

public class ClientDeleteAccountController {
	ClientDeleteAccount view;
	DTO dto;

	public ClientDeleteAccountController(int id) {
		dto = new DTO();
		view = new ClientDeleteAccount();

		view.setVisible(true);
		dto.ReadData(id);
		view.getTxtUserName().setText(dto.username);
		/*
		 * view.getTxtConfrimPassword().setText(dto.password);
		 * view.getTxtPassword().setText(dto.password);
		 */
		view.getTxtLastName().setText(dto.lastname);
		view.getTxtFirstName().setText(dto.firstname);
		view.getTxtAddress().setText(dto.address);
		view.getTxtEmail().setText(dto.email);
		view.getTxtPhoneNo().setText(dto.phone);
		// File Disconnect
		view.getDisconnectMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new LoginController();
			}
		});

//Quit
		view.getCloseMItem().addActionListener(new ActionListener() {

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

//Food History
		view.getOrderHistoryMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				new ClientOrderHistroyController(id);
			}
		});

//Delete Button
		view.getBtnDelete().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.dispose();
				dto.ClientDelete(id);
				new LoginController();
				// System.out.println("delete b");
				// JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Password",
				// "Login Error",0);
			}
		});
	}

}
