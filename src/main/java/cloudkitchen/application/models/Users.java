package cloudkitchen.application.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="users_sequence")
	private Integer userId;
	
	@Column(name="username", length = 15,unique = true)
	private String username;
	
	@Column(name="full_name", length=20)
	public String fullName;
	
	@Column(name="address", length=50)
	private String address;
	
	@Column(name="password", length=15)
	private String password;
	
	@Column(name="mobile_number", length=20)
	private String mobileNumber;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(Integer userId, String username, String fullName, String address, String password,
			String mobileNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.fullName = fullName;
		this.address = address;
		this.password = password;
		this.mobileNumber = mobileNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
