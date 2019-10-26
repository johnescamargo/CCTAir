package cctair;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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
    String[] departure = {"10:30", "11:30", "12:30", "13:30", "14:30", "15:30", "16:30"};
    String[] arrival = {"17:30", "18:30", "19:30", "20:30", "21:30", "22:30", "23:30", "00:30"};
    Date dateOfFlight = new Date();

    Random rGen = new Random();

    public Airplane[] setAircrafts(Airplane[] airplane, Pilot[] pilot) {

        for (int i = 0; i < airplane.length; i++) {
            airplane[i] = new Airplane();

            airplane[i].setIdAircraft(i + 2050);
            airplane[i].setMake(makes[rGen.nextInt(makes.length)]);
            airplane[i].setModel(model[rGen.nextInt(model.length)]);
            airplane[i].setCapacity(capacity[rGen.nextInt(capacity.length)]);
            airplane[i].assignPilot(pilot);
            System.out.println(airplane[i]);

        }
        return airplane;
    }

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

    public void setFlights(ArrayList<Flight> flights, Airplane[] airplane, Pilot[] pilot) {
        //ArrayList<Flight> flights = new ArrayList<>();
        Flight[] flight = new Flight[10];
        Pilot pilots[] = new Pilot[26];
        Airplane airplanes[] = new Airplane[20];
        String[] origins = new String[13];
        String[] destinations = new String[13];
        String[] departures = new String[13];
        String[] arrivals = new String[13];

        System.arraycopy(pilot, 0, pilots, 0, airplane.length);

        System.arraycopy(airplane, 0, airplanes, 0, airplane.length);

        for (int i = 0; i <= 10; i++) {

            origins[0] = origin[rGen.nextInt(origin.length)];
            destinations[0] = destination[rGen.nextInt(destination.length)];
            departures[0] = departure[rGen.nextInt(departure.length)];
            arrivals[0] = arrival[rGen.nextInt(arrival.length)];
            pilots[0] = pilot[rGen.nextInt(pilot.length)];
            airplanes[0] = airplane[rGen.nextInt(airplane.length)];
            Date dateOfFlights = dateOfFlight;

            flights.add(new Flight(origins[0], destinations[0], departures[0], arrivals[0], dateOfFlights, airplanes[0], pilots[0]));
            //flights.add(new Flight(origins, destinations, departures, arrivals, dateOfFlights, airplanes, pilots));
           // Iterator<Flight> iterator = flights.iterator();
        }
        // return flights;

    }
}
