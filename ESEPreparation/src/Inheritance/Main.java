package Inheritance;

public class Main {
	public static void main(String args[]) {
//		Person p = new Person();
//		Student s = new Student();
		Person p2 = new Student();
		Student s = (Student) p2;
	
		
		
		System.out.println(s instanceof Student);
		
		
	}

}
