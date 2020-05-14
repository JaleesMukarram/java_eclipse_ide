package Task1;

public class Physician extends Doctor {
	
	// It is an overridden method of doctor class
	public void treatPatient() {
		System.out.println("Treatment is given by: " + (this.getClass().getSimpleName()));

	}

}
