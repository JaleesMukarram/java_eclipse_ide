
public class Book {

	// instance variables here
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;

	// constructor 1 with these parameters
	public Book(String name, Author author, double price) {
		this(name, author, price, 0);

	}

	// constructor 2 with these parameters
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = new Author();
		this.setPrice(price);
		this.setQtyInStock(qtyInStock);

	}

	// Public getters and setters for all the fields
	public String getName() {
		return this.name;
	}

	public Author getAuthor() {
		return this.author;

	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {

		// checking on price
		this.price = (price > 0 ? price : 0);
	}

	public int getQtyInStock() {
		return this.qtyInStock;

	}

	public void setQtyInStock(int qtyInStock) {
		// Checking on quantity of books in Stocks
		this.qtyInStock = (qtyInStock >= 0 ? qtyInStock : 0);

	}

}
