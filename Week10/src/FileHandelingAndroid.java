
import java.io.*;

public class FileHandelingAndroid {
	public static void main(String args[]) throws IOException {
		FileOutputStream fos = new FileOutputStream("./DATABASEANDROID.txt",true);
		
		String name = "Mamnoon";
		String password = "123123123";
		String space = "    ";
		String endline = "\n";
		
		char [] nameArray = name.toCharArray();
		char [] passwordArray = password.toCharArray();
		char [] spaceArray = space.toCharArray();
		char [] endlineArray = endline.toCharArray();
	
		
		
		for (int i = 0;i<name.length();i++) {
			fos.write(nameArray[i]);
		}
		for (int i = 0;i<space.length();i++) {
			fos.write(spaceArray[i]);
		}
		for (int i = 0;i<password.length();i++) {
			fos.write(passwordArray[i]);
			}
		
		for (int i = 0; i<endlineArray.length;i++) {
			fos.write(endlineArray[i]);
		}
		
		fos.close();
		
		
		
		
	}

}
