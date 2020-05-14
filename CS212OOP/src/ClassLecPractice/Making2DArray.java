package ClassLecPractice;

import java.util.Scanner;

public class Making2DArray {
	static Scanner sc;
	static int students_global;
	static int subjects_global;
	static int[][] student_data;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		System.out.print("Please enter the number of Students in class: ");
		int number_of_students = sc.nextInt();
		while (number_of_students < 0 || number_of_students > 10) {
			System.out.println("Students between 1 and 10 only");
			System.out.print("Please enter the number of Students in class: ");
			number_of_students = sc.nextInt();
		}

		students_global = number_of_students;

		System.out.println();
		System.out.print("Plese enter number of subject: ");
		int number_of_subjects = sc.nextInt();

		while (number_of_subjects < 0 || number_of_subjects > 10) {
			System.out.println("Subjects between 1 and 10");
			System.out.println();
			System.out.print("Plese enter number of subject: ");
			number_of_subjects = sc.nextInt();
		}

		subjects_global = number_of_subjects;

		student_data = new int[number_of_students][number_of_subjects + 1];

		for (int student_index = 0; student_index < student_data.length; student_index++) {
			for (int subject_index = 0; subject_index < number_of_subjects; subject_index++) {
				System.out.print("Please enter student " + (student_index + 1) + " marks in subject "
						+ (subject_index + 1) + " : ");

				student_data[student_index][subject_index] = sc.nextInt();
				while (student_data[student_index][subject_index] < 0
						|| student_data[student_index][subject_index] > 100) {
					System.out.println("Please enter marks between 0 and 100");
					System.out.println();
					System.out.print("Please enter student " + (student_index + 1) + " marks in subject "
							+ (subject_index + 1) + " : ");

					student_data[student_index][subject_index] = sc.nextInt();
				}

			}

			summarks(student_index);
			System.out.println();

		}

	}

	public static void summarks(int student_number_temp) {
		int sum = 0;
		for (int subject_index = 0; subject_index < student_data[student_number_temp].length; subject_index++) {
			sum += student_data[student_number_temp][subject_index];
		}
		student_data[student_number_temp][subjects_global] = sum;

	}

}
