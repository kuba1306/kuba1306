package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class World {
    public List<Continent> continentList = new ArrayList<>();

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public void addContinent(Continent continent) {
        continentList.add(continent);
    }

    public void removeContinent(Continent continent) {
        continentList.remove(continent);
    }

    public BigInteger getPeopleQuantity() {
        return continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulation)
                .reduce(BigInteger.ZERO, BigInteger::add);
    }
}
