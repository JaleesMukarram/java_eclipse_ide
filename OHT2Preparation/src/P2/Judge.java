package P2;

public class Judge extends GovernmentOfficers {
	private int judgeGrade;
	private String currentCity;

	public Judge(int grade, int hoursWorked, int yearsExperience, int judgeGrade, String currentCity) {
		super(grade, hoursWorked, yearsExperience);
		this.judgeGrade = judgeGrade;
		this.currentCity = currentCity;
	}

	
	public int getJudgeGrade() {
		return judgeGrade;
	}

	public void setJudgeGrade(int judgeGrade) {
		this.judgeGrade = judgeGrade;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	@Override
	public double calculatePay() {
		return super.calculatePay() + this.getJudgeGrade() * super.calculatePay();

	}
	

}
