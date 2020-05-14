import java.util.Date;

public class Airbnb {

	// This function will verify the check in date should be before leaving date and
	// the number of people must not be greater than 10
	public boolean validateVisitingInfo(Date checkInDate, Date checkOutDate, int numberOfPeople) {

		if (checkInDate.after(checkOutDate)) {

			return false;

		} else if (numberOfPeople > 10) {

			return false;

		} else {

			return true;
		}

	}
	
	
	
	//If visitor searches for the location available in the database
	//Then the system shall proceed further
	public boolean validateLocation(String location) {

		if (location == "Hunza" || location == "Murree" || location == "Kashmir") {

			return true;

		} else {

			return false;
		}

	}

	//Checking payment received before confirming reservation
	
	public String confirmReservation(boolean paymentSuccessful) {

		if (!paymentSuccessful) {

			return "Reservation Unsuccessful";

		} else {

			return "Reservation Successful";
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	boolean cancelBooking(boolean cancelPlease, boolean areYouSure) {
//
//		if (cancelPlease) {
//
//			if (areYouSure) {
//
//				return true;
//
//			} else {
//
//				return false;
//			}
//
//		} else {
//
//			return false;
//		}
//
//	}

}
