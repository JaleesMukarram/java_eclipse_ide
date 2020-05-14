package Task3;

public class TV extends Electronics {

	// Instance variable for the class
	private int size;

	// Constructor having call to previous constructor
	public TV(double regularPrice, String manufacturer, int size) {
		super(regularPrice, manufacturer);
		this.size = size;
	}

	// Overriding method according to the need
	public double computeSalePrice() {
		return this.getRegularPrice() * 0.22;
	}

}
