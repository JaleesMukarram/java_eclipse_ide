package Activity;

//This class tests the Time Class by creating different objects. 
public class TimeTest {
	public static void main(String[] args) {
		Time t0 = new Time(); // Set Time to 00:00:00
		Time t1 = new Time(11); // Set Time to 11:00:00
		Time t2 = new Time(12, 40);// Set Time to 12:40:00
		Time t3 = new Time(23, 40, 55); // Set Time to 23:40:55
		Time t4 = new Time(23, 40, 65); // Set Time to 23:40:65

//Print All Times in Universal Format 
		System.out.println(t0.toUniversalString());
		System.out.println(t1.toUniversalString());
		System.out.println(t2.toUniversalString());
		System.out.println(t3.toUniversalString());

//Print All Times in Standard Format
		System.out.println(t0);// toString method invoked on objects implicitly
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
	}
}
