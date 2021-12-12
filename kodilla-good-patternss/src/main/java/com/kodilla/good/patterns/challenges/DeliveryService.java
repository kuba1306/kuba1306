package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class DeliveryService {

    public boolean isDelivered(User user, LocalDateTime ordered, LocalDateTime estimatedDeliveryTime) {
        if (estimatedDeliveryTime.isAfter(LocalDateTime.now())) {
            return true;
        } else
            return false;
    }
}


