package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class StdInStdOutTwo {

    public static void main(final String[] args) {
        final String input = "42\n3.1415\nWelcome to HackerRank's Java tutorials!";
        new StdInStdOutTwo().run(new ByteArrayInputStream(input.getBytes()));
    }

    public void run(final InputStream input) {

        final Scanner scan = new Scanner(input);

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
