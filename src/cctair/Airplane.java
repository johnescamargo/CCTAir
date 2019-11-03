/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Airplane {

    //Variables
    private int idAircraft;
    private String make;
    private int model;
    private int capacity;
    //ArrayList of Pilot's id who are allowed to fly the airplane
    private ArrayList<Integer> idPilot = new ArrayList<>();
    boolean available = true;

    //Contructor
    public Airplane(int idAircraft, String make, int model, int capacity) {
        this.idAircraft = idAircraft;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    //Contructor
    public Airplane() {
    }

    //Getters ------------------------------------------------------------------
    public String getMake() {
        return make;
    }

    public int getModel() {
        return model;
    }

    public int capacity() {
        return capacity;
    }

    public int getIdAircraft() {
        return idAircraft;
    }

    public ArrayList<Integer> getIdPilot() {
        return idPilot;
    }

    public boolean isAvailable() {
        return available;
    }
    // end of getters ----------------------------------------------------------

    //Setters ------------------------------------------------------------------
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIdAircraft(int idAircraft) {
        this.idAircraft = idAircraft;
    }

    public void setIdPilot(ArrayList<Integer> idPilot) {
        this.idPilot = idPilot;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    // end of setters ----------------------------------------------------------
   
    // Method that returns a String according to variable "available"
    public String isAvailableToString(boolean available) {
        if (available == true) {
            return "Available";
        } else {
            return "Not Available";
        }

    }

    // Method that assigns and arrayList of Pilot's ID according to the capacity
    // of the airplane and the rank of the pilots
    public void assignPilot(Pilot[] pilot) {

        for (Pilot pilot1 : pilot) {
            int rank = pilot1.getRank();
            if (capacity <= 250) {
                if (rank >= 1) {
                    idPilot.add(pilot1.getIdPilot());
                }
            } else if (capacity <= 350) {
                if (rank >= 2) {
                    idPilot.add(pilot1.getIdPilot());
                }
            } else if (capacity <= 400) {
                if (rank >= 3) {
                    idPilot.add(pilot1.getIdPilot());
                }
            }
        }

    }

    @Override // Method that returns values and Strings in a String format
    public String toString() {
        return "Airplane Information: " + "\n"
                + "     ID Aircraft: " + idAircraft + "\n"
                + "     Aircraft: " + make + "-" + model + "\n"
                + "     Capacity: " + capacity + " Seats" + "\n"
                + "     Pilots ID: " + idPilot + "\n"
                + " Availability: " + isAvailableToString(available) + "\n"
                + "_________________________________________________________"
                + "\n";

    }

}
