import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter string: ");
		String string = input.nextLine();
		for(int i=0;i<string.length();i++) {
			System.out.println("ELements are: "+string.charAt(i));
		}

	}

}
