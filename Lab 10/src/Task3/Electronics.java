package Task3;

public class Electronics extends Product implements ElectronicsInterface {
	
	//Instance variable
	private String Manufacturer;

	//Constructor with required fields of the superclass and this class
	public Electronics(double regularPrice, String manufacturer) {
		super(regularPrice);
		Manufacturer = manufacturer;
	}


	//Public getters and setters
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

}
