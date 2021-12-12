package flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public List<Flight> requestOriginAllFlights(String originAirport) {

        DataBase data1 = new DataBase();
        List<Flight> origins = data1.addingDataToList().stream()
                .filter(flight -> flight.getOriginAirport().equals(originAirport))
                .collect(Collectors.toList());

        return origins;
    }

    public List<Flight> requestDestinationAllFlights(String destination) {
        DataBase data1 = new DataBase();
        List<Flight> destiny = data1.addingDataToList().stream()
                .filter(flight -> flight.getDestination().equals(destination))
                .collect(Collectors.toList());

        return destiny;
    }
}
