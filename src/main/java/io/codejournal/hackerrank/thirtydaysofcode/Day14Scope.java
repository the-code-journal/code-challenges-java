package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day14Scope {

    public static void main(final String[] args) {

        final String input = "3\n2 5 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner sc = new Scanner(System.in);

        final int numbers = sc.nextInt();

        final int[] elements = new int[numbers];

        for (int i = 0; i < numbers; i++) {
            elements[i] = sc.nextInt();
        }

        sc.close();

        new Day14Scope().run(elements);
    }

    public void run(final int[] elements) {

        final Difference difference = new Difference(elements);

        difference.computeDifference();

        System.out.print(difference.getMaximumDifference());
    }
}

class Difference {

    private final int[] elements;

    private int maximumDifference = 0;

    public Difference(final int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

        int min = 0;
        int max = 0;

        for (int i = 0; i < elements.length; i++) {

            if (i == 0) {
                min = elements[i];
                max = elements[i];
                continue;
            }

            if (elements[i] > max) {
                max = elements[i];
            }

            if (elements[i] < min) {
                min = elements[i];
            }
        }

        this.maximumDifference = max - min;
    }

    public int getMaximumDifference() {
        return maximumDifference;
    }
}
