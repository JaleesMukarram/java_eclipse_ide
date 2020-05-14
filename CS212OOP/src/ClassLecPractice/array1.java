package ClassLecPractice;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int temp_value;

		int[] arr = new int[6];
		int total = 0;
		for (int i = 0; i < 20; i++) {
			System.out.print("Please enter your review: ");
			int temp_value = sc.nextInt();
			while (temp_value > 5 || temp_value < 0) {
				System.out.println("Error!! Please enter rating between 0 and 5");
				System.out.print("Please enter your review: ");
				temp_value = sc.nextInt();
			}
			arr[temp_value] += 1;
			total += temp_value;

		}
		System.out.println("0 are: " + arr[0]);
		System.out.println("1 are: " + arr[1]);
		System.out.println("2 are: " + arr[2]);
		System.out.println("3 are: " + arr[3]);
		System.out.println("4 are: " + arr[4]);
		System.out.println("5 are: " + arr[5]);
		System.out.println("\n\n");

		System.out.println("Average is "+(double) (total/20));

	}

}
