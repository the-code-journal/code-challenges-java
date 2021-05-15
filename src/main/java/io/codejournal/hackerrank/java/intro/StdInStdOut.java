package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class StdInStdOut {

    public static void main(final String[] args) {
        final String input = "42\n100\n125";
        new StdInStdOut().run(new ByteArrayInputStream(input.getBytes()));
    }

    public void run(final InputStream input) {

        final Scanner scan = new Scanner(input);

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
