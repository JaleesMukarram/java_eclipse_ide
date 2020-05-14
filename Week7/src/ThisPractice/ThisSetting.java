package ThisPractice;

public class ThisSetting {
	private int i = 0;
	private static double j = 36;

	void setI(int i) {
		this.i = i;
	}

	void setJ(double j) {
		this.j = j;
	}

	static void setJstatic(double j) {

	}

	public static void main(String[] args) {
		System.out.println(j);
		ThisSetting.setJstatic(324234.4);
		System.out.println(j);

	}

}
