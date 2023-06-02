package org.example;

public class Expert {

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.

    public static String reverseString(String text) {
        String reverse = "";
        for (int i = 0; i < text.length(); i++) {
            reverse = text.charAt(i) + reverse;
        }
        return reverse;
    }


    //Gibt den folgenden Array aufsteigend sortiert aus:
    // {6, 2, 8, 3, 9, 6}


    //Schreibe eine Methode die einen String nach ,
    // separiert und als Array zurück gibt.


    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.


    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
}
