package Task1;

public class Human extends LivingThing {

	// Constructor as we need it for calling super
	public Human(String name) {
		super(name);
	}

	// Implementing the abstract method
	public void walk() {
		System.out.println("The person walks");
	}
}
