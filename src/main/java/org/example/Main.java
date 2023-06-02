package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Joshua");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey what's your name?: ");
        String input = scanner.nextLine();
        System.out.println("Hello " + input + "!");

        String numberName = Intermediate.getNumberName(5);
        System.out.println(numberName);
        Intermediate.printNumbers();
        Intermediate.inputWords();

        String reverse = Expert.reverseString("Hello World");
        System.out.println(reverse);
        String[] stringArray = Expert.CreateStringArray("Hello,World");
        System.out.println(java.util.Arrays.toString(stringArray));
        int checkSum = Expert.checkSum(123);
        System.out.println("Checksum of 123 is: " + checkSum);
        String romanNumeral = Expert.romanNumeral(420);
        System.out.println("420 in roman numerals is: " + romanNumeral);
        String romanNumeral2 = Expert.romanNumeral(69);
        System.out.println("69 in roman numerals is: " + romanNumeral2);
    }
    public static boolean isBiggerThan0(int number) {
        return number > 0;
    }
    public static int squaredNumber(int number) {
        return number * number;
    }
}