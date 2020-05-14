
public class Faculty extends Person {
	private long officeNumber;
	private JobDescription jobInfo;
	private HiringDate hireDate;

	public Faculty(String name, long CNIC, String emailAddress, long contactNumber, long officeNumber,
			String designation, double salary, String teachingLoad, int day, int month, int year) {
		super(name, CNIC, emailAddress, contactNumber);
		this.setOfficeNumber(officeNumber);
		this.setJobInfo(designation, salary, teachingLoad);
		this.setHiringDate(day, month, year);

	}

	public void setOfficeNumber(long officeNumber) {
		this.officeNumber = officeNumber;
	}

	public long getOfficeNumber() {
		return this.officeNumber;
	}

	public void setJobInfo(String designation, double salary, String teachingLoad) {
		this.jobInfo = new JobDescription(designation, salary, teachingLoad);

	}

	public void setHiringDate(int day, int month, int year) {
		this.hireDate = new HiringDate(day, month, year);

	}

	@Override
	public String toString() {
		return ("\nI am a faculty member and " + super.toString() + "\nwith office number " + this.getOfficeNumber()
				+ "And I am an " + this.jobInfo.getDesignation() + ".\nMy salary is Rs " + this.jobInfo.getSalary()
				+ " with the teachingLoad of " + this.jobInfo.getTeachingLoad());

	}

}
