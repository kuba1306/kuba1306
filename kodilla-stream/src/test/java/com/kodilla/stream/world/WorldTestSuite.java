package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    @DisplayName("Test for Europe")
    void testAddingnewNewEuropeanContries() {
        //Given

        List<Continent> continentList = new ArrayList<>();
        Continent Europe = new Continent("Europe");
        Country c1 = new Country("Germany", new BigInteger("81000000"));
        Country c2 = new Country("Poland", new BigInteger("38500876"));
        Country c3 = new Country("France", new BigInteger("6000000"));
        Country c4 = new Country("Italy", new BigInteger("59200187"));

        Europe.addCountry(c1);
        Europe.addCountry(c2);
        Europe.addCountry(c3);
        Europe.addCountry(c4);
        //184701063

        Country c5 = new Country("USA", new BigInteger("2428876"));
        Country c6 = new Country("Mexico", new BigInteger("75000876"));
        Country c7 = new Country("Canada", new BigInteger("37002362"));
        Continent NorthAmerica = new Continent("NorthAmerica");
        NorthAmerica.addCountry(c5);
        NorthAmerica.addCountry(c6);
        NorthAmerica.addCountry(c7);
        //299133177

        Continent Africa = new Continent("Africa");
        Country c8 = new Country("Egypt", new BigInteger("92002300"));
        Country c9 = new Country("RSA", new BigInteger("67000876"));
        Country c10 = new Country("Tunisia", new BigInteger("27002362"));
        Africa.addCountry(c8);
        Africa.addCountry(c9);
        Africa.addCountry(c10);

        World worldOne = new World(continentList);
        worldOne.addContinent(Europe);
        worldOne.addContinent(Africa);
        worldOne.addContinent(NorthAmerica);
        //485138715

        //When
        BigInteger result = worldOne.getPeopleQuantity();

        //Then
        BigInteger expectedPeople = new BigInteger("485138715");
        assertEquals(expectedPeople, result);

    }
}