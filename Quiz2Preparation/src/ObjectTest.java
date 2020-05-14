
public class ObjectTest {
	public static void main(String[] args) {

		String s1 = new String("A");
		String s2 = new String("A");

		boolean result;

		result = s1 == s2;

		System.out.println("Using == :" + result);

		result = (s1.equals(s2));

		System.out.println("Using equals :" + result);

		ObjectTest t = new ObjectTest();

	}

}
