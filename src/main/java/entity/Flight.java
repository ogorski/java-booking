package entity;

import java.util.*;
import java.text.*;

public class Flight {
    private String flightID;
    private String flightDestination;
    private Date flightDeparture;
    private int freeSeats;

    public Flight(String flightID, String flightDestination, Date flightDeparture, int freeSeats) {
        this.flightID = flightID;
        this.flightDestination = flightDestination;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        try {
            this.flightDeparture = dateFormat.parse(String.valueOf(flightDeparture));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.freeSeats = freeSeats;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public int getFreeSeats() {
        return freeSeats;
    }

    public Date getFlightDeparture() {
        return flightDeparture;
    }

    public void setFlightDeparture(Date flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public void setFreeSeats(int freeSeats) {
        this.freeSeats = freeSeats;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightID, flightDestination, flightDeparture);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return flightID.equals(flight.flightID) &&
               flightDeparture.equals(flight.flightDeparture) &&
               flightDestination.equals(flight.flightDestination);
    }
    @Override
    public String toString() {
        return flightID + "\t" +
               flightDestination + "\t" +
               new SimpleDateFormat("dd/MM/yyyy HH:mm").format(flightDeparture) + "\t" +
               freeSeats + "free seats" + "\n" +
               "--------------------------------";
    }
    public String toShortString() {
        return "\n Destination of flight: " + flightDestination +
                "\n Date of departure: " + new SimpleDateFormat("dd/MM/yyyy HH:mm").format(flightDeparture);
    }
}