package Task2;

public class Book extends Product {
	private String publisher;
	private int yearPublished;

	public Book(double regularPrice, String publisher, int yearPublished) {
		super(regularPrice);
		this.publisher = publisher;
		this.yearPublished = yearPublished;
	}

	public double computeSalePrice() {
		return super.getRegularPrice() * 0.20;
	}

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
		this.yearPublished = yearPublished > 1900 ? yearPublished : 2000;
	}
}
