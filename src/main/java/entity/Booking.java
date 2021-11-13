package entity;

import java.util.*;

public class Booking {
    private String flightID;
    private String passengerName;
    private String passengerSurname;
    private boolean isBookingValid;
    private int bookingID;

    public Booking(String flightID, String passengerName, String passengerSurname) {
        isBookingValid = true;
        this.flightID = flightID;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
    }

    public Booking(String flightID, String passengerName, String passengerSurname, int bookingID) {
        this.flightID = flightID;
        this.passengerName = passengerName;
        this.passengerSurname = passengerSurname;
        this.bookingID = bookingID;
        isBookingValid = true;
    }

    public String getFlightID() {
        return flightID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPassengerSurname() {
        return passengerSurname;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public int getBookingID() {
        return bookingID;
    }

    public boolean isBookingValid(boolean isBookingValid) {
        return isBookingValid;
    }

    public void setBookingValid(boolean bookingValid) {
        isBookingValid = bookingValid;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public void setPassengerSurname(String passengerSurname) {
        this.passengerSurname = passengerSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingID, passengerName, passengerSurname, isBookingValid);
    }
}
