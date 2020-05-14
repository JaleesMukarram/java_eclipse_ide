package FileHandeling;

import java.io.*;
import java.util.*;

public class May14 {

	public static void main(String[] args) {

		File f1 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");
		File f2 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC", "ABC.txt");
		System.out.println(f2.getPath());

		// File f3 = new File(f2,"");
		FileReader fr = null;
		BufferedReader bfr = null;
		Formatter f = null;
		Scanner sc = null;
		try {
		

	

		} catch (Exception ex) {
			System.err.println(ex);

		} finally {
		}

	}

	public static void WriteUsingBuffer() {
		FileWriter fr = null;
		BufferedWriter bfr = null;

		try {
			fr = new FileWriter("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");
			bfr = new BufferedWriter(fr);

			bfr.write("Jalees Mukarram NUST H12\nAge:12\n");
			bfr.write("Hassaan Ali NUST H12\nAge:15");
			System.out.println("Written Sucessfully");
//			bfr.flush();
//			fr.flush();

		} catch (IOException ex) {

			System.err.println(ex + " First");

		} catch (Exception ex) {

			System.err.println(ex + " Second");

		}

		finally {
			try {
				if (!(bfr == null)) {

					bfr.close();
					System.out.println("Buffered Reader Closed");
				}
				if (!(fr == null)) {

					fr.close();
					System.out.println("File Writer Closed");

				}

			} catch (Exception ex) {

				System.err.println("Already closed");

			}

		}

	}

	public static void ReadUsingBuffer() {
		FileReader fr = null;
		BufferedReader bfr = null;

		try {

			fr = new FileReader("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");
			bfr = new BufferedReader(fr);

			int x = 0;
			String data;

			while ((data = bfr.readLine()) != null) {
				System.out.print(data);

			}

		} catch (Exception ex) {
			System.err.println(ex + "Error while writing");
		}

		finally {
			try {
				if (!(bfr == null)) {

					bfr.close();
					System.out.println("Buffered Reader Closed");
				}
				if (!(fr == null)) {

					fr.close();
					System.out.println("File Writer Closed");

				}

			} catch (Exception ex) {

				System.err.println("Already closed");

			}

		}

	}

	public static void FindData() {

	}
}
