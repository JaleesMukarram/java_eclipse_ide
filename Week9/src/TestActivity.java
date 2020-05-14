
public class TestActivity {
	public static void main(String[] args) {
		Course OOP = new Course("Object Oriented Programming");
		OOP.addStudent("Jalees");
		OOP.addStudent("Mamnoon");
		OOP.addStudent("Hassaan");
		OOP.addStudent("Ali Hasnat");
		OOP.addStudent("Idrees");
		OOP.getStudentName();
		OOP.deleteStudent("Mamnoon");
		OOP.getStudentName();

	}

}
