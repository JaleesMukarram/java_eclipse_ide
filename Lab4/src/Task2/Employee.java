package Task2;

public class Employee {
	public String first_name;
	public String second_name;
	public double salary;
	
	Employee(String f_name,String s_name,double sal){
		first_name = f_name;
		second_name = s_name;
		if (sal<0)
			salary = 0;
		else
		salary = sal;	
		
	}

}
