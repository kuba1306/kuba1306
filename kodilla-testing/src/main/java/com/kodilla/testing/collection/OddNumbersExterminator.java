package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    List<Integer> numbers = new ArrayList<>();
    List<Integer> even = new ArrayList<>();


    public OddNumbersExterminator() {
        List<Integer> numbers = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
    }

    public void exterminate(ArrayList<Integer> numbers) {
        List<Integer> even = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                even.add(number);
            }
        }
        System.out.println(even);
        System.out.println("...............................................................");
    }
}


