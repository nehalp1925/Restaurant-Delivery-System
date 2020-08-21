package Model;

public class RestaurantBean {

	private int id=0;
	private String Restaurant_Name;
	private String Restaurant_Address;
	private String Restaurant_No;
	private String Sunday_Open_Hour;
	private String Sunday_Open_Minute;
	private String Sunday_Close_Hour;
	private String Sunday_Close_Minute;
	private String Monday_Open_Hour;
	private String Monday_Open_Minute;
	private String Monday_Close_Hour;
	private String Monday_Close_Minute;
	private String Tuesday_Open_Hour;
	private String Tuesday_Open_Minute;
	private String Tuesday_Close_Hour;
	private String Tuesday_Close_Minute;
	private String Wednesday_Open_Hour;
	private String Wednesday_Open_Minute;
	private String Wednesday_Close_Hour;
	private String Wednesday_Close_Minute;
	private String Thursday_Open_Hour;
	private String Thursday_Open_Minute;
	private String Thursday_Close_Hour;
	private String Thursday_Close_Minute;
	private String Friday_Open_Hour;
	private String Friday_Open_Minute;
	private String Friday_Close_Hour;
	private String Friday_Close_Minute;
	private String Saturday_Open_Hour;
	private String Saturday_Open_Minute;
	private String Saturday_Close_Hour;
	private String Saturday_Close_Minute;
	private String DeliveryArea;
	
	
	public RestaurantBean() {
		
	}
	
	
	
