package SecondDay;

public class Test {
	static int x = 10;
	private int y = 8;

	Test() {
		x = 9;
		y = 2;
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1.x + "\n" + Test.x);
		t1.x = 20;
		System.out.println(t1.x + "\n" + t2.y);

	}

}
