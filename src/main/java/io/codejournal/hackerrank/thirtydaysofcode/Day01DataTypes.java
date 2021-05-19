package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day01DataTypes {

    static final int DEFAULT_INTEGER = 4;

    static final double DEFAULT_DOUBLE = 4.0;

    static final String DEFAULT_STRING = "HackerRank ";

    public static void main(final String[] args) {

        final String input = "12\n4.0\nis the best place to learn and practice coding!";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final int integerValue = scan.nextInt();
        final double doubleValue = scan.nextDouble();
        scan.nextLine();
        final String stringValue = scan.nextLine();

        new Day01DataTypes().run(integerValue, doubleValue, stringValue);

        scan.close();
    }

    public void run(final int integerValue, final double doubleValue, final String stringValue) {
        System.out.println(DEFAULT_INTEGER + integerValue);
        System.out.println(DEFAULT_DOUBLE + doubleValue);
        System.out.println(DEFAULT_STRING + stringValue);
    }
}
