package Activity;

class Time {
	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59

// TODO: Add constructors definitions here
	public Time() {
		this(00, 00, 00);
	}

	public Time(int hour) {
		this(hour, 0, 0);

	}

	public Time(int hour, int minute) {
		this(hour, minute, 00);

	}

	public Time(int hour, int minute, int second) {
		this.setTime(hour, minute, second);

	}

// set a new time value using universal time; throw an
// exception if the hour, minute or second is invalid 
	public void setTime(int h, int m, int s) {
// validate hour, minute and second
		if ((h >= 00 && h < 24) && (m >= 00 && m < 60) && (s >= 00 && s < 60)) {
			hour = h;
			minute = m;
			second = s;
		} // end if else
			// throw new IllegalArgumentException("hour, minute and/or second was out of
			// range");
	} // end method setTime

// convert to String in universal-time format (HH:MM:SS) 
	public String toUniversalString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	} // end method toUniversalString

	public String toString() {
		return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12) ? 12 : hour % 12), minute, second,
				(hour < 12 ? "AM" : "PM"));
	} // end method toString
} // end class Time
