package Task2;

import java.util.Date;

public class Car extends Vehicle implements Insurable {
	private int seatingCapacity;
	private String doorQuality;

	


	public Car(int vehicleIdentityNumber, double cost, String color, Date dateOfArrival, int seatingCapacity,
			String doorQuality) {
		super(vehicleIdentityNumber, cost, color, dateOfArrival);
		this.seatingCapacity = seatingCapacity;
		this.doorQuality = doorQuality;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public String getDoorQuality() {
		return doorQuality;
	}

	public void setDoorQuality(String doorQuality) {
		this.doorQuality = doorQuality;
	}



	public double calculateInsurance(double insurance_rate) {
		return (this.getCost() * INSURANCE_RATE);
	}

}
