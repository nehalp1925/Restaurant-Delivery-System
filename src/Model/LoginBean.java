package Model;

public class LoginBean {

	private int id = 0;
	private String username;
	private String password;
	private String level;
	private int status;
	/**
	 * @param id
	 * @param username
	 * @param password
	 */
	
	public LoginBean() {
		
	}
	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String toString() {
		return this.id + ": " + this.username + " " + this.password;
	}
	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
