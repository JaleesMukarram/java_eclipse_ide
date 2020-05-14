package TrainPackage;

public class Train {
	private String TrainName;
	private int number0fCoaches;
	private int numberOfStops;
	private String TrainDriverName;
	private TrainCoach[] trainCoaches;
	private TrainStation[] trainStops;

	public Train(String trainName, int number0fCoaches, int numberOfStops, String trainDriverName,
			TrainCoach[] trainCoaches, TrainStation[] trainStops) {
		TrainName = trainName;
		this.number0fCoaches = number0fCoaches;
		this.numberOfStops = numberOfStops;
		TrainDriverName = trainDriverName;
		this.trainCoaches = trainCoaches;
		this.trainStops = trainStops;
	}

	public String getTrainName() {
		return TrainName;
	}

	public void setTrainName(String trainName) {
		TrainName = trainName;
	}

	public int getNumber0fCoaches() {
		return number0fCoaches;
	}

	public void setNumber0fCoaches(int number0fCoaches) {
		this.number0fCoaches = number0fCoaches;
	}

	public int getNumberOfStops() {
		return numberOfStops;
	}

	public void setNumberOfStops(int numberOfStops) {
		this.numberOfStops = numberOfStops;
	}

	public String getTrainDriverName() {
		return TrainDriverName;
	}

	public void setTrainDriverName(String trainDriverName) {
		TrainDriverName = trainDriverName;
	}

	public TrainCoach[] getTrainCoaches() {
		return trainCoaches;
	}

	public void setTrainCoaches(TrainCoach[] trainCoaches) {
		this.trainCoaches = trainCoaches;
	}

	public TrainStation[] getTrainStops() {
		return trainStops;
	}

	public void setTrainStops(TrainStation[] trainStops) {
		this.trainStops = trainStops;
	}

}
