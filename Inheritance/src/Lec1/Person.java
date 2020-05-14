package Lec1;

public class Person {

	protected String name;
	protected String address;
	long cellNo;

	Person() {
		this("noName", "XYZ", 0000);
	}

	Person(String name, String address, long cellNo) {
		this.name = name;
		System.out.println("Name given in Person class as " + this.name);
		this.address = address;
		this.cellNo = cellNo;

	}

	void display() {
		System.out.println("your name is " + this.name);
		System.out.println("Your Address is " + this.address);
		System.out.println("Your CellNo is: " + this.cellNo);
	}

	void displayName() {
		System.out.println("Name invoked from person class in person class is " + this.name);
	}
	void checking() {
		System.out.println("Checking done");
	}

}
