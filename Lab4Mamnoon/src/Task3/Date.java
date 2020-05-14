package Task3;

public class Date {
	int month;
	int day;
	int year;
	
	Date(int m,int d,int y){
		month = m;
		day = d;
		year = y;
	}
	void displayDate() {
		System.out.println("Date is: "+month+"/"+day+"/"+year);
	}

}
