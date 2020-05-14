package Inheritance;

public class Alumni extends Student {

	public double pay;
	private String jobCompany;

	Alumni(String name, int rollNo, double GPA, String section, double pay, String jobCompany) {

		super(name, rollNo, GPA, section);

		this.pay = pay;
		this.jobCompany = jobCompany;

	}
	
	public double getPay(){
		return this.pay;
	}
	
	public String getJobCompany() {
		return this.jobCompany;
	}
	
	@Override
	public String introduce() {
		return String.format("My name is %S and I am an Alumni\nI had a CGPA of %f\nNow I am working in %s with current pay @%fRS.",getName(),getGPA(),getJobCompany(),getPay());
	}

}
