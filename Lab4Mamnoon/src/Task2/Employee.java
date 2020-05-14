package Task2;

public class Employee {
	String firstName;
	String lastName;
	double salary;

	Employee(String n, String ln, double sa) {
		firstName = n;
		lastName = ln;
		salary = sa;
		if (salary < 0)
			salary = 0;

	}

}
