package flights;

import java.util.ArrayList;
import java.util.List;

public class FlightRequest {

    public static List<String> requestOriginAllFlights() {
        final List<Flight> theList = new ArrayList<>();

        theList.add(new Flight("POZ", "WAW"));
        theList.add(new Flight("POZ", "KRK"));
        theList.add(new Flight("POZ", "WRO"));
        theList.add(new Flight("POZ", "GDN"));
        theList.add(new Flight("POZ", "BER"));
        theList.add(new Flight("POZ", "PMI"));
        theList.add(new Flight("POZ", "AMM"));
        theList.add(new Flight("POZ", "PTY"));
        theList.add(new Flight("POZ", "BUD"));

        theList.add(new Flight("BER", "WAW"));
        theList.add(new Flight("BER", "KRK"));
        theList.add(new Flight("BER", "WRO"));
        theList.add(new Flight("BER", "GDN"));
        theList.add(new Flight("WAW", "BER"));
        theList.add(new Flight("BER", "PMI"));
        theList.add(new Flight("BER", "AMM"));
        theList.add(new Flight("BER", "PTY"));
        theList.add(new Flight("BER", "BUD"));



        return new ArrayList<>(theList);
    }
}
