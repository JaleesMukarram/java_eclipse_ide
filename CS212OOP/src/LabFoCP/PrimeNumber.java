package LabFoCP;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number to check: ");

		int number = sc.nextInt();
		boolean not_prime = false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				System.out.println(number + " Divided by " + i);
				not_prime = true;
				break;
			}
		}
		if (not_prime)
			System.out.println("Not a prime number");
		else
			System.out.println("Its a prime number");
		
		sc.close();

	}

}
