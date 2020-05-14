package OneLab6Practice;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("Jalees", "H13", "jaleesdon786@gmail.com");
		Person p2 = new Person();
		p2 = p;

		System.out.println(p.equals(p2));
	}

}
