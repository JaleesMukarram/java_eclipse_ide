package Task2;

public class Person {

	// Defining instance variables
	private String name;
	private String address;
	private long phoneNumber;
	private String EmaiLAddress;

	// Defining required constructors for the Class
	public Person() {

	}

	// Default constructor for Person
	public Person(String name) {
		this.name = name;

	}

	// All getter defined here for all the private fields
	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getEmailAddress() {
		return this.EmaiLAddress;
	}

	// All setters for instance variable are here with basic checks
	public void setName(String name) {
		if (name.length() > 3) {
			this.name = name;

		}
	}

	public void setAddress(String address) {
		if (address.length() > 10) {
			this.address = address;

		}

	}

	public void setPhoneNumber(long phoneNumber) {
		if (phoneNumber - 9999999 > 0) {
			this.phoneNumber = phoneNumber;
		}
	}

	public void setEmailAddress(String emailAddress) {

		// Checking on email Address whether valid or not
		char last = emailAddress.charAt(emailAddress.length() - 1);
		char secondLast = emailAddress.charAt(emailAddress.length() - 2);
		char thirdLast = emailAddress.charAt(emailAddress.length() - 3);
		char fourthLast = emailAddress.charAt(emailAddress.length() - 4);

		if ((last == 'm') && (secondLast == 'o') && (thirdLast == 'c') && (fourthLast == '.')) {
			this.EmaiLAddress = emailAddress;
		}

	}

	// Overriding the toString method for Person Class
	public String toString() {
		Class className = (new Employee()).getClass();
		return (className + " and name of Person is " + this.getName());
	}

}
