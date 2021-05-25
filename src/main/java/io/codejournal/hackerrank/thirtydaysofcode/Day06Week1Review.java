package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Day06Week1Review {

    public static void main(final String[] args) {

        final String input = "2\nHacker\nRank\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int testCases = scanner.nextInt();

        final Day06Week1Review runner = new Day06Week1Review();

        IntStream.rangeClosed(1, testCases).forEach(index -> runner.run(scanner.next()));

        scanner.close();
    }

    public void run(final String string) {

        final StringBuilder oddIndexCharacters = new StringBuilder();
        final StringBuilder evenIndexCharacters = new StringBuilder();

        boolean isEven = true;

        for (int i = 0; i < string.length(); i++) {

            final char currentCharacter = string.charAt(i);

            if (isEven) {
                evenIndexCharacters.append(currentCharacter);
            } else {
                oddIndexCharacters.append(currentCharacter);
            }

            isEven = !isEven;
        }

        System.out.printf("%s %s\n", evenIndexCharacters.toString(), oddIndexCharacters.toString());
    }
}
