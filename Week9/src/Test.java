
public class Test {

	static void check(String a, String b) {
		if (a == b) {
			System.out.println("==");
		}
		if (a.equals(b)) {
			System.out.println("Equals");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Jalees");
		String a = new String("Jalees");
		String u = "Jalees";
		String v = "Jalees";

		if (v == a) {
			System.out.println("==");
		}
		if (v.equals(a)) {
			System.out.println("Equals");
		}

		// check();

	}

}
