
public class JobDescription {

	// instance variables defined here
	private String designation;
	private double salary;
	private String teachingLoad;

	// constructor for this class with proper parameters
	public JobDescription(String designation, double salary, String teachingLoad) {
		this.setDesisgnation(designation);
		this.setSalary(salary);
		this.setTeachingLoad(teachingLoad);
	}

	// Public setters and getters for this class
	public void setDesisgnation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setSalary(double salary) {
		this.salary = (salary > 0 ? salary : 0);
	}

	public double getSalary() {
		return this.salary;
	}

	public void setTeachingLoad(String teachingLoad) {
		this.teachingLoad = teachingLoad;
	}

	public String getTeachingLoad() {
		return this.teachingLoad;
	}

}
