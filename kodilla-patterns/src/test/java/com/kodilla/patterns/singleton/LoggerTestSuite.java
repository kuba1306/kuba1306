package com.kodilla.patterns.singleton;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
    }


    @Test
    public void getLastLog() {
        //Given
        //When
        String result = logger.getLastLog();
        //Then
        assertEquals("byly sobie pieski 2", result);
    }
}
