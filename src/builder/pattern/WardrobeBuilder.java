package builder.pattern;

public class WardrobeBuilder {
	
	private String color;
	private String material;
	private int mirrors;
	private int doors;
	private boolean isHangingRods;
	private boolean isWheels; 
	
	
	
	public WardrobeBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	 
	public WardrobeBuilder setMaterial(String material) {
		this.material = material;
		return this;
	}
	 
	public WardrobeBuilder setMirrors(int mirrors) {
		this.mirrors = mirrors;
		return this;
	}
	 
	public WardrobeBuilder setDoors(int doors) {
		this.doors = doors;
		return this;
	}
	 
	public WardrobeBuilder setHangingRods(boolean isHangingRods) {
		this.isHangingRods = isHangingRods;
		return this;
	}
	 
	public WardrobeBuilder setWheels(boolean isWheels) {
		this.isWheels = isWheels;
		return this;
	}
	
	public Wardrobe getWardrobe() {
		return new Wardrobe(color, material,   mirrors,   doors,   isHangingRods,   isWheels);
	}
	
	 
}
