package Task;

public class TestSavingsAccount {

	public static void main(String[] args) {
		// Creating two saver accounts
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();

		// Setting balance for both the savers
		saver1.setSavingBalance(32000.00);
		saver2.setSavingBalance(45000.00);

		// Initializing the annual interest rate to 5%
		SavingsAccount.annualInterestRate = 5;

		// printing the value of saving balance for both the account
		System.out.println("Saved balance of saver1 initially is: " + saver1.getSavingBalance());
		System.out.println("Saved balance of saver2 initially is: " + saver2.getSavingBalance());

		for (int i = 0; i < 12; i++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();

		}

		// printing the value of saving balance for both the account
		System.out.println("Balance after 12 months:\n");
		System.out.println("Saved balance of saver1 @5% interest is: " + saver1.getSavingBalance());
		System.out.println("Saved balance of saver2 @5% interest is: " + saver2.getSavingBalance());

		// increasing interest rate to 7 percent
		SavingsAccount.annualInterestRate = 7;

		// adding interest for 1 month
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("Balance after 1 months:\n");
		System.out.println("Saved balance of saver1 @7% interest is: " + saver1.getSavingBalance());
		System.out.println("Saved balance of saver2 @7% interest is: " + saver2.getSavingBalance());

	}

}
