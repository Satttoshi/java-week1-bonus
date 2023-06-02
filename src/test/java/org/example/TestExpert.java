package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    static Stream<Arguments> testDataSortArray() {
        return Stream.of(
                Arguments.of(new int[]{6, 2, 8, 3, 9, 6}, new int[]{2, 3, 6, 6, 8, 9}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6}),
                Arguments.of(new int[]{6, 5, 4, 3, 2, 1}, new int[]{1, 2, 3, 4, 5, 6})
        );
    }
    @ParameterizedTest
    @MethodSource("testDataSortArray")
    public void testSortArray(int[] array, int[] expected) {
        int[] actual = Expert.sortArray(array);
        Assertions.assertArrayEquals(expected, actual);
    }

}
