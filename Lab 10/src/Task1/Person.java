package Task1;

public class Person implements PersonInterface, AnotherPersonInterface {
	int cashSaving;
	int retirementFund;
	String firstName;
	String lastNane;

	public Person(int cashSaving, int retirementFund, String firstName, String lastNane) {
		super();
		this.cashSaving = cashSaving;
		this.retirementFund = retirementFund;
		this.firstName = firstName;
		this.lastNane = lastNane;
	}

	public int computeTotalWealth() {
		return this.cashSaving + this.retirementFund;

	}

	public String getName() {
		return this.firstName + this.lastNane;
	}

	public int measureInteligent(String intelligence) {
		return 100;
	}

}
