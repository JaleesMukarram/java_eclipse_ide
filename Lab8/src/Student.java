
public class Student extends Person {

	// Instance variables for students
	private String batch;
	private int regNumber;

	// Student constructor with these parameters for proper initialization
	public Student(String name, long CNIC, String emailAddress, long contactNumber, String batch, int regNumber) {

		// Calling this super Person class constructor for giving them following
		// properties
		super(name, CNIC, emailAddress, contactNumber);

		// Setting through public setter just for validation
		this.setBatch(batch);
		this.setRegNumber(regNumber);

	}

	// All public getters and setters are defined here
	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getBatch() {
		return this.batch;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public int getRegNumber() {
		return this.regNumber;
	}

	// toString method overriding from Object
	public String toString() {
		return ("\nI am a student and " + super.toString() + "\nI am student of " + this.getBatch()
				+ " with regNumber: " + this.getRegNumber());
	}

}
