package Task;

public class BMI {

	// declaring instance variable
	private String name;
	private int age;
	private double weight;
	private double height;

	// declaring final static variables
	public static final double KG_PER_POUND = 0.45359237;
	public static final double METERS_PER_INCH = 0.0254;

	// Constructor with all the parameters
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;

	}

	// Second constructor
	public BMI(String name, double height, double weight) {
		this(name, 0, height, weight);

	}

	// Copy constructor
	public BMI(BMI obj) {
		this(obj.name, obj.age, obj.height, obj.weight);

	}

	// Method for getting BMI
	public double getBMI() {
		double BMI = ((double) (this.weight * KG_PER_POUND) / (height * METERS_PER_INCH * height * METERS_PER_INCH));
		return BMI;

	}

	// This will return the status according to formula
	public String getStatus() {
		// getting the value of BMI from other method in the class
		double BMI = this.getBMI();

		// Checking if else condition just for showing correct status
		if (BMI < 18.5) {
			return ("Underweight");
		} else if (BMI > 18.5 && BMI < 24.9) {
			return ("Normal");
		} else if (BMI > 25 && BMI < 29.9) {
			return ("Overweight");
		} else {
			return ("Obese");

		}

	}

	// All getters of instance private variables are defined here
	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getHehght() {
		return height;
	}

	// All setters are defined here
	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
