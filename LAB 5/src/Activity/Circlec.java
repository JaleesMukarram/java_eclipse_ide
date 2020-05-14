package Activity;

/*
 * The Circle class models a circle with a radius and color.
 */
public class Circlec {
// Save as "Circle.java"
	// private instance variable, not accessible from outside this class
	private double radius;
	private String color;
	public static int NoOfObjects;

	// The default constructor with no argument.
	// It sets the radius and color to their default value.
	public Circlec() {
		radius = 1.0;
		color = "red";
		++NoOfObjects;
	}

	// 2nd constructor with given radius, but color default
	public Circlec(double r) {
		radius = r;
		color = "red";
		++NoOfObjects;
	}

	public Circlec(double r, String c) {
		radius = r;
		color = c;
		++NoOfObjects;
	}

	// A public method for retrieving the radius
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}

	// A public method for computing the area of circle
	public double getArea() {
		return radius * radius * Math.PI;
	}

	public void setRadius(double r) {
		radius = r;
	}
	public void setColor(String c) {
		color = c;
	}
	
}
