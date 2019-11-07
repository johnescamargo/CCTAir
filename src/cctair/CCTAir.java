/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class CCTAir {

    public static void main(String[] args) {
        //Array of pilots, airplanes and flights
        Pilot[] pilots = new Pilot[30];
        AirPlane[] airPlanes = new AirPlane[15];
        ArrayList<Flight> flights = new ArrayList<>();

        // Instances of Classes
        SetUp setup = new SetUp();
        Menu menu = new Menu();
        DepartureArrivalTime a = new DepartureArrivalTime();

        //Set Up ---------------------------------------------------------------
        pilots = setup.setPilots(pilots);
        airPlanes = setup.setAircrafts(airPlanes, pilots);
        flights = setup.setFlights(flights, airPlanes, pilots);
        a.setTime(flights);
        // ---------------------------------------------------------------------

        //Call method Menu at Menu Class
        menu.mainMenu(pilots, airPlanes, flights);    

    }

}
