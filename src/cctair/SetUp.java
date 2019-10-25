package cctair;

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
    String[] departure = {"10:30","11:30","12:30","13:30","14:30","15:30","16:30",};
    String[] arrival = {"17:30","18:30","19:30","20:30","21:30","22:30","23:30","00:30"};
    Date dateOfFlight;
    //Airplane[] airplane = new Airplane[1];
    //Pilot[] pilot = new Pilot[1];

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

    public Flight[] setFlights(Flight[] flight) {

        for (int i = 0; i <= 10; i++) {

        }
        return flight;

    }
}
