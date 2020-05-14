package ClassLecPractice;

import javax.swing.*;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account.introduce();

		Account member = new Account("Jalees Mukarram");
		System.out.print("Please input the amount of balance you want to deposit: ");
		double balance_for_deposit = sc.nextDouble();
		member.depositMoney(balance_for_deposit);
		System.out.printf("Your new balance is: %.2f", member.balanceInquiry());
		System.out.print("\nPlease input the amount of balance you want to withdraw: ");
		double money_for_withdraw = sc.nextDouble();
		member.withdrawMoney(money_for_withdraw);
		System.out.printf("Your new balance is: %.2f", member.balanceInquiry());

	}

}
