package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class PaymentMethod {

    public boolean isPaid(User user, LocalDateTime from, LocalDateTime to, boolean cashOnAccount) {
        if (cashOnAccount == true) {
            System.out.println("We achived your payment. We're preparing your order");
            return true;
        } else {
            System.out.println("Unfortunetly we didn't achive your payment yet");
            return false;
        }
    }
}
