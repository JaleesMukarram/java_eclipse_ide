
import java.util.Random;

public class Dice6000Time {
	static Random random;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int total = 0;
		
		random = new Random();
		for (int index = 0;index<6000;index++) {
			int value = random.nextInt(6)+1;
			total +=1;
			
			if (value == 1)
				one+=1;
			else if(value == 2)
				two+=1;
			else if(value == 3)
				three+=1;
			else if(value == 4)
				four+=1;
			else if(value == 5)
				five+=1;
			else if(value == 6)
				six+=1;
			
					
		}
		System.out.println("One came "+one+" times");
		System.out.println("Two came "+two+" times");
		System.out.println("Three came "+three+" times");
		System.out.println("Four came "+four+" times");
		System.out.println("Five came "+five+" times");
		System.out.println("Six came "+six+" times");
		System.out.println("Total of "+total+" out of "+(one+two+three+four+five+six));



	}

}
