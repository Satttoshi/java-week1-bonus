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

        Intermediate intermediate = new Intermediate();

        String numberName = intermediate.getNumberName(5);
    }
    public static boolean isBiggerThan0(int number) {
        return number > 0;
    }
    public static int squaredNumber(int number) {
        return number * number;
    }
}