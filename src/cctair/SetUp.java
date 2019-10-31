package cctair;

import java.util.ArrayList;
import java.util.Random;

public class SetUp {

    //Global variables
    String[] names = {"John", "Mary", "Dave", "Joshua", "Rebecca", "Anne",
        "Mark"};
    String[] surnames = {" Jones", " O'Camargo", " O'Silva", " Gerrard",
        " Gate", " Drinkwater", " Python", " Vimm"};

    String[] makes = {"Embraer", "Boing", "Airbus"};
    int[] model = {707, 860, 870, 890, 830, 353, 160, 855,
        700};
    int[] capacity = {300, 400, 350, 200, 250, 400};
    int[] rank = {1, 2, 3};

    String[] origin = {"Dublin", "Cork"};
    String[] destination = {"Dublin", "Porto", "Paris", "Bucharest",
        "Liverpool", "Manchester", "Rome", "Cork",
        "Lisbon", "London", "Glasgow"};
    String[] departure = {"10:30", "11:30", "12:30", "13:30", "14:30", "15:30",
        "16:30"};
    String[] arrival = {"17:30", "18:30", "19:30", "20:30", "21:30", "22:30",
        "23:30", "00:30"};
    String[] date = {"30/11/2019", "20/11/2019", "29/11/2019", "28/11/2019",
        "17/11/2019", "21/11/2019", "25/11/2019", "19/11/2019",
        "04/12/2019", "05/12/2019", "06/12/2019"};

    int id = 1;

    Random rGen = new Random();

    public Airplane[] setAircrafts(Airplane[] airplane, Pilot[] pilot) {

        for (int i = 0; i < airplane.length; i++) {
            airplane[i] = new Airplane();

            airplane[i].setIdAircraft(i + 2050);
            airplane[i].setMake(makes[rGen.nextInt(makes.length)]);
            airplane[i].setModel(model[rGen.nextInt(model.length)]);
            airplane[i].setCapacity(capacity[rGen.nextInt(capacity.length)]);
            airplane[i].assignPilot(pilot);
        }
        return airplane;
    }

    public Pilot[] setPilots(Pilot[] pilot) {

        for (int i = 0; i < pilot.length; i++) {
            pilot[i] = new Pilot();
            pilot[i].setName(names[rGen.nextInt(names.length)] + surnames[rGen.nextInt(names.length)]);
            pilot[i].setIdPilot(100 + i);
            pilot[i].setRank(rank[rGen.nextInt(rank.length)]);
            // System.out.println(pilot[i]);
        }
        return pilot;
    }

    public ArrayList<Flight> setFlights(ArrayList<Flight> flights, Airplane[] airplane, Pilot[] pilot) {
        Pilot pilots[] = new Pilot[18];
        Airplane airplanes[] = new Airplane[15];
        String origins = "";
        String destinations = "";
        String dates = "";

        System.arraycopy(pilot, 0, pilots, 0, airplane.length);

        System.arraycopy(airplane, 0, airplanes, 0, airplane.length);

        for (int i = 0; i < 10; i++) {

            origins = origin[rGen.nextInt(origin.length)];
            destinations = destination[rGen.nextInt(destination.length)];
            pilots[i] = pilot[rGen.nextInt(pilot.length)];
            airplanes[i] = airplane[rGen.nextInt(airplane.length)];
            dates = date[rGen.nextInt(date.length)];

            if (!origins.equals(destinations)) {
                flights.add(new Flight(id, origins, destinations, dates, airplanes[i], pilots[i]));
                id++;
            } else {
                id--;
            }
        }
        return flights;

    }

    public void setTimeRandomly(ArrayList<Flight> flights) {
        Flight a = new Flight();
        for (int i = 0; i < flights.size(); i++) {
            a = flights.get(i);

            a.setDepartureTime(departure[rGen.nextInt(departure.length)]);
            a.setArrivalTime(arrival[rGen.nextInt(arrival.length)]);

        }

    }

}
