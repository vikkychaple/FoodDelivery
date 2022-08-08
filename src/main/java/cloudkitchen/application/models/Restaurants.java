package cloudkitchen.application.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="restaurants")
public class Restaurants {
	@Id
	@Column(name="restaurant_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="restaurant_sequence")
	private Integer restaurantId;
	
	
	@Column(name = "restaurant_username", length = 15,unique = true)
	private String restaurantUsername;
	
	@Column(name="restaurant_password", length=15)
	private String restaurantPassword;
	
	@Column(name="restaurant_name", length=50)
	private String  restaurantName;
	
	@Column(name="restaurant_contact_number", length=12)
	private String  restaurantContactNumber;
	
	@Column(name="restaurant_address", length=50)
	private String restaurantAddress;
	
	@Column(name="owner_gmail", length=30)
	private String ownerGmail;

	public Restaurants(Integer restaurantId, String restaurantUsername, String restaurantPassword,
			String restaurantName, String restaurantContactNumber, String restaurantAddress, String ownerGmail) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantUsername = restaurantUsername;
		this.restaurantPassword = restaurantPassword;
		this.restaurantName = restaurantName;
		this.restaurantContactNumber = restaurantContactNumber;
		this.restaurantAddress = restaurantAddress;
		this.ownerGmail = ownerGmail;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantUsername() {
		return restaurantUsername;
	}

	public void setRestaurantUsername(String restaurantUsername) {
		this.restaurantUsername = restaurantUsername;
	}

	public String getRestaurantPassword() {
		return restaurantPassword;
	}

	public void setRestaurantPassword(String restaurantPassword) {
		this.restaurantPassword = restaurantPassword;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantContactNumber() {
		return restaurantContactNumber;
	}

	public void setRestaurantContactNumber(String restaurantContactNumber) {
		this.restaurantContactNumber = restaurantContactNumber;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}

	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public String getOwnerGmail() {
		return ownerGmail;
	}

	public void setOwnerGmail(String ownerGmail) {
		this.ownerGmail = ownerGmail;
	}


}


