package LabFoCP;

import java.util.Scanner;

public class SquareCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input number of digits: ");
		int lines = sc.nextInt();
		System.out.printf("%8s %8s %8s \n", "Number", "Square", "Cube");
		for (int index = 0; index <= lines; index++) {
			System.out.printf("%8d %8d %8d\n", (index), (index * index), (index * index * index));

		}

	}

}
