package Task;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		// creating stduent array
		Student[] studentArray = new Student[7];

		// Creating random object for randomly assigning marks
		Random rn = new Random();

		// initializing marks and average
		int sum = 0;
		double average;

		// using for loop for creating 7 student objects
		// having different id and marks randomly assigned
		for (int i = 0; i < studentArray.length; i++) {
			studentArray[i] = new Student((i + 1), 50 + rn.nextInt(50));
		}

		// getting all the marks of 7 students
		for (Student i : studentArray) {
			System.out.println("Marks of student" + i.getStudent_id() + " are: " + i.getMarks());
			sum += i.getMarks();
		}
		// Finally calculating average of all the students
		System.out.println("Calculating average");
		average = (double) sum / studentArray.length;
		System.out.println("Average of " + studentArray.length + " students is " + average);

	}

}
