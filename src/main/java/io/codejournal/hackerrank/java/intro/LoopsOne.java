package io.codejournal.hackerrank.java.intro;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsOne {

    public static void main(final String[] args) throws IOException {

        final BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new ByteArrayInputStream("2".getBytes())));

        final int number = Integer.parseInt(bufferedReader.readLine().trim());

        new LoopsOne().run(number);
    }

    public void run(final int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, (number * i));
        }
    }
}
