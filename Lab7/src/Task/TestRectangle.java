package Task;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// creating Scanner object for taking user unput
		Scanner sc = new Scanner(System.in);

		// Asking for Width
		System.out.print("Please enter width of the rectangle: ");
		double width = sc.nextDouble();

		// Necessary checks on width entered by the user
		while (width <= 0) {
			System.out.println("Error!! Width cant be zero or negative. ");
			System.out.print("Please enter width of the rectangle: ");
			width = sc.nextDouble();
		}

		// Asking for height from the user
		System.out.print("Please enter height of the rectangle: ");
		double height = sc.nextDouble();

		// Applying necessary checks on the user
		while (height <= 0) {
			System.out.println("Error!! height cant be zero or negative. ");
			System.out.print("Please enter height of the rectangle: ");
			height = sc.nextDouble();
		}

		// Asking for the color from the user
		System.out.print("Please enter color of the rectangle: ");
		String color = sc.next();

		// Asking if the color is filled
		System.out.print("Please enter whether the color is filled(true or false): ");
		boolean filled = sc.nextBoolean();

		// Creating rectangle object for testing
		Rectangle rec_obj = new Rectangle(width, height, color, filled);

		// Printing different fields of rectangle
		System.out.println("Area of rectangle is: " + rec_obj.getArea());
		System.out.println("Perimeter of rectangle is: " + rec_obj.getPerimeter());
		System.out.println("Color of rectangle is: " + rec_obj.getColor());
		System.out.println("Color filled value is: " + rec_obj.isFilled());

	}

}
