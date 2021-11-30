package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    List<Shape> shapeCollection = new ArrayList<Shape>();

    public ShapeCollector(List<Shape> shapeCollection) {
        this.shapeCollection = shapeCollection;
    }

    public void addFigure() {
        shapeCollection.add(this.shape);
        System.out.println(this.shape);
    }

    public void removeFigure(List<Shape> shapeCollection) {
        shapeCollection.remove(this.shape);
        System.out.println(this.shape);
    }

    public void getFigure(int n) {
        shapeCollection.get(n);
        System.out.println(n);
    }

    public void showFigures() {
        for (int i = 0; i < shapeCollection.size(); i++) {
            System.out.println(i);
        }
    }
}
