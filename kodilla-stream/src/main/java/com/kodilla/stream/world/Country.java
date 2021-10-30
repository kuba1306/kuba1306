package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.Objects;

public final class Country {
    private final String name;
    private final BigInteger population;

    public Country(final String name, final BigInteger population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public BigInteger getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(population, country.population);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }
}
