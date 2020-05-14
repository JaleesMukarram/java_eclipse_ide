package LongVideoCourseTutorials;

public class MethodAverage {
	public static void averageCalculate(int... numbers) {
		double total = 0;
		for (int num : numbers) {
			total += num;
			System.out.println(num);
		}
		System.out.println("Average of " + numbers.length + " subjects is " + total / numbers.length);

	}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Please enter the number of subjects: ");
		int number_of_subjects = sc.nextInt();

		int[] list = new int[number_of_subjects];
		for (int index = 0; index < number_of_subjects; index++) {
			System.out.print("Please enter marks of subject " + (index+1)+": ");
			list[index] = sc.nextInt();
		}

		MethodAverage.averageCalculate(list);

	}

}
