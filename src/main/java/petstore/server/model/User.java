package petstore.server.model;

public class User {
	private String firstName = null;
	private String lastName = null;
	private String password = null;
	private Integer userStatus = null;
	private String phone = null;
	private Integer id = null;
	private String email = null;
	private String username = null;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String value) {
		firstName = value;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String value) {
		lastName = value;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String value) {
		password = value;
	}
	
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer value) {
		userStatus = value;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String value) {
		phone = value;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer value) {
		id = value;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String value) {
		email = value;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String value) {
		username = value;
	}
	
}

