import java.util.ArrayList;

public class ArrayListPracrice {
	public static void main(String args[]) {
		Integer  i = new Integer(3);
	
		

		ArrayList<Integer> myList = new ArrayList<Integer>(4);
		myList.add(3);
		myList.add(3123);
		myList.add(33);
		myList.add(33);
		for (int x : myList) {
			System.out.println(x);
		}
		
		myList.remove(3);

		System.out.println("Removing");
		for (int x : myList) {
			System.out.println(x);
		}

	}

}
