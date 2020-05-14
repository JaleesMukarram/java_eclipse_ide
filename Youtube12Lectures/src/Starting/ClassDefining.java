package Starting;

public class ClassDefining {
	public String name = "Nonamae";
	public int roll_no = 00;
	public int merit_position = 00000;;
	public String class_name = "Default Class";
	public double CGPA = 0.0 ;
	public boolean repeat_starts = false;

	
	public void introduce() {
		System.out.println("My name is :"+name);
		System.out.println("My roll no is :"+roll_no);
		System.out.println("My merit position is :"+merit_position);
		System.out.println("My class name is :"+class_name);
		System.out.println("My CGPA is :"+CGPA);

	}
	public boolean has_stars() {
		return repeat_starts;
	}
	
	



	

}
