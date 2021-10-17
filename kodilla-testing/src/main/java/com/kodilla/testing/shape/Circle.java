package com.kodilla.testing.shape;

public class Circle implements Shape {

    public String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        double field = 3.14 * this.radius * this.radius;
        return field;
    }
}
