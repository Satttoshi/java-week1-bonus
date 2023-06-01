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

    // Aufgabe: Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
    // Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
    // Vor Zahlen die durch 5 teilbar sind soll ein $ stehen

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.println(i);
        }
    }

    // Aufgabe: Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner)
    // und diese in einem Array speichert. Gib vor jeder Eingabe jeweils die
    // eingegebenen Wörter noch mal aus.

}
