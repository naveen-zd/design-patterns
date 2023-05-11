package prototype.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShopClient {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs1 = new BookShop("DC books");
 		
		bs1.loadData();
		BookShop bs2 = (BookShop) bs1.clone();//shallow cloning
		bs1.getBooks().remove(2);		
		bs1.getBooks().get(0).setName("Harry Potter");
		bs1.setAddress("A12C");
		System.out.println(bs1);
		System.out.println(bs2);
		 
	}

}
