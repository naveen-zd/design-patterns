package prototype.pattern;

public class Address {
	private String building;
	private String location;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String building, String location) {
		super();
		this.building = building;
		this.location = location;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", location=" + location + "]";
	}

	 
	
	

}
