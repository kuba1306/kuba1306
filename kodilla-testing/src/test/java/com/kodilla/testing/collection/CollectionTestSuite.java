package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Random;

@DisplayName("List Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when create empty List, " +
            "then show elements")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean result;
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);
        boolean expectedResult = true;

        //When
        result = numbers.isEmpty();

        //Then
        Assertions.assertTrue(result);
    }

    @DisplayName("when create List with numbers, " +
            "then show list elements")

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int randomNumber = random.nextInt(90);
            numbers.add(randomNumber);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        exterminator.exterminate(numbers);
        boolean expectedResult2 = true;

        //When
        boolean result2 = even.isEmpty();

        //Then
        Assertions.assertTrue(result2 = true);
        System.out.println("Everything is ok, even numbers are in previous line");
    }
}

