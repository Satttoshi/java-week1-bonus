package org.example;

public class Intermediate {

    // Aufgabe: Schreibe eine Methode die zu einer
    // einstelligen Zahl das entsprechende Zahlenwort ausgibt.
    public static String getNumberName(int number) {

        String[] Numbers = {
            "One", "Two", "Three",
            "Four", "Five", "Six",
            "Seven", "Eight", "Nine",
            "Ten"
        };

        if (number < 0 || number > 9) {
            return "Number don't exist";
        }
        return Numbers[number];
    }

}
