package LabFoCP;

import java.util.Scanner;
import java.lang.Math;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number for factorial: ");
		int number = sc.nextInt();
		boolean is_negative = false;

		if (number < 0) {
			is_negative = true;
			number = Math.abs(number);
		}

		int factorial = 1;

		for (int i = number; i > 0; i--) {
			factorial *= i;
		}
		if (is_negative)
			System.out.print("Factorial of " + (number - 2 * number) + " is " + factorial);
		else
			System.out.print("Factorial of " + number + " is " + factorial);

		sc.close();
	}
}
