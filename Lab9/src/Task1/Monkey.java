package Task1;

public class Monkey extends LivingThing {

	// Here the constructor as we need it for the super implementation
	public Monkey(String name) {
		super(name);
	}

	// Abstract method is defined a body which is necassary
	public void walk() {
		System.out.println("Monkey is walking");
	}
}
