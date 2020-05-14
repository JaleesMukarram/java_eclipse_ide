package CaseStudy1;

public class HourlyEmplyees extends Employee{

	private int hoursWorked;
	private double payPerHour;

	public HourlyEmplyees(int hoursWorked, double payPerHour) {
		super();
		this.hoursWorked = hoursWorked;
		this.payPerHour = payPerHour;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public double earning() {
		if (hoursWorked > 40) {
			return (40 * payPerHour) + ((hoursWorked - 40) * (1.5 * payPerHour));
		} else {
			return (hoursWorked * payPerHour);
		}

	}

}
