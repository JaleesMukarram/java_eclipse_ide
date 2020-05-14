
public class CopyConstructor {
	String name;

	private CopyConstructor(CopyConstructor obj) {
		this.name = obj.name;

	}

	private CopyConstructor() {

	}

	CopyConstructor copier() {
		return this;
	}

	CopyConstructor(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		CopyConstructor c = new CopyConstructor("Jalees");
		CopyConstructor x = c.copier();
		System.out.println(c);
		System.out.println(x);
		x.name = "SA";

		System.out.println(x.name);
		System.out.println(c.name);
		System.out.println(c);
		System.out.println(x);

	}

}
