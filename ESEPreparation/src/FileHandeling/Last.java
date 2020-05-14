package FileHandeling;

import java.io.*;
import java.util.*;

public class Last {


	public static void main(String[] args) {
		File f1 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");
		
		try {
			FileInputStream fis = new FileInputStream(f1);
			int x;
			while (( x = fis.read())!=-1) {
				System.out.println((char)x);
			}
			
			
		}catch (Exception ex) {
			
		}
		

//		try {
//			File f1 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABC.txt");
//			File f2 = new File("C:\\Users\\Jalees DON\\Desktop\\ABC\\ABCD.txt");
//
//			FileReader fr = new FileReader(f1);
//			int i;
//			while ((i = fr.read()) != -1) {
//				FileWriter f2r = new FileWriter(f2, true);
//				f2r.write(i);
//				f2r.close();
//
//			}
//
//			FileReader fr2 = new FileReader(f2);
//			int z;
//			while ((i = fr2.read()) != -1) {
//				System.out.println((char) i);
//
//			}
//
//			fr.close();
//
//		} catch (Exception ex) {
//
//		}

	}

}
