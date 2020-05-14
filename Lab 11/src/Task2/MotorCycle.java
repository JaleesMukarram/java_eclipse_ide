package Task2;

import java.util.Date;

public class MotorCycle extends Vehicle {
	private double saddleHeight;

	public MotorCycle(int vehicleIdentityNumber, double cost, String color, Date dateOfArrival, double saddleHeight) {
		super(vehicleIdentityNumber, cost, color, dateOfArrival);
		this.saddleHeight = saddleHeight;
	}

	public double getSaddleHeight() {
		return saddleHeight;
	}

	public void setSaddleHeight(double saddleHeight) {
		this.saddleHeight = saddleHeight;
	}

	public MotorCycle getDuplicate() throws CloneNotSupportedException {
		MotorCycle m = (MotorCycle) this.clone();
		return m;

	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public boolean areMotorcycleEqual(MotorCycle m) {
		if (this.getVehicleIdentityNumber() == m.getVehicleIdentityNumber() && this.getCost() == m.getCost()
				&& this.getColor().equals(m.getColor()) && this.getCatagory().equals(m.getCatagory())
				&& this.getDateOfArrival().equals(m.getDateOfArrival())
				&& this.getSaddleHeight() == m.getSaddleHeight()) {
			return true;
		} else {
			return false;
		}

	}
}
