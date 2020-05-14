
public class ComissionEmployee extends Employee {
	public ComissionEmployee(String fName, String lName, long number) {
		super(fName, lName, number);

	}

	public String toString() {
		return ("I am CommissionEmployee" + super.toString() + "\n getting salary of " + this.earning());
	}

}
