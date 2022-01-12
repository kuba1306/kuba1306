package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void addTwoNumbers() {
        //Given

        //When
        double result = calculator.add(5, 7);

        //Then
        Assertions.assertEquals(12.0, result);
    }

    @Test
    void subTwoNumbers() {
        //Given

        //When
        double result = calculator.sub(9, 7);

        //Then
        Assertions.assertEquals(2.0, result);
    }

    @Test
    void mulTwoNumbers() {
        //Given

        //When
        double result = calculator.mul(9, 7);

        //Then
        Assertions.assertEquals(63.0, result);
    }

    @Test
    void divTwoNumbers() {
        //Given

        //When
        double result = calculator.div(15, 5);

        //Then
        Assertions.assertEquals(3.0, result);
    }
}


