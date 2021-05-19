package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Day03Conditionals {

    static final String WEIRD = "Weird";

    static final String NOT_WEIRD = "Not Weird";

    public static void main(final String[] args) {

        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        new Day03Conditionals().run(System.in);
    }

    public void run(final InputStream input) {

        final Scanner sc = new Scanner(input);

        final int number = sc.nextInt();

        String ans = "";

        if (isOdd(number)) {
            ans = WEIRD;
        } else if (2 <= number && number <= 5) {
            ans = NOT_WEIRD;
        } else if (6 <= number && number <= 20) {
            ans = WEIRD;
        } else {
            ans = NOT_WEIRD;
        }

        System.out.println(ans);

        sc.close();
    }

    private boolean isOdd(final int number) {
        return (number & 1) == 1; // Bitwise AND(&) of Number and 1
    }
}
