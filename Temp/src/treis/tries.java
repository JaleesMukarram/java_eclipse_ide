package treis;

import java.util.Date;
import java.util.Random;

public class tries {

	static double[] array1 = new double[] { 0, 0.5, 1, 1.5, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8 };

	static int[] array2 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {

		Random random = new Random();

		boolean go = true;
		int counter = 0;

		while (go) {

			int a = array2[random.nextInt(9)];
			int b = 8 - a;
			int c = 13 - a;
			int d = 8 - b;

			if (a < 0 || b < 0 || c < 0 || d < 0) {

				continue;
			}

			if (equation(a, b, c, d)) {

				go = true;

			} else {

				go = false;

			}

		}

		System.out.println("Found");

	}

	public static boolean equation(int a, int b, int c, int d) {

		if (((a + b) == 8) && ((c - d) == 6) && ((a + c) == 13) && ((b + d) == 8)) {

			System.out.println("Found");
			System.out.println("a: " + a + "\nb: " + b + "\nc: " + c + "\nd  " + d);

			return false;

		} else {

			return true;
		}

	}

}
