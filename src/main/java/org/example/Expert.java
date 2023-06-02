package org.example;

public class Expert {

    //Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.

    public static String reverseString(String text) {
        StringBuilder str = new StringBuilder(text);
        return String.valueOf(str.reverse());
    }


    //Gibt den folgenden Array aufsteigend sortiert aus:
    // {6, 2, 8, 3, 9, 6}

    public static int[] sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }




    //Schreibe eine Methode die einen String nach ,
    // separiert und als Array zurück gibt.


    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.


    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
}
