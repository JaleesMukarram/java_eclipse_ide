package CaseStudy1;

public class BaseSalariedComisionEmployee extends CommissionEmployee {
	public BaseSalariedComisionEmployee(int saleAmount, double payPercent, double baseSalary) {
		super(saleAmount, payPercent);
		this.baseSalary = baseSalary;
	}

	double baseSalary;

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

}
