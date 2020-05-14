
public class Employee {
	private String fName;
	private String lName;
	private long socialSecurityNumber;
	private double comissionRate;
	private double grossSaleAmount;

	public Employee(String fName, String lName, long socialSecurityNumber) {
		this.fName = fName;
		this.lName = lName;
		this.socialSecurityNumber = socialSecurityNumber;

	}

	public void setComissionRate(double comissionRate) {
		this.comissionRate = (comissionRate < 1 && comissionRate > 0) ? comissionRate : 0.0;

	}

	public void setGrossSaleAmount(double grossSaleAmount) {
		this.grossSaleAmount = (grossSaleAmount > 0) ? grossSaleAmount : 0.0;
	}

	public double earning() {
		return (this.grossSaleAmount * this.comissionRate);

	}

	public String toString() {
		return ("My name is " + this.fName + " " + this.lName + ".\nMy cell number is " + this.socialSecurityNumber
				+ "I am getting comission @ " + this.comissionRate + "And my gross sale was of Rs: "
				+ this.grossSaleAmount + "\n My total salary this month is" + this.earning());
	}

}
