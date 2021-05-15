package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StdInStdOut2 {

    static {
        final String input = "42\n3.1415\nWelcome to HackerRank's Java tutorials!";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);

        final int intValue = scan.nextInt();
        final double doubleValue = scan.nextDouble();
        scan.nextLine();
        final String stringValue = scan.nextLine();

        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);

        scan.close();
    }
}
