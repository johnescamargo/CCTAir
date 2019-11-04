/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.Date;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Flight {

    //Variables
    private int id;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateOfFlight;
    private Date dateOfCreation;
    Airplane airplane = new Airplane();
    Pilot pilot = new Pilot();

    /**
     * Constructor
     *
     * @param id - receives integer id
     * @param origin - receives String origin
     * @param destination - receives String destination
     * @param dateOfFlight - receives String of date
     * @param airplane - receives an instance of Airplane
     * @param pilot - receives an instance of Pilot
     */
    public Flight(int id, String origin, String destination, String dateOfFlight, Airplane airplane, Pilot pilot) {
        this.dateOfCreation = new Date();
        this.origin = origin;
        this.destination = destination;
        this.dateOfFlight = dateOfFlight;
        this.airplane = airplane;
        this.airplane.available = false;
        this.pilot = pilot;
        this.pilot.available = false;
        this.id = id;
    }

    /**
     * Constructor
     */
    public Flight() {
    }

    //Setters
    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
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

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getters
    public Date getDateOfCreation() {
        return dateOfCreation;
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
        return departureTime;
    }

    public String getArrival() {
        return arrivalTime;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    /**
     * Method that sets arrival time
     *
     * @param arrivalTime
     */
    public void schedule(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Method that sets arrival time and departure time
     *
     * @param departureTime
     * @param arrivalTime
     */
    public void schedule(String departureTime, String arrivalTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight Information:" + " ID: " + id + "\n"
                + "     Date: " + dateOfFlight + "\n"
                + "     From: " + origin + " to " + destination + "\n"
                + "     Flight time: " + departureTime + " to " + arrivalTime + "\n"
                + "Plane Information: " + "\n"
                + "     Aircraft: " + airplane.getMake() + "-" + airplane.getModel() + "\n"
                + "     Capacity: " + airplane.capacity() + " seats" + "\n"
                + "     Pilot: " + pilot.getName() + "\n"
                + "_________________________________________________________"
                + "\n";
    }

}
