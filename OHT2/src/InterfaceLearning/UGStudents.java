package InterfaceLearning;

public interface UGStudents extends Student {
	String EducationLevel = "UG";

	public void GPAPlease();

	public static void showStudyLevel() {
		System.out.println("I am a UG Student");
	}

}
