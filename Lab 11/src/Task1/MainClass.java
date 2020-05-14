package Task1;

public class MainClass {
	public static void main(String args[]) {

		// Surgeon object of Doctor reference
		Doctor obj1;
		obj1 = new Surgeon();
		obj1.displayIdentity();
		obj1.treatPatient();

		// Physician object of Doctor reference
		Doctor obj2;
		obj2 = new Physician();
		obj2.displayIdentity();
		obj2.treatPatient();

	}

}
