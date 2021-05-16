package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class OutputFormatting {

    public static void main(final String[] args) {
        final String input = "java 100\ncpp 65\npython 50";
        new OutputFormatting().run(new ByteArrayInputStream(input.getBytes()));
    }

    public void run(final InputStream input) {

        final Scanner sc = new Scanner(input);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            final String string = sc.next();
            final int integer = sc.nextInt();
            System.out.printf("%-15s%03d\n", string, integer);
        }

        System.out.println("================================");

        sc.close();
    }
}
