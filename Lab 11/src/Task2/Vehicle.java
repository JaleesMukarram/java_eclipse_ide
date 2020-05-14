package Task2;

import java.util.Date;

public abstract class Vehicle {
	private int VehicleIdentityNumber;
	private double cost;
	private String Color;
	private String catagory = this.getClass().getSimpleName();
	private Date DateOfArrival;
	
	



	public Vehicle(int vehicleIdentityNumber, double cost, String color, Date dateOfArrival) {
		super();
		VehicleIdentityNumber = vehicleIdentityNumber;
		this.cost = cost;
		Color = color;
		DateOfArrival = dateOfArrival;
	}

	public int getVehicleIdentityNumber() {
		return VehicleIdentityNumber;
	}

	public void setVehicleIdentityNumber(int vehicleIdentityNumber) {
		VehicleIdentityNumber = vehicleIdentityNumber;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Date getDateOfArrival() {
		return DateOfArrival;
	}

	public void setDateOfArrival(Date dateOfArrival) {
		DateOfArrival = dateOfArrival;
	}

}
