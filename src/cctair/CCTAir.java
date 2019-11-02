package cctair;

import java.util.ArrayList;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class CCTAir {

    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[30];
        Airplane[] airplanes = new Airplane[15];
        ArrayList<Flight> flights = new ArrayList<>();

        SetUp setup = new SetUp();
        Menu menu = new Menu();
        DepartureArrivalTime a = new DepartureArrivalTime();

        //Set Up ---------------------------------------------------------------
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        flights = setup.setFlights(flights, airplanes, pilots);
        a.setTime(flights);
        // ---------------------------------------------------------------------

        menu.mainMenu(pilots, airplanes, flights);

    }

}
