package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] numbers = {4, 6, 5, 5, 5, 3, 4, 5, 3, 2, 3, 4, 5, 6, 3, 2, 4, 2, 1, 6};

        //When
        OptionalDouble expected = OptionalDouble.of(3.9);
        OptionalDouble result = getAverage(numbers);

        //Then
        Assertions.assertEquals(expected, result);


    }
}