package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DrivingTask = "DrivingTask";
    public static final String PaintingTask = "PaitingTask";
    public static final String ShoppingTask = "ShoppingTask";

    public final Task setTask(final String taskClass) {
        switch (taskClass) {
            case DrivingTask:
                return new DrivingTask("Next holidays", "Spain", "plane");
            case PaintingTask:
                return new PaintingTask("Paint your living room", "blue", "apartment");
            case ShoppingTask:
                return new ShoppingTask("Shooping in grocer", "Oranges", 5.0);
            default:
                return null;
        }
    }
}
