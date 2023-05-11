package prototype.pattern;

 
import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String shopName;
	List<Book> books = new ArrayList<Book>();
	
	public BookShop(String name) {
		this.shopName = name;
		//loadData();
		
	}

	public String getShopName() {
		return shopName;
	}
	

	public List<Book> getBooks() {
		return books;
	}
	
	public void loadData() {
		for(int i=1;i <=10; i++) {
			Book b = new Book("id_"+i, "Book_"+i,"Author_"+i);
			this.books.add(b);
		}
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
	   BookShop bookShop = new BookShop("Penguin");
	   for(Book b : getBooks()) {
		  bookShop.getBooks().add(b);
		}
		return bookShop;
	}
	

	
	
	

}
