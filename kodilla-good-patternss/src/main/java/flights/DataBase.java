package flights;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    final List<Flight> theList = new ArrayList<>();

    Flight f1 = new Flight("POZ", "WAW");
    Flight f2 = new Flight("POZ", "KRK");
    Flight f3 = new Flight("POZ", "WRO");
    Flight f4 = new Flight("POZ", "GDN");
    Flight f5 = new Flight("POZ", "BER");
    Flight f6 = new Flight("POZ", "PMI");
    Flight f7 = new Flight("POZ", "AMM");
    Flight f8 = new Flight("POZ", "PTY");
    Flight f9 = new Flight("POZ", "BUD");

    Flight f10 = new Flight("BER", "WAW");
    Flight f11 = new Flight("BER", "KRK");
    Flight f12 = new Flight("BER", "WRO");
    Flight f13 = new Flight("BER", "GDN");
    Flight f14 = new Flight("WAW", "BER");
    Flight f15 = new Flight("WAW", "PMI");
    Flight f16 = new Flight("BER", "AMM");
    Flight f17 = new Flight("BER", "PTY");
    Flight f18 = new Flight("WAW", "BUD");

    public List<Flight> addingDataToList() {
        theList.add(f1);
        theList.add(f2);
        theList.add(f3);
        theList.add(f4);
        theList.add(f5);
        theList.add(f6);
        theList.add(f7);
        theList.add(f8);
        theList.add(f9);
        theList.add(f10);
        theList.add(f11);
        theList.add(f13);
        theList.add(f14);
        theList.add(f15);
        theList.add(f16);
        theList.add(f17);
        theList.add(f18);
        theList.add(f12);

        return theList;
    }
}


