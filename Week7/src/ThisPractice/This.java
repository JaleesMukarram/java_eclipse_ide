package ThisPractice;

public class This {
	int code;
	static int num;

	void game() {
		this.code = 213;

	}

	void setCode(int code) {
		this.code = code;

	}

	void getCode() {
		System.out.println(this.num);
		System.out.println(this.code);
	}

	public static void main(String[] args) {
		This obj = new This();
		obj.game();
		System.out.println(obj.code);

	}
}
