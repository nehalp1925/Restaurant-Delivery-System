package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import View.DeleteManager;

public class DeleteManagerController {
	DeleteManager view;
	DTO dto;
	public String selectedRes, selecetdManager;

	public DeleteManagerController() {
		dto = new DTO();
		view = new DeleteManager();

		view.setVisible(true);
		view.getRestaurantComboBox()
				.setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));

		view.getRestaurantComboBox().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				selectedRes = view.getRestaurantComboBox().getSelectedItem().toString();

				dto.ReadAllManger(selectedRes);
				// System.out.println(selectedRes);
				view.getManagerComboBox().setModel(
						new DefaultComboBoxModel<String>(dto.ReadAllManger(selectedRes).toArray(new String[0])));

			}

		});

		view.getManagerComboBox().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.getBtnDelete().setEnabled(true);

				selecetdManager = view.getManagerComboBox().getSelectedItem().toString();

				dto.ReadDataManager(selecetdManager);

				view.getTxtuname().setText(dto.Musername);
				view.getTxtLname().setText(dto.Mlastname);
				view.getTxtfname().setText(dto.Mfirstname);
				view.getTxtAddress().setText(dto.Maddress);
				view.getTxtEmail().setText(dto.Memail);
				view.getTxtPhoneNo().setText(dto.Mphone);
			}
			// }
		});

//Delete Button
		view.getBtnDelete().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// view.dispose();

				int a = JOptionPane.showConfirmDialog(view.getPanel(), "Are you sure do you want to delete?");
				if (a == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(view.getPanel(), "Manager Delete Successfully");

					view.dispose();
					dto.ManagerDelete(selectedRes, dto.Musername);

					new AdminDashboardController();
				} else if (a == JOptionPane.NO_OPTION) {
					view.dispose();
					// new DeleteManagerController();
				}
			}
		});

		// -------------File
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
		
// -------------Restaurant CRUD

		view.getCreateRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddRestaurantController();
			}
		});

		view.getEditRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditRestaurantController();
			}
		});

		view.getDeleteRestaurantMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteRestaurantController();
			}
		});

		// ------------- Manager CRUD
		view.getCreateManagerItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddManagerController();
			}
		});

		view.getEditManagerItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditManagerController();
			}
		});

		// ------------- Menu CRUD
		view.getCreateFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddMenuController();
			}
		});

		view.getEditFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditMenuController();
			}
		});

		view.getDeleteFoodMenuItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteMenuController();
			}
		});
		// ------------- Delivery Man CRUD
		view.getCreateDeliveryManMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new AddDeliveryManController();
			}
		});

		view.getEditDeliveryManMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new EditDeliveryManController();
			}
		});

		view.getDeleteDeliveryManMItem().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				view.dispose();
				new DeleteDeliveryManController();
			}
		});
	}

}
