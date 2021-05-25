package io.codejournal.hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringIntroduction {

    public static void main(final String[] args) {

        final String input = "hello\njava\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final String firstWord = scanner.next();
        final String secondWord = scanner.next();

        scanner.close();

        new StringIntroduction().run(firstWord, secondWord);
    }

    public void run(final String firstWord, final String secondWord) {
        System.out.println(firstWord.length() + secondWord.length());
        System.out.println(firstWord.compareTo(secondWord) > 0 ? "Yes" : "No");
        System.out.printf("%s %s\n", toTitleCase(firstWord), toTitleCase(secondWord));
    }

    public String toTitleCase(final String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
