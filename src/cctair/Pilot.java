/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Pilot {

    //Variables
    private int idPilot;
    private String name;
    private int rank;
    boolean available;

    /**
     * Constructor that sets 'true' automatically into variable available
     *
     */
    public Pilot() {
        this.available = true;
    }

    /**
     * Constructor
     *
     * @param pilot
     */
    public Pilot(Pilot pilot) {
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getIdPilot() {
        return idPilot;
    }

    public int getRank() {
        return rank;
    }

    public boolean isAvailable() {
        return available;
    }

    //Setters
    public void setIdPilot(int idPilot) {
        this.idPilot = idPilot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Method that displays a String whether Pilot is available or not available
     *
     * @param available
     * @return String
     */
    public String isAvailableToString(boolean available) {
        if (available == true) {
            return "Available";
        } else {
            return "Not Available";
        }

    }

    @Override
    public String toString() {
        return "Pilot ID: " + idPilot + "\n"
                + "     Name: " + name + "\n"
                + "     Rank: " + rank + "\n"
                + "     Availability: " + isAvailableToString(available) + "\n"
                + "_________________________________________________________";
    }

}
