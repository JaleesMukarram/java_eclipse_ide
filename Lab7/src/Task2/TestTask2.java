package Task2;

public class TestTask2 {

	public static void main(String[] args) {

		// Creating objects of different classes
		Person psn = new Person("Jalees");
		Student std = new Student("Hassaan");
		Employee emp = new Employee("Mamnoon");
		Faculty fty = new Faculty("Ali");
		Staff stf = new Staff("Haseeb");

		// Printing the toString information for all the objects
		System.out.println("For Person: " + psn.toString());
		System.out.println("For Student: " + std.toString());
		System.out.println("For Employee: " + emp.toString());
		System.out.println("For Faculty: " + fty.toString());
		System.out.println("For Staff: " + stf.toString());

	}

}
