package com.antaladrien;

import java.util.Scanner;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Sum odd or even digit in number");
        System.out.println("Enter positive number:");
        int num = myObj.nextInt();
        System.out.println("Enter odd or even");
        String word = myObj.next();

        if (word.compareTo("odd") == 0) {
            System.out.println("Sum odd digits = " + getOddDigitSum(num));
        } else if (word.compareTo("even") == 0) {
            System.out.println("Sum even digits = " + getEvenDigitSum(num));
        } else {
            System.out.println("You wrote the wrong word");
        }
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getOddDigitSum(int number) {
        if (number < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
