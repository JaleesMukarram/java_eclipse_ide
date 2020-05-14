package Task;

public class SavingsAccount {
	private double savingsBalance;
	static double annualInterestRate;

	public void setSavingBalance(double b) {
		if (b >= 0)
			savingsBalance = b;
	}

	public double getSavingBalance() {
		return savingsBalance;

	}

	public double calculateMonthlyInterest() {

		double monthlyInterest = ((annualInterestRate / 100) * savingsBalance) / 12;
		savingsBalance += monthlyInterest;
		return monthlyInterest;

	}

	public void modifyInterestRate(double rate) {
		if (rate >= 0)
			annualInterestRate = rate;

	}

}
