package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            System.out.println(firstChallenge.divide(20,0));
        } catch (ArithmeticException e) {
            System.out.println("nie przez 0");
        } finally {
            System.out.println("end of the program");
        }
    }
}