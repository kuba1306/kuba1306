package com.kodilla.spring.calculator;

import org.springframework.stereotype.Service;

@Service
public class Display {

    public void show(double val) {
        System.out.println(val);
    }
}
