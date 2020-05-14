
public class Methods {
	int x;
	int y;
	final static int g = 10;

	public int sum() {
		return this.x * this.y * this.g;
	}

//	public Methods(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
	public static int sum(int x, int y) {

		return x + y;
	}
//
//	public int sum() {
//		return sum(x, y);
//	}
//
//	public void sub() {
//		
//		System.out.println("Running SUB");
//	}

}
