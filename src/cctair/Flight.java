package cctair;

import java.util.Date;

public class Flight {

    private int id;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private Date dateOfFlight;
    Airplane airplane = new Airplane();
    Pilot pilot = new Pilot();

    //Constructor
    public Flight(int id, String origin, String destination, String departure, String arrival, Date dateOfFlight, Airplane airplane, Pilot pilot) {
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfFlight = dateOfFlight;
        this.airplane = airplane;
        this.pilot = pilot;
        this.id = id;
    }

    //Setters
    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

    public void setPilot(Pilot pilot) {
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
    public void setId(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public Pilot getPilot() {
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
        return "_________________________________________________________" +"\n"
                + "Flight ID: " + id + "\n"
                + "Origin:" + origin + "\n"
                + "Destination: " + destination + "\n"
                + "Departure: " + departure + "\n"
                + "Arrival: " + arrival + "\n"
                + "Airplane: " + airplane.getMake()+ "-" +airplane.getModel() + "\n"
                + "Pilot: " + pilot.getName() + "\n"
                + "Flight's date created: " + dateOfFlight + "\n"
                + "_________________________________________________________"
                + "\n";
    }

}
