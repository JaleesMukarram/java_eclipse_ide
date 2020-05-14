package Task3;

public class MP3Player extends Electronics {

	// Instance variables
	private String color;

	// Required Constructor for this class having call of the previous constructor
	public MP3Player(double regularPrice, String manufacturer, String color) {
		super(regularPrice, manufacturer);
		this.color = color;
	}

	// Overriding the methods according to product
	public double computeSalePrice() {
		return getRegularPrice() * 0.34;
	}

	// Public getters and Setters for private fields
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
