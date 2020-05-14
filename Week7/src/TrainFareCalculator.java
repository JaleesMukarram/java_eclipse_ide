
public class TrainFareCalculator {
	public static void main(String[] args) {

		// Array of all the cities
		String[] cityArray = { "Islamabad", "Rawalpindi", "Jhang", "Multan", "Bahawalpur" };

		// Array of selected route starting and ending point
		String[] route = { "Islamabad", "Bahwalpur" };

		// Array which can accommodation all the cities from start up to end
		String[] path = new String[cityArray.length];

		// indexer used for indexing into the path array
		int indexer = 0;

		// this loop will add all the starting including and final city of the route
		for (String city : cityArray) {

			if (city == route[0]) {
				path[indexer] = city;
				indexer++;
				continue;
			}
			if (indexer != 0) {
				path[indexer] = city;
				indexer++;
				if (city == route[1]) {
					break;
				}

			}

		}

		// Just for demonstration purpose to print all the cities included
		for (String a : path) {
			if (a != null)
				System.out.println(a);
		}

		// This integer value will show us that at which index in
		// path array the final city is
		int finalAt = 0;

		// This loop will give the value to final_int
		for (int i = 0; i < path.length; i++) {

			if (path[i] == null) {
				finalAt = (i - 1);
				break;
			} else if (i == path.length - 1) {
				finalAt = (path.length - 1);

			}

		}

//String[] cityArray = { "Islamabad", "Rawalpindi", "Jhang", "Multan", "Bahawalpur" };

		// Isb to Pindi == 100
		// Pindi to jhang == 700
		// Jhang to Multan == 300
		// Multan to BWP == 200

		int rokra = 0;
		int[] fare = { 100, 700, 300, 200 };
		int path_indexer = 0;

		// Loop for calculating fare
		for (int i = 0; i < cityArray.length; i++) {

			// This will find the first city in the list of path
			if (cityArray[i].equals(path[0])) {
				System.out.println("Starting from " + path[path_indexer]);
				rokra += fare[i];
				path_indexer++;
				continue;
			}

			// this will add the including fares
			if (rokra != 0) {

				if (cityArray[i] != path[finalAt]) {
					System.out.println("Found a stop");
					rokra += fare[i];
					path_indexer++;

				} else {
					break;
				}

			}

		}
		System.out.println("Your total fare is: " + rokra);

	}

}
