package LabFoCP;

import java.util.Scanner;

public class One {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number of input: ");

		int iteration = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < iteration; i++) {
			System.out.print("Please enter the number "+(i+1)+": ");
			double num = sc.nextDouble();
			sum += num;
		}
		System.out.println("Total sum is "+sum);
		sc.close();
		

	}

}
