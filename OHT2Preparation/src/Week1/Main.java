package Week1;

public class Main {
	public static int x = 12;
	public int y = 12;

	

	public static void dd() {
		Main.x = 133;
		Main a = new Main();
		a.y = 12;
		a.x = 12;

	}

	public static void main(String[] args) {

		Vehicle v = new Car();
		System.out.println(v instanceof Vehicle);

	}

}
