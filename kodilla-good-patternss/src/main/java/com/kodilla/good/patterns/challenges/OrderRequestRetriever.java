package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public static OrderRequest retrieve() {

        String something = "Kalosze";
        User user = new User("Adam", "Kowalski");
        LocalDateTime ordered = LocalDateTime.of(2021, 11, 15, 12, 0);
        LocalDateTime estimatedDeliveryTime = LocalDateTime.of(2022, 12, 10, 12, 0);
        boolean cashOnAccount=true;

        return new OrderRequest(something, user, ordered, estimatedDeliveryTime, cashOnAccount);
    }
}