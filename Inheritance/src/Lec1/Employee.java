package Lec1;

public class Employee extends Person {
	String company;
	double pay;
	String name;

	Employee() {
		this("noname", "XYZ", 00000, "Default", 0000, "noName2");
	}

	Employee(String name, String address, long cellNo, String company, double pay, String name2) {
		super(name, address, cellNo);
		this.company = company;
		this.pay = pay;
		this.name = name2;
		System.out.println("Name given in Employee class is " + this.name + "\n");

	}

	@Override
	void display() {
		System.out.println("displaying info fot the Employee");
		super.display();
		System.out.println("I am working in " + this.company + " company");
		System.out.println("I am getting pay of RS " + this.pay);
		System.out.println("Your full Employee name is " + this.name);

	}

	@Override
	void displayName() {

		System.out.println("Going to previous class");
		super.displayName();
		System.out.println("Coming back to this class");
		System.out.println("Name invoked from Employee class is " + this.name);
		System.out.println("Name invoked from Employee class of Person class is " + super.name);
	}
	
	void zz() {
		super.checking();
		
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("Jalees", "RYK", 3413877, "NUST", 200321.22, "Jalees Mukarram");
		Employee emp2 = new Employee();
		emp1.display();
		emp1.zz();

	}

}
