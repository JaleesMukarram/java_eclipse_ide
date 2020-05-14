package Task;

public class Student {

	private int student_id;
	private int marks;

	public Student(int student_id, int marks) {
		this.student_id = student_id;
		this.marks = marks;

	}

	public void setMarks(int marks) {

		this.marks = 0;
		if (marks >= 0)
			this.marks = marks;
	}

	public int getMarks() {
		return this.marks;
	}

	public int getStudent_id() {
		return this.student_id;
	}

}
