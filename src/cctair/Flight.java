package cctair;

import java.io.Serializable;
import java.util.Date;

public class Flight  {

    private int id;
    private String origin;
    private String destination;
    private String departure;
    private String arrival;
    private String dateOfFlight;
    Airplane airplane = new Airplane();
    Pilot pilot = new Pilot();

//    • origin (e.g. “Dublin”) 
//    • destination (e.g. “New York”) 
//    • departure time (e.g. “10:10”)   ****
//    • arrival time (e.g “13:30”)         ****
//    • date of flight (e.g. “05/12/2015”) 
//    • aircraft assigned (this should be an object);  
    public Flight(String origin, String destination, String departure, String arrival, String dateOfFlight) {
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.dateOfFlight = dateOfFlight;
    }
    
    public Flight(){
        
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }
    
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

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    //Getters

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

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    @Override
    public String toString() {
        return "Flight{" + "id=" + id + ", origin=" + origin + ", destination=" + destination + ", departure=" + departure + ", arrival=" + arrival + ", dateOfFlight=" + dateOfFlight + " " + airplane;
    }

    

}
