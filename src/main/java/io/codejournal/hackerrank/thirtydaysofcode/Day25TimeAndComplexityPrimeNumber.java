package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day25TimeAndComplexityPrimeNumber {

    public static void main(final String[] args) {

        final String input = "6 1 2 3 6 27 31";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();

        final Day25TimeAndComplexityPrimeNumber runner = new Day25TimeAndComplexityPrimeNumber();

        while (testCases-- > 0) {

            final long number = scan.nextLong();

            System.out.println(runner.isPrime(number) ? "Prime" : "Not prime");
        }

        scan.close();
    }

    public boolean isPrime(final long number) {

        if (number <= 1) {
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        // Bitwise operation to check if - number AND 1 == 0, means the number is even
        if ((number & 1) == 0) {
            return false;
        }

        // If we don't find a number divisible till sqrt(number), then number is prime
        final int sqrtOfNumber = (int) Math.sqrt(number);

        for (long i = 3; i <= sqrtOfNumber; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
