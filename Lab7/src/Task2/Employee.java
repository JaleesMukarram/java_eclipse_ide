package Task2;

public class Employee extends Person {
	// Defining instance variables
	private String office;
	private double salary;
	private String dateHired;

	// Defining required constructors for the Class
	public Employee() {

	}

	public Employee(String name) {
		super(name);

	}

	// All getter defined here for all the private fields
	public String getOffice() {
		return this.office;
	}

	public double getSalary() {
		return this.salary;
	}

	public String getDateHired() {
		return this.dateHired;
	}

	// All setters for instance variable are here with basic checks
	public void setOffice(String office) {
		if (office.length() > 4) {
			this.office = office;
		}
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		}
	}

	public void setDateHired(String dateHired) {
		if (dateHired.length() > 6) {
			this.dateHired = dateHired;
		}
	}

	// Overriding the toString method for Person Class
	@Override
	public String toString() {
		Class className = (new Employee()).getClass();
		return (className + " and name of Employee is " + this.getName());
	}
}
