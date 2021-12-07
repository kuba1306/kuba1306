package flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightRequest {

    public List<String> requestOriginAllFlights(String originAirport) {

        DataBase data1 = new DataBase();
        List<String> origins = data1.addingDataToList().stream()
                .filter(flight -> flight.getOriginAirport().startsWith(originAirport))
                .map(Flight::getDestination)
                .collect(Collectors.toList());

        return origins;
    }

    public List<String> requestDestinationAllFlights(String destination) {
        DataBase data1 = new DataBase();
        List<String> destiny = data1.addingDataToList().stream()
                .filter(flight -> flight.getDestination().startsWith(destination))
                .map(Flight::getOriginAirport)
                .collect(Collectors.toList());

        return destiny;
    }
}
