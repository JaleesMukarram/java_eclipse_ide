
public class Q2OHT1 {
	String name;
	final String org = "SEECS";

	Q2OHT1() {

	}

	Q2OHT1(String name) {
		this.name = name;

	}

	public static void main(String[] args) {
		final Q2OHT1 q = new Q2OHT1();
		q.name = "Ali Raza";
		System.out.println(q.toString());
		//q = new Q2OHT1("Jalees");
		System.out.println(q.toString());

	}

}
