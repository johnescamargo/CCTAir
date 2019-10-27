/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Menu {
Scanner scan = new Scanner(System.in);
    
    public Menu(Pilot[] pilots, Airplane[] airplanes, Flight[] flights)
    {
        String choice = null;
        SetUp setup = new SetUp();

        System.out.println("Welcome to Airline \nMENU");
        System.out.println("Select one option:");
        System.out.println("1: Show a particular flight");
        System.out.println("2: Show all the available aircraft");
        System.out.println("3: Show a particular aircraft");
        System.out.println("4: Show all Pilots");
        System.out.println("5: Show a particular Pilot");
        System.out.println("6: Create a flight");
        System.out.println("7: Quit");

        do {
            choice = scan.nextLine();
            switch (choice) 
            {
                case "1": 
                {
                    oneFlight(flights);
                    new Menu(pilots,airplanes,flights);
                    break;
                }
                case "2": 
                {
                    setup.setAircrafts(airplanes, pilots);
                    new Menu(pilots,airplanes,flights);
                    break;
                }
                case "3": 
                {
                    oneAircraft(airplanes);
                    new Menu(pilots,airplanes,flights);
                    break;
                }
                case "4": 
                {        
                    setup.setPilots(pilots);
                    new Menu(pilots,airplanes,flights);
                    break;
                }
                case "5": 
                {
                    onePilot(pilots);
                    new Menu(pilots,airplanes,flights);
                    break;
                }
                case "6": 
                {
                }
                case "7": 
                {
                    System.exit(0);
                }
                default: 
                {
                    System.out.println("You chose and invalid option. Please, try again.\n");
                    break;
                }

            } 
            // end of switch

        } while (!choice.equals("6")); 
        // end of do-while

    }
    
    public void oneFlight(Flight[] flights){
        System.out.println("Choose an flight between 1 and "+ flights.length);
        int id = scan.nextInt();
        System.out.println(flights[id-1]);
    }

    public void oneAircraft(Airplane[] airplanes){
        System.out.println("Choose an Airplane between 1 and "+ airplanes.length);
        int id = scan.nextInt();
        System.out.println(airplanes[id]);   
    }
    
    public void onePilot(Pilot[] pilots){
        System.out.println("Choose an Pilot between 1 and "+ pilots.length);
        int id = scan.nextInt();
        System.out.println(pilots[id]);   
    }

}
