
public class Person {

	// Instance variables here
	private String name;
	private long CNIC;
	private String emailAddress;
	private long contactNumber;

	// Person constructor with following parameters
	public Person(String name, long CNIC, String emailAddress, long contactNumber) {

		// Validating first with setter methods and then giving the variables properties
		this.setName(name);
		this.setCNIC(CNIC);
		this.setEmainAddress(emailAddress);
		this.setNumber(contactNumber);
	}

	// All public setters and getters are defined here
	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;
	}

	public void setCNIC(long CNIC) {
		this.CNIC = CNIC;
	}

	public long getCNIC() {
		return this.CNIC;
	}

	public void setEmainAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public long getContactNumber() {
		return this.contactNumber;
	}

	// toString method for Person description
	@Override
	public String toString() {
		return ("\nMy name is: " + this.getName() + " with CNIC: " + this.getCNIC() + "\nhaving emailAddress: "
				+ this.getEmailAddress() + " and my contact number is: " + this.getContactNumber());
	}

}
