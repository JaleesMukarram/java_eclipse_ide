package Task2;

public class TV extends Electronics {
	private int size;

	public TV(double regularPrice, String manufacturer, int size) {
		super(regularPrice, manufacturer);
		this.size = size;
	}

	@Override
	public double computeSalePrice() {
		return super.getRegularPrice() * 0.20;
	}
}
