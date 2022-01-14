package com.kodilla.patterns.builder.bigmac;

public class Sauce {

    public static final String STANDARD = "STANDARD";
    public static final String ISLANDS = "ISLANDS";
    public static final String BARBECUE = "BARBECUE";
    private String sauce;

    public Sauce(String sauce) {
        if (sauce.equals(STANDARD) || sauce.equals(ISLANDS) || sauce.equals(BARBECUE)) {
            this.sauce = sauce;
            throw new IllegalStateException("You should choose between: STANDARD, ISLANDS and BARBECUE sauce");
        }
    }

    public String getSauce() {
        return sauce;
    }
}
