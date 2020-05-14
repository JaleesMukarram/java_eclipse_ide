package CaseStudy2;

public class Line {

	Point p1, p2;

	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public boolean equals(Line b) {
		if ((this.getP1().equals(b.getP1())) && (this.getP2().equals(b.getP2()))) {
			return true;

		} else {
			return false;

		}
	}

	public double calculateLength() {

		return Math
				.sqrt(Math.pow((this.p2.getX() - this.p1.getX()), 2) + Math.pow((this.p2.getY() - this.p1.getY()), 2));

	}

	public String checkLines(Line b) {
		if (this.equals(b)) {
			return "They are equal";
		} else if (this.calculateLength() > b.calculateLength()) {
			return "Line A is greater than line B";

		} else {
			return "Line B is greater than Line A";
		}

	}
}
