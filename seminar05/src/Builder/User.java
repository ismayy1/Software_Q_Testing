package Builder;

public class User {
	
//	mandatory
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	
//	optional
	private String phone;
	private String address;
	private String birthDay;
	
	public User(String username, String firstName, String lastName, String email) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public User(String username, String firstName, String lastName, String email, String address) {
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}
//	public User(String username, String firstName, String lastName, String email, String phone) {
//		this.username = username;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.phone = phone;
//	}

}
