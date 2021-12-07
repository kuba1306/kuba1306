package flights;

import java.util.List;

public class App {

    public static void main(String[] args) {

        FlightRequest request = new FlightRequest();
        List<String> result1 = request.requestOriginAllFlights("WAW");
        System.out.println("Avaleible destinations from chosen airport " + " " +result1);
    }
}