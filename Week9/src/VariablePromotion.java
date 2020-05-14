
public class VariablePromotion {

	void show(int x, float v) {
		System.out.println("int float method running");
	}

	void show(float x, int v) {
		System.out.println("float int running");
	}

	public static void main(String[] args) {
		VariablePromotion v = new VariablePromotion();
	

	}

}
