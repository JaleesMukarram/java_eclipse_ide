package P2;

public class GovernmentOfficers {
	private int grade;
	private int hoursWorked;
	private int yearsExperience;

	private static int numberOfGovernmentOfficers;

	public GovernmentOfficers(int grade, int hoursWorked, int yearsExperience) {
		super();
		this.grade = grade;
		this.hoursWorked = hoursWorked;
		this.yearsExperience = yearsExperience;
		GovernmentOfficers.numberOfGovernmentOfficers++;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getYearsExperience() {
		return yearsExperience;
	}

	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}

	public double calculatePay() {
		return this.getGrade() * this.getHoursWorked();

	}
	
}
