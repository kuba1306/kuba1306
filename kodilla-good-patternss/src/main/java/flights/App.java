package flights;

import java.util.List;

public class App {

    public static void main(String[] args) {

        String chosenCity = "WAW";

        FlightService request = new FlightService();
        List<Flight> result1 = request.requestOriginAllFlights(chosenCity);
        System.out.println("From" + " " + chosenCity + " " + "you can fly to:" + ""+ result1);

        List<Flight> result2 = request.requestDestinationAllFlights(chosenCity);
        System.out.println("To:"+ chosenCity + " " + "You can fly from:" + " " + result2);
    }
}