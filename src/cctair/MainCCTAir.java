package cctair;

import java.util.ArrayList;

public class MainCCTAir {

    public static void main(String[] args) {
        Pilot[] pilots = new Pilot[25];
        Airplane[] airplanes = new Airplane[10];
        ArrayList<Flight> flights = new ArrayList<>();

        SetUp setup = new SetUp();
        
        //Set Up 
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        
        

    }

}
