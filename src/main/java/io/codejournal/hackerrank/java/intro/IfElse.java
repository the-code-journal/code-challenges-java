package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class IfElse {

    static final String WEIRD = "Weird";

    static final String NOT_WEIRD = "Not Weird";

    static {
        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        String ans = "";

        if (isOdd(n)) {
            ans = WEIRD;
        } else if (2 <= n && n <= 5) {
            ans = NOT_WEIRD;
        } else if (6 <= n && n <= 20) {
            ans = WEIRD;
        } else {
            ans = NOT_WEIRD;
        }

        System.out.println(ans);

        sc.close();
    }

    private static boolean isOdd(final int number) {
        return (number & 1) == 1; // Bitwise AND(&) of Number and 1
    }
}
