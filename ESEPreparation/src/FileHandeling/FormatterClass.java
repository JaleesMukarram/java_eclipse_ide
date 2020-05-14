package FileHandeling;

import java.io.*;
import java.util.Scanner;

public class FormatterClass {

	public static void main(String[] args) {
		AddStudent();
		TakeStudent();
		

//		File f = new File("C:\\\\Users\\\\Jalees DON\\\\Desktop\\\\ABC\\\\Scanner.txt");
//		try {
//			Scanner sc = new Scanner(f);
//			String name = sc.next();
//			String b = sc.next();
//
//			System.out.println(name + " " + b);
//		} catch (Exception ex) {
//			System.err.println(ex);
//		}

	}

	public static void TakeStudent() {

		FileInputStream fos = null;
		ObjectInputStream ous = null;

		try {
			fos = new FileInputStream("C:\\Users\\Jalees DON\\Desktop\\ABC\\File3.txt");
			ous = new ObjectInputStream(fos);
			
			Student t = (Student) ous.readObject();

			System.out.println(t.className);
		
//			Student j = (Student) ous.readObject();
//			Student k = (Student) ous.readObject();
//
//			System.out.println(j.name + " " + j.className);
//			System.out.println(k.name + " " + k.className);

		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}

	public static void AddStudent() {

		FileOutputStream fos = null;
		ObjectOutputStream ous = null;

		try {
			fos = new FileOutputStream("C:\\Users\\Jalees DON\\Desktop\\ABC\\File3.txt");
			ous = new ObjectOutputStream(fos);

			Student s1 = new Student("Jalees Mukarram", "BESE-9A");
//			Student s2 = new Student("Hassaan Ali Mehmood", "BESE-9A");
//			Teacher t1 = new Teacher("NUST_Teacher");
//
			ous.writeObject(s1);
//			ous.writeObject(s2);
//			ous.writeObject(t1);

		} catch (Exception ex) {
			ex.printStackTrace();
			;
		}

	}

}
