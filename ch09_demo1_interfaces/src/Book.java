
public class Book extends Product implements Printable {

	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String code, String description, double price, String author) {
		super(code, description, price);
		this.author = author;		
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
		System.out.println(getDescription() + " by " + author);
	}
	
	

}
