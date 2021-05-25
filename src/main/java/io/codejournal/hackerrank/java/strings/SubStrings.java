package io.codejournal.hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SubStrings {

    public static void main(final String[] args) {

        System.setIn(new ByteArrayInputStream("Helloworld\n3 7\n".getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String string = scanner.next();
        final int startPosition = scanner.nextInt();
        final int endPosition = scanner.nextInt();

        scanner.close();

        final String substring = new SubStrings().run(string, startPosition, endPosition);

        System.out.println(substring);
    }

    public String run(final String string, final int startPosition, final int endPosition) {
        return string.substring(startPosition, endPosition);
    }
}
