package com.kodilla.exception.test;

import java.util.Map;

public class FlightSearchEngine {

    private final Map<String, Boolean> flightMap;

    public FlightSearchEngine(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    public void findFlight(String airport) throws RouteNotFoundException {

        if (flightMap.get(airport) != null && airport != null) {
            if (flightMap.get(airport)) {
                System.out.println("We found the route from" + " " + airport);
            } else {
                System.out.println("We didn't find this route from: " + " " + airport);
            }
        } else {
            throw new RouteNotFoundException("Airport doesn't exist.");
        }
    }
}

