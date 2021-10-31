package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    int[] numbers = new int[20];

    public static OptionalDouble getAverage(final int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.print(numbers[n]+","+" "));
        System.out.println(" ");
        System.out.println("And average equals --------> " + " " + Arrays.stream(numbers).average());

       return Arrays.stream(numbers).average();
    }
}
