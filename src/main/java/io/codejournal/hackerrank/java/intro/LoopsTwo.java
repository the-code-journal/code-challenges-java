package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LoopsTwo {

    public static void main(final String[] args) {

        final String line1 = "2";
        final String line2 = "0 2 10";
        final String line3 = "5 3 5";

        final String input = String.join("\n", line1, line2, line3);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        final LoopsTwo object = new LoopsTwo();

        final int lines = in.nextInt();

        for (int i = 0; i < lines; i++) {

            final int a = in.nextInt();
            final int b = in.nextInt();
            final int iterations = in.nextInt();

            System.out.println(object.getSequence(a, b, iterations));
        }

        in.close();
    }

    public String getSequence(final int a, final int b, final int iterations) {

        final StringBuilder result = new StringBuilder();

        int value = a;

        for (int i = 0; i < iterations; i++) {
            value = value + ((int) Math.pow(2, i) * b);
            result.append(value + " ");
        }

        return result.toString().trim();
    }
}
