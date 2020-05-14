package Inheritance;

public class Person {

	public String name;
	private int age;
	static int numP;

	public void Run() {
		System.out.println("Run1");
	}

	public static void setNumP(int numP) {
		Person.numP = numP;
	}

}
