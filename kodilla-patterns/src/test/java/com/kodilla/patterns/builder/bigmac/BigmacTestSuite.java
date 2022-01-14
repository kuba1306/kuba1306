package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.bigmac.Bigmac;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigMac = new Bigmac.BigmacBuilder()
                .bun("BUN")
                .sauce("STANDARD")
                .burgers(2)
                .ingredient("MUSHROOMS")
                .ingredient("CHEESE")
                .build();
        System.out.println(bigMac);

        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(2, howManyIngredients);
    }










}
