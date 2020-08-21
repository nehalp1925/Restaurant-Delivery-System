package Model;

public class ClientBean {
	private int id = 0;
	private String username;
	private String password;
	private String cpassword;
	private String lastname;
	private String firstname;
	private String address;
	private String email;
	private String phonenumber;
	private int status = 1 ;
	
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param cpassword
	 * @param lastname
	 * @param firstname
	 * @param address
	 * @param email
	 * @param phonenumber
	 * @param status
	 * @param level
	 */
	public ClientBean( String username, String password, String cpassword, String lastname, String firstname,
			String address, String email, String phonenumber) {
		super();
		
		this.username = username;
		this.password = password;
		this.cpassword = cpassword;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.email = email;
		this.phonenumber = phonenumber;
	

	}
	
	
	
	
	/*public ClientBean(int id) {
		super();
		this.id = id;
	}*/




	public ClientBean() {
		
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
	/**
	 * @return the cpassword
	 */
	public String getCpassword() {
		return cpassword;
	}
	/**
	 * @param cpassword the cpassword to set
	 */
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phonenumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * @param phonenumber the phonenumber to set
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
