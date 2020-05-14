package Task2;

public class EmployeeTest {

	public static void main(String[] args) {
		// Creating Employee objects
		Employee e1, e2;
		e1 = new Employee("Ali", "Raza", 200000.32);
		e2 = new Employee("Ahmed", "Gul", 150000.93);

		// Printing both the salaries
		System.out.println("Salary of emloyee 1 is: " + e1.salary * 12);
		System.out.println("Salary of emloyee 2 is: " + e2.salary * 12);

		// Incrementing salaries
		e1.salary += ((double) 10 / 100 * e1.salary);
		e2.salary += ((double) 10 / 100 * e2.salary);

		// Printing both the salaries
		System.out.println("Salary of emloyee 1 updated is: " + e1.salary * 12);
		System.out.println("Salary of emloyee 2 updated is: " + e2.salary * 12);

	}

}
