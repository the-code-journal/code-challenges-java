package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day09RecursionFactorial {

    public static void main(final String[] args) {

        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int number = scanner.nextInt();

        System.out.println(new Day09RecursionFactorial().factorial(number));

        scanner.close();
    }

    public int factorial(final int number) {

        if (number == 1) {
            return number;
        }

        return number * factorial(number - 1);
    }
}
