package cctair;

import java.util.ArrayList;
import java.util.Date;

public class MainCCTAir {

    public static void main(String[] args) {

        Pilot[] pilots = new Pilot[25];
        Airplane[] airplanes = new Airplane[20];
        Flight[] flights = new Flight[20];
        Date date = new Date();

        SetUp setup = new SetUp();
        
        //Set Up 
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        flights=setup.setFlights(flights,airplanes);
        
        //System.out.println(date.toString());
        
        new Menu(pilots,airplanes,flights);

    }

}
