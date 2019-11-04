/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctair;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class Menu {

    // Global Variables
    Scanner scan = new Scanner(System.in);
    SetUp setup = new SetUp();
    DepartureArrivalTime dat = new DepartureArrivalTime();
    String origin1;
    String destination1;
    int id;
    int j;

    /**
     * Method that interacts with users of the system
     * @param pilots - receives an array of Class Pilot
     * @param airplanes - receives an array of Class Airplane
     * @param flights - receives an ArrayList of Class Flight
     */
    public void mainMenu(Pilot[] pilots, Airplane[] airplanes, ArrayList<Flight> flights) {

        String choice;
        do {

            System.out.println("Welcome to Airline \nMENU");
            System.out.println("Select one option:");
            System.out.println("1: Show a particular flight");
            System.out.println("2: Show all the available aircraft");
            System.out.println("3: Show a particular aircraft");
            System.out.println("4: Show all Pilots");
            System.out.println("5: Show a particular Pilot");
            System.out.println("6: Create a flight");
            System.out.println("7: Show all flights");
            System.out.println("8: Quit");
            choice = scan.next();

            switch (choice) {
                //-------------------------------------------------------------------                        
                case "1": //1: Show a particular flight
                    System.out.println("Choose an flight between 1 and " + flights.size());
                    try {
                        id = scan.nextInt() - 1;
                        int a = flights.size();
                        if (id < a && id >= 0) {
                            System.out.println(flights.get(id));
                            break;
                        } else {
                            System.out.println("You chose and invalid option. Please, try again.\n");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("You chose and invalid option. Please, try again.\n");
                        break;
                    }
                    break;
                //-------------------------------------------------------------------
                case "2":  //2: Show all the available aircraft
                    showAvailableAirplanes(airplanes);// Call method 
                    break;

                //-------------------------------------------------------------------
                case "3"://3: Show a particular aircraft
                    System.out.println("Choose an Airplane between 1 and " + airplanes.length);
                    try {
                        id = scan.nextInt() - 1;
                        int air = airplanes.length;
                        if (id < air && id >= 0) {
                            System.out.println(airplanes[id]);
                            break;
                        } else {
                            System.out.println("You chose and invalid option. Please, try again.\n");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("You chose and invalid option. Please, try again.\n");
                        break;
                    }
                    break;

                //-------------------------------------------------------------------        
                case "4": //4: Show all Pilots
                    for (Pilot airplane : pilots) {
                        System.out.println(airplane);
                    }
                    break;

                //-------------------------------------------------------------------
                case "5":  // 5: Show a particular Pilot
                    System.out.println("Choose an Pilot between 1 and "
                            + pilots.length);
                    try {
                        id = scan.nextInt() - 1;
                        int pil = pilots.length;
                        if (id < pil && id >= 0) {
                            System.out.println(pilots[id]);
                            break;
                        } else {
                            System.out.println("You chose and invalid option. "
                                    + "Please, try again.\n");
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("You chose and invalid option. "
                                + "Please, try again.\n");
                        break;
                    }
                    break;

                //-------------------------------------------------------------------
                case "6"://Create a Flight
                    if (flights.size() < 15) {
                        createFlight(flights, airplanes, pilots);
                        break;
                    } else {
                        System.out.println("You are not allowed to create any "
                                + "more flight");
                        break;
                    }

                //-------------------------------------------------------------------         
                case "7"://Display all flights
                    for (Flight flight1 : flights) {
                        System.out.println(flight1);
                    }
                    break;

                //-------------------------------------------------------------------        
                case "8"://Exit
                    System.out.println("Exiting...");
                    System.exit(0);

                //-------------------------------------------------------------------         
                default:
                    System.out.println("You chose and invalid option. Please, "
                            + "try again.\n");
                    break;
            }
            // end of switch ----------------------------------------------------

        } while (!"8".equals(choice));
        // end of do-while -----------------------------------------------------

    } // end of method ----------------------------------------------------------

    /**
     * Method that create new flights
     * @param pilot - receives an array of Class Pilot
     * @param airplanes - receives an array of Class Airplane
     * @param flights - receives an ArrayList of Class Flight
     */
    public void createFlight(ArrayList<Flight> flights, Airplane[] airplanes, Pilot[] pilot) {

        Airplane airplane = new Airplane();
        Pilot pilot1 = new Pilot();
        String origin = "";
        String destination = "";
        String dateOfFlight;
        int idPilot;
        String idAirplane;
        int idArrayPilot;
        String x = "0";

        //Choose available airplanes 
        do {

            ArrayList<Airplane> airplaneMenu = new ArrayList<>();
            airplaneMenu.clear();

            airplaneMenu = getAvailableAirplanes(airplanes);
            for (int i = 0; i < airplaneMenu.size(); i++) {
                System.out.println(airplaneMenu.get(i));

            }

            try {

                System.out.println("Choose an airplane from the List typeing in its ID");
                idAirplane = scan.next();

                for (int i = 0; i < airplaneMenu.size(); i++) {
                    String am = Integer.toString(airplaneMenu.get(i).getIdAircraft());
                    if (idAirplane.equals(am)) {
                        airplane = airplaneMenu.get(i);
                        System.out.println("Aircraft found" + "\n");
                        x = "1";
                        break;
                    } else {
                        x = "2";
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("You chose and invalid option. Please, try again.\n");

            }

        } while (!"1".equals(x));

        //Choose available pilots assigned to an airplane 
        do {

            x = "w";
            ArrayList<Pilot> pilotMenu = new ArrayList<>();
            pilotMenu.clear();

            System.out.println("These are the available Pilots assigned to this specific Aircraft at the moment");
            System.out.println("Choose one Pilot from the list typeing in the ID");

            pilotMenu = getAvailablePilotsforAnAirplane(airplane, pilot);
            for (int i = 0; i < pilotMenu.size(); i++) {
                System.out.println(pilotMenu.get(i));
            }

            //Choose Pilot from list of pilots
            try {

                System.out.println("Choose a pilot from the List. Type in its ID");
                String idPilot1 = scan.next();

                for (int i = 0; i < pilotMenu.size(); i++) {
                    String pm = Integer.toString(pilotMenu.get(i).getIdPilot());
                    if (idPilot1.equals(pm)) {
                        pilot1 = pilotMenu.get(i);
                        System.out.println("Pilot found");
                        x = "1";
                        break;
                    } else {
                        x = "2";
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("You chose and invalid option. Please, try again.\n");

            }

        } while (!"1".equals(x));

        //Choose an Origin
        do {

            System.out.println("Type 1 for " + setup.origin[0]);
            System.out.println("Type 2 for " + setup.origin[1]);

            System.out.println("Type in the Origin from the list above");
            origin1 = scan.next();

            if ("1".equals(origin1)) {
                origin = setup.origin[0];
                origin1 = "1";
            } else if ("2".equals(origin1)) {
                origin = setup.origin[0];
                origin1 = "1";
            } else {
                System.out.println("You chose and invalid option. Please, try again.\n");
            }

        } while (!"1".equals(origin1));

        // Choose a Destination
        do {

            for (int i = 0; i < setup.destination.length; i++) {
                System.out.println("Type " + (i + 1) + " for " + setup.destination[i]);
            }
            System.out.println("Except: " + origin);

            System.out.println("Type in the Destination");
            destination1 = scan.next();

            if ("1".equals(destination1)) {
                if (origin.equals(setup.destination[0])) {
                    destination1 = "w";
                } else {
                    destination = setup.destination[0];
                    destination1 = "1";
                }
            } else if ("2".equals(destination1)) {
                if (origin.equals(setup.destination[1])) {
                    destination1 = "w";
                } else {
                    destination = setup.destination[1];
                    destination1 = "1";
                }
            } else if ("3".equals(destination1)) {
                destination = setup.destination[2];
                destination1 = "1";
            } else if ("4".equals(destination1)) {
                destination = setup.destination[3];
                destination1 = "1";
            } else if ("5".equals(destination1)) {
                destination = setup.destination[4];
                destination1 = "1";
            } else if ("6".equals(destination1)) {
                destination = setup.destination[5];
                destination1 = "1";
            } else if ("7".equals(destination1)) {
                destination = setup.destination[6];
                destination1 = "1";
            } else if ("8".equals(destination1)) {
                destination = setup.destination[7];
                destination1 = "1";
            } else if ("9".equals(destination1)) {
                destination = setup.destination[8];
                destination1 = "1";
            } else if ("10".equals(destination1)) {
                destination = setup.destination[9];
                destination1 = "1";
            } else if ("11".equals(destination1)) {
                destination = setup.destination[10];
                destination1 = "1";
            } else {
                System.out.println("You chose and invalid option. Please, try again.\n");
            }

        } while (!"1".equals(destination1));

        System.out.println("Type in the day of Flight: (Ex. 21/12/2019)");
        dateOfFlight = scan.next();

        //Insert an ID into a Flight
        int idFlight = flights.size();
        Flight a = flights.get(idFlight - 1);
        int b = (int) a.getId() + 1;

        //Set new flight
        flights.add(new Flight(b, origin, destination, dateOfFlight, airplane, pilot1));
        //Set time of the flight
        dat.setTime(flights);
    }

    /**
     * Method that gets just available airplanes
     * @param airplanes - receives an array of Class Airplane
     * @return Airplane - return an ArrayList of Class Airplane
     */
    public ArrayList<Airplane> getAvailableAirplanes(Airplane[] airplanes) {
        ArrayList<Airplane> airplane1 = new ArrayList<>();
        airplane1.clear();
        for (Airplane airplane : airplanes) {
            if (airplane.isAvailable() == true) {
                airplane1.add(airplane);
            }
        }
        return airplane1;

    }

    /**
     * Method that displays just available airplanes
     * @param airplanes - receives an array of Class Airplane
     */
    public void showAvailableAirplanes(Airplane[] airplanes) {
        for (int i = 0; i < airplanes.length; i++) {
            if (airplanes[i].isAvailable() == true) {
                System.out.println(airplanes[i]);
            }
        }
    }

  
     /**
     * Method that displays and return an array of available pilots assigned to
     * a airplane
     *
     * @param airplane - receives an array of Class Airplane
     * @param pilot - receives an array of Class Airplane
     * @return Pilot - returns an ArrayList of Class Pilot
     */
    public ArrayList<Pilot> getAvailablePilotsforAnAirplane(Airplane airplane, Pilot[] pilot) {

        int[] pil = new int[30]; // array of Pilot's ID
        ArrayList<Pilot> ap = new ArrayList<>();

        //Save id of pilots assigned to the airplane
        for (int i = 0; i < airplane.getIdPilot().size(); i++) {
            pil[i] = airplane.getIdPilot().get(i);
        }

        //Add pilot to ArrayList
        for (int i = 0; i < pil.length; i++) {
            for (int j = 0; j < pilot.length; j++) {
                if (pil[i] == pilot[j].getIdPilot() && pilot[j].isAvailable() == true) {
                    ap.add(pilot[j]);
                }
            }
        }
        return ap;
    }
}
