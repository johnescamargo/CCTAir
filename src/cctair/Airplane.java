package cctair;

import java.util.ArrayList;

public class Airplane {

    private int idAircraft;
    private String make;
    private int model;
    private int capacity;
    private ArrayList<Integer> idPilot = new ArrayList<>();
    boolean available;

    //Contructor
    public Airplane(int idAircraft, String make, int model, int capacity) {
        this.idAircraft = idAircraft;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
        this.available = false;
    }

    public Airplane() {
    }

    //Getters
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

    //Setters
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

    public String isAvailableToString(boolean available) {
        if (available == false) {
            return "Available";
        } else {
            return "Not Available";
        }

    }

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

    @Override
    public String toString() {
        return "Airplane Information: " + "\n"
                + "     ID Aircraft: " + idAircraft + "\n"
                + "     Aircraft: " + make + "-" + model + "\n"
                + "     Capacity: " + capacity + " Seats" + "\n"
                + "     Pilot: " + idPilot + "\n"
                + " Availability: "+ isAvailableToString(available) + "\n"
                + "_________________________________________________________"
                + "\n";

    }

}
