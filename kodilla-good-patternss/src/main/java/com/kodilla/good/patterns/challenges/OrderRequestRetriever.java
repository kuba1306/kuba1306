package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public static OrderRequest retrieve() {
        User user = new User("John", "Wekl");

        LocalDateTime ordered = LocalDateTime.of(2021, 11, 15, 12, 0);
        LocalDateTime estimatedDeliveryTime = LocalDateTime.of(2021, 12, 10, 12, 0);

        return new OrderRequest(user, ordered, estimatedDeliveryTime);
    }

}