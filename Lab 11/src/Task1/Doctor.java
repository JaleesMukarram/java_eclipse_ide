package Task1;

public abstract class Doctor {

	// DisplayIdentity method as required for every class
	public void displayIdentity() {
		System.out.println(this.getClass().getSimpleName());

	}

	// This is an abstract method and will be extended
	public abstract void treatPatient();

}
