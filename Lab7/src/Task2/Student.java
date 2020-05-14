package Task2;

public class Student extends Person {
	// Defining instance variables
	private String[] status_Array = { "freshman", "sophomore", "junior", "senior" };
	private String status;

	// Defining required constructors for the Class
	public Student() {

	}

	public Student(String name) {
		super(name);
	}

	// All getter defined here for all the private fields
	public String getStatus() {
		return this.status;
	}

	// All setters for instance variable are here with basic checks
	public void setStatus(String status) {
		for (String every : status_Array) {
			if (status.equals(every)) {
				this.status = status;
				break;
			}
		}
	}

	// Overriding the toString method for Person Class
	@Override
	public String toString() {
		Class className = (new Student()).getClass();
		return (className + "and name of Student is " + this.getName());

	}

}
