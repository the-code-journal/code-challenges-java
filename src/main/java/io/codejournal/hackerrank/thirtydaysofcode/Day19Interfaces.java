package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day19Interfaces {

    public static void main(final String[] args) {

        String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final int number = scan.nextInt();

        scan.close();

        new Day19Interfaces().run(number);
    }

    public void run(final int number) {

        final AdvancedArithmetic calculator = new CalculatorAdvanced();

        final int sum = calculator.divisorSum(number);

        System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(sum);
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class CalculatorAdvanced implements AdvancedArithmetic {

    @Override
    public int divisorSum(final int number) {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
