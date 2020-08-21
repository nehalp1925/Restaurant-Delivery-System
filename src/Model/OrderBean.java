package Model;

import java.sql.Date;
import java.sql.Time;

public class OrderBean {
	private int id = 0;
	private String ClientName;
	private String RestaurantName;
	private String Date;
	private String Time;
	private String DeliveryArea;
	private String Itemname;
	private String Itemprice;
	private String Itemqty;
	private String Itemtotal;
	private String grandtotal;
	private String OrderStatus;
	//private String Details;
	private String DeliveryGuyName;
	private int status =1 ;
	/**
	 * @param id
	 * @param ClientName
	 * @param restaurantName
	 * @param date
	 * @param time
	 * @param deliveryArea
	 * @param details
	 * @param DeliveryGuyName
	 * @param status
	 */
	
	public OrderBean() {
		
	}
	public OrderBean(String clientName, String restaurantName, String date, String time, String deliveryArea,
			String itemname, String itemprice, String itemqty, String itemtotal, String grandtotal,String orderStatus) {
		super();
		this.ClientName = clientName;
		this.RestaurantName = restaurantName;
		this.Date = date;
		this.Time = time;
		this.DeliveryArea = deliveryArea;
		this.Itemname = itemname;
		this.Itemprice = itemprice;
		this.Itemqty = itemqty;
		this.Itemtotal = itemtotal;
		this.grandtotal = grandtotal;
		this.OrderStatus=orderStatus;
	
	}
	public OrderBean(String clientName, String restaurantName, String date, String time, String deliveryArea,
			String details, String DeliveryGuyName) {
		super();
	//	this.id = id;
		this.ClientName = clientName;
		this.RestaurantName = restaurantName;
		this.Date = date;
		this.Time = time;
		this.DeliveryArea = deliveryArea;
		//this.Details = details;
		this.DeliveryGuyName = DeliveryGuyName;
	//	this.status = status;
	}
	
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientName() {
		return ClientName;
	}
	public void setClientName(String clientName) {
		ClientName = clientName;
	}
	public String getRestaurantName() {
		return RestaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getDeliveryArea() {
		return DeliveryArea;
	}
	public void setDeliveryArea(String deliveryArea) {
		DeliveryArea = deliveryArea;
	}
	/*public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}*/
	public String getDeliveryGuyName() {
		return DeliveryGuyName;
	}
	public void setDeliveryGuyName(String DeliveryGuyName) {
		DeliveryGuyName = DeliveryGuyName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public String getItemname() {
		return Itemname;
	}
	public void setItemname(String itemname) {
		Itemname = itemname;
	}
	public String getItemprice() {
		return Itemprice;
	}
	public void setItemprice(String itemprice) {
		Itemprice = itemprice;
	}
	public String getItemqty() {
		return Itemqty;
	}
	public void setItemqty(String itemqty) {
		Itemqty = itemqty;
	}
	public String getItemtotal() {
		return Itemtotal;
	}
	public void setItemtotal(String itemtotal) {
		Itemtotal = itemtotal;
	}
	public String getGrandtotal() {
		return grandtotal;
	}
	public void setGrandtotal(String grandtotal) {
		this.grandtotal = grandtotal;
	}
	
	
}

