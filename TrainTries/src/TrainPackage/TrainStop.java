package TrainPackage;

import java.util.Date;

public class TrainStop extends TrainStation {
	private Date TraindepartureTime;
	private Date TrainArrivalTime;

	public TrainStop(String stationName, String stationMasterName, String stationCityName, Date traindepartureTime,
			Date trainArrivalTime) {
		super(stationName, stationMasterName, stationCityName);
		TraindepartureTime = traindepartureTime;
		TrainArrivalTime = trainArrivalTime;
	}

	public Date getTraindepartureTime() {
		return TraindepartureTime;
	}

	public void setTraindepartureTime(Date traindepartureTime) {
		TraindepartureTime = traindepartureTime;
	}

	public Date getTrainArrivalTime() {
		return TrainArrivalTime;
	}

	public void setTrainArrivalTime(Date trainArrivalTime) {
		TrainArrivalTime = trainArrivalTime;
	}

}
