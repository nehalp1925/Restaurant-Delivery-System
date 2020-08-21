package DBManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import Model.ChefBean;
import Model.ClientBean;
import Model.DeliveryGuyBean;
import Model.LoginBean;
import Model.ManagerBean;
import Model.MenuBean;
import Model.OrderBean;
import Model.RestaurantBean;

public class DTO extends DatabaseConnection {

	public String level, logeduser;
	public String lastname, firstname, username, address, email, phone, password, cpassword;
	public String Gusername, GDeliveryarea, Gpassword, GCpassword, Gphone, Gstatus;
	public String MenuItemname, MenuItemprice, MenuRestname;
	public String OrderRestName, OrderDeliveryArea, OrderTime, OrderGrandTotal;
	public String Mlastname, Mfirstname, Musername, Maddress, Memail, Mphone, Mpassword, MCpassword, Mresname, Mlevel;
	public String Clastname, Cfirstname, Cusername, Caddress, Cemail, Cphone, Cpassword, CCpassword, CRestaurant_Name;
	public String RestaurantName, RestaurantAddress, RestarantNo, RestaurantDeliveryArea, Sunday_Open_hour,
			Sunday_Open_mintue, Sunday_Close_hour, Sunday_Close_mintue, Monday_Open_hour, Monday_Open_mintue,
			Monday_Close_hour, Monday_Close_mintue, Tuesday_Open_hour, Tuesday_Open_mintue, Tuesday_Close_hour,
			Tuesday_Close_mintue, Wednesday_Open_hour, Wednesday_Open_mintue, Wednesday_Close_hour,
			Wednesday_Close_mintue, Thursday_Open_hour, Thursday_Open_mintue, Thursday_Close_hour,
			Thursday_Close_mintue, Friday_Open_hour, Friday_Open_mintue, Friday_Close_hour, Friday_Close_mintue,
			Saturday_Open_hour, Saturday_Open_mintue, Saturday_Close_hour, Saturday_Close_mintue;
	public int i, status;
	public String Grestname,Gpostalcode,Gadsress,Mpostalcode,Mgrandtotal;

	// ------------------------Login Controller -------------------------------//

	public LoginBean verifyUserAndPassword(String username, String password) {
		String SQL_GETUNAME = "SELECT username,password,level,id,status FROM users where username = ? and password=? ";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETUNAME);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			ResultSet rs = preparedStatement.executeQuery();
			LoginBean login = null;
			while (rs.next()) {
				login = new LoginBean();
				login.setUsername(rs.getString("username"));
				login.setPassword(rs.getString("password"));
				// login.setLevel(rs.getString("level"));

				level = rs.getString("level");
				status = rs.getInt("status");
				i = rs.getInt("id");
			}

			return login;

			// row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public LoginBean verifyUsername(String username) {
		String SQL_GETUNAME = "SELECT username FROM users where username = ?";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETUNAME);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			LoginBean login = null;
			while (rs.next()) {
				login = new LoginBean();
				login.setUsername(rs.getString("username"));
			}

			return login;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public LoginBean verifyPassword(String password) {
		String SQL_GETPASSWORD = "SELECT password FROM users where password = ?";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETPASSWORD);
			preparedStatement.setString(1, password);
			ResultSet rs = preparedStatement.executeQuery();
			LoginBean login = null;
			while (rs.next()) {
				login = new LoginBean();
				login.setPassword(rs.getString("password"));
			}

			return login;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

