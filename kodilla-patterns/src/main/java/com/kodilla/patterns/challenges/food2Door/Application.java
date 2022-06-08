package com.kodilla.patterns.challenges.food2Door;

public class Application {

    public static void main(String[] args) {

        OrderRequest orderRequest = DummyDataProvider.createDummyOrderRequest();

        new OrderProcessor().processOrder(orderRequest);
    }
}