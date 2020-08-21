package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import DBManager.DTO;
import View.Login;

public class LoginController {
	DTO dto;
	Login view;
	
	//LoginBean lb;
	private String client="client";
	private String admin="admin";
	private String manager="manager";
	private String cook="chef";
	private String guy="guy";

			
	public LoginController() {
		dto = new DTO();
		view = new Login();
		
		view.setVisible(true);
		setEvents();
	}

	private void setEvents() {
		// TODO Auto-generated method stub
		view.getBtnregister().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ClientNewAccountController();
				view.setVisible(false);
			}
			
		});
		
		view.getBtnclose().addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				view.setVisible(false);
			}
			
		});
		
		view.getBtnlogin().addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				String uname=view.gettxtLoginUname().getText();
				String pswrd=String.valueOf(view.getPasswordField().getPassword());
				
				if(uname.trim().isEmpty()&&pswrd.trim().isEmpty()) {
					// TODO Show error message Please insert username first
					//System.out.println("Empty not allowed");
					JOptionPane.showMessageDialog(view.getPanel(), "Please Fill Out All The Fields", "Login Error",0);
					return;
				}
				if(uname.trim().isEmpty()) {
					//System.out.println("Empty Username is not allowed");
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter UserName", "Login Error",0);
				}else if(pswrd.trim().isEmpty()){
					//System.out.println("Empty Password is not allowed");
					JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Password", "Login Error",0);
				}else {
					if(null == dto.verifyUserAndPassword(uname,pswrd)) {
				
						if(null==dto.verifyUsername(uname)) {
							//System.out.println("Username does not match");
							JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Valid UserName", "Login Error",0);
						}
						else if(null==dto.verifyPassword(pswrd)) {
							//System.out.println("Password does not match");
							JOptionPane.showMessageDialog(view.getPanel(), "Please Enter Valid Password", "Login Error",0);
						} else if(dto.status==0) {
							
						}
						
						
					}
					else {//System.out.println(dto.i); 
							/*dto.fetchdata(dto.i);
						System.out.println(dto.f);*/
						//System.out.println(dto.status);
						if(dto.status==0) {
							JOptionPane.showMessageDialog(view.getPanel(), "User Does not Exists", "Login Error",0);
						}else {
							if(dto.level.equals(client)) {
								//System.out.println(dto.l);
								//int id = dto.i;
								new ClientPageController(dto.i);
								view.setVisible(false);
								
							}else if(dto.level.equals(admin)) {
								
								new AdminDashboardController();
								view.setVisible(false);
							}else if(dto.level.equals(manager)) {
								//System.out.println(dto.level);
								new ManagerDashboardController(uname);
								view.setVisible(false);
								
							}else if(dto.level.equals(cook)) {
								//System.out.println(dto.level);
								new ChefDashboardController(uname);
								view.setVisible(false);
							}else if(dto.level.equals(guy)) {
								//System.out.println(dto.level);
								new DeliveryGuyDashboardController(uname);
								view.setVisible(false);
							}
							
							
						}
						
							
							
					}
				}
				
				 
				
				 
	
				
				
			}
		});
	}
}
