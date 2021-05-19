package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class IntToString {

    static final String GOOD_JOB = "Good job";

    static final String WRONG_ANSWER = "Wrong answer.";

    public static void main(final String[] args) {

        final String input = "100";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner in = new Scanner(System.in);

        final int number = in.nextInt();

        new IntToString().run(number);

        in.close();
    }

    public void run(final int number) {

        final String string = number + "";

        if (number == Integer.parseInt(string)) {
            System.out.println(GOOD_JOB);
        } else {
            System.out.println(WRONG_ANSWER);
        }
    }
}
