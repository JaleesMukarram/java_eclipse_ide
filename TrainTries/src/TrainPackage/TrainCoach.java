package TrainPackage;

public class TrainCoach {
	private int coachNumber;
	private TrainSeat[] trainSeats;

	public TrainCoach(int coachNumber, TrainSeat[] trainSeats) {
		this.coachNumber = coachNumber;
		this.trainSeats = trainSeats;
	}

	public int getCoachNumber() {
		return coachNumber;
	}

	public void setCoachNumber(int coachNumber) {
		this.coachNumber = coachNumber;
	}

	public TrainSeat[] getTrainSeats() {
		return trainSeats;
	}

	public void setTrainSeats(TrainSeat[] trainSeats) {
		this.trainSeats = trainSeats;
	}

}
