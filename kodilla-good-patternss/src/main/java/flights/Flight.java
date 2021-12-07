package flights;

public class Flight {

    private String originAirport;
    private String destination;

    public Flight(String originAirport, String destination) {
        this.originAirport = originAirport;
        this.destination = destination;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "originAirport='" + originAirport + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
