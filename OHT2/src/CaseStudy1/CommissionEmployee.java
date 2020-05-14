package CaseStudy1;

public class CommissionEmployee extends Employee {
	
	public CommissionEmployee(int saleAmount, double payPercent) {
		super();
		this.saleAmount = saleAmount;
		this.payPercent = payPercent;
	}

	int saleAmount;
	double payPercent;

	public int getSaleAmount() {
		return saleAmount;
	}

	public void setSaleAmount(int saleAmount) {
		this.saleAmount = saleAmount;
	}

	public double getPayPercent() {
		return payPercent;
	}

	public void setPayPercent(double payPercent) {
		this.payPercent = payPercent;
	}

	@Override
	final public double earning() {
		return (saleAmount * payPercent / 100);
	}

}
