package TrainPackage;

public class TrainSeat {

    private String Seatnumber;
    private boolean isBooked;
    private String bookingPersonName;

    public TrainSeat(String seatnumber, boolean isBooked, String bookingPersonName) {
        Seatnumber = seatnumber;
        this.isBooked = isBooked;
        this.bookingPersonName = bookingPersonName;
    }

    public TrainSeat(String seatnumber, boolean isBooked) {
        Seatnumber = seatnumber;
        this.isBooked = isBooked;
    }

    public String getSeatnumber() {
        return Seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        Seatnumber = seatnumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getBookingPersonName() {
        return bookingPersonName;
    }

    public void setBookingPersonName(String bookingPersonName) {
        this.bookingPersonName = bookingPersonName;
    }

}
