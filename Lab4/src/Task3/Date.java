package Task3;

public class Date {
	public int month;
	public int day;
	public int year;

	Date(int m,int d,int y){
		month = m;
		day = d;
		year = y;

	}
	public void displayDate() {
		System.out.println("Date is: "+month+"/"+day+"/"+year);
	}
}
