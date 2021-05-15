package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StdInStdOut {

    static {
        final String input = "42\n100\n125";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);

        int a = 0;

        a = scan.nextInt();
        System.out.println(a);

        a = scan.nextInt();
        System.out.println(a);

        a = scan.nextInt();
        System.out.println(a);

        scan.close();
    }
}
