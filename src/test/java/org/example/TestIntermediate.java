package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestIntermediate {

    @ParameterizedTest
    @CsvSource(
        value = {
            "0, One",
            "1, Two",
            "2, Three",
            "3, Four",
            "4, Five",
            "5, Six",
            "6, Seven",
            "7, Eight",
            "8, Nine",
            "9, Ten",
            "10, Number don't exist",
        }
    )
    public void testGetNumberName(int number, String expected) {
        String actual = Main.getNumberName(number);
        Assertions.assertEquals(expected, actual);
    }
}
