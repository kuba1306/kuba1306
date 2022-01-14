package com.kodilla.patterns.builder.bigmac;

public class Bottom {

    public static final String BUN = "BUN";
    public static final String ROLL = "ROLL";
    private String bottom;

    public Bottom(String bottom) {
        if (bottom.equals(BUN) || bottom.equals(ROLL)) {
            this.bottom = bottom;
            throw new IllegalStateException("You should choose BUN or ROLL");
        }
    }

    public String getBottom() {
        return bottom;
    }
}