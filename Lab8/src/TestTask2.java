
public class TestTask2 {

	public static void main(String[] args) {
		// Creating person object person1
		Person person1 = new Person("Jalees Mukarram", 3120423433489L, "jaleesdon786@gmail.com", +923473413877L);
		System.out.println(person1.toString());

		// Creating student object student1
		Student student1 = new Student("Hassaan Ali Mehmood", 21933894658L, "hassaanAwara@wehla.com", +923082130128L,
				"BESE-9A", 243443);

		System.out.println(student1.toString());

		// Creating faculty object faculty1
		Faculty faculty1 = new Faculty("Mamnoon", 3192122123912L, "Mamnoon@musi.com", 923343828328L, +92323123212L,
				"OOP teacher", 200000, "22 hrs per week", 11, 3, 2017);

		System.out.println(faculty1.toString());

	}

}
