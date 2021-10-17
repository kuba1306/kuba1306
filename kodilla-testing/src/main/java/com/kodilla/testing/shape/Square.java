package com.kodilla.testing.shape;

public class Square implements Shape {

    String name;
    double squareSide;

    public Square(String name, double squareSide) {
        this.name = name;
        this.squareSide = squareSide;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        double field = squareSide * squareSide;
        return field;
    }
}