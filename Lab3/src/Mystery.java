
public class Mystery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y;
		int x = 1;
		int total = 0;

		while (x <= 10) {
			y = x * x;
			System.out.println(y);
			total += y;
			++x;
		} // end while

		System.out.printf("Total is %d\n", total);

	}

}
