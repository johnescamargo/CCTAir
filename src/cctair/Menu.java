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
    ArrayList<Pilot> pilotsAirplane = new ArrayList<>();
    SetUp setup = new SetUp();

    int id;
    int j;

    public void mainMenu(Pilot[] pilots, Airplane[] airplanes, ArrayList<Flight> flights) {
        int choice;
        do {

            System.out.println("Welcome to Airline \nMENU");
            System.out.println("Select one option:");
            System.out.println("1: Show a particular flight");
            System.out.println("2: Show all the available aircraft");
            System.out.println("3: Show a particular aircraft");
            System.out.println("4: Show all Pilots");
            System.out.println("5: Show a particular Pilot");
            System.out.println("6: Create a flight");
            System.out.println("7: Quit");
            choice = scan.nextInt();

            switch (choice) {
                case 1: //1: Show a particular flight
                    System.out.println("Choose an flight between 1 and " + flights.size());
                    id = scan.nextInt() - 1;
                    System.out.println(flights.get(id));
                    break;
                case 2:  //2: Show all the available aircraft
                    showAvailableAirplanes(airplanes);// Call method 
                    break;
                case 3://3: Show a particular aircraft"
                    System.out.println("Choose an Airplane between 1 and " + airplanes.length);
                    id = scan.nextInt();
                    System.out.println(airplanes[id]);
                    break;
                case 4: //4: Show all Pilots
                    for (Pilot airplane : pilots) {
                        System.out.println(airplane);
                    }
                    break;
                case 5:  // 5: Show a particular Pilot
                    System.out.println("Choose an Pilot between 1 and " + pilots.length);
                    id = scan.nextInt();
                    System.out.println(pilots[id]);
                    break;
                case 6://Create a Flight
                    createFlight(flights, airplanes, pilots);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("You chose and invalid option. Please, try again.\n");
                    break;
            }
            // end of switch

        } while (choice != 7);
        // end of do-while

    }

    public void createFlight(ArrayList<Flight> flights, Airplane[] airplanes, Pilot[] pilot) {

        Airplane airplane = new Airplane();
        String origin = "";
        String destination = "";
        String departureTime;
        String arrivalTime;
        String dateOfFlight;
        int idPilot;
        int idAirplane;
        int idArrayPilot = 0;

        //Choose available airplane    
        showAvailableAirplanes(airplanes);
        System.out.println("Choose an airplane from the List typeing in its ID");
        idAirplane = scan.nextInt();

        for (Airplane airplane1 : airplanes) {
            if (idAirplane == airplane1.getIdAircraft()) {
                airplane = airplane1;
                System.out.println("Aircraft found");
                break;
            }
        }

        //Choose available pilots assigned to an airplane 
        System.out.println("These are the available Pilots assigned to this specific Aircraft at the moment");
        System.out.println("Choose one Pilot from the list typeing in the ID");

        showAvailablePilotsforAnAirplane(airplane, pilot);//Receive array of Pilots
        idPilot = scan.nextInt();

        for (Pilot pilotsAirplane1 : pilotsAirplane) {
            System.out.println("pilots arrayList :  " + pilotsAirplane1);
        }

 
        System.out.println("Type in the Origin from the list above");
        origin = scan.next();

        System.out.println("Type in the Destination");
        destination = scan.next();

        System.out.println("Type in Departure time: (Ex. 10:20)");
        departureTime = scan.next();
        
          for (int i = 0; i < setup.destination.length; i++) {
            System.out.println("" + setup.destination[i]);
        }

        System.out.println("Type in Arrival time: (Ex. 17:20)");
        arrivalTime = scan.next();

        System.out.println("Type in the day of Flight: (Ex. 21/12/2019)");
        dateOfFlight = scan.next();

        int idFlight = flights.size();
        System.out.println("idFlight" + idFlight);

        System.out.println("idFlight" + idFlight);

        Flight a = flights.get(idFlight - 1);
        System.out.println("flight" + a);
        int b = (int) a.getId() + 1;

        flights.add(new Flight(b, origin, destination, dateOfFlight, airplane, pilotsAirplane.get(id)));
    }

    //Method to show just available airplanes
    public void showAvailableAirplanes(Airplane[] airplanes) {
        for (Airplane airplane : airplanes) {
            if (airplane.isAvailable() == false) {
                System.out.println(airplane);
            }
        }

    }

    //Method to save and return an array of availble pilots assigned to the airplane 
    public void showAvailablePilotsforAnAirplane(Airplane airplane, Pilot[] pilot) {

        int[] pil = new int[25]; // array of Pilots

        //Save id of pilots assigned to the airplane
        for (int i = 0; i < airplane.getIdPilot().size(); i++) {
            pil[i] = airplane.getIdPilot().get(i);//Working
        }

        for (int i = 0; i < pil.length; i++) {
            for (int j = 0; j < pilot.length; j++) {
                if (pil[i] == pilot[j].getIdPilot() && pilot[j].isAvailable() == false) {
                    pilotsAirplane.add(pilot[j]);
                    System.out.println(pilot[j]);
                }
            }
        }

    }

}
