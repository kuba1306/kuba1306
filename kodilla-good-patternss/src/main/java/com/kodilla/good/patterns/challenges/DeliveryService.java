package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface DeliveryService {
    public boolean delivery(User user, LocalDateTime ordered, LocalDateTime estimatedDeliveryTime);
}
