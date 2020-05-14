import java.util.Scanner;
public class SeperatingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = sc.nextInt();
		while (num<100 | num>999) {
			System.out.println("Error!! Type again");
			System.out.print("Please enter the number: ");
			num = sc.nextInt();

		}
		int[] array = new int[3];
		int counter = 0;
		int temp; 
		
		while(num>0) {
			temp = num%10;
		    num /= 10;
		    array[counter]=temp;
		    counter++;
		    
		}
		int answer =1;
		for (int zz:array) {
			answer *= zz;
		}
		System.out.println("Multiple is "+(answer));
				
			
		

	}

}
