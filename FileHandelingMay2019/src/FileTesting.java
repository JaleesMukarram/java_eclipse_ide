import java.io.*;
import java.util.Formatter;
import java.util.Scanner;


public class FileTesting {

	public static void main(String[] args) throws Exception{
		
		Formatter f = new Formatter("C:\\\\Users\\\\Jalees DON\\\\Desktop\\\\New folder (3)\\\\File.txt");
		f.format("%10d Jalees", 22);
		f.close();
		
		if (1==1) {
			throw new IOException();
		}
		
		
		
		
//		File file = new File("C:\\Users\\Jalees DON\\Desktop\\New folder (3)\\File.txt");
//
//		FileReader fr = null;
//		try {
//			
//			fr = new FileReader("ewds");
//			char[] d = new char[50];
//			fr.read(d);
//
//		}
//
//		catch (IOException e) {
//			System.out.println("File");
//			// TODO Auto-generated catch block
//			// e.printStackTrace();
//		}
				
		
//
//		} catch (ArithmeticException ez) {
//			ez.printStackTrace();
//
//		} catch (Exception ex) {
//
//		}

//		try {
//			FileWriter f = new FileWriter(file);
//			char [] c = {'d','e'};
//			
//			f.write(c);
//			f.close();
//			System.out.println("Written successfully");
//
//		} catch (Exception ex) {
//			System.out.println("fAILED");
//		}

	}

}
