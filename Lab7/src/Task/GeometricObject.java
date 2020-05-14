
package Task;

import java.util.Date;

public class GeometricObject {

	// Defining instance variable here
	private String color;
	private boolean filled;
	private Date dateCreated = new Date();

	// Default Constructor
	public GeometricObject() {

	}

	// Parameterized Constructor
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Public getter and setter methods for all the instance private variables
	public String getColor() {
		return this.color;

	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	// Overriding toString method
	public String toString() {
		if (this.filled)
			return ("This geometrical object is of " + this.getColor() + " color and is filled" + " and was created on "
					+ this.getDateCreated());
		else
			return ("This geometrical object is of " + this.getColor() + " color and is not filled"
					+ " and was created on " + this.getDateCreated());

	}

}
