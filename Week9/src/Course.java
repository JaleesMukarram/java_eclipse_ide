
public class Course {

	// Instance variables
	private String name;
	private int numberOfStudents;
	private Student[] studentArray = new Student[5];

	// Constructor
	public Course(String name) {
		this.setName(name);
	}

	// Public setters and getters
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getNumberOfStudent() {
		return numberOfStudents;
	}

	// Public addStudents for adding student into the same course
	public void addStudent(String name) {

		// Boolean for checking if student of same name is already enrolled
		boolean studentExists = false;

		// This loop will loop up to the last index of active students
		for (int i = 0; i < numberOfStudents; i++) {

			// if student is found during the checking
			if (studentArray[i].name == name) {
				System.out.println("Student already exists");
				studentExists = true;
				break;

			}
		}
		if (!studentExists) {

			// If its a new student then it will be added
			studentArray[numberOfStudents] = new Student(name);
			numberOfStudents++;
		}
	}

	public void deleteStudent(String name) {
		System.out.println(numberOfStudents);

		// Looping through the present number of students
		for (int i = 0; i < numberOfStudents; i++) {

			// If the name of student is found at that index
			if (studentArray[i].name == name) {

				// Deleting that student number
				// System.out.println("Deleting student number: " + (i + 1));
				studentArray[i] = null;

				// Now looping starting from that index up to number of students
				for (int j = i; j <= numberOfStudents; j++) {

					// If we are at the end object then that object needs to be nulled
					if (j == (numberOfStudents - 1)) {
						studentArray[j] = null;
						break;
					} else {
						studentArray[j] = studentArray[j + 1];
					}
				}

				// decrementing the number of student by one
				numberOfStudents--;
				break;
			}
		}

	}

	// Checking student name through this method
	// the null will come as empty slot
	public void getStudentName() {

		// Looping through whole array
		for (int i = 0; i < studentArray.length; i++) {

			// If slot is empty then printing empty slot
			if (studentArray[i] == null) {
				System.out.println("Empty slot");

			}
			// If student exists then his nane will be displayed
			else
				System.out.println(studentArray[i].name);

		}

	}

	@Override
	public String toString() {
		return ("This is " + this.name + " Course having " + this.numberOfStudents + " number of enrolled students");
	}

}
