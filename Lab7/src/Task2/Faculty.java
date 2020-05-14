package Task2;

public class Faculty extends Employee {
	// Defining instance variables
	private String officeHours;
	private int rank;

	// Defining required constructors for the Class
	public Faculty() {

	}

	public Faculty(String name) {
		super(name);
	}

	// All getter defined here for all the private fields
	public String getOfficeHours() {
		return this.officeHours;
	}

	public int getRank() {
		return this.rank;
	}

	// All setters for instance variable are here with basic checks

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	// Overriding the toString method for Person Class
	@Override
	public String toString() {
		Class className = (new Faculty()).getClass();
		return (className + " and name of Faculty is: " + this.getName());
	}

}
