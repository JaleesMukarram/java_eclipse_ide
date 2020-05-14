package Task3;

public class Book extends Product {

	// Instance variables defined here
	private String publisher;
	private int yearPublished;

	// Constructor with required fields from previous class and this class
	public Book(double regularPrice, String publisher, int yearPublished) {
		super(regularPrice);
		setPublisher(publisher);
		setYearPublished(yearPublished);
	}

	// Overriding the computeSalePrice method
	public double computeSalePrice() {
		return getRegularPrice() * 0.25;

	}

	// Public Getters and setters for private fields
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

}
