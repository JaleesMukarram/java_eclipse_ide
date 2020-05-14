package ExceptionHandeling;

class ExA extends ClassNotFoundException {
	ExA(String s) {
		super(s);
	}

}

class ExB extends ExA {
	ExB(String s) {
		super(s);
	}

}

public class Class2 extends Class1{

	public static void main(String args[]) {

	}

	public void check(int i) throws ExB {
		if (i < 18) {
			throw new ExB("ExB thron");
		}

	}

}
