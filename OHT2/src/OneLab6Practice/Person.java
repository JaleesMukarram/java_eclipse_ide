package OneLab6Practice;

public class Person {
	private String name;
	private String address;
	private String emailAddress;

	public Person() {

	}

	Person(String name, String address, String emailAddress) {
		this.setName(name);
		this.setAddress(emailAddress);
		this.setEmailAddress(emailAddress);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
