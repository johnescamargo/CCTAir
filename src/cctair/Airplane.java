package cctair;

import java.util.ArrayList;

public class Airplane {

    private int idAircraft;
    private String make;
    private String model;
    private int capacity;
    private ArrayList<Integer> idPilot = new ArrayList<>();

    //Contructor
    public Airplane(int idAircraft, String make, String model, int capacity) {
        this.idAircraft = idAircraft;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public Airplane() {
    }

    //Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
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

    //Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
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

    public void assignPilot(Pilot[] pilot) {

        for (int i = 0; i < pilot.length; i++) {
            int rank = pilot[i].getRank();

            if (capacity <= 250) {

                if (rank >= 1) {
                    idPilot.add(pilot[i].getIdPilot());
                }

            } else if (capacity <= 350) {

                if (rank >= 2) {
                    idPilot.add(pilot[i].getIdPilot());
                }

            } else if (capacity <= 400) {

                if (rank >= 3) {
                    idPilot.add(pilot[i].getIdPilot());

                }

            }

        }

    }

    @Override
    public String toString() {
        return "Airplane{" + "ID Aircraft = " + idAircraft + ", Make = " + make + ", Model = " + model + ", Capacity = " + capacity + ", idPilot = " + idPilot + '}';
    }

}
