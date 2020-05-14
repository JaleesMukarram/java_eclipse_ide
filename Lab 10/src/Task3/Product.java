package Task3;

public class Product implements ProductInterface{
	
	//Instance variable
	private double regularPrice;

	//Constructor with required fields
	public Product(double regularPrice) {

		setRegularPrice(regularPrice);
	}
	
	//Interface method implementing
	public double computeSalePrice() {
		return getRegularPrice()*0.20;
	}

	
	//Setters and Getters are defined here
	public double getRegularPrice() {
		return this.regularPrice;
	}

	
	public void setRegularPrice(double regularPrice) {
		this.regularPrice = regularPrice > 0 ? regularPrice : 0;

	}

}
