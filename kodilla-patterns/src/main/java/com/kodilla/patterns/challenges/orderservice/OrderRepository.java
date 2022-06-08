package com.kodilla.patterns.challenges.orderservice;


public interface OrderRepository {

    boolean createOrder(OrderRequest orderRequest);
}