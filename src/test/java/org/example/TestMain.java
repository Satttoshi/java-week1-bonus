package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestMain {

    @ParameterizedTest
    @CsvSource(
        value = {
            "1,true",
            "-2,false",
            "3,true",
            "0,false",
            "69,true",
        }
    )
    public void testIsBiggerThan0(int number, boolean expected) {
        boolean actual = Main.isBiggerThan0(number);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
        value = {
            "2,4",
            "12,144",
            "16,256",
        }
    )
    public void testSquaredNumber(int number, int expected) {
        int actual = Main.squaredNumber(number);
        Assertions.assertEquals(expected, actual);
    }

}
