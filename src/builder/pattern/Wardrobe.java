package builder.pattern;

public class Wardrobe {
	private String color;
	private String material;
	private int mirrors;
	private int doors;
	private boolean isHangingRods;
	private boolean isWheels;
	
	public Wardrobe(String color, String material, int mirrors, int doors, boolean isHangingRods, boolean isWheels) {
		super();
		this.color = color;
		this.material = material;
		this.mirrors = mirrors;
		this.doors = doors;
		this.isHangingRods = isHangingRods;
		this.isWheels = isWheels;
	}
	
	public Wardrobe(String color, String material, int mirrors, int doors) {
		
	}
	
	@Override
	public String toString() {
		return "Wardrobe [color=" + color + ", material=" + material + ", mirrors=" + mirrors + ", doors=" + doors
				+ ", isHangingRods=" + isHangingRods + ", isWheels=" + isWheels + "]";
	}
	

}
