package com.kodilla.good.patterns.challenges;

import java.util.Locale;

public class InformationService {

    public void inform(User user) {
        System.out.println("Hello " + user.getName().toUpperCase(Locale.ROOT) + " " + user.getLastName().toUpperCase(Locale.ROOT) +", thank you for choosing our company");
    }
}
