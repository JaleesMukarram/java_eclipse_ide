package AnimalInheritance;

public class Animal {
	String animalCatagory;
	static int numberOfAnimals;
	private String AnimalPrivate;

	public Animal(String an) {
		this.animalCatagory = an;
		System.out.println();

	}

	public void AType() {

		System.out.println("Animal");

	}

	public static void CheckZooNumber() {
		System.out.println("Static zoo is WWE");
	}

	private void Private() {
		System.out.println("Animal private method");
		
	}
	
	private int Pr() {
		return 12;
	}
	
	public static void main(String[] args) {
		Animal animal = new Animal("Animal");
		Animal cat  = new Cat("MyCat");
		Animal RCat = new RussianCat("MyNewCat","Ali");
		Cat x = new Cat("MycATA");
		
		System.out.println();
		
		
		
		
		
		
	
		
	}
	
	

}
