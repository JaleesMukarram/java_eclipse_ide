package Task1;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rc1 = new Rectangle(4, 40);
		Rectangle rc2 = new Rectangle(3.5, 35.9);

		System.out.println("Width of rectangle 1 is: " + rc1.width);
		System.out.println("Height of rectangle 1 is: " + rc1.height);
		System.out.println("Area of rectangle 1 is: " + rc1.getArea());
		System.out.println("Perimeter of rectangle 1 is: " + rc1.getPerimeter());

		System.out.println("Width of rectangle 1 is: " + rc2.width);
		System.out.println("Height of rectangle 1 is: " + rc2.height);
		System.out.println("Area of rectangle 1 is: " + rc2.getArea());
		System.out.println("Perimeter of rectangle 1 is: " + rc2.getPerimeter());

	}

}
