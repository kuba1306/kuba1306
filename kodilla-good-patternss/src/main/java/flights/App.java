package flights;

public class App {

    public static void main(String[] args) {

        FlightRequest request = new FlightRequest();
        System.out.println(request.requestOriginAllFlights("POZ"));
    }
}