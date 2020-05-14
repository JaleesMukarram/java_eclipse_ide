package CaseStudy1;

public class SalariadEmployees extends Employee{

	public SalariadEmployees(double baseSalary) {
		super();
		this.baseSalary = baseSalary;
	}

	private double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary > 0 ? baseSalary : 0;
	}

	public double earning() {
		return baseSalary;

	}

}
