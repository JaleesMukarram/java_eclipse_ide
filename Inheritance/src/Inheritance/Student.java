package Inheritance;

public class Student {
	public final String name;
	private int rollNo;
	private double GPA;
	private String section;

	Student(String name, int rollNo, double GPA, String section) {
		this.name = name;
		this.rollNo = rollNo;
		this.GPA = GPA;
		this.section = section;

	}

	public String getName() {
		return this.name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getGPA() {
		return GPA;
	}

	public String getSrction() {
		return this.section;
	}

	void GPA_Please() {
		if (GPA > 3) {
			System.out.printf("Alhamdulillah! My GPA is %f", GPA);

		} else if (GPA > 2) {
			System.out.printf("My GPA is %f", GPA);

		} else {
			System.out.println("I am not supposed to tell you this!!");
		}

	}

	public String introduce() {
		
		return String.format("My name is %S with roll no %d and reading in %S with a GPA of %f", name, rollNo, section,
				GPA);

	}

}
