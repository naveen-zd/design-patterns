package builder.pattern;

public class WardrobeBuilderClient {
	public static void main(String[] args) {
		
		//Warddrobe w1 = new Wardrobe("ddad",asdad);
		//Wardrobe w2 = new Wardrobe("asd","ada","sdasd","asad");
		
		Wardrobe w3 = new WardrobeBuilder().setColor("Ivory").setDoors(4).setMaterial("Teeak").getWardrobe();
		
		String URL = "http://abc.com/create/3"

	}
}
