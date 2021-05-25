package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day10BinaryNumbers {

    public static void main(final String[] args) {

        final String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int number = scanner.nextInt();

        System.out.println(new Day10BinaryNumbers().runSolutionSingleLoop(number));

        scanner.close();
    }

    public int runSolutionSingleLoop(final int number) {

        int currentNumber = number;
        int consecutiveOneSinceLastTime = 0;
        int maxConsecutiveOnes = 0;

        while (currentNumber != 0) {

            final int remainder = currentNumber % 2;
            currentNumber = currentNumber / 2;

            if (remainder == 1) {
                consecutiveOneSinceLastTime++;
                maxConsecutiveOnes = Math.max(consecutiveOneSinceLastTime, maxConsecutiveOnes);
            } else {
                consecutiveOneSinceLastTime = 0;
            }
        }

        return maxConsecutiveOnes;
    }

    public int runSolutionWithGeneratedBinary(final int number) {

        String output = "";
        int currentNumber = number;

        while (currentNumber > 0) {
            output = (currentNumber % 2) + output;
            currentNumber = currentNumber / 2;
        }

        int maxConsecutiveOnes = -1;

        final String[] splits = output.split("0");

        for (final String split : splits) {

            final int currentSplitLength = split.replaceAll("0", "").length();

            maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentSplitLength);
        }

        return maxConsecutiveOnes;
    }
}
