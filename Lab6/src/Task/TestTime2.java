package Task;

public class TestTime2 {

	public static void main(String[] args) {

		// Creating 3 Time2 class objects using all constructors
		Time2 obj1 = new Time2(23, 58, 59);
		Time2 obj2 = new Time2(21, 34);
		Time2 obj3 = new Time2(4);

		// Adding to array for proper demonstration purposes
		Time2[] array = { obj1, obj2, obj3 };

		// Looping through all created objects to minimize the amount of code
		for (Time2 time : array) {

			// this will print default value of time given by user
			System.out.printf("Object origional time is:%s\n", time.toString());

			// this tick() method will update one second of time
			time.tick();

			// This will print the time after incrementing one second
			System.out.printf("Now its updated seconds are  %s\n", time.toString());

			// This will increment the minute after incrementing second
			time.incrementMinute();

			// This will print the time after incrementing one minute
			System.out.printf("Now its updated minutes are  %s\n", time.toString());

			// This will increment the hour after incrementing minute
			time.incrementHour();

			// This will print the time after incrementing one hour
			System.out.printf("Now its updated hours are  %s\n\n", time.toString());

		}

	}

}
