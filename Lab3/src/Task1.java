
import java.util.Scanner; 

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing some value
		double BMI,Weight,Height;
		Scanner input = new Scanner(System.in);
		
		//Asking from user
		System.out.print("Please enter your Weight(in Kg): ");
		Weight = input.nextDouble();
		
		//Checking conditions
		while (Weight<=0 || Weight >=200) {
			System.out.println("Error! Please enter correct weight");
			System.out.print("Please enter your Weight(in Kg): ");
			Weight = input.nextDouble();
		}
		
		//Asking for height
		System.out.print("Please enter your Height(in meters): ");
		Height = input.nextDouble();
		
		
		//Checks on height
		while (Height<=0 || Height >=10) {
			System.out.println("Error! Please enter correct Height");
			System.out.print("Please enter your Height(in meters): ");
			Height = input.nextDouble();
		}
		
		//Calculating BMI
		BMI = (Weight/(Height*Height));
		
		//Closing object
		input.close();
		
		//Prining BMI
		System.out.println("Your BMI is "+BMI);
		
		//Chechking value according to condition
		String status = "";
		if (BMI<18.5) 
			status = "Underweight";
		if (BMI>=18.5 && BMI<24.9) 
			status = "Normal";
		if (BMI<25 && BMI>29.9) 
			status = "Overweight";
		if (BMI>30) 
			status = "Obese";
		
		//Prining Status
		System.out.printf("You are %s",status);
		
		
		

	}

}
