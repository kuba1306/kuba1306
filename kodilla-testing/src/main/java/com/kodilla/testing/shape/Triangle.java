package com.kodilla.testing.shape;

public class Triangle implements Shape {

    String name;
    double basis;
    double height;

    public Triangle(String name, double basis, double height) {
        this.name = name;
        this.basis = basis;
        this.height = height;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        double field = this.basis * this.height * 0.5;
        return field;
    }
}