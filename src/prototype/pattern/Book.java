package prototype.pattern;

public class Book {
	private String bookId;
	private String bookName;
	private String bookAuthor;
	public Book(String bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	
	public String getBookId() {
		return bookId;
	}

 

	public String getBookName() {
		return bookName;
	}



	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setName(String name) {
		this.bookName = name;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + "]";
	}

				
	 
	

}
