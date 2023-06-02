package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestExpert {

    // Aufgabe Test: Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    @ParameterizedTest
    @CsvSource(
            value = {
                    "abc, cba,",
                    "what234XD!, !DX432tahw",

            }
    )
    public void testGetNumberName(String text, String expected) {
        String actual = Expert.reverseString(text);
        Assertions.assertEquals(expected, actual);
    }
}
