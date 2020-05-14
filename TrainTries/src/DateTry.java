import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.io.*
;
public class DateTry {
	

	public static void main(String[] args) {
		String readed = "";
		try {
		 FileReader fr = new FileReader("C:\\\\Users\\\\Jalees DON\\\\Desktop\\\\New folder (3)\\\\File.txt");
		 int i;    
         while((i=fr.read())!=-1)    {
        	 readed += (char)i;
         }
         System.out.println(readed);
         
         fr.close();    
         
         
         String [] lines = readed.split("\n",0);
         
         int number = 0;
         
         
         for (String s: lines) {
        	 String [] words = s.split(" ",0);
        	 number += words.length;
        	 
        	 
        	 
         }
         
		 
 		System.out.println("Lines are: "+lines.length+"\nWords are: "+number);

		}catch(Exception ex) {
			
		}
		
	}

}
