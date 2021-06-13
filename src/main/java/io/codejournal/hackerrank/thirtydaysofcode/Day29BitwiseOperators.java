package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day29BitwiseOperators {

    public static void main(final String[] args) {

        // @formatter:off
        final String input = "3 "
                           + "5 2 "
                           + "8 5 "
                           + "2 2 ";
        // @formatter:on
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final int totalCases = scan.nextInt();

        final int[][] inputs = new int[totalCases][2];

        for (int i = 0; i < totalCases; i++) {
            inputs[i][0] = scan.nextInt();
            inputs[i][1] = scan.nextInt();
        }

        scan.close();

        new Day29BitwiseOperators().run(inputs);
    }

    private void run(final int[][] inputs) {

        for (int row = 0; row < inputs.length; row++) {

            final int number = inputs[row][0];
            final int limit = inputs[row][1];

            int max = 0;

            for (int a = 1; a < number; a++) {

                for (int b = a + 1; b <= number; b++) {

                    final int result = a & b;

                    if (result > max && result < limit) {
                        max = result;
                    }
                }
            }

            System.out.println(max);
        }
    }
}
