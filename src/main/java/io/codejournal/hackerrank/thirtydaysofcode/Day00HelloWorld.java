package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Day00HelloWorld {

    public static void main(final String[] args) {

        final String input = "Welcome to 30 Days of Code!";
        final ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());

        new Day00HelloWorld().run(in);
    }

    public void run(final InputStream input) {

        final Scanner scan = new Scanner(input);

        final String inputString = scan.nextLine();

        scan.close();

        System.out.println("Hello, World.");
        System.out.println(inputString);
    }
}
