package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private final User user;
    private final LocalDateTime ordered;
    private final LocalDateTime estimatedDeliveryTime;

    public OrderRequest(final User user, final LocalDateTime from, final LocalDateTime estimatedDeliveryTime) {
        this.user = user;
        this.ordered = from;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrdered() {
        return ordered;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }
}