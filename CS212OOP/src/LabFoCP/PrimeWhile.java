package LabFoCP;

import java.util.Scanner;

public class PrimeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		boolean found_prime = false;
		while (!found_prime) {
			System.out.print("Enter number to check: ");
			int number = sc.nextInt();

			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					found_prime = false;
					System.out.println("No this is not a prime number:(");
					break;

				} else {
					found_prime = true;
					System.out.println("Yes this is a prime number:(");
					break;
				}
			}
		}

	}

}
