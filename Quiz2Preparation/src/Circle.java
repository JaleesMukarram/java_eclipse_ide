
public class Circle extends Shape {
	double radius = 12;;
	final double diameter = radius / 2;

	void i() {
		System.out.println(super.space);
		super.space = 4;
		System.out.println(super.space);

	}

	public String toString() {
		return ("It is a Circle. " + super.toString() + " and with radius of " + this.radius);
	}

}
