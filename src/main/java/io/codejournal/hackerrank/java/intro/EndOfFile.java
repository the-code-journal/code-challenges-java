package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class EndOfFile {

    public static void main(final String[] args) {

        String input = "Hello world\nI am a file\nRead me until end-of-file.";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        int lineNo = 1;

        while (scan.hasNext()) {

            String line = scan.nextLine();

            System.out.println(lineNo + " " + line);

            lineNo++;
        }

        scan.close();
    }
}
