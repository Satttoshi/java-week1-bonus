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

    public static String[] CreateStringArray(String text) {
        return text.split(",");
    }


    //Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.

    public static int checkSum(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


    //Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)

    public static String romanNumeral(int number) {
        String[] romanNumeral = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] romanNumeralValue = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < romanNumeralValue.length; i++) {
            while (number >= romanNumeralValue[i]) {
                roman.append(romanNumeral[i]);
                number -= romanNumeralValue[i];
            }
        }
        return roman.toString();
    }

}
