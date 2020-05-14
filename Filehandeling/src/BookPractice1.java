import java.util.Scanner;

public class BookPractice1 {
	public static void main(String[] args) {
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		a= sc.nextInt();
		
		System.out.print("Enter number 2: ");
		b= sc.nextInt();
		
		System.out.print("Enter number 3: ");
		c= sc.nextInt();
		
		
		if (a>b && a>c)
			System.out.println(a+" is greater than "+b+" and "+c);
		
		if (b>a && b>c)
			System.out.println(b+" is greater than "+a+" and "+c);
		if (c>b && c>a)
				System.out.println(c+" is greater than "+b+" and "+a);
		
		
		
		
	}
}
