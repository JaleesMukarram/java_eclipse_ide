
public class PassBy {
	int x = 10;
	int y = 10;

	public static void main(String[] args) {
		PassBy p = new PassBy();
		System.out.println("Before: " + p.x);
		p.add(p);
		System.out.println("After: " + p.x);

	}

	public void add(PassBy num) {
		System.out.println("number is: " + num.x);
		num.x = 22;
		System.out.println("number changed to: " + num.x);

	}

}
