package Task1;

public abstract class LivingThing {

	// Instance variables here
	private String name;

	// Constructor having name parameter
	public LivingThing(String name) {
		this.name = name;
	}

	// Public methods defined here
	public void breath() {
		System.out.println("Living things breath");

	}

	public void eat() {
		System.out.println("Living things eat");

	}

	// Abstrac method walk to be defined here
	public abstract void walk();

	// Public setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
