package flights;

import java.util.List;

public class App {

    public static void main(String[] args) {

        String chosenOriginCity = "POZ";
        String chosenDestinationCity = "KRK";

        FlightService request = new FlightService();
        List<Flight> result1 = request.requestOriginAllFlights(chosenOriginCity);
        if (result1.size() > 0) {
            System.out.println("From" + " " + chosenOriginCity + " " + "we found this direct connections:" + "" + result1);
        } else {
            System.out.println("we didn't find this direct connections ");
        }

        List<Flight> result2 = request.requestDestinationAllFlights(chosenDestinationCity);
        if (result2.size() > 0) {
            System.out.println("To:" + chosenDestinationCity + " " + "we found this direcct connections" + " " + result2);
        } else {
            System.out.println("we didn't find this direct connections ");
        }

        List<Flight> result3 = request.requestFlightWithConnection(chosenOriginCity, chosenDestinationCity);
        if (result3.size() > 0) {
            System.out.println("From:" + chosenOriginCity + " " + "You can fly to:" + " " + chosenDestinationCity + " " + "with connection" + result3);
        } else {
            System.out.println("we didn't find this any flight with connection ");

        }
    }
}