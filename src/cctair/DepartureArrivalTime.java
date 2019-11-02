package cctair;

import java.util.ArrayList;

/**
 *
 * @author Johnes
 * @author Mihaela
 */
public class DepartureArrivalTime {

    String[] origin = {"Dublin", "Cork"};
    String[] destination = {"Dublin", "Porto", "Paris", "Bucharest",
        "Liverpool", "Manchester", "Rome", "Cork",
        "Lisbon", "London", "Glasgow"};

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
