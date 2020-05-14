package ClassLecPractice;

import java.util.Random;

public class Account {
	private String name;
	private double money;
	public static String class_info ="This is the class of bank Employees"; 
	public static void introduce() {
		System.out.println("This is the class of bank Employees");
	}

	public Account(String name) {
		setName(name);
	}

	public void setName(String name_tmep) {
		this.name = name_tmep;
	}

	public String getName() {
		return name;

	}

	public void depositMoney(double money) {
		if (money > 0.0) {
			this.money += money;
			System.out.println("Transition successfull");
		} else {
			System.out.println("Transition failed");
		}
	}

	public void withdrawMoney(double money) {
		if (money <= this.money) {
			this.money -= money;
			System.out.println("Transition successfull");
		} else {
			System.out.println("Transition failed");
		}
	}

	public double balanceInquiry() {
		return this.money;
	}

}
