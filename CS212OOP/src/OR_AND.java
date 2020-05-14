
import java.util.Scanner;

public class OR_AND {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] arr = new int[a];
		for (int index = 0; index<arr.length;index++) {
			arr[index] = 100+index;
			System.out.println(arr[index]);
		}
			
		
		

	}

}
