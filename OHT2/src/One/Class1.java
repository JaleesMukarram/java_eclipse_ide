package One;

public class Class1 {
	int x;
	int y;
	static int numOfObjects;

	Class1() {
		numOfObjects++;
	}

	Class1(int x, int y) {
		this.x = x > 0 ? x : 0;
		this.y = y > 0 ? y : 0;
		numOfObjects++;

	}
	
	

	public static int getOBJ() {
		return numOfObjects;
		
	}

	public static void main(String args[]) {
		Class1 c = new Class1();
		Class1 r = new Class1(4, 5);
		
		

	}

}
