package Task1;

public class Rectangle {
	double width = 1;
	double height = 1;

	public Rectangle() {

	}

	public Rectangle(double width_temp, double height_temp) {
		width = width_temp;
		height = height_temp;
	}

	public double getArea() {
		double area = width * height;
		return area;
	}

	public double getPerimeter() {
		double perimeter = 2 * (width + height);
		return perimeter;
	}

}
