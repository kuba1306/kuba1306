package com.kodilla.testing;

import com.kodilla.testing.Calculator.SimpleCalculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        SimpleCalculator counter = new SimpleCalculator();
        int a = 10;
        int b = 5;
        int substractResult = a - b;
        int addResult = a + b;

        if (counter.add(a, b) == addResult) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (counter.subtract(a, b) == substractResult) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}