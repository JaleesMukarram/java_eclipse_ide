
public class BiasedEmployee extends Employee {
	double baseSalary;

	BiasedEmployee(String fName, String lName, long number) {
		super(fName, lName, number);

	}

	@Override
	public double earning() {
		return (super.earning() + baseSalary);

	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = (baseSalary > 0) ? baseSalary : 0.0;
	}

	public String toString() {
		return (super.toString() + "\nAnd getting salary of " + this.earning());
	}

}
