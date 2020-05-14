
public class Author {

	// instance variable here
	private String name;
	private String email;
	private char gender;

	public String setName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char gender) {

		//Checking on gender
		this.gender = (gender == 'm' || gender == 'f' ? gender : 'm');
	}

}
