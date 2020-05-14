package ConstructorChaining;

public class Student {
	String name;
	int rollNo;
	String cityInfo;
	static int noOfStudents;

//	Student() {
//		this("NoName");
//		System.out.println("Constructor with 0 arguments");
//
//	}
//
//	Student(String name) {
//		this(name, 0);
//		System.out.println("Constructor with 1 arguments");
//
//	}
//
//	Student(String name, int rollNo) {
//		this(name, rollNo, "EMPTY");
//		System.out.println("Constructor with 2 arguments");
//
//	}
//
//	Student(String name, int rollNo, String cityInfo) {
//		this.name = name;
//		this.rollNo = rollNo;
//		this.cityInfo = cityInfo;
//		System.out.println("Constructor wiFth 3 arguments");
//
//	}

	Student() {
		this("NoName", 0, "Empty");
		System.out.println("Constructor with 0 arguments");

	}

	Student(String name) {
		this(name, 0, "Empty");
		System.out.println("Constructor with 1 arguments");

	}

	Student(String name, int rollNo) {
		this(name, rollNo, "EMPTY");
		System.out.println("Constructor with 2 arguments");

	}

	Student(String name, int rollNo, String cityInfo) {
		this.name = name;
		this.rollNo = rollNo;
		this.cityInfo = cityInfo;
		System.out.println("Constructor with 3 arguments");
		Student.noOfStudents++;

	}

	void introduce() {
		System.out.println("my name is " + name + " roll no:" + this.rollNo + " living in:" + this.cityInfo);

	}

	Student duplicate() {
		Student copy = new Student(this.name, this.rollNo, this.cityInfo);
		return copy;

	}

	Student(Student obj) {
		this(obj.name, obj.rollNo, obj.cityInfo);

	}

}