//-----------------------------Client Controller--------------------------------//
	// Client INsert
	public int Clientinsert(ClientBean Client) {
		String SQL_INSERT = "INSERT INTO users (Username,Password,Cpassword,Last_name,First_name,Address,Email,Phone_number,Level) VALUES (?,?,?,?,?,?,?,?,'client')";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, Client.getUsername());
			preparedStatement.setString(2, Client.getPassword());
			preparedStatement.setString(3, Client.getCpassword());
			preparedStatement.setString(4, Client.getLastname());
			preparedStatement.setString(5, Client.getFirstname());
			preparedStatement.setString(6, Client.getAddress());
			preparedStatement.setString(7, Client.getEmail());
			preparedStatement.setString(8, Client.getPhonenumber());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	public ClientBean getClient(String username) {
		String SQL_GETUNAME = "SELECT username FROM users where username = ?";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETUNAME);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			ClientBean client = null;
			while (rs.next()) {
				client = new ClientBean();
				client.setUsername(rs.getString("username"));
			}
			return client;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public RestaurantBean getRestaurantname(String Restaurant_Name) {
		String SQL_GETUNAME = "SELECT Restaurant_Name FROM restaurant where Restaurant_Name = ?";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETUNAME);
			preparedStatement.setString(1, Restaurant_Name);
			ResultSet rs = preparedStatement.executeQuery();
			RestaurantBean Restaurant = null;
			while (rs.next()) {
				Restaurant = new RestaurantBean();
				Restaurant.setRestaurant_Name(rs.getString("Restaurant_Name"));
			}
			return Restaurant;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public ClientBean ReadData(int id) {

		String SQL_SELECT = "Select * from users WHERE id = ?";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			ClientBean client1 = null;

			while (rs.next()) {
				// System.out.println("hiii");
				client1 = new ClientBean();
				client1.setUsername(rs.getString("username"));
				client1.setPassword(rs.getString("password"));
				client1.setCpassword(rs.getString("Cpassword"));
				client1.setLastname(rs.getString("last_name"));
				client1.setFirstname(rs.getString("first_name"));
				client1.setAddress(rs.getString("address"));
				client1.setEmail(rs.getString("email"));
				client1.setPhonenumber(rs.getString("phone_number"));

				firstname = client1.getFirstname();
				password = client1.getPassword();
				cpassword = client1.getCpassword();
				username = client1.getUsername();
				address = client1.getAddress();
				email = client1.getEmail();
				phone = client1.getPhonenumber();
				lastname = client1.getLastname();
			}

			return client1;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// --------------Edit Client Contoller----------------------------------
	// Edit Client
	public int ClientEdit(ClientBean Client2, int id) {
		String SQL_update = "UPDATE users SET Username =?,Password=?,Cpassword=?,Last_name = ?,First_name=?,Address =?,Email =?,Phone_number=? WHERE id = ? ";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, Client2.getUsername());
			preparedStatement.setString(2, Client2.getPassword());
			preparedStatement.setString(3, Client2.getCpassword());
			preparedStatement.setString(4, Client2.getLastname());
			preparedStatement.setString(5, Client2.getFirstname());
			preparedStatement.setString(6, Client2.getAddress());
			preparedStatement.setString(7, Client2.getEmail());
			preparedStatement.setString(8, Client2.getPhonenumber());
			preparedStatement.setInt(9, id);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ---------------------Delete Client Controller--------------------------
	// Delete Client
	public int ClientDelete(int id) {
		String SQL_DELETE = "UPDATE users SET status = 0 WHERE id = ?";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE);
			preparedStatement.setInt(1, id);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

//-------------------------Add Manager Controller--------------------------------------
	// Manager Insert
	public int ManagerInsert(ManagerBean manager) {
		String SQL_INSERT = "INSERT INTO users (Restaurant_id,Restaurant_name,Username,Password,Cpassword,Last_name,First_name,Address,Email,Phone_number,Level) VALUES (?,?,?,?,?,?,?,?,?,'manager')";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, manager.getRestaurantname());
			preparedStatement.setString(2, manager.getUsername());
			preparedStatement.setString(3, manager.getPassword());
			preparedStatement.setString(4, manager.getCpassword());
			preparedStatement.setString(5, manager.getLastname());
			preparedStatement.setString(6, manager.getFirstname());
			preparedStatement.setString(7, manager.getAddress());
			preparedStatement.setString(8, manager.getEmail());
			preparedStatement.setString(9, manager.getPhonenumber());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// Manager Username

	public ManagerBean getManager(String username) {
		String SQL_GETUNAME = "SELECT username FROM users where username = ?";
		int row = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_GETUNAME);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			ManagerBean Manager = null;
			while (rs.next()) {
				Manager = new ManagerBean();
				Manager.setUsername(rs.getString("username"));
			}
			return Manager;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	// List of Manager

	public ArrayList<String> ReadAllManger(String resname) {
		ArrayList<String> AllManager = new ArrayList<>();
		String SQL_SELECT = "SELECT Username FROM users WHERE Restaurant_Name=? and level='manager' and status =1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, resname);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				AllManager.add(rs.getString("Username"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return AllManager;
	}

	// Manager Data
	public ManagerBean ReadDataManager(String username) {

		String SQL_SELECT = "Select * from users WHERE username = ? and level ='manager'";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, username);
			// preparedStatement.setString(2, level);
			ResultSet rs = preparedStatement.executeQuery();
			ManagerBean manager = null;

			while (rs.next()) {
				// System.out.println("hiii");
				manager = new ManagerBean();
				manager.setUsername(rs.getString("username"));
				manager.setPassword(rs.getString("password"));
				manager.setCpassword(rs.getString("Cpassword"));
				manager.setLastname(rs.getString("last_name"));
				manager.setFirstname(rs.getString("first_name"));
				manager.setAddress(rs.getString("address"));
				manager.setEmail(rs.getString("email"));
				manager.setPhonenumber(rs.getString("phone_number"));

				Musername = manager.getUsername();
				Mpassword = manager.getPassword();
				MCpassword = manager.getCpassword();
				Mlastname = manager.getLastname();
				Mfirstname = manager.getFirstname();
				Maddress = manager.getAddress();
				Memail = manager.getEmail();
				Mphone = manager.getPhonenumber();
				Mresname = rs.getString("Restaurant_Name");
				// Mmenu = rs.getString("")
				Mlevel = rs.getString("level");

			}

			return manager;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// ------------------- Edit Manager Controller----------------------
	// Edit Manager
	public int ManagerEdit(ManagerBean manager, String Restaurant_Name, String username) {
		String SQL_update = "UPDATE users SET Username =?,Password=?,Cpassword=?,Last_name = ?,First_name=?,Address =?,Email =?,Phone_number=? WHERE Restaurant_Name = ? AND username = ? ";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, manager.getUsername());
			preparedStatement.setString(2, manager.getPassword());
			preparedStatement.setString(3, manager.getCpassword());
			preparedStatement.setString(4, manager.getLastname());
			preparedStatement.setString(5, manager.getFirstname());
			preparedStatement.setString(6, manager.getAddress());
			preparedStatement.setString(7, manager.getEmail());
			preparedStatement.setString(8, manager.getPhonenumber());
			preparedStatement.setString(9, Restaurant_Name);
			preparedStatement.setString(10, username);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// --------------- Delete Manager Controller-----------------------
	public int ManagerDelete(String Restaurant_Name, String username) {
		String SQL_DELETE = "UPDATE users SET status = 0 WHERE Restaurant_Name = ? AND Username =?";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE);
			preparedStatement.setString(1, Restaurant_Name);
			preparedStatement.setString(2, username);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// Update restaurant name
	public int UpdateRestName(String New_res, String old_res) {

		String SQL_update_usertable = "UPDATE users SET Restaurant_Name = ? WHERE Restaurant_Name = ? ";
		String SQL_update_menutable = "UPDATE menu SET Restaurant_Name = ? WHERE Restaurant_Name = ? ";
		String SQL_update_ordertable = "UPDATE orders SET RestaurantName = ? WHERE RestaurantName = ? ";

		int row = 0;
		int row1 = 0;
		int row2 = 0;
		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update_usertable);
			preparedStatement.setString(1, New_res);
			preparedStatement.setString(2, old_res);

			PreparedStatement preparedStatement1 = this.connection.prepareStatement(SQL_update_menutable);
			preparedStatement1.setString(1, New_res);
			preparedStatement1.setString(2, old_res);

			PreparedStatement preparedStatement2 = this.connection.prepareStatement(SQL_update_ordertable);
			preparedStatement2.setString(1, New_res);
			preparedStatement2.setString(2, old_res);

			row = preparedStatement.executeUpdate();
			row1 = preparedStatement1.executeUpdate();
			row2 = preparedStatement2.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ----------------------------------Add Chef
	// Controller---------------------------

	// Chef Insert

	public int ChefInsert(ChefBean Chef) {
		String SQL_INSERT = "INSERT INTO users (Restaurant_Name,Username,Password,Cpassword,Last_name,First_name,Address,Email,Phone_number,Level) VALUES (?,?,?,?,?,?,?,?,?,'chef')";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, Chef.getRestaurantname());
			preparedStatement.setString(2, Chef.getUsername());
			preparedStatement.setString(3, Chef.getPassword());
			preparedStatement.setString(4, Chef.getCpassword());
			preparedStatement.setString(5, Chef.getLastname());
			preparedStatement.setString(6, Chef.getFirstname());
			preparedStatement.setString(7, Chef.getAddress());
			preparedStatement.setString(8, Chef.getEmail());
			preparedStatement.setString(9, Chef.getPhonenumber());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// Read chef info using restaurant name
	public ChefBean ReadDataChef(String resname) {

		String SQL_SELECT = "Select * from users WHERE Restaurant_Name = ?";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, resname);
			ResultSet rs = preparedStatement.executeQuery();
			ChefBean chef = null;

			while (rs.next()) {

				chef = new ChefBean();
				// chef.setRestaurantname(rs.getString("Restaurant_Name"));
				chef.setUsername(rs.getString("username"));
				chef.setPassword(rs.getString("password"));
				chef.setCpassword(rs.getString("Cpassword"));
				chef.setLastname(rs.getString("last_name"));
				chef.setFirstname(rs.getString("first_name"));
				chef.setAddress(rs.getString("address"));
				chef.setEmail(rs.getString("email"));
				chef.setPhonenumber(rs.getString("phone_number"));

				// CRestaurant_Name=chef.getRestaurantname();
				Cfirstname = chef.getFirstname();
				Cpassword = chef.getPassword();
				CCpassword = chef.getCpassword();
				Cusername = chef.getUsername();
				Caddress = chef.getAddress();
				Cemail = chef.getEmail();
				Cphone = chef.getPhonenumber();
				Clastname = chef.getLastname();
			}

			return chef;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// ---------------Chef Dashboard Controller---------------------
	// Read chef info using username
	public ChefBean ReadDataChefByUName(String username) {

		String SQL_SELECT = "Select * from users WHERE UserName = ? AND level='chef' AND status=1 ";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, username);
			ResultSet rs = preparedStatement.executeQuery();
			ChefBean chef = null;

			while (rs.next()) {

				chef = new ChefBean();
				chef.setRestaurantname(rs.getString("Restaurant_Name"));
				chef.setUsername(rs.getString("username"));
				chef.setPassword(rs.getString("password"));
				chef.setCpassword(rs.getString("Cpassword"));
				chef.setLastname(rs.getString("last_name"));
				chef.setFirstname(rs.getString("first_name"));
				chef.setAddress(rs.getString("address"));
				chef.setEmail(rs.getString("email"));
				chef.setPhonenumber(rs.getString("phone_number"));

				CRestaurant_Name = chef.getRestaurantname();
				Cfirstname = chef.getFirstname();
				Cpassword = chef.getPassword();
				CCpassword = chef.getCpassword();
				Cusername = chef.getUsername();
				Caddress = chef.getAddress();
				Cemail = chef.getEmail();
				Cphone = chef.getPhonenumber();
				Clastname = chef.getLastname();
			}

			return chef;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}
	// List of chef

	public ArrayList<String> ReadAllChef(String resname) {
		ArrayList<String> AllManager = new ArrayList<>();
		String SQL_SELECT = "SELECT Username FROM users WHERE Restaurant_Name=? AND level='chef'AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, resname);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				AllManager.add(rs.getString("Username"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return AllManager;
	}

	// -----------------Edit Chef Controller-----------------------
	// Edit Chef
	public int ChefEdit(ChefBean chef, String resname, String username) {
		String SQL_update = "UPDATE users SET Username =?,Password=?,Cpassword=?,Last_name = ?,First_name=?,Address =?,Email =?,Phone_number=? WHERE Restaurant_Name = ? and username=? and level = 'chef'  ";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, chef.getUsername());
			preparedStatement.setString(2, chef.getPassword());
			preparedStatement.setString(3, chef.getCpassword());
			preparedStatement.setString(4, chef.getLastname());
			preparedStatement.setString(5, chef.getFirstname());
			preparedStatement.setString(6, chef.getAddress());
			preparedStatement.setString(7, chef.getEmail());
			preparedStatement.setString(8, chef.getPhonenumber());
			preparedStatement.setString(9, resname);
			preparedStatement.setString(10, username);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ---------------Delete chef Controller -----------------
	public int ChefDelete(String uname) {
		String SQL_DELETE = "UPDATE users SET status = 0 WHERE username = ?";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE);
			preparedStatement.setString(1, uname);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// --------------------- Add Restaurant
	// Controller---------------------------------
	// Restaurant INsert
	public int RestaurantInsert(RestaurantBean Restaurant) {
		String SQL_INSERT = "INSERT INTO restaurant (Restaurant_Name,Restaurant_Address	,Restaurant_No,Sunday_Open_Hour,Sunday_Open_Minute,Sunday_Close_Hour,Sunday_Close_Minute,Monday_Open_Hour,Monday_Open_Minute,Monday_Close_Hour,Monday_Close_Minute,Tuesday_Open_Hour,Tuesday_Open_Minute,Tuesday_Close_Hour,Tuesday_Close_Minute,Wednesday_Open_Hour,Wednesday_Open_Minute,Wednesday_Close_Hour,Wednesday_Close_Minute,Thursday_Open_Hour,Thursday_Open_Minute,Thursday_Close_Hour,Thursday_Close_Minute,Friday_Open_Hour,Friday_Open_Minute,Friday_Close_Hour,Friday_Close_Minute,Saturday_Open_Hour,Saturday_Open_Minute,Saturday_Close_Hour,Saturday_Close_Minute,DeliveryArea) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, Restaurant.getRestaurant_Name());
			preparedStatement.setString(2, Restaurant.getRestaurant_Address());
			preparedStatement.setString(3, Restaurant.getRestaurant_No());
			preparedStatement.setString(4, Restaurant.getSunday_Open_Hour());
			preparedStatement.setString(5, Restaurant.getSunday_Open_Minute());
			preparedStatement.setString(6, Restaurant.getSunday_Close_Hour());
			preparedStatement.setString(7, Restaurant.getSunday_Close_Minute());
			preparedStatement.setString(8, Restaurant.getMonday_Open_Hour());
			preparedStatement.setString(9, Restaurant.getMonday_Open_Minute());
			preparedStatement.setString(10, Restaurant.getMonday_Close_Hour());
			preparedStatement.setString(11, Restaurant.getMonday_Close_Minute());
			preparedStatement.setString(12, Restaurant.getTuesday_Open_Hour());
			preparedStatement.setString(13, Restaurant.getTuesday_Open_Minute());
			preparedStatement.setString(14, Restaurant.getTuesday_Close_Hour());
			preparedStatement.setString(15, Restaurant.getTuesday_Close_Minute());
			preparedStatement.setString(16, Restaurant.getWednesday_Open_Hour());
			preparedStatement.setString(17, Restaurant.getWednesday_Open_Minute());
			preparedStatement.setString(18, Restaurant.getWednesday_Close_Hour());
			preparedStatement.setString(19, Restaurant.getWednesday_Close_Minute());
			preparedStatement.setString(20, Restaurant.getThursday_Open_Hour());
			preparedStatement.setString(21, Restaurant.getThursday_Open_Minute());
			preparedStatement.setString(22, Restaurant.getThursday_Close_Hour());
			preparedStatement.setString(23, Restaurant.getThursday_Close_Minute());
			preparedStatement.setString(24, Restaurant.getFriday_Open_Hour());
			preparedStatement.setString(25, Restaurant.getFriday_Open_Minute());
			preparedStatement.setString(26, Restaurant.getFriday_Close_Hour());
			preparedStatement.setString(27, Restaurant.getFriday_Close_Hour());
			preparedStatement.setString(28, Restaurant.getSaturday_Open_Hour());
			preparedStatement.setString(29, Restaurant.getSaturday_Open_Minute());
			preparedStatement.setString(30, Restaurant.getSaturday_Close_Hour());
			preparedStatement.setString(31, Restaurant.getSaturday_Close_Minute());
			preparedStatement.setString(32, Restaurant.getDeliveryArea());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// -----------Edit Restaurant Controller ------------------
	// Restaurant Name

	public ArrayList<String> ReadRestaurantName() {
		ArrayList<String> restaurantsName = new ArrayList<>();
		String SQL_SELECT = "SELECT Restaurant_Name FROM restaurant WHERE status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				restaurantsName.add(rs.getString("Restaurant_Name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return restaurantsName;
	}

	// Restaurant Detail for particular rest

	public RestaurantBean RestaurantData(String Restaurant_Name) {

		String SQL_SELECT = "Select * from restaurant WHERE Restaurant_Name = ?";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, Restaurant_Name);
			ResultSet rs = preparedStatement.executeQuery();
			RestaurantBean Rest = null;
			System.out.println(Restaurant_Name);
			while (rs.next()) {
				// System.out.println("hi");
				Rest = new RestaurantBean();

				Rest.setRestaurant_Name(rs.getString("Restaurant_Name"));
				Rest.setRestaurant_Address(rs.getString("Restaurant_Address"));
				Rest.setRestaurant_No(rs.getString("Restaurant_No"));
				Rest.setSunday_Open_Hour(rs.getString("Sunday_Open_Hour"));
				Rest.setSunday_Open_Minute(rs.getString("Sunday_Open_Minute"));
				Rest.setSunday_Close_Hour(rs.getString("Sunday_Close_Hour"));
				Rest.setSunday_Close_Minute(rs.getString("Sunday_Close_Minute"));
				Rest.setMonday_Open_Hour(rs.getString("Monday_Open_Hour"));
				Rest.setMonday_Open_Minute(rs.getString("Monday_Open_Minute"));
				Rest.setMonday_Close_Hour(rs.getString("Monday_Close_Hour"));
				Rest.setMonday_Close_Minute(rs.getString("Monday_Close_Minute"));
				Rest.setTuesday_Open_Hour(rs.getString("Tuesday_Open_Hour"));
				Rest.setTuesday_Open_Minute(rs.getString("Tuesday_Open_Minute"));
				Rest.setTuesday_Close_Hour(rs.getString("Tuesday_Close_Hour"));
				Rest.setTuesday_Close_Minute(rs.getString("Tuesday_Close_Minute"));
				Rest.setWednesday_Open_Hour(rs.getString("Wednesday_Open_Hour"));
				Rest.setWednesday_Open_Minute(rs.getString("Wednesday_Open_Minute"));
				Rest.setWednesday_Close_Hour(rs.getString("Wednesday_Close_Hour"));
				Rest.setWednesday_Close_Minute(rs.getString("Wednesday_Close_Minute"));
				Rest.setThursday_Open_Hour(rs.getString("Thursday_Open_Hour"));
				Rest.setThursday_Open_Minute(rs.getString("Thursday_Open_Minute"));
				Rest.setThursday_Close_Hour(rs.getString("Thursday_Close_Hour"));
				Rest.setThursday_Close_Minute(rs.getString("Thursday_Close_Minute"));
				Rest.setFriday_Open_Hour(rs.getString("Friday_Open_Hour"));
				Rest.setFriday_Open_Minute(rs.getString("Friday_Open_Minute"));
				Rest.setFriday_Close_Hour(rs.getString("Friday_Close_Hour"));
				Rest.setFriday_Close_Minute(rs.getString("Friday_Close_Minute"));
				Rest.setSaturday_Open_Hour(rs.getString("Saturday_Open_Hour"));
				Rest.setSaturday_Open_Minute(rs.getString("Saturday_Open_Minute"));
				Rest.setSaturday_Close_Hour(rs.getString("Saturday_Close_Hour"));
				Rest.setSaturday_Close_Minute(rs.getString("Saturday_Close_Minute"));
				Rest.setDeliveryArea(rs.getString("DeliveryArea"));

				RestaurantName = Rest.getRestaurant_Name();
				RestaurantAddress = Rest.getRestaurant_Address();
				RestarantNo = Rest.getRestaurant_No();
				Sunday_Open_hour = Rest.getSunday_Open_Hour();
				Sunday_Open_mintue = Rest.getSunday_Open_Minute();
				Sunday_Close_hour = Rest.getSunday_Close_Hour();
				Sunday_Close_mintue = Rest.getSunday_Close_Minute();
				Monday_Open_hour = Rest.getMonday_Open_Hour();
				Monday_Open_mintue = Rest.getMonday_Open_Minute();
				Monday_Close_hour = Rest.getMonday_Close_Hour();
				Monday_Close_mintue = Rest.getMonday_Close_Minute();
				Tuesday_Open_hour = Rest.getTuesday_Open_Hour();
				Tuesday_Open_mintue = Rest.getTuesday_Open_Minute();
				Tuesday_Close_hour = Rest.getTuesday_Close_Hour();
				Tuesday_Close_mintue = Rest.getTuesday_Close_Minute();
				Wednesday_Open_hour = Rest.getWednesday_Open_Hour();
				Wednesday_Open_mintue = Rest.getWednesday_Open_Minute();
				Wednesday_Close_hour = Rest.getWednesday_Close_Hour();
				Wednesday_Close_mintue = Rest.getWednesday_Close_Minute();
				Thursday_Open_hour = Rest.getThursday_Open_Hour();
				Thursday_Open_mintue = Rest.getThursday_Open_Minute();
				Thursday_Close_hour = Rest.getThursday_Close_Hour();
				Thursday_Close_mintue = Rest.getThursday_Close_Minute();
				Friday_Open_hour = Rest.getFriday_Open_Hour();
				Friday_Open_mintue = Rest.getFriday_Open_Minute();
				Friday_Close_hour = Rest.getFriday_Close_Hour();
				Friday_Close_mintue = Rest.getFriday_Close_Minute();
				Saturday_Open_hour = Rest.getSaturday_Open_Hour();
				Saturday_Open_mintue = Rest.getSaturday_Open_Minute();
				Saturday_Close_hour = Rest.getSaturday_Close_Hour();
				Saturday_Close_mintue = Rest.getSaturday_Close_Minute();
				RestaurantDeliveryArea = Rest.getDeliveryArea();

				// Rest_status=rs.getInt("Status");
			}

			return Rest;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// RestaurantDataById
	public RestaurantBean RestaurantDataByID(int RID) {

		String SQL_SELECT = "Select * from restaurant WHERE Restaurant_id = ?";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setInt(1, RID);
			ResultSet rs = preparedStatement.executeQuery();
			RestaurantBean Rest = null;
			while (rs.next()) {
				// System.out.println("hi");
				Rest = new RestaurantBean();

				Rest.setRestaurant_Name(rs.getString("Restaurant_Name"));
				Rest.setRestaurant_Address(rs.getString("Restaurant_Address"));
				Rest.setRestaurant_No(rs.getString("Restaurant_No"));
				Rest.setSunday_Open_Hour(rs.getString("Sunday_Open_Hour"));
				Rest.setSunday_Open_Minute(rs.getString("Sunday_Open_Minute"));
				Rest.setSunday_Close_Hour(rs.getString("Sunday_Close_Hour"));
				Rest.setSunday_Close_Minute(rs.getString("Sunday_Close_Minute"));
				Rest.setMonday_Open_Hour(rs.getString("Monday_Open_Hour"));
				Rest.setMonday_Open_Minute(rs.getString("Monday_Open_Minute"));
				Rest.setMonday_Close_Hour(rs.getString("Monday_Close_Hour"));
				Rest.setMonday_Close_Minute(rs.getString("Monday_Close_Minute"));
				Rest.setTuesday_Open_Hour(rs.getString("Tuesday_Open_Hour"));
				Rest.setTuesday_Open_Minute(rs.getString("Tuesday_Open_Minute"));
				Rest.setTuesday_Close_Hour(rs.getString("Tuesday_Close_Hour"));
				Rest.setTuesday_Close_Minute(rs.getString("Tuesday_Close_Minute"));
				Rest.setWednesday_Open_Hour(rs.getString("Wednesday_Open_Hour"));
				Rest.setWednesday_Open_Minute(rs.getString("Wednesday_Open_Minute"));
				Rest.setWednesday_Close_Hour(rs.getString("Wednesday_Close_Hour"));
				Rest.setWednesday_Close_Minute(rs.getString("Wednesday_Close_Minute"));
				Rest.setThursday_Open_Hour(rs.getString("Thursday_Open_Hour"));
				Rest.setThursday_Open_Minute(rs.getString("Thursday_Open_Minute"));
				Rest.setThursday_Close_Hour(rs.getString("Thursday_Close_Hour"));
				Rest.setThursday_Close_Minute(rs.getString("Thursday_Close_Minute"));
				Rest.setFriday_Open_Hour(rs.getString("Friday_Open_Hour"));
				Rest.setFriday_Open_Minute(rs.getString("Friday_Open_Minute"));
				Rest.setFriday_Close_Hour(rs.getString("Friday_Close_Hour"));
				Rest.setFriday_Close_Minute(rs.getString("Friday_Close_Minute"));
				Rest.setSaturday_Open_Hour(rs.getString("Saturday_Open_Hour"));
				Rest.setSaturday_Open_Minute(rs.getString("Saturday_Open_Minute"));
				Rest.setSaturday_Close_Hour(rs.getString("Saturday_Close_Hour"));
				Rest.setSaturday_Close_Minute(rs.getString("Saturday_Close_Minute"));
				Rest.setDeliveryArea(rs.getString("DeliveryArea"));

				RestaurantName = Rest.getRestaurant_Name();
				RestaurantAddress = Rest.getRestaurant_Address();
				RestarantNo = Rest.getRestaurant_No();
				Sunday_Open_hour = Rest.getSunday_Open_Hour();
				Sunday_Open_mintue = Rest.getSunday_Open_Minute();
				Sunday_Close_hour = Rest.getSunday_Close_Hour();
				Sunday_Close_mintue = Rest.getSunday_Close_Minute();
				Monday_Open_hour = Rest.getMonday_Open_Hour();
				Monday_Open_mintue = Rest.getMonday_Open_Minute();
				Monday_Close_hour = Rest.getMonday_Close_Hour();
				Monday_Close_mintue = Rest.getMonday_Close_Minute();
				Tuesday_Open_hour = Rest.getTuesday_Open_Hour();
				Tuesday_Open_mintue = Rest.getTuesday_Open_Minute();
				Tuesday_Close_hour = Rest.getTuesday_Close_Hour();
				Tuesday_Close_mintue = Rest.getTuesday_Close_Minute();
				Wednesday_Open_hour = Rest.getWednesday_Open_Hour();
				Wednesday_Open_mintue = Rest.getWednesday_Open_Minute();
				Wednesday_Close_hour = Rest.getWednesday_Close_Hour();
				Wednesday_Close_mintue = Rest.getWednesday_Close_Minute();
				Thursday_Open_hour = Rest.getThursday_Open_Hour();
				Thursday_Open_mintue = Rest.getThursday_Open_Minute();
				Thursday_Close_hour = Rest.getThursday_Close_Hour();
				Thursday_Close_mintue = Rest.getThursday_Close_Minute();
				Friday_Open_hour = Rest.getFriday_Open_Hour();
				Friday_Open_mintue = Rest.getFriday_Open_Minute();
				Friday_Close_hour = Rest.getFriday_Close_Hour();
				Friday_Close_mintue = Rest.getFriday_Close_Minute();
				Saturday_Open_hour = Rest.getSaturday_Open_Hour();
				Saturday_Open_mintue = Rest.getSaturday_Open_Minute();
				Saturday_Close_hour = Rest.getSaturday_Close_Hour();
				Saturday_Close_mintue = Rest.getSaturday_Close_Minute();
				RestaurantDeliveryArea = Rest.getDeliveryArea();

				// Rest_status=rs.getInt("Status");
			}

			return Rest;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// ----------------Edit Restaurant Controller----------------
	// Edit Restaurant
	public int RestaurantEdit(RestaurantBean Rest, String Restaurant_Name) {
		String SQL_update = "UPDATE restaurant SET Restaurant_Name=?,Restaurant_Address=?,Restaurant_No=?,Sunday_Open_Hour=?,Sunday_Open_Minute=?,Sunday_Close_Hour=?,Sunday_Close_Minute=?,Monday_Open_Hour=?,Monday_Open_Minute=?,Monday_Close_Hour=?,Monday_Close_Minute=?,Tuesday_Open_Hour=?,Tuesday_Open_Minute=?,Tuesday_Close_Hour=?,Tuesday_Close_Minute=?,Wednesday_Open_Hour=?,Wednesday_Open_Minute=?,Wednesday_Close_Hour=?,Wednesday_Close_Minute=?,Thursday_Open_Hour=?,Thursday_Open_Minute=?,Thursday_Close_Hour=?,Thursday_Close_Minute=?,Friday_Open_Hour=?,Friday_Open_Minute=?,Friday_Close_Hour=?,Friday_Close_Minute=?,Saturday_Open_Hour=?,Saturday_Open_Minute=?,Saturday_Close_Hour=?,Saturday_Close_Minute=?,DeliveryArea=? WHERE Restaurant_Name = ? ";

		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, Rest.getRestaurant_Name());
			preparedStatement.setString(2, Rest.getRestaurant_Address());
			preparedStatement.setString(3, Rest.getRestaurant_No());
			preparedStatement.setString(4, Rest.getSunday_Open_Hour());
			preparedStatement.setString(5, Rest.getSunday_Open_Minute());
			preparedStatement.setString(6, Rest.getSunday_Close_Hour());
			preparedStatement.setString(7, Rest.getSunday_Close_Minute());
			preparedStatement.setString(8, Rest.getMonday_Open_Hour());
			preparedStatement.setString(9, Rest.getMonday_Open_Minute());
			preparedStatement.setString(10, Rest.getMonday_Close_Hour());
			preparedStatement.setString(11, Rest.getMonday_Close_Minute());
			preparedStatement.setString(12, Rest.getTuesday_Open_Hour());
			preparedStatement.setString(13, Rest.getTuesday_Open_Minute());
			preparedStatement.setString(14, Rest.getTuesday_Close_Hour());
			preparedStatement.setString(15, Rest.getTuesday_Close_Minute());
			preparedStatement.setString(16, Rest.getWednesday_Open_Hour());
			preparedStatement.setString(17, Rest.getWednesday_Open_Minute());
			preparedStatement.setString(18, Rest.getWednesday_Close_Hour());
			preparedStatement.setString(19, Rest.getWednesday_Close_Minute());
			preparedStatement.setString(20, Rest.getThursday_Open_Hour());
			preparedStatement.setString(21, Rest.getThursday_Open_Minute());
			preparedStatement.setString(22, Rest.getThursday_Close_Hour());
			preparedStatement.setString(23, Rest.getThursday_Close_Minute());
			preparedStatement.setString(24, Rest.getFriday_Open_Hour());
			preparedStatement.setString(25, Rest.getFriday_Open_Minute());
			preparedStatement.setString(26, Rest.getFriday_Close_Hour());
			preparedStatement.setString(27, Rest.getFriday_Close_Hour());
			preparedStatement.setString(28, Rest.getSaturday_Open_Hour());
			preparedStatement.setString(29, Rest.getSaturday_Open_Minute());
			preparedStatement.setString(30, Rest.getSaturday_Close_Hour());
			preparedStatement.setString(31, Rest.getSaturday_Close_Minute());
			preparedStatement.setString(32, Rest.getDeliveryArea());
			preparedStatement.setString(33, Restaurant_Name);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// -------------Delete Restaurant Controller---------------------
	// Delete Restaurant
	public int DeleteRestaurant(String Restaurant_Name) {
		String SQL_DELETE_RES = "UPDATE restaurant SET status = 0 WHERE Restaurant_Name = ?";
		String SQL_DELETE_Manger = "UPDATE users SET status = 0 WHERE Restaurant_Name = ?";
		int row = 0;
		int row1 = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE_RES);
			preparedStatement.setString(1, Restaurant_Name);

			PreparedStatement preparedStatement1 = this.connection.prepareStatement(SQL_DELETE_Manger);
			preparedStatement1.setString(1, Restaurant_Name);

			row = preparedStatement.executeUpdate();
			row1 = preparedStatement1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// Insert Delivery Man
	public int DeliveryGuyInsert(DeliveryGuyBean guy) {
		String SQL_INSERT = "INSERT INTO users (Username,Password,Cpassword,Last_name,First_name,Address,Email,Phone_number,Level,Restaurant_Name) VALUES (?,?,?,'','',?,'',?,'guy','')";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, guy.getUsername());
			preparedStatement.setString(2, guy.getPassword());
			preparedStatement.setString(3, guy.getCpassword());
			preparedStatement.setString(4, guy.getDeliveryarea());
			preparedStatement.setString(5, guy.getPhonenumber());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ---------------Edit DeliveryMan Controller ---------------------
	// List of Delivery Man

	public ArrayList<String> ReadDeliveryMan() {
		ArrayList<String> DeliveryMan = new ArrayList<>();
		String SQL_SELECT = "SELECT username FROM users WHERE level='guy' AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				DeliveryMan.add(rs.getString("Username"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return DeliveryMan;
	}

	public DeliveryGuyBean ReadDataDeliveryGuy(String guyname) {

		String SQL_SELECT = "Select * from users WHERE Username = ? And status=1";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, guyname);
			ResultSet rs = preparedStatement.executeQuery();
			DeliveryGuyBean Guy = null;

			while (rs.next()) {

				Guy = new DeliveryGuyBean();

				Guy.setUsername(rs.getString("username"));
				Guy.setPassword(rs.getString("password"));
				Guy.setCpassword(rs.getString("Cpassword"));
				Guy.setPhonenumber(rs.getString("phone_number"));
				Guy.setDeliveryarea(rs.getString("address"));
				Gstatus = rs.getString("status");

				Gusername = Guy.getUsername();
				Gpassword = Guy.getPassword();
				GCpassword = Guy.getCpassword();
				Gphone = Guy.getPhonenumber();
				GDeliveryarea = Guy.getDeliveryarea();

			}

			return Guy;

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return null;
	}

	// Edit Delivery Guy
	public int DeliveryGuyEdit(DeliveryGuyBean Guy, String guyname) {
		String SQL_update = "UPDATE users SET Username =?,Password=?,Cpassword=?,Last_name = '',First_name='',Address =?,Email ='',Phone_number=? WHERE Username = ? and level = 'guy' ";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, Guy.getUsername());
			preparedStatement.setString(2, Guy.getPassword());
			preparedStatement.setString(3, Guy.getCpassword());
			preparedStatement.setString(4, Guy.getDeliveryarea());
			preparedStatement.setString(5, Guy.getPhonenumber());
			preparedStatement.setString(6, guyname);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ---------------Delete DeliveryGuy Controller-----------------------------
	// Delete Delivery Guy
	public int DeliveryGuyDelete(String guyname) {
		String SQL_DELETE = "UPDATE users SET status = 0 WHERE username = ?";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE);
			preparedStatement.setString(1, guyname);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// ----------------Add Menu Controller-----------------------
	// Menu data INsert
	public int MenuInsert(MenuBean menu) {
		String SQL_INSERT = "INSERT INTO menu (ItemName,ItemPrice,Restaurant_Name) VALUES (?,?,?)";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, menu.getItemName());
			preparedStatement.setString(2, menu.getItemPrice());
			preparedStatement.setString(3, menu.getRestaurantName());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// Item Name

	public ArrayList<String> ReadMenuItemName(String resname) {
		ArrayList<String> MenuItemName = new ArrayList<>();
		String SQL_SELECT = "SELECT ItemName FROM menu WHERE Restaurant_name=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, resname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				MenuItemName.add(rs.getString("ItemName"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return MenuItemName;
	}

	// --------------------Edit Menu Controller--------------------------
	// Read selected Item data
	public MenuBean ReadItemDetail(String itemname) {

		String SQL_SELECT = "Select * from menu WHERE ItemName = ?";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, itemname);
			ResultSet rs = preparedStatement.executeQuery();
			MenuBean menu = null;

			while (rs.next()) {

				menu = new MenuBean();

				menu.setItemName(rs.getString("ItemName"));
				menu.setItemPrice(rs.getString("ItemPrice"));
				menu.setRestaurantName(rs.getString("Restaurant_Name"));

				MenuItemname = menu.getItemName();
				MenuItemprice = menu.getItemPrice();
				MenuRestname = menu.getRestaurantName();

			}

			return menu;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	// Edit Menu Item
	public int MenuEdit(MenuBean menu, String itemname) {
		String SQL_update = "UPDATE menu SET ItemName =?,ItemPrice=?,Restaurant_Name=? WHERE ItemName = ?";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, menu.getItemName());
			preparedStatement.setString(2, menu.getItemPrice());
			preparedStatement.setString(3, menu.getRestaurantName());
			preparedStatement.setString(4, itemname);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// -----------------Delete Menu Controller-------------------------
	// Delete Menu Item
	public int MenuDelete(String itemname) {
		String SQL_DELETE = "UPDATE menu SET status = 0 WHERE ItemName = ?";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_DELETE);
			preparedStatement.setString(1, itemname);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// --------------------------Client order Food Controller-----------------
	// Get Restaurant as per delivery postal code
	public ArrayList<String> GetPostalCode() {
		ArrayList<String> AvalilabeRest = new ArrayList<>();
		String SQL_SELECT = "SELECT DeliveryArea FROM restaurant WHERE   status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			// preparedStatement.setString(1, postalcode);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				AvalilabeRest.add(rs.getString("DeliveryArea"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return AvalilabeRest;
	}

	// Read selected Item data
	
	public String[] ReadDistinctPostalCode() {
		ArrayList<String> pc = new ArrayList<>();

		// Get unique postal codes from db
		String SQL_SELECT = "SELECT DISTINCT DeliveryArea FROM restaurant WHERE status = 1";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			ResultSet rs = preparedStatement.executeQuery();

			// add found postal in an array list
			while (rs.next())
				pc.addAll((Arrays.asList(rs.getString("DeliveryArea").split("\\ ", -1))));

			// create unique array from array list
			String[] uniquePC = new String[pc.size()];
			uniquePC[0] = "Select Postal Code";
			int i = 1;

			// validate said postcal is not empty now already in the unique array
			for (String s : pc) {
				if (!s.trim().equals("") && Arrays.asList(uniquePC).indexOf(s) == -1) {
					uniquePC[i] = s;
					i++;
				}
			}

			// creating a temp array in order to redim the unique array
			String temp[] = new String[i];
			System.arraycopy(uniquePC, 0, temp, 0, i);
			return temp;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	public String[] selectRestaurantByPostalCode(String pc) {
		ArrayList<String> rest = new ArrayList<>();

		String SQL_SELECT = "SELECT Restaurant_id, Restaurant_Name FROM `restaurant` WHERE DeliveryArea LIKE ?";
		int row = 1;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, "%" + pc + "%");
			ResultSet rs = preparedStatement.executeQuery();

			// add found postal in an array list
			while (rs.next())
				rest.add(rs.getString("Restaurant_Name"));
			// rest.add(rs.getString("Restaurant_id") + " - " +
			// rs.getString("Restaurant_Name"));

			// create unique array from array list
			String[] restaurant = new String[rest.size() + 1];
			restaurant[0] = "Select Restaurant";

			// validate said postcal is not empty now already in the unique array
			for (String s : rest) {
				restaurant[row] = s;
				row++;
			}

			return restaurant;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	// Order Insert
	public int OrderInsert(OrderBean order) {
		String SQL_INSERT = "INSERT INTO orders (ClientName,RestaurantName,DeliveryArea,Date,Time,Itemname,Itemprice,Itemqty,Itemtotal,grandtotal,OrderStatus) VALUES (?,?,?,?,?,?,?,?,?,?,'pending')";
		int row = 0;

		try {
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_INSERT);
			preparedStatement.setString(1, order.getClientName());
			preparedStatement.setString(2, order.getRestaurantName());
			preparedStatement.setString(3, order.getDeliveryArea());
			preparedStatement.setString(4, order.getDate());
			preparedStatement.setString(5, order.getTime());
			preparedStatement.setString(6, order.getItemname());
			preparedStatement.setString(7, order.getItemprice());
			preparedStatement.setString(8, order.getItemqty());
			preparedStatement.setString(9, order.getItemtotal());
			preparedStatement.setString(10, order.getGrandtotal());

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	// -----------------------------Client Order History----------------------
	// Get order as per date
	public ArrayList<String> GetOderByDate(String clientname) {
		ArrayList<String> OrderList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT Date FROM orders WHERE  ClientName=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, clientname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderList.add(rs.getString("Date"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderList;
	}

	// Get Restaurant order as per date and RestaurantName
	public ArrayList<String> GetOderByDateAndRestName(String clientname, String orderdate) {
		ArrayList<String> OrderList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT RestaurantName FROM orders WHERE  ClientName=? AND Date=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, clientname);
			preparedStatement.setString(2, orderdate);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderList.add(rs.getString("RestaurantName"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderList;
	}

	// Get Restaurant order as per date and RestaurantName
	public ArrayList<String> GetOderByDateAndRestNameAndTime(String clientname, String orderdate, String restname) {
		ArrayList<String> OrderList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT Time FROM orders WHERE  ClientName=? AND Date=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, clientname);
			preparedStatement.setString(2, orderdate);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderList.add(rs.getString("Time"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderList;
	}

	// Get Itemname as per date
	public ArrayList<String> GetItemNameOderByDate(String date, String restname, String time) {
		ArrayList<String> OrderListItemname = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemname FROM orders WHERE  Date=? AND RestaurantName=? AND Time=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemname.add(rs.getString("Itemname"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemname;
	}

	// Get Itemprice as per date
	public ArrayList<String> GetItemPriceOderByDate(String date, String restname, String time) {
		ArrayList<String> OrderListItemPrice = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemprice FROM orders WHERE  Date=? AND RestaurantName=? AND Time=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemPrice.add(rs.getString("Itemprice"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemPrice;
	}

	// Get Item Quantity as per date
	public ArrayList<String> GetItemQtyOderByDate(String date, String restname, String time) {
		ArrayList<String> OrderListItemQty = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemqty FROM orders WHERE  Date=? AND RestaurantName=? AND Time=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemQty.add(rs.getString("Itemqty"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemQty;
	}

	// Get Item Total as per date
	public ArrayList<String> GetItemTotalOderByDate(String date, String restname, String time) {
		ArrayList<String> OrderListItemTotal = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE  Date=? AND RestaurantName=? AND Time=? AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemTotal.add(rs.getString("Itemtotal"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemTotal;
	}

	// Read selected Item data
	public OrderBean ReadOrderDetail(String orderdate, String restname, String time) {

		String SQL_SELECT = "Select RestaurantName,DeliveryArea,Time,grandtotal from orders WHERE Date = ? AND RestaurantName=? AND Time=? AND status=1";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, orderdate);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, time);
			ResultSet rs = preparedStatement.executeQuery();
			OrderBean order = null;

			while (rs.next()) {

				order = new OrderBean();

				order.setRestaurantName(rs.getString("RestaurantName"));
				order.setDeliveryArea(rs.getString("DeliveryArea"));
				order.setTime(rs.getString("Time"));
				order.setGrandtotal(rs.getString("grandtotal"));

				OrderRestName = order.getRestaurantName();
				OrderDeliveryArea = order.getDeliveryArea();
				OrderTime = order.getTime();
				OrderGrandTotal = order.getGrandtotal();

			}

			return order;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	// ----------Chef Accepting Order---------------------
	// Get Client name for chef by date and restaurant
	public ArrayList<String> GetClientByDateAndRestname(String date, String restname) {
		ArrayList<String> ClientList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT ClientName FROM orders WHERE  Date=? AND RestaurantName=? AND OrderStatus='pending' AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				ClientList.add(rs.getString("ClientName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return ClientList;
	}

	// Get accpeted order's Client name for chef by date and restaurant
	public ArrayList<String> GetOrderTimeByDateAndRestname(String date, String restname, String clientname) {
		ArrayList<String> ClientList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT Time FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND Orderstatus='pending' AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, clientname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				ClientList.add(rs.getString("Time"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return ClientList;
	}

	// Get Itemname as per date
	public ArrayList<String> GetItemNameOderByUsername(String date, String restname, String uname) {
		ArrayList<String> OrderListItemname = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemname FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND status=1 AND OrderStatus='pending'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemname.add(rs.getString("Itemname"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemname;
	}

	// Get Itemprice as per date
	public ArrayList<String> GetItemPriceOderByUsername(String date, String restname, String uname) {
		ArrayList<String> OrderListItemPrice = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemprice FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND status=1 AND OrderStatus='pending'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemPrice.add(rs.getString("Itemprice"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemPrice;
	}

	// Get Item Quantity as per date
	public ArrayList<String> GetItemQtyOderByUsername(String date, String restname, String uname) {
		ArrayList<String> OrderListItemQty = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemqty FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=? AND status=1 AND OrderStatus='pending'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemQty.add(rs.getString("Itemqty"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemQty;
	}

	// Get Item Total as per date
	public ArrayList<String> GetItemTotalOderByUsername(String date, String restname, String uname) {
		ArrayList<String> OrderListItemTotal = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=? AND status=1 AND OrderStatus='pending'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemTotal.add(rs.getString("Itemtotal"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemTotal;
	}

	// Read selected Item data
	public OrderBean ReadOrderDetailByUsername(String orderdate, String restname, String uname) {

		String SQL_SELECT = "Select ClientName,DeliveryArea,Time,grandtotal from orders WHERE Date = ? AND RestaurantName=? AND ClientName=? AND status=1 AND OrderStatus='pending'";
		int row = 0;
		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, orderdate);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			ResultSet rs = preparedStatement.executeQuery();
			OrderBean order = null;

			while (rs.next()) {

				order = new OrderBean();

				// order.setClientName(rs.getString("ClientName"));
				order.setDeliveryArea(rs.getString("DeliveryArea"));
				order.setTime(rs.getString("Time"));
				order.setGrandtotal(rs.getString("grandtotal"));

				// OrderRestName = order.getClientName();
				OrderDeliveryArea = order.getDeliveryArea();
				OrderTime = order.getTime();
				OrderGrandTotal = order.getGrandtotal();

			}

			return order;

		} catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	// Edit Order Status from pending to accepted
	public int UpdateOrderStatus(String itemname, String uname, String date, String restname, String time) {
		String SQL_update = "UPDATE orders SET OrderStatus='accepted' WHERE ItemName = ? AND ClientName=? AND Date=? AND RestaurantName=? AND Time=? AND OrderStatus='pending'AND status=1";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, itemname);
			preparedStatement.setString(2, uname);
			preparedStatement.setString(3, date);
			preparedStatement.setString(4, restname);
			preparedStatement.setString(5, time);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}
	// Get Itemname as per date
			public ArrayList<String> GetItemNameForChef(String date, String restname, String uname, String time) {
				ArrayList<String> OrderListItemname = new ArrayList<>();
				String SQL_SELECT = "SELECT Itemname FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='pending'";

				try {

					PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
					preparedStatement.setString(1, date);
					preparedStatement.setString(2, restname);
					preparedStatement.setString(3, uname);
					preparedStatement.setString(4, time);
					ResultSet rs = preparedStatement.executeQuery();

					while (rs.next()) {

						OrderListItemname.add(rs.getString("Itemname"));

					}

				} catch (SQLException e) {
					e.printStackTrace();

				}

				return OrderListItemname;
			}

			// Get Itemprice as per date
			public ArrayList<String> GetItemPriceForChef(String date, String restname, String uname, String time) {
				ArrayList<String> OrderListItemPrice = new ArrayList<>();
				String SQL_SELECT = "SELECT Itemprice FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='pending'";

				try {

					PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
					preparedStatement.setString(1, date);
					preparedStatement.setString(2, restname);
					preparedStatement.setString(3, uname);
					preparedStatement.setString(4, time);
					ResultSet rs = preparedStatement.executeQuery();

					while (rs.next()) {

						OrderListItemPrice.add(rs.getString("Itemprice"));

					}

				} catch (SQLException e) {
					e.printStackTrace();

				}

				return OrderListItemPrice;
			}

			// Get Item Quantity as per date
			public ArrayList<String> GetItemQtyForChef(String date, String restname, String uname, String time) {
				ArrayList<String> OrderListItemQty = new ArrayList<>();
				String SQL_SELECT = "SELECT Itemqty FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=?AND Time=? AND status=1 AND OrderStatus='pending'";

				try {

					PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
					preparedStatement.setString(1, date);
					preparedStatement.setString(2, restname);
					preparedStatement.setString(3, uname);
					preparedStatement.setString(4, time);
					ResultSet rs = preparedStatement.executeQuery();

					while (rs.next()) {
						OrderListItemQty.add(rs.getString("Itemqty"));

					}

				} catch (SQLException e) {
					e.printStackTrace();

				}

				return OrderListItemQty;
			}

			// Get Item Total as per date
			public ArrayList<String> GetItemTotalOderForChef(String date, String restname, String uname, String time) {
				ArrayList<String> OrderListItemTotal = new ArrayList<>();
				String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=? AND Time=? AND status=1 AND OrderStatus='pending'";

				try {

					PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
					preparedStatement.setString(1, date);
					preparedStatement.setString(2, restname);
					preparedStatement.setString(3, uname);
					preparedStatement.setString(4, time);
					ResultSet rs = preparedStatement.executeQuery();

					while (rs.next()) {
						OrderListItemTotal.add(rs.getString("Itemtotal"));
					}

				} catch (SQLException e) {
					e.printStackTrace();

				}

				return OrderListItemTotal;
			}
	
	// Get Client name for chef by date and restaurnant who's order is accepted
	public ArrayList<String> GetClientForMarkAsReady(String date, String restname) {
		ArrayList<String> ClientList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT ClientName FROM orders WHERE  Date=? AND RestaurantName=? AND Orderstatus='accepted' AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				ClientList.add(rs.getString("ClientName"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return ClientList;
	}
	//------------------Mark As Ready Controller---------------
	// Get accpeted order's Client name for chef by date and restaurant who's order
	// is accepted
	public ArrayList<String> GetOrderTimeForMarkAsReady(String date, String restname, String clientname) {
		ArrayList<String> ClientList = new ArrayList<>();
		String SQL_SELECT = "SELECT DISTINCT Time FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND Orderstatus='accepted' AND status=1";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, clientname);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				ClientList.add(rs.getString("Time"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return ClientList;
	}

	// Get Itemname as per date
	public ArrayList<String> GetItemNameForMarkAsReady(String date, String restname, String uname, String time) {
		ArrayList<String> OrderListItemname = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemname FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='accepted'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemname.add(rs.getString("Itemname"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemname;
	}

	// Get Itemprice as per date
	public ArrayList<String> GetItemPriceForMarkAsReady(String date, String restname, String uname, String time) {
		ArrayList<String> OrderListItemPrice = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemprice FROM orders WHERE  Date=? AND RestaurantName=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='accepted'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {

				OrderListItemPrice.add(rs.getString("Itemprice"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemPrice;
	}

	// Get Item Quantity as per date
	public ArrayList<String> GetItemQtyForMarkAsReady(String date, String restname, String uname, String time) {
		ArrayList<String> OrderListItemQty = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemqty FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=?AND Time=? AND status=1 AND OrderStatus='accepted'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemQty.add(rs.getString("Itemqty"));

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemQty;
	}

	// Get Item Total as per date
	public ArrayList<String> GetItemTotalOderForMarkAsReady(String date, String restname, String uname, String time) {
		ArrayList<String> OrderListItemTotal = new ArrayList<>();
		String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE Date=? AND RestaurantName=? AND ClientName=? AND Time=? AND status=1 AND OrderStatus='accepted'";

		try {

			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
			preparedStatement.setString(1, date);
			preparedStatement.setString(2, restname);
			preparedStatement.setString(3, uname);
			preparedStatement.setString(4, time);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				OrderListItemTotal.add(rs.getString("Itemtotal"));
			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return OrderListItemTotal;
	}

	// Edit Order Status from accepted to ready
	public int UpdateOrderStatusAsReady(String itemname, String uname, String date, String restname, String time) {
		String SQL_update = "UPDATE orders SET OrderStatus='Ready' WHERE ItemName = ? AND ClientName=? AND Date=? AND RestaurantName=? AND Time=? AND OrderStatus='accepted'AND  status=1";
		int row = 0;

		try {
			// System.out.println(id);
			PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
			preparedStatement.setString(1, itemname);
			preparedStatement.setString(2, uname);
			preparedStatement.setString(3, date);
			preparedStatement.setString(4, restname);
			preparedStatement.setString(5, time);

			row = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// rows affected
		System.out.println(row + " row affected");
		return row;
	}

	//---------Delivery Guy Accepting Order Controller
	
	// Read selected Item data
	
		public String[] ReadDistinctPostalCodeOfGuy(String username) {
			ArrayList<String> pc = new ArrayList<>();

			// Get unique postal codes from db
			String SQL_SELECT = "SELECT DISTINCT Address FROM users WHERE Username=? AND level='guy' AND status = 1";
			int row = 0;
			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, username);
				ResultSet rs = preparedStatement.executeQuery();

				// add found postal in an array list
				while (rs.next())
					pc.addAll((Arrays.asList(rs.getString("Address").split("\\ ", -1))));

				// create unique array from array list
				String[] uniquePC = new String[pc.size()];
				uniquePC[0] = "Select Postal Code";
				int i = 1;

				// validate said postcal is not empty now already in the unique array
				for (String s : pc) {
					if (!s.trim().equals("") && Arrays.asList(uniquePC).indexOf(s) == -1) {
						uniquePC[i] = s;
						i++;
					}
				}

				// creating a temp array in order to redim the unique array
				String temp[] = new String[i];
				System.arraycopy(uniquePC, 0, temp, 0, i);
				return temp;

			} catch (SQLException e) {
				e.printStackTrace();

			}
			return null;
		}
		
		// fetch  client name
		public String[] selectClientByPostalCode(String pc,String date) {
			ArrayList<String> rest = new ArrayList<>();

			String SQL_SELECT = "SELECT DISTINCT ClientName FROM `orders` WHERE DeliveryArea LIKE ? AND date=? AND OrderStatus='Ready' AND DeliveryGuyName = 'null' AND status=1";
			int row = 1;
			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, "%" + pc + "%");
				preparedStatement.setString(2, date);
				ResultSet rs = preparedStatement.executeQuery();

				// add found postal in an array list
				while (rs.next())
					rest.add(rs.getString("ClientName"));
				

				// create unique array from array list
				String[] restaurant = new String[rest.size() + 1];
				restaurant[0] = "Select Client Name";

				// validate said postcal is not empty now already in the unique array
				for (String s : rest) {
					restaurant[row] = s;
					row++;
				}

				return restaurant;

			} catch (SQLException e) {
				e.printStackTrace();

			}
			return null;
		}
		
		// Get accpeted order's Client name for deliveryguy by date and restaurant
		public ArrayList<String> GetOrderTimeByDateAndPCAndCname(String pc,String date, String clientname) {
			ArrayList<String> ClientList = new ArrayList<>();
			String SQL_SELECT = "SELECT DISTINCT Time FROM orders WHERE DeliveryArea LIKE ? AND  Date=? AND ClientName=? AND Orderstatus='Ready' AND status=1";

			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, "%" + pc + "%");
				preparedStatement.setString(2, date);
				preparedStatement.setString(3, clientname);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {
					ClientList.add(rs.getString("Time"));
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

			return ClientList;
		}
		// Get Itemname as per date for guy
		public ArrayList<String> GetItemNameForGuy(String date, String uname, String time) {
			ArrayList<String> OrderListItemname = new ArrayList<>();
			String SQL_SELECT = "SELECT Itemname FROM orders WHERE  Date=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='ready'";

			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, date);
				preparedStatement.setString(2, uname);
				preparedStatement.setString(3, time);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {

					OrderListItemname.add(rs.getString("Itemname"));

				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

			return OrderListItemname;
		}

		// Get Itemprice as per date
		public ArrayList<String> GetItemPriceForGuy(String date,String uname, String time) {
			ArrayList<String> OrderListItemPrice = new ArrayList<>();
			String SQL_SELECT = "SELECT Itemprice FROM orders WHERE  Date=? AND ClientName=? AND time=? AND status=1 AND OrderStatus='Ready'";

			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, date);
				preparedStatement.setString(2, uname);
				preparedStatement.setString(3, time);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {

					OrderListItemPrice.add(rs.getString("Itemprice"));

				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

			return OrderListItemPrice;
		}

		// Get Item Quantity as per date
		public ArrayList<String> GetItemQtyForGuy(String date,String uname, String time) {
			ArrayList<String> OrderListItemQty = new ArrayList<>();
			String SQL_SELECT = "SELECT Itemqty FROM orders WHERE Date=? AND ClientName=?AND Time=? AND status=1 AND OrderStatus='Ready'";

			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, date);
				preparedStatement.setString(2, uname);
				preparedStatement.setString(3, time);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {
					OrderListItemQty.add(rs.getString("Itemqty"));

				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

			return OrderListItemQty;
		}

		// Get Item Total as per date
		public ArrayList<String> GetItemTotalOderForGuy(String date,String uname, String time) {
			ArrayList<String> OrderListItemTotal = new ArrayList<>();
			String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE Date=?  AND ClientName=? AND Time=? AND status=1 AND OrderStatus='Ready'";

			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, date);
				preparedStatement.setString(2, uname);
				preparedStatement.setString(3, time);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {
					OrderListItemTotal.add(rs.getString("Itemtotal"));
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}

			return OrderListItemTotal;
		}

		// Read selected Order restaurant name 
		public int ReadOrderDetailForGuy(String date, String username, String time) {

			String SQL_SELECT = "Select RestaurantName from orders WHERE Date = ? AND ClientName=? AND Time=? AND status=1 AND OrderStatus='Ready'";
			int row = 0;
			try {

				PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
				preparedStatement.setString(1, date);
				preparedStatement.setString(2, username);
				preparedStatement.setString(3, time);
				

				ResultSet rs = preparedStatement.executeQuery();
				while(rs.next()) {
				
					Grestname=rs.getString("RestaurantName");
					
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
			
			return row;
		}
		
		// Read selected Restaurant address
		public int ReadRestaurantAddressForGuy(String restname) {

			String SQL_SELECT_Client = "Select Restaurant_Address from restaurant WHERE Restaurant_Name=?";
			int row = 0;
			try {

				
				PreparedStatement preparedStatement1 = this.connection.prepareStatement(SQL_SELECT_Client);
				preparedStatement1.setString(1, restname);

				ResultSet rs = preparedStatement1.executeQuery();
				while(rs.next()) {
	
					Gpostalcode= rs.getString("Restaurant_Address");
				}

			} catch (SQLException e) {
				e.printStackTrace();

			}
			
			return row;
		}

		// Read selected order's client address
				public int ReadClientAddressForGuy(String username) {

					String SQL_SELECT_Client = "Select Address from users WHERE Username=?";
					int row = 0;
					try {

						
						PreparedStatement preparedStatement1 = this.connection.prepareStatement(SQL_SELECT_Client);
						preparedStatement1.setString(1, username);

						ResultSet rs = preparedStatement1.executeQuery();
						while(rs.next()) {
			
							Gadsress= rs.getString("Address");
						}

					} catch (SQLException e) {
						e.printStackTrace();

					}
					
					return row;
				}
				
				// Edit Order Status from pending to accepted
				public int UpdateDeliveryGuyName(String GuyName,String itemname, String clientname, String date, String restname, String time) {
					String SQL_update = "UPDATE orders SET DeliveryGuyName=? WHERE ItemName = ? AND ClientName=? AND Date=? AND RestaurantName=? AND Time=? AND OrderStatus='Ready'AND status=1";
					int row = 0;

					try {
						// System.out.println(id);
						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_update);
						preparedStatement.setString(1, GuyName);
						preparedStatement.setString(2, itemname);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, date);
						preparedStatement.setString(5, restname);
						preparedStatement.setString(6, time);

						row = preparedStatement.executeUpdate();
					} catch (SQLException e) {
						e.printStackTrace();
					}

					// rows affected
					System.out.println(row + " row affected");
					return row;
				}
				
	// -----------------------------Restaurant Order History For Manager----------------------
				// Get order as per date
				public ArrayList<String> GetOderByDateForManager(String restname) {
					ArrayList<String> OrderList = new ArrayList<>();
					String SQL_SELECT = "SELECT DISTINCT Date FROM orders WHERE  RestaurantName=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							OrderList.add(rs.getString("Date"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderList;
				}
				
		// Get Client Name as per date and RestaurantName
				public ArrayList<String> GetClientByDateAndRestName(String restaurantname, String orderdate) {
					ArrayList<String> OrderList = new ArrayList<>();
					String SQL_SELECT = "SELECT DISTINCT ClientName FROM orders WHERE  RestaurantName=? AND Date=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restaurantname);
						preparedStatement.setString(2, orderdate);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							OrderList.add(rs.getString("ClientName"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderList;
				}
				
				// Get  order time as per date and RestaurantName and client name
				public ArrayList<String> GetOderTimeForManager(String restautrantname, String date, String clientname) {
					ArrayList<String> OrderList = new ArrayList<>();
					String SQL_SELECT = "SELECT DISTINCT Time FROM orders WHERE RestaurantName=? AND Date=? AND ClientName=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restautrantname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							OrderList.add(rs.getString("Time"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderList;
				}
				
				// Get Itemname as per date
				public ArrayList<String> GetItemNameForManager(String restname,String date, String clientname,String time) {
					ArrayList<String> OrderListItemname = new ArrayList<>();
					String SQL_SELECT = "SELECT Itemname FROM orders WHERE RestaurantName=? AND Date=? AND ClientName=? AND Time=? ";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, time);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {

							OrderListItemname.add(rs.getString("Itemname"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderListItemname;
				}

				// Get Itemprice as per date
				public ArrayList<String> GetItemPriceForManager(String restname,String date, String clientname,String time) {
					ArrayList<String> OrderListItemPrice = new ArrayList<>();
					String SQL_SELECT = "SELECT Itemprice FROM orders WHERE RestaurantName=? AND Date=? AND ClientName=? AND Time=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, time);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {

							OrderListItemPrice.add(rs.getString("Itemprice"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderListItemPrice;
				}

				// Get Item Quantity as per date
				public ArrayList<String> GetItemQtyForManager(String restname,String date, String clientname,String time) {
					ArrayList<String> OrderListItemQty = new ArrayList<>();
					String SQL_SELECT = "SELECT Itemqty FROM orders WHERE RestaurantName=? AND Date=? AND ClientName=? AND Time=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, time);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							OrderListItemQty.add(rs.getString("Itemqty"));

						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderListItemQty;
				}

				// Get Item Total as per date
				public ArrayList<String> GetItemTotalForManager(String restname,String date, String clientname,String time) {
					ArrayList<String> OrderListItemTotal = new ArrayList<>();
					String SQL_SELECT = "SELECT Itemtotal FROM orders WHERE RestaurantName=? AND Date=? AND ClientName=? AND Time=?";

					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, time);
						ResultSet rs = preparedStatement.executeQuery();

						while (rs.next()) {
							OrderListItemTotal.add(rs.getString("Itemtotal"));
						}

					} catch (SQLException e) {
						e.printStackTrace();

					}

					return OrderListItemTotal;
				}

				// Read selected Order postal code AND GRAND TOTAL
				public int ReadOrderDetailForManager(String restname,String date, String clientname, String time) {

					String SQL_SELECT = "Select DeliveryArea,grandtotal from orders WHERE RestaurantName=? AND Date=? AND ClientName=? AND Time=?";
					int row = 0;
					try {

						PreparedStatement preparedStatement = this.connection.prepareStatement(SQL_SELECT);
						preparedStatement.setString(1, restname);
						preparedStatement.setString(2, date);
						preparedStatement.setString(3, clientname);
						preparedStatement.setString(4, time);

						ResultSet rs = preparedStatement.executeQuery();
						while(rs.next()) {
							
							Mpostalcode=rs.getString("DeliveryArea");
							Mgrandtotal=rs.getString("grandtotal");
							
						}

					} catch (SQLException e) {
						e.printStackTrace();

					}
					
					return row;
				}
				
				
}
