package cctair;

public class Pilot {

    private int idPilot;
    private String name;
    private int rank;
    boolean available;

    //Contructor
    public Pilot() {
        this.available = true;
    }
    
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
