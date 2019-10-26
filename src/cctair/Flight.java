package cctair;

import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;
    private final long id = serialVersionUID;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private Date dateOfFlight;
    Airplane[] airplane = new Airplane[1];
    Pilot[] pilot = new Pilot[1];

    //Constructor
    public Flight() {
    }

    public Flight(String origin, String destination, String departure, String arrival, Date dateOfFlight, Airplane airplane, Pilot pilot) {
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfFlight = dateOfFlight;
        this.airplane[0] = airplane;
        this.pilot[0] = pilot;
    }

    //Setters
    public void setAirplane(Airplane[] airplane) {
        this.airplane = airplane;
    }

    public void setPilot(Pilot[] pilot) {
        this.pilot = pilot;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDateOfFlight(Date dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    //Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public Airplane[] getAirplane() {
        return airplane;
    }

    public Pilot[] getPilot() {
        return pilot;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public Date getDateOfFlight() {
        return dateOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", origin=" + origin + ", destination=" + destination + ", departure=" + departure + ", arrival=" + arrival + ", dateOfFlight=" + dateOfFlight + ", airplane=" + airplane[0] + ", pilot=" + pilot[0] + '}';
    }


}
