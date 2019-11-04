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
public class DepartureArrivalTime {

    
     /**
     * Method that sets time according to origin and destinations
     * @param flights - receives an ArrayList of flights
     */
    public void setTime(ArrayList<Flight> flights) {
        Flight flight = new Flight();
        for (int i = 0; i < flights.size(); i++) {
            flight = flights.get(i);

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Porto".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Porto".equals(flights.get(i).getDestination())) {
                flight.schedule("13:00", "15:30");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Paris".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Paris".equals(flights.get(i).getDestination())) {
                flight.schedule("14:00", "15:30");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Bucharest".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Bucharest".equals(flights.get(i).getDestination())) {
                flight.schedule("07:00", "10:45");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Liverpool".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Liverpool".equals(flights.get(i).getDestination())) {
                flight.schedule("08:00", "08:45");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Manchester".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Manchester".equals(flights.get(i).getDestination())) {
                flight.schedule("06:00", "07:00");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Rome".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Rome".equals(flights.get(i).getDestination())) {
                flight.schedule("09:00", "11:05");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Cork".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Dublin".equals(flights.get(i).getDestination())) {
                flight.schedule("10:10", "10:40");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Lisbon".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Lisbon".equals(flights.get(i).getDestination())) {
                flight.schedule("18:00", "20:25");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "London".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "London".equals(flights.get(i).getDestination())) {
                flight.schedule("08:30", "09:30");
            }

            if ("Dublin".equals(flights.get(i).getOrigin()) && "Glasgow".equals(flights.get(i).getDestination())
                    || "Cork".equals(flights.get(i).getOrigin()) && "Glasgow".equals(flights.get(i).getDestination())) {
                flight.schedule("09:00", "11:05");
            }

        }

    }

}
