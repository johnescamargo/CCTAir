package cctair;

public class Pilot {

    private int idPilot;
    private String name;
    private int rank;

    //Contructor
    public Pilot() {
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

    public void setIdPilot(int idPilot) {
        this.idPilot = idPilot;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Setters
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Pilot{" + "idPilot=" + idPilot + ", name=" + name + ", rank=" + rank + '}';
    }

    
}
