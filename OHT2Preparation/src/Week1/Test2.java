package Week1;

public class Test2 extends Test1 {
	Test2() {
		this(1);
		System.out.println("Test2");
	}

	Test2(int x) {
		System.out.println("Test2 parametrized");

	}

	@Override
	public int x() {
		return 4;
	}

}
