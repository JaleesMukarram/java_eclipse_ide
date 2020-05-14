package ConstructorChaining;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		// Student s2 = s1.duplicate();
		Student s2 = s1.duplicate();
		System.out.println(s1);
		System.out.println(s2);

	}

}
