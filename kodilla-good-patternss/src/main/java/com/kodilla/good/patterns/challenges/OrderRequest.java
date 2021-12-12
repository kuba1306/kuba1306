package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private final String something;
    private final User user;
    private final LocalDateTime ordered;
    private final LocalDateTime estimatedDeliveryTime;
    private final boolean cashOnAccount;

    public OrderRequest(final String something, final User user, final LocalDateTime from, final LocalDateTime estimatedDeliveryTime, final boolean cashOnAccount) {
        this.something = something;
        this.user = user;
        this.ordered = from;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.cashOnAccount = cashOnAccount;

    }

    public String getSomething() {return something;}

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrdered() {
        return ordered;
    }

    public LocalDateTime getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public boolean isCashOnAccount() {
        return cashOnAccount;
    }
}