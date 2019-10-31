package cctair;

import java.util.ArrayList;

public class MainCCTAir {

    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[25];
        Airplane[] airplanes = new Airplane[15];
        ArrayList<Flight> flights = new ArrayList<>();
          
        SetUp setup = new SetUp();
        Menu menu = new Menu();

        //Set Up ---------------------------------------------------------------
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        flights = setup.setFlights(flights, airplanes, pilots);
        setup.setTimeRandomly(flights); 
        // ---------------------------------------------------------------------

//        for (int i = 0; i < flights.size(); i++) {
//            System.out.println(flights.get(i));
//        }


            menu.mainMenu(pilots, airplanes, flights);
      
    }

}
