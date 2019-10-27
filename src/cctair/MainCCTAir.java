package cctair;

import java.util.ArrayList;

public class MainCCTAir {

    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[26];
        Airplane[] airplanes = new Airplane[20];
        ArrayList<Flight> flights = new ArrayList<>();
        SetUp setup = new SetUp();
        Menu menu = new Menu();

        //Set Up ---------------------------------------------------------------
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        flights = setup.setFlights(flights, airplanes, pilots);
        // ---------------------------------------------------------------------

        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i));
        }
    }

}
