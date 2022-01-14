package com.kodilla.patterns.builder.bigmac;

public class Ingredients {

    public static final String LETTUCE = "LETTUCE";
    public static final String ONION = "ONION";
    public static final String BACON = "BACON";
    public static final String CUCUMBER = "CUCUMBER";
    public static final String PEPPER = "PEPPER";
    public static final String CHEESE = "CHEESE";
    public static final String MUSHROOMS = "MUSHROOMS";
    public static final String SHRIMPS = "SHRIMPS";
    private String ingredient;

    public Ingredients(String ingredient) {
        if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON) ||
                ingredient.equals(CUCUMBER) || ingredient.equals(PEPPER) || ingredient.equals(CHEESE) ||
                ingredient.equals(MUSHROOMS) || ingredient.equals(SHRIMPS)) {
            this.ingredient = ingredient;
            throw new IllegalStateException("You can add only: LETTUCE, ONION, BACON, CUCUMBER, PEPPER, CHEESE, MUSHROOMS or SHRIMPS");
        }
    }

    public String getIngredient() {
        return ingredient;
    }
}
