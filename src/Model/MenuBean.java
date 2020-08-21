package Model;

public class MenuBean {
	private int id = 0;
	private String RestaurantName;
	private String ItemName;
	private String ItemPrice;
	private int status =1 ;
	
	
	public MenuBean() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurantName() {
		return RestaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(String itemPrice) {
		ItemPrice = itemPrice;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public MenuBean(String restaurantName, String itemName, String itemPrice) {
		super();
		this.RestaurantName = restaurantName;
		this.ItemName = itemName;
		this.ItemPrice = itemPrice;
	}

}