	public RestaurantBean(String Restaurant_Name, String Restaurant_Address, String Restaurant_No,
			String sunday_Open_Hour, String sunday_Open_Minute, String sunday_Close_Hour, String sunday_Close_Minute,
			String monday_Open_Hour, String monday_Open_Minute, String monday_Close_Hour, String monday_Close_Minute,
			String tuesday_Open_Hour, String tuesday_Open_Minute, String Tuesday_Close_Hour, String Tuesday_Close_Minute,
			String wednesday_Open_Hour, String wednesday_Open_Minute, String wednesday_Close_Hour,
			String wednesday_Close_Minute, String thursday_Open_Hour, String thursday_Open_Minute,
			String thursday_Close_Hour, String thursday_Close_Minute, String friday_Open_Hour,
			String friday_Open_Minute, String friday_Close_Hour, String friday_Close_Minute, String saturday_Open_Hour,
			String saturday_Open_Minute, String Saturday_Close_Hour, String saturday_Close_Minute,
			String deliveryArea) {
		super();
		this.Restaurant_Name = Restaurant_Name;
		this.Restaurant_Address = Restaurant_Address;
		this.Restaurant_No = Restaurant_No;
		this.Sunday_Open_Hour = sunday_Open_Hour;
		this.Sunday_Open_Minute = sunday_Open_Minute;
		this.Sunday_Close_Hour = sunday_Close_Hour;
		this.Sunday_Close_Minute = sunday_Close_Minute;
		this.Monday_Open_Hour = monday_Open_Hour;
		this.Monday_Open_Minute = monday_Open_Minute;
		this.Monday_Close_Hour = monday_Close_Hour;
		this.Monday_Close_Minute = monday_Close_Minute;
		this.Tuesday_Open_Hour = tuesday_Open_Hour;
		this.Tuesday_Open_Minute = tuesday_Open_Minute;
		this.Tuesday_Close_Hour = Tuesday_Close_Hour;
		this.Tuesday_Close_Minute = Tuesday_Close_Minute;
		this.Wednesday_Open_Hour = wednesday_Open_Hour;
		this.Wednesday_Open_Minute = wednesday_Open_Minute;
		this.Wednesday_Close_Hour = wednesday_Close_Hour;
		this.Wednesday_Close_Minute = wednesday_Close_Minute;
		this.Thursday_Open_Hour = thursday_Open_Hour;
		this.Thursday_Open_Minute = thursday_Open_Minute;
		this.Thursday_Close_Hour = thursday_Close_Hour;
		this.Thursday_Close_Minute = thursday_Close_Minute;
		this.Friday_Open_Hour = friday_Open_Hour;
		this.Friday_Open_Minute = friday_Open_Minute;
		this.Friday_Close_Hour = friday_Close_Hour;
		this.Friday_Close_Minute = friday_Close_Minute;
		this.Saturday_Open_Hour = saturday_Open_Hour;
		this.Saturday_Open_Minute = saturday_Open_Minute;
		this.Saturday_Close_Hour = Saturday_Close_Hour;
		this.Saturday_Close_Minute = saturday_Close_Minute;
		this.DeliveryArea = deliveryArea;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurant_Name() {
		return Restaurant_Name;
	}

	public void setRestaurant_Name(String restaurant_Name) {
		Restaurant_Name = restaurant_Name;
	}

	public String getRestaurant_Address() {
		return Restaurant_Address;
	}

	public void setRestaurant_Address(String restaurant_Address) {
		Restaurant_Address = restaurant_Address;
	}

	public String getRestaurant_No() {
		return Restaurant_No;
	}

	public void setRestaurant_No(String restaurant_No) {
		Restaurant_No = restaurant_No;
	}

	public String getSunday_Open_Hour() {
		return Sunday_Open_Hour;
	}

	public void setSunday_Open_Hour(String sunday_Open_Hour) {
		Sunday_Open_Hour = sunday_Open_Hour;
	}

	public String getSunday_Open_Minute() {
		return Sunday_Open_Minute;
	}

	public void setSunday_Open_Minute(String sunday_Open_Minute) {
		Sunday_Open_Minute = sunday_Open_Minute;
	}

	public String getSunday_Close_Hour() {
		return Sunday_Close_Hour;
	}

	public void setSunday_Close_Hour(String sunday_Close_Hour) {
		Sunday_Close_Hour = sunday_Close_Hour;
	}

	public String getSunday_Close_Minute() {
		return Sunday_Close_Minute;
	}

	public void setSunday_Close_Minute(String sunday_Close_Minute) {
		Sunday_Close_Minute = sunday_Close_Minute;
	}

	public String getMonday_Open_Hour() {
		return Monday_Open_Hour;
	}

	public void setMonday_Open_Hour(String monday_Open_Hour) {
		Monday_Open_Hour = monday_Open_Hour;
	}

	public String getMonday_Open_Minute() {
		return Monday_Open_Minute;
	}

	public void setMonday_Open_Minute(String monday_Open_Minute) {
		Monday_Open_Minute = monday_Open_Minute;
	}

	public String getMonday_Close_Hour() {
		return Monday_Close_Hour;
	}

	public void setMonday_Close_Hour(String monday_Close_Hour) {
		Monday_Close_Hour = monday_Close_Hour;
	}

	public String getMonday_Close_Minute() {
		return Monday_Close_Minute;
	}

	public void setMonday_Close_Minute(String monday_Close_Minute) {
		Monday_Close_Minute = monday_Close_Minute;
	}

	public String getTuesday_Open_Hour() {
		return Tuesday_Open_Hour;
	}

	public void setTuesday_Open_Hour(String tuesday_Open_Hour) {
		Tuesday_Open_Hour = tuesday_Open_Hour;
	}

	public String getTuesday_Open_Minute() {
		return Tuesday_Open_Minute;
	}

	public void setTuesday_Open_Minute(String tuesday_Open_Minute) {
		Tuesday_Open_Minute = tuesday_Open_Minute;
	}

	public String getTuesday_Close_Hour() {
		return Tuesday_Close_Hour;
	}

	public void setTuesday_Close_Hour(String tuesday_Close_Hour) {
		Tuesday_Close_Hour = tuesday_Close_Hour;
	}

	public String getTuesday_Close_Minute() {
		return Tuesday_Close_Minute;
	}

	public void setTuesday_Close_Minute(String tuesday_Close_Minute) {
		Tuesday_Close_Minute = tuesday_Close_Minute;
	}

	public String getWednesday_Open_Hour() {
		return Wednesday_Open_Hour;
	}

	public void setWednesday_Open_Hour(String wednesday_Open_Hour) {
		Wednesday_Open_Hour = wednesday_Open_Hour;
	}

	public String getWednesday_Open_Minute() {
		return Wednesday_Open_Minute;
	}

	public void setWednesday_Open_Minute(String wednesday_Open_Minute) {
		Wednesday_Open_Minute = wednesday_Open_Minute;
	}

	public String getWednesday_Close_Hour() {
		return Wednesday_Close_Hour;
	}

	public void setWednesday_Close_Hour(String wednesday_Close_Hour) {
		Wednesday_Close_Hour = wednesday_Close_Hour;
	}
	public String getWednesday_Close_Minute() {
		return Wednesday_Close_Minute;
	}

	public void setWednesday_Close_Minute(String wednesday_Close_Minute) {
		Wednesday_Close_Minute = wednesday_Close_Minute;
	}

	public String getThursday_Open_Hour() {
		return Thursday_Open_Hour;
	}

	public void setThursday_Open_Hour(String thursday_Open_Hour) {
		Thursday_Open_Hour = thursday_Open_Hour;
	}

	public String getThursday_Open_Minute() {
		return Thursday_Open_Minute;
	}

	public void setThursday_Open_Minute(String thursday_Open_Minute) {
		Thursday_Open_Minute = thursday_Open_Minute;
	}

	public String getThursday_Close_Hour() {
		return Thursday_Close_Hour;
	}

	public void setThursday_Close_Hour(String thursday_Close_Hour) {
		Thursday_Close_Hour = thursday_Close_Hour;
	}

	public String getThursday_Close_Minute() {
		return Thursday_Close_Minute;
	}

	public void setThursday_Close_Minute(String thursday_Close_Minute) {
		Thursday_Close_Minute = thursday_Close_Minute;
	}

	public String getFriday_Open_Hour() {
		return Friday_Open_Hour;
	}

	public void setFriday_Open_Hour(String friday_Open_Hour) {
		Friday_Open_Hour = friday_Open_Hour;
	}

	public String getFriday_Open_Minute() {
		return Friday_Open_Minute;
	}

	public void setFriday_Open_Minute(String friday_Open_Minute) {
		Friday_Open_Minute = friday_Open_Minute;
	}

	public String getFriday_Close_Hour() {
		return Friday_Close_Hour;
	}

	public void setFriday_Close_Hour(String friday_Close_Hour) {
		Friday_Close_Hour = friday_Close_Hour;
	}

	public String getFriday_Close_Minute() {
		return Friday_Close_Minute;
	}

	public void setFriday_Close_Minute(String friday_Close_Minute) {
		Friday_Close_Minute = friday_Close_Minute;
	}

	public String getSaturday_Open_Hour() {
		return Saturday_Open_Hour;
	}

	public void setSaturday_Open_Hour(String saturday_Open_Hour) {
		Saturday_Open_Hour = saturday_Open_Hour;
	}

	public String getSaturday_Open_Minute() {
		return Saturday_Open_Minute;
	}

	public void setSaturday_Open_Minute(String saturday_Open_Minute) {
		Saturday_Open_Minute = saturday_Open_Minute;
	}

	public String getSaturday_Close_Hour() {
		return Saturday_Close_Hour;
	}

	public void setSaturday_Close_Hour(String saturday_Close_Hour) {
		Saturday_Close_Hour = saturday_Close_Hour;
	}

	public String getSaturday_Close_Minute() {
		return Saturday_Close_Minute;
	}

	public void setSaturday_Close_Minute(String saturday_Close_Minute) {
		Saturday_Close_Minute = saturday_Close_Minute;
	}

	public String getDeliveryArea() {
		return DeliveryArea;
	}

	public void setDeliveryArea(String deliveryArea) {
		DeliveryArea = deliveryArea;
	}

	
	
}
