package cctair;

import java.util.ArrayList;

public class MainCCTAir {

    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[26];
        Airplane[] airplanes = new Airplane[20];
        ArrayList<Flight> flights = new ArrayList<>();

        SetUp setup = new SetUp();
        
        //Set Up 
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        //setup.setFlights(flights,airplanes, pilots);
        flights = setup.setFlights(airplanes, pilots);
        
        for (Flight flight : flights) {
            System.out.println(flights);
        }
        

    }

}
