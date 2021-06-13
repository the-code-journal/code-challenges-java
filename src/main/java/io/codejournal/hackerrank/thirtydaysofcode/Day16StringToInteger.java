package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day16StringToInteger {

    public static void main(final String[] args) {

        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String string = scanner.next();

        scanner.close();

        new Day16StringToInteger().parse(string);
    }

    public void parse(final String string) {

        try {
            final int parsedInteger = Integer.parseInt(string, 10);
            System.out.println(parsedInteger);
        } catch (final NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
