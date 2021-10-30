package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    public String name;
    public Set<Country> countries = new HashSet<>();

    public Continent(final String name) {
        this.name = name;
    }
    public void addCountry(Country country) {
        countries.add(country);
    }
    public void removeCountry(Country country) {
        countries.remove(country);
    }
    public String getName() {
        return name;
    }
    public Set<Country> getCountries() {
        return countries;
    }
}
