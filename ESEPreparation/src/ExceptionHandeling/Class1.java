package ExceptionHandeling;



public class Class1 {

	public static void main(String[] args) {
//		Class1 c = new Class1();
//
//		try {
//			c.Validate(12);
//			System.out.println("Jalees Mukarram");
//		} catch (AgeException ex) {
//			System.err.println(ex);
//		}

	}

	public void Validate(int age) throws AgeException{

		if (age < 18) {
			throw new AgeException("You are not eligible");
		} else {
			System.out.println("Welcome to voting system");
		}

	}

}

class AgeException extends Exception {

	AgeException(String s) {
		super(s);
	}
}
