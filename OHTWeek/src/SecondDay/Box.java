package SecondDay;

public class Box {
	int height;
	int width;

	Box duplicate() {
		return this;
	}

	Box duplicate(Box temp) {
		return temp;
	}

	void change_height(Box b) {
		b.height = 0;
		System.out.println("_____Changed height to 0______");

	}

	void change_height_sep(int height) {
		System.out.println("_____Changed height to 312321______");
		this.height = 312321;

	}

	public static void main(String[] args) {
//		Box b1 = new Box();
//		b1.height = 12;
//		System.out.println("Initial height is: " + b1.height);
//		b1.change_height(b1);
//		System.out.println("Height after calling 1st method is: "+b1.height);
//		b1.change_height_sep(12312);
//		System.out.println("Height after calling 2nd method is: "+b1.height);
//
//		
//		double x = Math.pow(32, 3);
//		double r = Math.pow(32.3, 3);
//		double z = Math.pow(32, 3.3);
//		double a = Math.pow(32.42, 3.3);
		int x = 1;
		int y = 2;
		int z = 3;
		int a = 4;
		System.out.println(x + "" + y + z + a);

	}

}
