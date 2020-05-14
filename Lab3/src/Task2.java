
//importing Scanner class
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating Scanner object 
		Scanner input = new Scanner(System.in);
        
		//Asking for total rides
		System.out.print("Please input the number of records of rides you have taken: ");
		int rides = input.nextInt();
		
		//Creating array and variables required
		int[] kilemeters_array = new int[rides];
		int[] liters_array = new int[rides];
		double total_kilometers = 0;
		double total_liters = 0;
		double total_average;
		double sep_average;
		String ride_no = "";
		int km_temp, liter_temp;

		//Creating the loop for asking both the km drived and liters used 
		for (int index = 0; index < rides; index++) {
			
			//This will be usefull while asking input
			if (index == 0)
				ride_no = "st";
			else if(index == 1)
				ride_no = "nd";
			else if(index == 2)
				ride_no ="rd";
			else
				ride_no = "th";
						
			//Asking for kilometers in respective drive
			System.out.print("Please enter kilometers in " + (index + 1)+ride_no+ " ride: ");
			km_temp = input.nextInt();
			
			//Applying check on kilometers input
			while (km_temp <= 0) {
				System.out.println("Km cant be negative or zero");
				System.out.print("Please enter kilometers in " + (index + 1) +ride_no+ " ride: ");
				km_temp = input.nextInt();
			}
			
			//Adding km entered by user to the array 
			kilemeters_array[index] = km_temp;
			
			//Adding km to total kms
			total_kilometers += km_temp;

			//Asking for liters in respective drive
			System.out.print("Please enter liters in " + (index + 1) +ride_no+ " ride: ");
			liter_temp = input.nextInt();
			
			//Applying check on liters input
			while (liter_temp <= 0) {
				System.out.println("liters cant be negative or zero");
				System.out.print("Please enter liter in " + (index + 1) +ride_no+ " ride: ");
				liter_temp = input.nextInt();
			}
			// Adding to respective liter array
			liters_array[index] = liter_temp;
			
			// Adding to the total liters
			total_liters += liter_temp;

		}
		
		//Loop for calculating average of all trips seperated
		for (int i = 0; i < rides; i++) {
			
			//conditions for showing input correctly while asking
			if (i == 0)
				ride_no = "st";
			else if(i == 1)
				ride_no = "nd";
			else if(i == 2)
				ride_no ="rd";
			else
				ride_no = "th";
			
			//Average of every rode
			sep_average = (double) (kilemeters_array[i] / liters_array[i]);
            
			//printing average of every ride
			System.out.println("Average of " + (i + 1) +ride_no+ " ride is " + sep_average+" km per liter");
		}
		
		//Average of total rides calculating
		total_average = (total_kilometers/total_liters);
		
		//Prining average of total rides
		System.out.printf("Your total avaerage of %d rides is %2f  km per liter",rides,total_average);

	}

}
