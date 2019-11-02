package cctair;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class SetUp {

    //Global variables
    String[] names = {"John", "Mary", "Dave", "Joshua", "Rebecca", "Anne",
        "Mark", "Justin", "Paddy", "Apple", "Noel", "Amilcar", "Brendan"};
    String[] surnames = {" Jones", " Windows", " Netbeans", " Oracle",
        " Ubuntu", " Drinkwater", " Python", " Linux", " Case", " Pie", " Sony", " Asus", " MacOs"};

    String[] makes = {"Embraer", "Boing", "Airbus"};
    int[] model = {707, 860, 870, 890, 830, 353, 160, 855,
        700, 800, 900};
    int[] capacity = {300, 400, 350, 200, 250, 400};
    int[] rank = {1, 2, 3};

    String[] origin = {"Dublin", "Cork"};
    String[] destination = {"Dublin", "Cork", "Paris", "Bucharest",
        "Liverpool", "Manchester", "Rome", "Porto",
        "Lisbon", "London", "Glasgow"};
    String[] departure = {"10:30", "11:30", "12:30", "13:30", "14:30", "15:30",
        "16:30"};
    String[] arrival = {"17:30", "18:30", "19:30", "20:30", "21:30", "22:30",
        "23:30", "00:30"};
    String[] date = {"21/11/2019", "20/11/2019", "23/11/2019", "22/11/2019"};

    int id = 1;

    Random rGen = new Random();

    public Airplane[] setAircrafts(Airplane[] airplane, Pilot[] pilot) {

        for (int i = 0; i < airplane.length; i++) {
            airplane[i] = new Airplane();

            airplane[i].setIdAircraft(i + 201);
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
            pilot[i].setIdPilot(101 + i);
            pilot[i].setRank(rank[rGen.nextInt(rank.length)]);
            // System.out.println(pilot[i]);
        }
        return pilot;
    }

    public ArrayList<Flight> setFlights(ArrayList<Flight> flights, Airplane[] airplane, Pilot[] pilot) {
        ArrayList<Pilot> pilots = new ArrayList<>();
        String origins = "";
        String destinations = "";
        String dates = "";
        Pilot pil = new Pilot();
        Airplane air = new Airplane();

        for (int i = 0; i < 10; i++) {
            pilots.clear();
            origins = origin[rGen.nextInt(origin.length)];
            destinations = destination[rGen.nextInt(destination.length)];
            dates = date[rGen.nextInt(date.length)];
            air = airplane[rGen.nextInt(airplane.length)];

            for (int j = 0; j < air.getIdPilot().size(); j++) {// Save pilots

                for (int x = 0; x < pilot.length; x++) {
                    if (air.getIdPilot().get(j) == pilot[x].getIdPilot()) {
                        pilots.add(pilot[x]);
                    }
                }
            }

            pil = pilots.get(rGen.nextInt(pilots.size()));

            if (origins != destinations && pil.isAvailable() == true) {
                flights.add(new Flight(id, origins, destinations, dates, air, pil));
                id++;
            } else {
                i--;
            }
        }
        return flights;

    }

}
