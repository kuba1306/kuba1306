package com.kodilla.spring.portfolio;

import com.kodilla.spring.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {
}

    @Autowired
    private Calculator calculator;

    @Test
    void addTwoNumbers()
