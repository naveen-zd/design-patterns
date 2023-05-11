package facade.pattern;

public class User {
	private String name;
	private String email;
	private long phone;
	public User(String name, String email, long phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	 
	public String getEmail() {
		return email;
	}
	 
	public long getPhone() {
		return phone;
	}
	 
	
}
