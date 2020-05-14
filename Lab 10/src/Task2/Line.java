package Task2;

public class Line implements RelationInterface {

	private double x1;
	private double x2;
	private double y1;
	private double y2;

	public Line(double x1, double x2, double y1, double y2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public double getLength() {

		return Math.sqrt(Math.pow((this.y2 - this.y1), 2) + Math.pow((this.x2 - this.x1), 2));
	}

	public boolean isGreater(Line line1, Line line2) {
		if (line1.getLength() > line2.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isLess(Line line1, Line line2) {
		if (line1.getLength() < line2.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEqual(Line line1, Line line2) {
		if (line1.getLength() == line2.getLength()) {
			return true;
		} else {
			return false;
		}
	}
}
