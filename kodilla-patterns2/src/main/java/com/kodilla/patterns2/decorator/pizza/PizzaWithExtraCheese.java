package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class PizzaWithExtraCheese extends AbstractPizzaOrderDecorator {

    public PizzaWithExtraCheese(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }


    @Override
    public String getDescription() {
        return super.getDescription() + " + Extra Cheese";
    }
}
