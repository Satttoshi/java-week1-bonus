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
    }
    public static boolean isBiggerThan0(int number) {
        return number > 0;
    }
    public static int squaredNumber(int number) {
        return number * number;
    }
}