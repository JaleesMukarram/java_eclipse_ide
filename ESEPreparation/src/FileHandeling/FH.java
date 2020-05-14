package FileHandeling;

import java.io.File;
import java.io.*;

public class FH {

	public static void main(String[] args) {

		File f1 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");

		try {
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student s = new Student("Jalees","BESE-9A");
			oos.writeObject(s);
			
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student sz = (Student) ois.readObject();
			
			System.out.println(sz.className);

		} catch (Exception ex) {

		}

	}

}
