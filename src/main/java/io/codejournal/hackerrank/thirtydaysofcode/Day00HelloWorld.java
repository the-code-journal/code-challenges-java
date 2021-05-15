package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day00HelloWorld {

    static {
        final String input = "Welcome to 30 Days of Code!";
        final ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    public static void main(final String[] args) {
        // Create a Scanner object to read input from stdin.
        final Scanner scan = new Scanner(System.in);

        // Read a full line of input from stdin and save it to our variable,
        // inputString.
        final String inputString = scan.nextLine();

        // Close the scanner object, because we've finished reading
        // all of the input from stdin needed for this challenge.
        scan.close();

        // Print a string literal saying "Hello, World." to stdout.
        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
