import java.util.Random;

public class Checking123 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 5, 7, 8, 4 };

		for (int i = 0; i < array.length - 1; i++) {
			int temp = array[i + 1];

			if (i == 0) {
				continue;

			} else {

				if (temp > array[i]) {
					System.out.println("Breaken as: " + temp + " is grater than " + array[i]);
					continue;

				} else {

					System.out.println("Going down as: " + temp + " is less than " + array[i]);

					for (int j = i - 1; j >= 0; j--) {
						if (temp > array[j]) {
							int saved = array[j + 1];
//	                        array[j+1] = temp;
//	                        array[j+2] = saved;
							int internalNext;

							for (int k = j + 1; k < array.length - 1; j++) {
								if (k == j + 1) {
									array[k] = temp;
								} else {
									internalNext = array[k + 1];
									if (k == j + 2) {
										array[k + 1] = saved;
									} else {
										array[k + 1] = array[k];

									}

								}
							}

						}

					}
				}
			}

		}

		for (int a : array) {
			System.out.println(a);

		}
	}

}
