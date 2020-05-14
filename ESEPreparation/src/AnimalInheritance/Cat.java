package AnimalInheritance;

public class Cat extends Animal{
	String catName;
	int CatID;
	static int x = 100;
	
	Cat(String ca){
		super("Cat");
		this.catName = ca;
		
	}
	
	public void AType() {
		System.out.println("Cat");
		
	}
	
	public static void CheckZooNumber() {
		System.out.println("Static zoo is Cat");
	}
	
	
	
	
	
	

}
