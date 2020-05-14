import java.util.Scanner;

public class BillTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double unit_price;

		System.out.print("Please inter your units: ");
		double units = sc.nextDouble();

		if (units <= 100) {
			System.out.println("Charging Rs 4/Unit");
			unit_price = 4;
		}

		else if (units > 100 && units <= 300) {
			System.out.println("Charging Rs 4.50/Unit");
			unit_price = 4.5;

		} else if (units > 300 && units <= 500) {
			System.out.println("Charging Rs 4.75/Unit");
			unit_price = 4.75;
		} else {
			System.out.println("Charging Rs 5/Unit");
			unit_price = 5.0;
		}
		double bill = (units * unit_price);
		double all_tax = ((double) 30 / 100) * bill;

		System.out.println("TOTAL tax of " + all_tax + " has been deducted");
		bill += all_tax;
		System.out.println("Your total bill is: " + bill + " Rs");

	}

}
