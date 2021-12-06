package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PaymentMethod {
    public boolean isPaid(User user, LocalDateTime from, LocalDateTime to);

    public void pay();
}
