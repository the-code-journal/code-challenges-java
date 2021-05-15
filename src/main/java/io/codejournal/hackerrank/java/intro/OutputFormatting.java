package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class OutputFormatting {

    static {
        final String input = "java 100\ncpp 65\npython 50";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);

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
