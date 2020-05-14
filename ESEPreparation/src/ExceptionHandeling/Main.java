package ExceptionHandeling;

import java.io.IOException;
import java.util.InputMismatchException;

class A {
	void M1() throws IOException {

		try {
			M2();
		} catch (IOException ex) {
			System.err.println("M1: " + ex);
			throw new ArrayIndexOutOfBoundsException();

		}finally {
			System.out.println("Inside finaly");
		}
//		}catch (IOException ex) {
//			System.out.println(" M1:"+ex);
//		}
//ArrayIndexOutOfBoundsException
	}

	void M2() throws IOException {

		throw new IOException();

	}
}

public class Main {
	public static void main(String[] args) {

		try {
			A z = new A();
			z.M1();

		} catch (Exception ex) {
			System.err.println("Found in main: " + ex);

//		}catch (Exception ez){
//			System.out.println("Everything caught here");

		} finally {
			System.out.println("Main Finally");
		}

	}

}

class B extends A {

}