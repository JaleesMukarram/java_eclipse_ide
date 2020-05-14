
//Class declaration
public class Assignment2 {

	public static void main(String args[]) {

		// Initializing the array of boolean objects
		boolean[] array = new boolean[1000];

		// setting all the value to true as required in the algorithm
		for (int index = 0; index < array.length; index++) {
			array[index] = true;
		}

		// looping starting through 2 where all the elements are true
		for (int index = 2; index < array.length - 1; index++) {

			// if it will be true then looping for indexing starts here
			if (array[index] == true) {

				// if true then looping from that index element start
				for (int j = index; j < array.length; j += index) {

					// skipping the same index which is true and will be used for multiple indexing
					if (j == index) {
						continue;
					}

					// Setting all the multiples to false
					array[j] = false;
				}
			}
		}

		// Here for printing all the prime numbers
		for (int i = 2; i < array.length; i++) {

			// Checking if the array index is prime
			if (array[i] == true)

				// The prime number will be printed from 2 to 999
				System.out.println(i + " is prime number");
		}
	}
}