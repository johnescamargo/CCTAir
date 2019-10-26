package cctair;

import java.util.ArrayList;
import java.util.Date;

public class MainCCTAir {

    public static void main(String[] args) {
//        new Menu();
        Pilot[] pilots = new Pilot[25];
        Airplane[] airplanes = new Airplane[20];
        ArrayList<Flight> flights = new ArrayList<>();
        Date date = new Date();

        SetUp setup = new SetUp();
        
        //Set Up 
        pilots = setup.setPilots(pilots);
        airplanes = setup.setAircrafts(airplanes, pilots);
        
        //System.out.println(date.toString());
        
        

    }

}
