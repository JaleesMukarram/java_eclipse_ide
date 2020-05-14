package xyz;

import java.util.Scanner;

public class Patient {
	int t;

	public void centigrade() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temp in: ");
		int t = sc.nextInt();
		System.out.println("t is: " + t);
		double T = ((double) 5 / 9 * (t - 32));
		System.out.println("Your body temperature is: " + T);
	}

	public void farenhite() {

		double T = (double) (9 / 5 * t - 32);
		System.out.println("Your body temperature is: " + T);

	}

}
