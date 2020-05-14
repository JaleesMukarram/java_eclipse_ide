package Task;

public class Time2 {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

//	Time2 no-argument constructor:
//	initializes each instance variable to zero 
	public Time2() {
		this(0, 0, 0); // invoke Time2 constructor with three arguments
	} // end Time2 no-argument constructor

//Time2 constructor: hour supplied, minute and second defaulted to 0 
	public Time2(int h) {

		this(h, 0, 0); // invoke Time2 constructor with three arguments
	} // end Time2 one-argument constructor

//Time2 constructor: hour and minute supplied, second defaulted to 0 
	public Time2(int h, int m) {
		this(h, m, 0); // invoke Time2 constructor with three arguments
	} // end Time2 two-argument constructor

//Time2 constructor: hour, minute and second supplied 
	public Time2(int h, int m, int s) {
		setTime(h, m, s); // invoke setTime to validate time
	} // end Time2 three-argument constructor

//Time2 constructor: another Time2 object supplied 
	public Time2(Time2 time) {
// invoke Time2 three-argument constructor
		this(time.getHour(), time.getMinute(), time.getSecond());
	} // end Time2 constructor with a Time2 object argument
//	Set Methods
//	set a new time value using universal time;
//	validate the data

	public void setTime(int h, int m, int s) {
		setHour(h); // set the hour
		setMinute(m); // set the minute
		setSecond(s); // set the second
	} // end method setTime

//validate and set hour
	public void setHour(int h) {
		if (h >= 0 && h < 24)
			hour = h;
		else
			throw new IllegalArgumentException("hour must be 0-23");
	} // end method setHour
//validate and set minute

	public void setMinute(int m) {
		if (m >= 0 && m < 60)
			minute = m;
		else
			throw new IllegalArgumentException("minute must be 0-59");
	} // end method setMinute

//validate and set second 
	public void setSecond(int s) {

		if (s >= 0 && s < 60)
			second = ((s >= 0 && s < 60) ? s : 0);
		else
			throw new IllegalArgumentException("second must be 0-59");
	} // end method setSecond

//	Get Methods
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {

		return second;
	}

	// adding increment tick method for incrementing second
	public void tick() {

		// if second is at 59 we need other changes as well
		if (second == 59) {

			// In this case, second will always get to 0
			second = 0;

			// checking if minutes are at 59
			if (minute == 59) {

				// In this case, minute will always get to 0
				minute = 0;

				// Checking if hours are at 23
				if (hour == 23) {

					// In this case, hour will always set back to 0
					hour = 0;

					// if hours is not at 23
				} else {

					// it will work by just adding in hour
					hour++;
				}
			}

			// else we just need to update minute when it is not at 59
			else {

				// incrementing minute when seconds are 0
				minute++;
			}
		}

		// If second are not at 59 we just need to increment the second
		else {

			// adding to second
			second++;
		}

	}

	// Adding increment minute method for incrementing minute
	public void incrementMinute() {

		// if minutes are at 59
		if (minute == 59) {

			// setting minutes back to 0
			minute = 0;

			// if hour is at 23 adding 1 minute will also add
			if (hour == 23) {

				// setting hours from 23 to 0
				hour = 0;
			} else {

				// Else we just need to add in hour because it will not exceed 23
				hour++;
			}

		}

		// If adding the minute when it is not at 59
		else if (minute != 59) {

			// else just incrementing the minute
			minute++;
		}

	}

	// Adding increment hour method for incrementing hour
	public void incrementHour() {

		// if it is 23 o'clock
		if (hour == 23) {

			// setting back to 0
			hour = 0;
		}

		// if it is else than 23 o'clock
		else {

			// Else just incrementing the hour
			hour++;
		}

	}

//convert to String in universal-time format (HH:MM:SS)
	public String toUniversalString() {

		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}

//convert to String in standard-time format (H:MM:SS AM or PM) 
	public String toString() {
		return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	} // end method toString

} // end class Time2
