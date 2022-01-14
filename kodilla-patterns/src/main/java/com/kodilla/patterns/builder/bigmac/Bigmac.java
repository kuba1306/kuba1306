package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bottom;
    private final String sauce;
    private final int burgers;
    private List<String> ingredients = new ArrayList<>();

    private Bigmac(String bottom, String sauce, int burgers, List<String> ingredients) {
        this.bottom = bottom;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBottom() {
        return bottom;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public static class BigmacBuilder {
        private String bottom = "";
        private String sauce = "";
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bottom) {
            this.bottom = bottom;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bottom, sauce, burgers, ingredients);
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bottom + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
