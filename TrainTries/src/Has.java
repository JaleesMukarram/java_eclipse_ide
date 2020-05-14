import java.util.ArrayList;
import java.util.Date;

public class Has {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		// long millis=System.currentTimeMillis();

		ArrayList<Date> dateList = new ArrayList<>();
		ArrayList<Long> milliSeconds = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			for (int z = 0; z < 999999; z++) {

				for (int e = 0; e < 99999; e++) {

				}

			}
			
			
			long millis = System.currentTimeMillis();
			Date date = new Date(millis);
			dateList.add(date);
			milliSeconds.add(date.getTime());

		}

		for (long a : milliSeconds) {
			System.out.println(a);
		}
		
		

	}
}
