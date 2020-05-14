package Task1;

public class Rectangle {
	double width = 1;
	double height = 1;

	Rectangle() {

	}

	Rectangle(double w, double h) {
		width = w;
		height = h;

	}

	double getArea() {
		return (width * height);
	}

	double getPerimeter() {
		return (2 * (width + height));
	}

}
