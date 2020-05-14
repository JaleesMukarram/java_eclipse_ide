package OneLab6Practice;

public class Employee extends Person{
	private String office;
	private double salary;
	private String dateHired;

	public Employee() {

	}

	public Employee(String name, String address, String emailAddress, String Office, double salary, String dateHired) {

		super(name,address,emailAddress);
		setSalary(salary);
		setDateHired(dateHired);
		setOffice(Office);
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

}
