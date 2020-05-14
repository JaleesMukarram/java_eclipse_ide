package Task2;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Jalees", "Mukarram", 300000.31);
		Employee emp2 = new Employee("Mamnoon", "Husnain", 340000.31);

		System.out.println("Monthly salary of employee 1 is: " + emp1.salary * 12);
		System.out.println("Monthly salary of employee 2 is: " + emp2.salary * 12);

		emp1.salary += ((double) 0.10 * emp1.salary);
		emp2.salary += ((double) 0.10 * emp2.salary);

		System.out.println("Monthly salary of employee 1 updated is: " + emp1.salary * 12);
		System.out.println("Monthly salary of employee 2 updated is: " + emp2.salary * 12);

	}

}
