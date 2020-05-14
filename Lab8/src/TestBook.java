
public class TestBook {

	public static void main(String[] args) {

		// Creating 2 new book objects
		Book English = new Book("English", new Author(), 1200, 200);
		Book Urdu = new Book("Urdu", new Author(), 900, 120);

		// Printing info of the first book
		System.out.println("Name of book is: " + English.getName() + "\nhaving price 0f: " + English.getPrice()
				+ "\nIt has number of " + English.getQtyInStock() + " books in stock");

	}

}
