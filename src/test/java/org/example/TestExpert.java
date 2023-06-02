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


    static Stream<Arguments> testDataCreateStringArray() {
        return Stream.of(
            Arguments.of("1,2,3,4,5,6", new String[]{"1", "2", "3", "4", "5", "6"}),
            Arguments.of("hello, what, fish, you, like, ?", new String[]{"hello", " what", " fish", " you", " like", " ?"}),
            Arguments.of("25,lol,420,XD,69lol", new String[]{"25", "lol", "420", "XD", "69lol"})
        );
    }
    @ParameterizedTest
    @MethodSource("testDataCreateStringArray")
    public void testCreateStringArray(String text, String[] expected) {
        String[] actual = Expert.CreateStringArray(text);
        Assertions.assertArrayEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
        value = {
            "123, 6",
            "123456789, 45",
            "1234567890, 45",
            "12345678901, 46",
        }
    )
    public void testCheckSum(long number, int expected) {
        int actual = Expert.checkSum(number);
        Assertions.assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(
        value = {
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X",
            "11, XI",
            "12, XII",
            "13, XIII",
            "14, XIV",
            "15, XV",
            "16, XVI",
            "17, XVII",
            "18, XVIII",
            "19, XIX",
            "20, XX",
            "21, XXI",
            "22, XXII",
            "23, XXIII",
            "24, XXIV",
            "25, XXV",
            "26, XXVI",
            "27, XXVII",
            "28, XXVIII",
            "29, XXIX",
            "30, XXX",
            "31, XXXI",
            "32, XXXII",
            "33, XXXIII",
            "34, XXXIV",
            "35, XXXV",
            "36, XXXVI",
            "37, XXXVII",
            "38, XXXVIII",
            "39, XXXIX",
            "40, XL",
            "41, XLI",
            "42, XLII",
            "43, XLIII",
            "44, XLIV",
            "45, XLV",
            "46, XLVI",
            "47, XLVII",
            "48, XLVIII",
            "49, XLIX",
            "50, L",
            "51, LI",
            "52, LII",
            "53, LIII",
            "54, LIV",
            "55, LV",
            "56, LVI",
            "57, LVII",
            "58, LVIII",
            "59, LIX",
            "60, LX",
            "61, LXI",
            "62, LXII",
            "63, LXIII",
            "64, LXIV",
            "65, LXV",
            "66, LXVI",
            "67, LXVII",
            "68, LXVIII",
            "69, LXIX",
            "70, LXX",
            "71, LXXI",
            "72, LXXII",
            "73, LXXIII",
        }
    )
    public void testRomanNumber(int number, String expected) {
        String actual = Expert.romanNumeral(number);
        Assertions.assertEquals(expected, actual);
    }

}
