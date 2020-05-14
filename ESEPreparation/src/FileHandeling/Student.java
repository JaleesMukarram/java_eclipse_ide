package FileHandeling;

public class Student implements java.io.Serializable {

	String name;
	String className;
	static int num;

	Student() {
		System.out.println("Default Called");
	}

	Student(String name, String className) {
		this.name = name;
		this.className = className;
		System.out.println("Arguments wala Called");
	}

	public void run() {

	}

	public static void main(String args[]) {

	}

}
