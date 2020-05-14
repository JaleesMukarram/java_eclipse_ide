
public class Q2 {
	public void m(double i) {
		System.out.println(i - 13);
	}

	public void m(String j) {
		System.out.println(j + 12);
	}

	public static void main(String[] args) {
		Q2 m = new Q2();
		m.m(10);
		m.m("20");

	}

}
