
import java.io.*;
public class FileHandelingIO {
	public static void main(String args[]) throws IOException{
		FileInputStream fos = new FileInputStream("./DATABASEANDROID.txt");
		  int size = fos.available();
          byte [] data =new byte[size];
          fos.read(data);
          String text = new String(data);
          //System.out.println(text);
          
          
          String [] usersArray = text.split("\n",0);
          String [] username = new String[usersArray.length];
          String [] password = new String[usersArray.length];
          
          for (int i = 0;i<usersArray.length;i++) {
        	 String [] usernametemp = usersArray[i].split("    ",0);
        	 username[i] = usernametemp[0];
        	 password[i] = usernametemp[1];
          }
          
          for (String s:password) {
        	  System.out.println(s);
          }
          
          

	}

}
