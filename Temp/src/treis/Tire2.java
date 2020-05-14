package treis;

import java.util.Random;

public class Tire2 {

	public static void main(String[] args) {

		Random random = new Random();

		char[] c = new char[10];

		int start = 65;

		for (int i = 0; i < c.length; i++) {

			start = i % 2 == 0 ? 65 : 97;

			c[i] = (char) (start + random.nextInt(25));

		}

		String s = new String(c);
		System.out.println(s);

	}

}
