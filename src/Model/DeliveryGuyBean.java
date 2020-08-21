package Model;

public class DeliveryGuyBean {

	private int id = 0;
	private String username;
	private String password;
	private String cpassword;	
	private String deliveryarea;	
	private String phonenumber;
	private int status = 1 ;
	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param cpassword
	 * @param deliveryarea
	 * @param phonenumber
	 * @param status
	 */
	public DeliveryGuyBean(String username, String password, String cpassword, String deliveryarea,
			String phonenumber) {
		super();
		//this.id = id;
		this.username = username;
		this.password = password;
		this.cpassword = cpassword;
		this.deliveryarea = deliveryarea;
		this.phonenumber = phonenumber;
	//	this.status = status;
	}
	
	public DeliveryGuyBean() {
		
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
	 * @return the deliveryarea
	 */
	public String getDeliveryarea() {
		return deliveryarea;
	}

	/**
	 * @param deliveryarea the deliveryarea to set
	 */
	public void setDeliveryarea(String deliveryarea) {
		this.deliveryarea = deliveryarea;
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
