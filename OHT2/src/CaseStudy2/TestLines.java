package CaseStudy2;

public class TestLines {

	public static void main(String args[]) {
		Line l1 = new Line(new Point(-2, 2), new Point(5, -4));
		Line l2 = new Line(new Point(-2, 22), new Point(5, -4));

		System.out.println(l1.checkLines(l2));

	}

}
