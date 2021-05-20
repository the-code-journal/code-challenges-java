package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day05Loops {

    public static void main(final String[] args) {

        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);
        final int number = scan.nextInt();
        scan.close();

        new Day05Loops().run(number);
    }

    public void run(final int number) {
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.printf("%d x %d = %d\n", number, i, (number * i)));
    }
}
