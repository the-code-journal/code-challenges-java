package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day17MoreExceptions {

    public static void main(final String[] args) {

        final String input = "3\n3 5\n-1 1\n1 -1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        final Day17MoreExceptions runner = new Day17MoreExceptions();
        final Calculator calculator = new Calculator();

        while (testCases-- > 0) {

            final int number = in.nextInt();
            final int power = in.nextInt();

            runner.run(calculator, number, power);
        }

        in.close();
    }

    public void run(final Calculator calculator, final int number, final int power) {

        try {
            int ans = calculator.power(number, power);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Calculator {

    public int power(int number, int power) {

        if (number < 0 || power < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }

        return (int) Math.pow((double) number, (double) power);
    }
}
