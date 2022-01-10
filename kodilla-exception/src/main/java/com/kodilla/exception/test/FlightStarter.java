package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightStarter {

    public static void main(String[] args) {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("BERLIN", true);
        flightMap.put("WARSAW", true);
        flightMap.put("LONDON", false);
        flightMap.put("ROME", true);
        flightMap.put("RIO DE JANERIO", false);

        FlightSearchEngine flightFinder = new FlightSearchEngine(flightMap);

        try {
            flightFinder.findFlight("LONDON");
        } catch (RouteNotFoundException e) {
            System.out.println("We didn't find expected route");
        }

    }
}