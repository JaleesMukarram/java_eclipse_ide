package test;

public class randomWordlist {

	public static void main(String args[]) {

		int[] list = { 2, 1, 4, 7, 3 };
		merge(list,0,3,5);
//		mergeSort(list, 0, list.length);
//		for (int a : list) {
//			System.out.print(a + " ");
//		}
	}

	public static void reverseBubbleSort(int[] list) {

		for (int i = 0; i < list.length - 2; i++) {

			for (int j = list.length - 1; j > 0; j--) {

				int temp = list[j];

				if (list[j] > list[j - 1]) {

					list[j] = list[j - 1];
					list[j - 1] = temp;

				}
			}
		}
	}

	public static void bubbleSort(int[] list) {

		for (int i = list.length; i > 1; i--) {

			for (int j = 0; j < i - 1; j++) {

				int temp = list[j];
				if (list[j] > list[j + 1]) {

					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}

	public static void selectionSort(int[] list) {

		for (int i = list.length - 1; i > 0; i--) {

			int max_id = i;

			for (int j = i - 1; j >= 0; j--) {

				if (list[j] > list[max_id]) {

					max_id = j;
				}
			}

			int temp = list[i];
			list[i] = list[max_id];
			list[max_id] = temp;

		}
	}

	public static void reverseSelectionSort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {

//			System.out.println("Entering for i = "+i);

			int max_id = i;

			for (int j = list.length - 1; j != i; j--) {

//				System.out.println(list[j]+" , "+list[max_id]);

				if (list[j] > list[max_id]) {

					max_id = j;
				}
			}

			int temp = list[i];
			list[i] = list[max_id];
			list[max_id] = temp;

		}
	}

	public static void insertionSort(int[] list) {

		for (int i = 1, j; i < list.length; i++) {
			
			int temp = list[i];

			for (j = i; j > 0 && temp < list[j - 1]; j--) {

				list[j] = list[j - 1];
				
			}
			list[j] = temp;
		}

	}

	public static void reverseInsertionSort(int[] list) {

		for (int i = 1, j; i < list.length; i++) {
			int temp = list[i];

			for (j = i; j > 0 && temp > list[j - 1]; j--) {

				list[j] = list[j - 1];

			}

			list[j] = temp;
		}

	}

	public static void mergeSort(int[] list, int first, int last) {

		if (first < last) {

			System.out.println("Running");

			int mid = (first + last) / 2;
			mergeSort(list, first, mid);
			mergeSort(list, mid + 1, last);
			merge(list, first, mid, last);

		}

	}

	public static void merge(int[] list, int first, int mid, int last) {

		int temp[] = new int[last];

		int i = first;
		int j = mid + 1;
		int k = 0;

		while (i <= mid && j <= last) {

			if (list[i] < list[j]) {

				temp[k++] = list[i++];

			} else {

				temp[k++] = list[j++];
			}

		}

		while (i < mid) {
			temp[k++] = list[i++];
		}

		while (j < last) {
			temp[k++] = list[j++];
		}

		for (int l = 0; l < list.length; l++) {
			list[l] = temp[l];

		}

//		System.out.print("After: ");
//		for (int l = 0; l <list.length;l++) {
//			System.out.print(list[l]+" ");
//			
//		}
	}

}