package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day02Operators {

    public static void main(final String[] args) {

        final String input = "12.0\n20\n8";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final double mealCost = scanner.nextDouble();

        final int tipPercent = scanner.nextInt();

        final int taxPercent = scanner.nextInt();

        new Day02Operators().solve(mealCost, tipPercent, taxPercent);

        scanner.close();
    }

    public void solve(final double mealCost, final int tipPercent, final int taxPercent) {

        final double tip = (mealCost * tipPercent) / 100;
        final double tax = (mealCost * taxPercent) / 100;

        System.out.println(Math.round(mealCost + tip + tax));
    }
}
