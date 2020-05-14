
public class HiringDate {

	// Instance variables for this class
	private int day;
	private int month;
	private int year;

	// constructor for initializing following properties
	public HiringDate(int day, int month, int year) {
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);

	}

	// All setters and getters are defined here
	public void setDay(int day) {
		this.day = ((day > 0 && day <= 31) ? day : 1);

	}

	public int getDay() {
		return this.day;
	}

	public void setMonth(int month) {
		this.month = ((month > 0 && month <= 12) ? month : 1);

	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = ((year > 2000 && year <= 2100) ? year : 2019);

	}

}
