package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final Display display;

    @Autowired
    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double addResult = a + b;
        display.show(addResult);
        return addResult;
    }

    public double sub(double a, double b) {
        double subResult = a - b;
        display.show(subResult);
        return subResult;
    }

    public double mul(double a, double b) {
        double mulResult = a * b;
        display.show(mulResult);
        return mulResult;
    }

    public double div(double a, double b) {
        double divResult = a / b;
        display.show(divResult);
        return divResult;
    }
}
