package ClassLecPractice;

public class Waste {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 3, 9, 10 }, { 11, 12, 13 } };
		System.out.println("Default\n");
		outputarray(a);

		changerow(a, 1);
		System.out.println("\nChanged\n");
		outputarray(a);

	}

	public static void changerow(int[][] arr, int row_number) {
		int counter = 0;
		for (int index = 0; index < arr[row_number].length; index++) {
			arr[row_number][index] = counter;
			counter += 10;
		}

	}

	public static void outputarray(int arr[][]) {
		int total = 0;
		for (int rows = 0; rows < arr.length; rows++) {
			for (int column_entry = 0; column_entry < arr[rows].length; column_entry++) {
				System.out.print(arr[rows][column_entry] + " ");
				total += arr[rows][column_entry];
			}
			System.out.println();
		}
		System.out.println("total is " + total);
	}

}
