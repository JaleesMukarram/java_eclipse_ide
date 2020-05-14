package P2;

public class Teacher extends GovernmentOfficers {
	private int numberOfStudents;
	private String subject;

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(int grade, int hoursWorked, int yearsExperience, int numberOfStudents, String subject) {
		super(grade, hoursWorked, yearsExperience);
		this.numberOfStudents = numberOfStudents;
		this.subject = subject;
	}

}
