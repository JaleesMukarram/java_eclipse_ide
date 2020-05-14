package Task2;

public class Staff extends Employee {
	// Defining instance variables
	private String title;

	// Defining required constructors for the Class
	public Staff() {

	}

	public Staff(String name) {
		super(name);
	}

	// All getter defined here for all the private fields

	public String getTtile() {
		return this.title;
	}

	// All setters for instance variable are here with basic checks

	public void setTitle(String title) {
		this.title = title;
	}

	// Overriding the toString method for Person Class
	public String toString() {
		Class className = (new Staff()).getClass();
		return (className + " and name of staff is " + this.getName());
	}

}
