package cctair;

import java.util.ArrayList;
import java.util.Date;

public class MainCCTAir {

    public static void main(String[] args) {

        Pilot[] pilots = new Pilot[25];
        Airplane[] airplanes = new Airplane[20];
        ArrayList<Flight> flights = new ArrayList<>();
        Date date = new Date();

        SetUp setup = new SetUp();
        
        
        
        //Set Up 
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        flights=setup.setFlights(airplanes);
        
        //System.out.println(date.toString());
        
        new Menu(pilots,airplanes,flights);

    }

}
