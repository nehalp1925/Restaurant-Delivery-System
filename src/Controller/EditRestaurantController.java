package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import DBManager.DTO;
import Model.RestaurantBean;
import View.EditRestaurant;

public class EditRestaurantController {

	DTO dto;
	EditRestaurant view;
	public String selectedRes;
	
	
	public EditRestaurantController() {
		dto = new DTO();
		view = new EditRestaurant();
		view.setVisible(true);
		view.getChefMenu().setVisible(false);
		
	//	view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0]="jfv")));
		view.getRestaurantComboBox().setModel(new DefaultComboBoxModel<String>(dto.ReadRestaurantName().toArray(new String[0])));
		
		
		
		view.getBtnVerify().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				view.getBtnSave().setEnabled(false);
				String resname = view.getTxtRestaurantName().getText();

				if (resname.trim().isEmpty()) {
					// TODO Show error message Please insert username first
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Restaurant Name To Verify",
							"Registration Error", 0);
					return;
				}

				if (null == dto.getRestaurantname(resname.trim())) {
					// System.out.println("Username available");
					JOptionPane.showMessageDialog(view.getPanel(), "Good To Go !!", "Registration Error", 0);
					view.getTxtRestaurantName().setEnabled(false);
					view.getBtnSave().setEnabled(true);

				} else {
					JOptionPane.showMessageDialog(view.getPanel(), "OOPPS !!! Restaurant Name Already Exist!!",
							"Registration Error", 0);
				}

			}
		});

		
		
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				selectedRes= view.getRestaurantComboBox().getSelectedItem().toString();
				dto.RestaurantData(selectedRes);
		
				view.getBtnSave().setEnabled(true);
				view.getBtnAddDeliveryArea().setEnabled(true);
				view.getBtnDeleteDeliveryArea().setEnabled(true);
				view.getTxtRestaurantName().setEditable(true);
				view.getTxtRestaurantAddress().setEditable(true);
				view.getTxtRestaurantPhoneNo().setEditable(true);
				view.getComBoxOpenH1().setEnabled(true);
				view.getComBoxOpenM1().setEnabled(true);
				view.getComBoxCloseH1().setEnabled(true);
				view.getComBoxCloseM1().setEnabled(true);
				
				view.getComBoxOpenH2().setEnabled(true);
				view.getComBoxOpenM2().setEnabled(true);
				view.getComBoxCloseH2().setEnabled(true);
				view.getComBoxCloseM2().setEnabled(true);
				
				view.getComBoxOpenH3().setEnabled(true);
				view.getComBoxOpenM3().setEnabled(true);
				view.getComBoxCloseH3().setEnabled(true);
				view.getComBoxCloseM3().setEnabled(true);
				
				view.getComBoxOpenH4().setEnabled(true);
				view.getComBoxOpenM4().setEnabled(true);
				view.getComBoxCloseH4().setEnabled(true);
				view.getComBoxCloseM4().setEnabled(true);
				
				view.getComBoxOpenH5().setEnabled(true);
				view.getComBoxOpenM5().setEnabled(true);
				view.getComBoxCloseH5().setEnabled(true);
				view.getComBoxCloseM5().setEnabled(true);
				
				view.getComBoxOpenH6().setEnabled(true);
				view.getComBoxOpenM6().setEnabled(true);
				view.getComBoxCloseH6().setEnabled(true);
				view.getComBoxCloseM6().setEnabled(true);
				
				view.getComBoxOpenH7().setEnabled(true);
				view.getComBoxOpenM7().setEnabled(true);
				view.getComBoxCloseH7().setEnabled(true);
				view.getComBoxCloseM7().setEnabled(true);
				view.getTxtDeliveryArea().setEditable(true);
				view.getTxtDeliveryArea().setEnabled(true);
				view.getTxtAreaDeliveryArea().setEditable(true);
				view.getTxtAreaDeliveryArea().setEnabled(true);
				
				view.getTxtRestaurantName().setText(dto.RestaurantName);
				view.getTxtRestaurantAddress().setText(dto.RestaurantAddress);
				view.getTxtRestaurantPhoneNo().setText(dto.RestarantNo);
				
				view.getComBoxOpenH1().setSelectedItem(dto.Sunday_Open_hour);
				view.getComBoxOpenM1().setSelectedItem(dto.Sunday_Open_mintue);
				view.getComBoxCloseH1().setSelectedItem(dto.Sunday_Close_hour);
				view.getComBoxCloseM1().setSelectedItem(dto.Sunday_Close_mintue);
				
				view.getComBoxOpenH2().setSelectedItem(dto.Monday_Open_hour);
				view.getComBoxOpenM2().setSelectedItem(dto.Monday_Open_mintue);
				view.getComBoxCloseH2().setSelectedItem(dto.Monday_Close_hour);
				view.getComBoxCloseM2().setSelectedItem(dto.Monday_Close_mintue);
				
				view.getComBoxOpenH3().setSelectedItem(dto.Tuesday_Open_hour);
				view.getComBoxOpenM3().setSelectedItem(dto.Tuesday_Open_mintue);
				view.getComBoxCloseH3().setSelectedItem(dto.Tuesday_Close_hour);
				view.getComBoxCloseM3().setSelectedItem(dto.Tuesday_Close_mintue);
				
				view.getComBoxOpenH4().setSelectedItem(dto.Wednesday_Open_hour);
				view.getComBoxOpenM4().setSelectedItem(dto.Wednesday_Open_mintue);
				view.getComBoxCloseH4().setSelectedItem(dto.Wednesday_Close_hour);
				view.getComBoxCloseM4().setSelectedItem(dto.Wednesday_Close_mintue);
				
				view.getComBoxOpenH5().setSelectedItem(dto.Thursday_Open_hour);
				view.getComBoxOpenM5().setSelectedItem(dto.Thursday_Open_mintue);
				view.getComBoxCloseH5().setSelectedItem(dto.Thursday_Close_hour);
				view.getComBoxCloseM5().setSelectedItem(dto.Thursday_Close_mintue);
				
				view.getComBoxOpenH6().setSelectedItem(dto.Friday_Open_hour);
				view.getComBoxOpenM6().setSelectedItem(dto.Friday_Open_mintue);
				view.getComBoxCloseH6().setSelectedItem(dto.Friday_Close_hour);
				view.getComBoxCloseM6().setSelectedItem(dto.Friday_Close_mintue);
				
				view.getComBoxOpenH7().setSelectedItem(dto.Saturday_Open_hour);
				view.getComBoxOpenM7().setSelectedItem(dto.Saturday_Open_mintue);
				view.getComBoxCloseH7().setSelectedItem(dto.Saturday_Close_hour);
				view.getComBoxCloseM7().setSelectedItem(dto.Saturday_Close_mintue);
				
				view.getTxtAreaDeliveryArea().setText(dto.RestaurantDeliveryArea);
				}
		
		});
		
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String RestaurantName = view.getTxtRestaurantName().getText().trim();
				String RestaurantAddress = view.getTxtRestaurantAddress().getText().trim();
				String RestarantNo = view.getTxtRestaurantPhoneNo().getText().trim();
				String RestaurantDeliveryArea = view.getTxtAreaDeliveryArea().getText();
				
				String Sunday_Open_hour = view.getComBoxOpenH1().getSelectedItem().toString();
				String Sunday_Open_mintue = view.getComBoxOpenM1().getSelectedItem().toString();
				String Sunday_Close_hour = view.getComBoxCloseH1().getSelectedItem().toString();
				String Sunday_Close_mintue = view.getComBoxCloseM1().getSelectedItem().toString();
				
				String Monday_Open_hour = view.getComBoxOpenH2().getSelectedItem().toString();
				String Monday_Open_mintue = view.getComBoxOpenM2().getSelectedItem().toString();
				String Monday_Close_hour = view.getComBoxCloseH2().getSelectedItem().toString();
				String Monday_Close_mintue = view.getComBoxCloseM2().getSelectedItem().toString();
				
				String Tuesday_Open_hour = view.getComBoxOpenH3().getSelectedItem().toString();
				String Tuesday_Open_mintue = view.getComBoxOpenM3().getSelectedItem().toString();
				String Tuesday_Close_hour = view.getComBoxCloseH3().getSelectedItem().toString();
				String Tuesday_Close_mintue = view.getComBoxCloseM3().getSelectedItem().toString();
				
				String Wednesday_Open_hour = view.getComBoxOpenH4().getSelectedItem().toString();
				String Wednesday_Open_mintue = view.getComBoxOpenM4().getSelectedItem().toString();
				String Wednesday_Close_hour = view.getComBoxCloseH4().getSelectedItem().toString();
				String Wednesday_Close_mintue = view.getComBoxCloseM4().getSelectedItem().toString();
				
				String Thursday_Open_hour = view.getComBoxOpenH5().getSelectedItem().toString();
				String Thursday_Open_mintue = view.getComBoxOpenM5().getSelectedItem().toString();
				String Thursday_Close_hour = view.getComBoxCloseH5().getSelectedItem().toString();
				String Thursday_Close_mintue = view.getComBoxCloseM5().getSelectedItem().toString();
				
				String Friday_Open_hour = view.getComBoxOpenH6().getSelectedItem().toString();
				String Friday_Open_mintue = view.getComBoxOpenM6().getSelectedItem().toString();
				String Friday_Close_hour = view.getComBoxCloseH6().getSelectedItem().toString();
				String Friday_Close_mintue = view.getComBoxCloseM6().getSelectedItem().toString();
				
				String Saturday_Open_hour = view.getComBoxOpenH7().getSelectedItem().toString();
				String Saturday_Open_mintue = view.getComBoxOpenM7().getSelectedItem().toString();
				String Saturday_Close_hour = view.getComBoxCloseH7().getSelectedItem().toString();
				String Saturday_Close_mintue = view.getComBoxCloseM7().getSelectedItem().toString();
				
				if(RestaurantName.trim().isEmpty() && RestaurantAddress.trim().isEmpty() && RestarantNo.trim().isEmpty() && RestaurantDeliveryArea.trim().isEmpty()) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName To Verify", "Registration Error",0);
				
			}else if(RestaurantName.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Restaurant Name", "Registration Error",0);
			}else if(RestaurantAddress.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Restaurant Address", "Registration Error",0);
			}else if(RestarantNo.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Your Phone Number", "Registration Error",0);
			}else if(!RestarantNo.matches("\\d{10}")) {
				JOptionPane.showMessageDialog(view.getPanel(), "Opps !! Please Enter Valid Number (MUST BE 10 DIGIT) ", "Registration Error",0);
			}else if(RestaurantDeliveryArea.trim().isEmpty()) {
				JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Restaurant Delivery Area", "Registration Error",0);
			}else {
				RestaurantBean bean = new RestaurantBean();
				
				bean.setRestaurant_Name(RestaurantName);
				bean.setRestaurant_Address(RestaurantAddress);
				bean.setRestaurant_No(RestarantNo);
				bean.setSunday_Open_Hour(Sunday_Open_hour);
				bean.setSunday_Open_Minute(Sunday_Open_mintue);
				bean.setSunday_Close_Hour(Sunday_Close_hour);
				bean.setSunday_Close_Minute(Sunday_Close_mintue);
				bean.setMonday_Open_Hour(Monday_Open_hour);
				bean.setMonday_Open_Minute(Monday_Open_mintue);
				bean.setMonday_Close_Hour(Monday_Close_hour);
				bean.setMonday_Close_Minute(Monday_Close_mintue);
				bean.setTuesday_Open_Hour(Tuesday_Open_hour);
				bean.setTuesday_Open_Minute(Tuesday_Open_mintue);
				bean.setTuesday_Close_Hour(Tuesday_Close_hour);
				bean.setTuesday_Close_Minute(Tuesday_Close_mintue);
				bean.setWednesday_Open_Hour(Wednesday_Open_hour);
				bean.setWednesday_Open_Minute(Wednesday_Open_mintue);
				bean.setWednesday_Close_Hour(Wednesday_Close_hour);
				bean.setWednesday_Close_Minute(Wednesday_Close_mintue);
				bean.setThursday_Open_Hour(Thursday_Open_hour);
				bean.setThursday_Open_Minute(Thursday_Open_mintue);
				bean.setThursday_Close_Hour(Thursday_Close_hour);
				bean.setThursday_Close_Minute(Thursday_Close_mintue);
				bean.setFriday_Open_Hour(Friday_Open_hour);
				bean.setFriday_Open_Minute(Friday_Open_mintue);
				bean.setFriday_Close_Hour(Friday_Close_hour);
				bean.setFriday_Close_Minute(Friday_Close_mintue);
				bean.setSaturday_Open_Hour(Saturday_Open_hour);
				bean.setSaturday_Open_Minute(Saturday_Open_mintue);
				bean.setSaturday_Close_Hour(Saturday_Close_hour);
				bean.setSaturday_Close_Minute(Saturday_Close_mintue);
				bean.setDeliveryArea(RestaurantDeliveryArea);
				
				dto.RestaurantEdit(bean,selectedRes);
				//System.out.println(RestaurantName);
				dto.UpdateRestName(RestaurantName,dto.RestaurantName);
				
				int a=JOptionPane.showConfirmDialog(view.getPanel(),"Do You Want To Edit Other Restaurant");  
				 if(a==JOptionPane.YES_OPTION){ 
					 new EditRestaurantController();
					 view.dispose();
					 
				 } else if(a==JOptionPane.NO_OPTION){
					 view.dispose();
					 new AdminDashboardController();
				 }
				}
			}
		});
		
		
		
		view.getBtnAddDeliveryArea().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String DeliveryArea = view.getTxtDeliveryArea().getText();
				if(!DeliveryArea.matches("^[A-Z0-9A-Z ]+$")) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Value like A2A", "Registration Error",0);
				}else {
				String Area=view.getTxtDeliveryArea().getText();
				String dArea=view.getTxtAreaDeliveryArea().getText();
				
				view.getTxtAreaDeliveryArea().setText(Area+" "+dArea);
				view.getTxtDeliveryArea().setText("");
			}
			}
		});
		
		view.getBtnDeleteDeliveryArea().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String DeleteArea = view.getTxtAreaDeliveryArea().getSelectedText();
				String dArea=view.getTxtAreaDeliveryArea().getText().trim();
				
				dArea = dArea.replace(DeleteArea, "");
				
				view.getTxtAreaDeliveryArea().setText(dArea);
				//System.out.println(DeleteArea);
			}
		});
		
		
		//-------------File
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
		
		//-------------Restaurant CRUD
		
		view.getCreateRestaurantMItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				view.dispose();
				new AddRestaurantController();
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
		
		//------------- Manager CRUD
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
				
				view.getDeleteManagerItem().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						
						//view.dispose();
						new DeleteManagerController();
					
						view.dispose();
					}
				});	
				
		//------------- Menu CRUD
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
		//------------- Delivery Man CRUD
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
	
	///-------------------------------New Constructor----------------------------------------------------------------------------------
	
	public EditRestaurantController(String resname,String username) {
	//	System.out.println(rest);
		dto = new DTO();
		view = new EditRestaurant();
		view.setVisible(true);
		
		
		
		view.getRestaurantComboBox().addItem(resname);
		view.getRestaurantMenu().setEnabled(false);
		view.getDeliveryManMenu().setVisible(false);
		view.getCreateManagerItem().setVisible(false);
		view.getDeleteManagerItem().setVisible(false);
		
		//view.getDeliveryManMenu().setVisible(false);
		view.getRestaurantComboBox().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			//	System.out.println(dto.RestaurantName);
		
		dto.RestaurantData(resname);
		
		view.getBtnSave().setEnabled(true);
		view.getBtnAddDeliveryArea().setEnabled(true);
		view.getBtnDeleteDeliveryArea().setEnabled(true);
	//	view.getTxtRestaurantName().setEditable(true);
		view.getTxtRestaurantAddress().setEditable(true);
		view.getTxtRestaurantPhoneNo().setEditable(true);
		view.getComBoxOpenH1().setEnabled(true);
		view.getComBoxOpenM1().setEnabled(true);
		view.getComBoxCloseH1().setEnabled(true);
		view.getComBoxCloseM1().setEnabled(true);
		
		view.getComBoxOpenH2().setEnabled(true);
		view.getComBoxOpenM2().setEnabled(true);
		view.getComBoxCloseH2().setEnabled(true);
		view.getComBoxCloseM2().setEnabled(true);
		
		view.getComBoxOpenH3().setEnabled(true);
		view.getComBoxOpenM3().setEnabled(true);
		view.getComBoxCloseH3().setEnabled(true);
		view.getComBoxCloseM3().setEnabled(true);
		
		view.getComBoxOpenH4().setEnabled(true);
		view.getComBoxOpenM4().setEnabled(true);
		view.getComBoxCloseH4().setEnabled(true);
		view.getComBoxCloseM4().setEnabled(true);
		
		view.getComBoxOpenH5().setEnabled(true);
		view.getComBoxOpenM5().setEnabled(true);
		view.getComBoxCloseH5().setEnabled(true);
		view.getComBoxCloseM5().setEnabled(true);
		
		view.getComBoxOpenH6().setEnabled(true);
		view.getComBoxOpenM6().setEnabled(true);
		view.getComBoxCloseH6().setEnabled(true);
		view.getComBoxCloseM6().setEnabled(true);
		
		view.getComBoxOpenH7().setEnabled(true);
		view.getComBoxOpenM7().setEnabled(true);
		view.getComBoxCloseH7().setEnabled(true);
		view.getComBoxCloseM7().setEnabled(true);
		view.getTxtDeliveryArea().setEditable(true);
		view.getTxtDeliveryArea().setEnabled(true);
		view.getTxtAreaDeliveryArea().setEditable(true);
		view.getTxtAreaDeliveryArea().setEnabled(true);
		
		view.getTxtRestaurantName().setText(dto.RestaurantName);
		view.getTxtRestaurantAddress().setText(dto.RestaurantAddress);
		view.getTxtRestaurantPhoneNo().setText(dto.RestarantNo);
		
		view.getComBoxOpenH1().setSelectedItem(dto.Sunday_Open_hour);
		view.getComBoxOpenM1().setSelectedItem(dto.Sunday_Open_mintue);
		view.getComBoxCloseH1().setSelectedItem(dto.Sunday_Close_hour);
		view.getComBoxCloseM1().setSelectedItem(dto.Sunday_Close_mintue);
		
		view.getComBoxOpenH2().setSelectedItem(dto.Monday_Open_hour);
		view.getComBoxOpenM2().setSelectedItem(dto.Monday_Open_mintue);
		view.getComBoxCloseH2().setSelectedItem(dto.Monday_Close_hour);
		view.getComBoxCloseM2().setSelectedItem(dto.Monday_Close_mintue);
		
		view.getComBoxOpenH3().setSelectedItem(dto.Tuesday_Open_hour);
		view.getComBoxOpenM3().setSelectedItem(dto.Tuesday_Open_mintue);
		view.getComBoxCloseH3().setSelectedItem(dto.Tuesday_Close_hour);
		view.getComBoxCloseM3().setSelectedItem(dto.Tuesday_Close_mintue);
		
		view.getComBoxOpenH4().setSelectedItem(dto.Wednesday_Open_hour);
		view.getComBoxOpenM4().setSelectedItem(dto.Wednesday_Open_mintue);
		view.getComBoxCloseH4().setSelectedItem(dto.Wednesday_Close_hour);
		view.getComBoxCloseM4().setSelectedItem(dto.Wednesday_Close_mintue);
		
		view.getComBoxOpenH5().setSelectedItem(dto.Thursday_Open_hour);
		view.getComBoxOpenM5().setSelectedItem(dto.Thursday_Open_mintue);
		view.getComBoxCloseH5().setSelectedItem(dto.Thursday_Close_hour);
		view.getComBoxCloseM5().setSelectedItem(dto.Thursday_Close_mintue);
		
		view.getComBoxOpenH6().setSelectedItem(dto.Friday_Open_hour);
		view.getComBoxOpenM6().setSelectedItem(dto.Friday_Open_mintue);
		view.getComBoxCloseH6().setSelectedItem(dto.Friday_Close_hour);
		view.getComBoxCloseM6().setSelectedItem(dto.Friday_Close_mintue);
		
		view.getComBoxOpenH7().setSelectedItem(dto.Saturday_Open_hour);
		view.getComBoxOpenM7().setSelectedItem(dto.Saturday_Open_mintue);
		view.getComBoxCloseH7().setSelectedItem(dto.Saturday_Close_hour);
		view.getComBoxCloseM7().setSelectedItem(dto.Saturday_Close_mintue);
		
		view.getTxtAreaDeliveryArea().setText(dto.RestaurantDeliveryArea);
			}
		});
		
		view.getBtnSave().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				String RestaurantName = view.getTxtRestaurantName().getText().trim();
				String RestaurantAddress = view.getTxtRestaurantAddress().getText().trim();
				String RestarantNo = view.getTxtRestaurantPhoneNo().getText().trim();
				String RestaurantDeliveryArea = view.getTxtAreaDeliveryArea().getText();
				
				String Sunday_Open_hour = view.getComBoxOpenH1().getSelectedItem().toString();
				String Sunday_Open_mintue = view.getComBoxOpenM1().getSelectedItem().toString();
				String Sunday_Close_hour = view.getComBoxCloseH1().getSelectedItem().toString();
				String Sunday_Close_mintue = view.getComBoxCloseM1().getSelectedItem().toString();
				
				String Monday_Open_hour = view.getComBoxOpenH2().getSelectedItem().toString();
				String Monday_Open_mintue = view.getComBoxOpenM2().getSelectedItem().toString();
				String Monday_Close_hour = view.getComBoxCloseH2().getSelectedItem().toString();
				String Monday_Close_mintue = view.getComBoxCloseM2().getSelectedItem().toString();
				
				String Tuesday_Open_hour = view.getComBoxOpenH3().getSelectedItem().toString();
				String Tuesday_Open_mintue = view.getComBoxOpenM3().getSelectedItem().toString();
				String Tuesday_Close_hour = view.getComBoxCloseH3().getSelectedItem().toString();
				String Tuesday_Close_mintue = view.getComBoxCloseM3().getSelectedItem().toString();
				
				String Wednesday_Open_hour = view.getComBoxOpenH4().getSelectedItem().toString();
				String Wednesday_Open_mintue = view.getComBoxOpenM4().getSelectedItem().toString();
				String Wednesday_Close_hour = view.getComBoxCloseH4().getSelectedItem().toString();
				String Wednesday_Close_mintue = view.getComBoxCloseM4().getSelectedItem().toString();
				
				String Thursday_Open_hour = view.getComBoxOpenH5().getSelectedItem().toString();
				String Thursday_Open_mintue = view.getComBoxOpenM5().getSelectedItem().toString();
				String Thursday_Close_hour = view.getComBoxCloseH5().getSelectedItem().toString();
				String Thursday_Close_mintue = view.getComBoxCloseM5().getSelectedItem().toString();
				
				String Friday_Open_hour = view.getComBoxOpenH6().getSelectedItem().toString();
				String Friday_Open_mintue = view.getComBoxOpenM6().getSelectedItem().toString();
				String Friday_Close_hour = view.getComBoxCloseH6().getSelectedItem().toString();
				String Friday_Close_mintue = view.getComBoxCloseM6().getSelectedItem().toString();
				
				String Saturday_Open_hour = view.getComBoxOpenH7().getSelectedItem().toString();
				String Saturday_Open_mintue = view.getComBoxOpenM7().getSelectedItem().toString();
				String Saturday_Close_hour = view.getComBoxCloseH7().getSelectedItem().toString();
				String Saturday_Close_mintue = view.getComBoxCloseM7().getSelectedItem().toString();
				
				RestaurantBean bean = new RestaurantBean();
				
				bean.setRestaurant_Name(RestaurantName);
				bean.setRestaurant_Address(RestaurantAddress);
				bean.setRestaurant_No(RestarantNo);
				bean.setSunday_Open_Hour(Sunday_Open_hour);
				bean.setSunday_Open_Minute(Sunday_Open_mintue);
				bean.setSunday_Close_Hour(Sunday_Close_hour);
				bean.setSunday_Close_Minute(Sunday_Close_mintue);
				bean.setMonday_Open_Hour(Monday_Open_hour);
				bean.setMonday_Open_Minute(Monday_Open_mintue);
				bean.setMonday_Close_Hour(Monday_Close_hour);
				bean.setMonday_Close_Minute(Monday_Close_mintue);
				bean.setTuesday_Open_Hour(Tuesday_Open_hour);
				bean.setTuesday_Open_Minute(Tuesday_Open_mintue);
				bean.setTuesday_Close_Hour(Tuesday_Close_hour);
				bean.setTuesday_Close_Minute(Tuesday_Close_mintue);
				bean.setWednesday_Open_Hour(Wednesday_Open_hour);
				bean.setWednesday_Open_Minute(Wednesday_Open_mintue);
				bean.setWednesday_Close_Hour(Wednesday_Close_hour);
				bean.setWednesday_Close_Minute(Wednesday_Close_mintue);
				bean.setThursday_Open_Hour(Thursday_Open_hour);
				bean.setThursday_Open_Minute(Thursday_Open_mintue);
				bean.setThursday_Close_Hour(Thursday_Close_hour);
				bean.setThursday_Close_Minute(Thursday_Close_mintue);
				bean.setFriday_Open_Hour(Friday_Open_hour);
				bean.setFriday_Open_Minute(Friday_Open_mintue);
				bean.setFriday_Close_Hour(Friday_Close_hour);
				bean.setFriday_Close_Minute(Friday_Close_mintue);
				bean.setSaturday_Open_Hour(Saturday_Open_hour);
				bean.setSaturday_Open_Minute(Saturday_Open_mintue);
				bean.setSaturday_Close_Hour(Saturday_Close_hour);
				bean.setSaturday_Close_Minute(Saturday_Close_mintue);
				bean.setDeliveryArea(RestaurantDeliveryArea);
				
				dto.RestaurantEdit(bean,resname);
				dto.UpdateRestName(RestaurantName,dto.RestaurantName);
				view.dispose();
				new ManagerDashboardController(username);
			}
		});
		
		view.getBtnAddDeliveryArea().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String DeliveryArea = view.getTxtAreaDeliveryArea().getText();
				if(!DeliveryArea.trim().matches("^[A-Z0-9A-Z ]+$")) {
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Value like A2A", "Registration Error",0);
				}else {
				String Area=view.getTxtDeliveryArea().getText();
				String dArea=view.getTxtAreaDeliveryArea().getText();
				
				view.getTxtAreaDeliveryArea().setText(Area+" "+dArea);
				view.getTxtDeliveryArea().setText("");
			}
			}
		});
		
		view.getBtnDeleteDeliveryArea().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String DeleteArea = view.getTxtAreaDeliveryArea().getSelectedText();
				String dArea=view.getTxtAreaDeliveryArea().getText().trim();
				
				dArea = dArea.replace(DeleteArea, "");
				
				view.getTxtAreaDeliveryArea().setText(dArea);
				//System.out.println(DeleteArea);
			}
		});
		
		
		
		//-------------File
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
				
				
				//------------- Manager CRUD
						
						view.getEditManagerItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new EditManagerController(resname,username);
							}
						});	
						
						
				//------------- Menu CRUD
						view.getCreateFoodMenuItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new AddMenuController(resname,username);
							}
						});
						
						view.getEditFoodMenuItem().addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								
								view.dispose();
								new EditMenuController(resname,username);
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
				
						// Chef menu link
						
						view.getCreateChefMenuItem().addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
								// TODO Auto-generated method stub
								view.setVisible(false);
								new AddChefController(resname,username);
								
								
							}
							
						});
						
						view.getEditChefMenuItem().addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
								// TODO Auto-generated method stub
								view.setVisible(false);
								new EditChefController(resname,username);
								
								
							}
							
						});
						
						view.getDeleteChefMenuItem().addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
								// TODO Auto-generated method stub
								view.setVisible(false);
								new DeleteChefController(resname,username);
								
								
							}
							
						});


	}
}
