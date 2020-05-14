
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		int x;
		x = 1; 		// initialize x to 1 for counting
		sum = 0; 	// initialize sum to 0 for totaling
			
		System.out.printf( "Going to calculate the sum\n" );
			
		while ( x <= 10 ) // while x is less than or equal to 10
		{
			sum += x; // add x to sum
			x++;
		} // end while
			
		System.out.printf( "The sum is: %d\n", sum );


	}

}
