package xyz;

import java.util.Scanner;

public class testclass {
	public static void main(String[] args) {
		Patient Hassaan = new Patient();

		Scanner sc = new Scanner(System.in);
		System.out.print("Gender plz: ");
		String gender = sc.nextLine();

		if (gender.equals("male")) {
			Hassaan.centigrade();
		} else if (gender.equals("female")) {
			Hassaan.farenhite();
		}
	}

}
