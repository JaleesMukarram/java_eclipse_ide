import java.util.Scanner;
public class PracticeQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three digit number: ");
		int num = sc.nextInt(); 
		while (num<100 || num>999) {
			System.out.println("Number not allowed :)");
			System.out.print("Enter three digit number: ");
			num = sc.nextInt(); 
		}
		int numberModuled1 = num/100;
		int numberModuled2 = num%100;
		int numberModuled3 = num;;
System.out.println(numberModuled1+" "+numberModuled2+" "+numberModuled3 );
		


	}

}
