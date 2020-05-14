package SecondDay;

public class EnhancedFir {
	public static void main(String[] main) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8 } };
		for (int[] temp : array) {
			System.out.println(temp);
		}
		for (int index =0; index<array.length;index++) {
			for (int aq: array[index]) {
				System.out.println(aq);
			}
		}

	}
}