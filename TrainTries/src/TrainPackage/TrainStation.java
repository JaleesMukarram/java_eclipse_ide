package TrainPackage;

public class TrainStation {
	private String StationName;
	private String StationMasterName;
	private String StationCityName;

	public TrainStation(String stationName, String stationMasterName, String stationCityName) {
		StationName = stationName;
		StationMasterName = stationMasterName;
		StationCityName = stationCityName;
	}

	public String getStationName() {
		return StationName;
	}

	public void setStationName(String stationName) {
		StationName = stationName;
	}

	public String getStationMasterName() {
		return StationMasterName;
	}

	public void setStationMasterName(String stationMasterName) {
		StationMasterName = stationMasterName;
	}

	public String getStationCityName() {
		return StationCityName;
	}

	public void setStationCityName(String stationCityName) {
		StationCityName = stationCityName;
	}

}
