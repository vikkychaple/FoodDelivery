package fooddelivery.models;

public class Restaurant {
	
	private String restaurantID;
	private String restaurantName;
	private String contactNumber;
	private String address;
	private String gmail;
	private String username;
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(String restauantID, String restauantName, String contactNumber, String address, String gmail,
			String username) {
		super();
		this.restaurantID = restauantID;
		this.restaurantName = restauantName;
		this.contactNumber = contactNumber;
		this.address = address;
		this.gmail = gmail;
		this.username = username;
	}
	public String getRestauantID() {
		return restaurantID;
	}
	public void setRestauantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestauantName() {
		return restaurantName;
	}
	public void setRestauantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantID=" + restaurantID + ", restaurantName=" + restaurantName + ", contactNumber="
				+ contactNumber + ", address=" + address + ", gmail=" + gmail + ", username=" + username + "]";
	}
	
	



}
