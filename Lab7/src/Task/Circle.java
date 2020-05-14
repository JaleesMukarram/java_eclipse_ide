package Task;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {

	}

	public Circle(Double radius) {
		this.radius = radius;

	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;

	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (3.14 * radius * radius);

	}

	public double getPerimeter() {
		return (2 * 3.14 * radius);
	}

	public void printCircle() {
		if (super.isFilled()) {
			System.out.println("This circle is having color of " + this.getColor() + ",is filled. It was created on "
					+ this.getDateCreated() + " it has a radius of " + this.getRadius());
		} else {
			System.out
					.println("This circle is having color of " + this.getColor() + ",is not filled. It was created on "
							+ this.getDateCreated() + " it has a radius of " + this.getRadius());

		}

	}

}
