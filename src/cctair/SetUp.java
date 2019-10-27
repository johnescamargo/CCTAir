package cctair;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class SetUp {

    //Global variables
    String[] names = {"John", "Mary", "Dave", "Joshua", "Rebecca", "Anne", "Mark"};
    String[] surnames = {" Jones", " O'Camargo", " O'Silva", " Gerrard", " Gate", " Drinkwater", " Python", " Vimm"};

    String[] makes = {"Embraer", "Boing", "Airbus"};
    String[] model = {"707", "860", "870", "890", "830", "353", "160", "855", "700"};
    int[] capacity = {300, 400, 350, 200, 250, 400};
    int[] rank = {1, 2, 3};

    String[] origin = {"Dublin", "Porto", "Paris", "Sao Paulo",
        "Tokio", "Liverpool", "Manchester", "Rome", "New York", "Florida", "Lisbon", "London", "Rio de Janeiro"};
    String[] destination = {"Dublin", "Porto", "Paris", "Sao Paulo",
        "Tokio", "Liverpool", "Manchester", "Rome", "New York", "Florida", "Lisbon", "London", "Rio de Janeiro"};
    String[] departure = {"10:30", "11:30", "12:30", "13:30", "14:30", "15:30", "16:30",};
    String[] arrival = {"17:30", "18:30", "19:30", "20:30", "21:30", "22:30", "23:30", "00:30"};
    Date dateOfFlight;
    //Airplane[] airplane = new Airplane[1];
    Pilot pilot = new Pilot();

    Pilot[] listPilot;

    //    • origin (e.g. “Dublin”) 
//    • destination (e.g. “New York”) 
//    • departure time (e.g. “10:10”)   ****
//    • arrival time (e.g “13:30”)         ****
//    • date of flight (e.g. “05/12/2015”) 
//    • aircraft assigned (this should be an object); 
    Random rGen = new Random();

    public Airplane[] setAircrafts(Airplane[] airplane, Pilot[] pilot) {

        for (int i = 0; i < airplane.length; i++) {
            airplane[i] = new Airplane();

            airplane[i].setIdAircraft(i + 2050);
            airplane[i].setMake(makes[rGen.nextInt(makes.length)]);
            airplane[i].setModel(model[rGen.nextInt(model.length)]);
            airplane[i].setCapacity(capacity[rGen.nextInt(capacity.length)]);
            Pilot validatedPilot = verifyPilot(airplane[i].getCapacity(), pilot);
            airplane[i].assignPilot(validatedPilot);
            System.out.println(airplane[i]);

        }
        return airplane;
    }

    public Pilot verifyPilot(int flightCapacity, Pilot[] pilot) {

        Pilot myPilot;

        if (flightCapacity >= 200 && flightCapacity <= 300) {
            do {
                myPilot = pilot[rGen.nextInt(pilot.length)];
                if (myPilot.getRank() == 1) {
                    return myPilot;
                }
            } while (myPilot.getRank() != 1);
        }

        if (flightCapacity > 300 && flightCapacity < 300) {
            do {
                myPilot = pilot[rGen.nextInt(pilot.length)];
                if (myPilot.getRank() == 2) {
                    return myPilot;
                }
            } while (myPilot.getRank() != 2);
        }

        if (flightCapacity >= 300 && flightCapacity <= 400) {
            do {
                myPilot = pilot[rGen.nextInt(pilot.length)];
                if (myPilot.getRank() == 3) {
                    return myPilot;
                }
            } while (myPilot.getRank() != 3);
        }

        return null;

    }
    //Method to create Flights with the Planes and Pilots created, and also using the data file

    public Pilot[] setPilots(Pilot[] pilot) {

        for (int i = 0; i < pilot.length; i++) {
            pilot[i] = new Pilot();
            pilot[i].setName(names[rGen.nextInt(names.length)] + surnames[rGen.nextInt(names.length)]);
            pilot[i].setIdPilot(100 + i);
            pilot[i].setRank(rank[rGen.nextInt(rank.length)]);
            System.out.println(pilot[i]);
        }
        return pilot;
    }

    public Flight[] setFlights(Flight[] flight,Airplane[] airplanes) {


        for(int i=0;i<10;i++){
        flight[i]=new Flight();
        flight[i].setId(201+i);
        flight[i].setAirplane(airplanes[rGen.nextInt(airplanes.length)]);
        
        String dest;
        String ori;
        do{
            dest=destination[rGen.nextInt(destination.length)];
            ori=origin[rGen.nextInt(origin.length)];
        }while(ori==dest);
        flight[i].setOrigin(ori);
        flight[i].setDestination(dest);
        flight[i].setDeparture(departure[rGen.nextInt(departure.length)]);
        flight[i].setArrival(arrival[rGen.nextInt(arrival.length)]);
        flight[i].setDateOfFlight(arrival[rGen.nextInt(arrival.length)]);
        flight[i].setDateOfFlight(randomDate());
        System.out.println(flight[i]);
        }
        return flight;

    }

    public String randomDate() {
        String flightDate = null;
        int day = rGen.nextInt(31);
        int month = rGen.nextInt(2) + 11;
        int year = 2019;

        flightDate = String.valueOf(year + "/" + month + "/" + day);

        return flightDate;
    }

}
