package Task1;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating objects from rectangle class
		Rectangle rectangle_object1 = new Rectangle(4, 40);
		Rectangle rectangle_object2 = new Rectangle(3.5, 35.9);
		
		//Printing width and height of rectangle 1
		System.out.println("Width of rectangle 1 is: " + rectangle_object1.width + "\nHeight of rectangle 1 is: "
				+ rectangle_object1.height);
		
		//Printing Area and perimeter of rectangle 1
		System.out.println("Area of rectangle 1 is: " + rectangle_object1.getArea() + "\nPerimeter of rectangle 1 is: "
				+ rectangle_object1.getPerimeter());

		//Printing width and height of rectangle 2
		System.out.println("Width of rectangle 2 is: " + rectangle_object2.width + "\nHeight of rectangle 1 is: "
				+ rectangle_object2.height);
		
		//Printing Area and perimeter of rectangle 2
		System.out.println("Area of rectangle 2 is: " + rectangle_object2.getArea() + "\nPerimeter of rectangle 2 is: "
				+ rectangle_object2.getPerimeter());
	}

}
