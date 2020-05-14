package SecondDay;

import java.util.Random;

public class Array {

	public static void main(String[] args) {
		Random rn = new Random();

		int[] survey = new int[10];

		for (int i = 0; i < 40; i++) {
			++survey[rn.nextInt(9)];
		}

		int number = 1;

		System.out.println("Number  Frequency");
		for (int value : survey) {
			System.out.printf("%2d%10d%n", number, value);
			number++;

		}

	}
}
