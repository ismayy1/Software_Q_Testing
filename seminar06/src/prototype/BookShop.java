package prototype;

import java.util.ArrayList;

public class BookShop implements Cloneable {

	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public BookShop(String name, ArrayList<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	public BookShop() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BookShop [name=");
		builder.append(name);
		builder.append(", books=");
		builder.append(books);
		builder.append("]");
		return builder.toString();
	}
	
	public static BookShop loadDataFromDB(String name) {
		BookShop bookshop = new BookShop();
		
		bookshop.name = name;
		Book book = null;
		for(int i = 0; i < 10; i++) {
			book = new Book(name + "-" + i, "mada", i*100);
			bookshop.books.add(book);
		}
		
		return bookshop;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		BookShop copy = new BookShop();
		copy.name = this.name;
		copy.books = (ArrayList<Book>) this.books.clone();		//this.books;
		return copy;
		
//		return super.clone();
	}
	
	
	
}
