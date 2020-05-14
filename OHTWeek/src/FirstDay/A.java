package FirstDay;

public class A {

	static void max(int x, int y) {
		System.out.println("Method 1 with both integers called");
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else
			System.out.println(y + " is greater than " + x);
	}

	static void max(double x, double y) {
		System.out.println("Method 2 with both double called");
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else
			System.out.println(y + " is greater than " + x);
	}

	static void max(double x, int y) {
		System.out.println("Method 3 with 1st double and 2nd int called");
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else
			System.out.println(y + " is greater than " + x);
	}

	static void max(int x, double y) {
		System.out.println("Method 4 with 1st int and 2nd double called");
		if (x > y)
			System.out.println(x + " is greater than " + y);
		else
			System.out.println(y + " is greater than " + x);
	}

}
