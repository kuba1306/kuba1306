package com.kodilla.patterns2.decorator.pizza;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Basic Pizza Margaritha(cheese and tomato sos", description);
    }

    @Test
    public void testMyPizzaWithFruitsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaForChildren(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), theCost);
    }

    @Test
    public void testMyPizzaWithFruitsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaForChildren(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic Pizza Margaritha(cheese and tomato sos + Additional Fruits for example pinaple", description);
    }

    @Test
    public void testMyPizzaWithFruitsMeatAndMushroomsAndExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaForChildren(theOrder);
        theOrder = new PizzaWithMeatAndMushrooms(theOrder);
        theOrder = new PizzaWithExtraCheese(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(50), theCost);
    }

    @Test
    public void testMyPizzaWithFruitsMeatAndMushroomsAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new HawaiiPizzaForChildren(theOrder);
        theOrder = new PizzaWithMeatAndMushrooms(theOrder);
        theOrder = new PizzaWithExtraCheese(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic Pizza Margaritha(cheese and tomato sos + Additional Fruits for example pinaple" +
                " + Additional mushrooms and chicken + Extra Cheese", description);
    }
}

