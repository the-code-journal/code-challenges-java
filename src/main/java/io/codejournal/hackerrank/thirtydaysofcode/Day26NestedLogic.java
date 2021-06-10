package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day26NestedLogic {

    public static void main(final String[] args) {

        final String input = "9 6 2015\n6 6 2015";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scan = new Scanner(System.in);

        final String actualReturnDate = scan.nextLine();
        final String expectedReturnDate = scan.nextLine();

        scan.close();

        new Day26NestedLogic().run(actualReturnDate, expectedReturnDate);
    }

    public void run(final String actualReturnDate, final String expectedReturnDate) {

        final String[] actualReturnDateParts = actualReturnDate.split(" ");
        final String[] expectedReturnDateParts = expectedReturnDate.split(" ");

        final int actualReturnDay = Integer.parseInt(actualReturnDateParts[0]);
        final int actualReturnMonth = Integer.parseInt(actualReturnDateParts[1]);
        final int actualReturnYear = Integer.parseInt(actualReturnDateParts[2]);

        final int expectedReturnDay = Integer.parseInt(expectedReturnDateParts[0]);
        final int expectedReturnMonth = Integer.parseInt(expectedReturnDateParts[1]);
        final int expectedReturnYear = Integer.parseInt(expectedReturnDateParts[2]);

        if (expectedReturnYear < actualReturnYear) {

            System.out.println(10000);
            return;

        } else if (expectedReturnYear == actualReturnYear) {

            if (expectedReturnMonth < actualReturnMonth) {

                System.out.println((actualReturnMonth - expectedReturnMonth) * 500);
                return;

            } else if (expectedReturnMonth == actualReturnMonth) {

                if (expectedReturnDay < actualReturnDay) {

                    System.out.println((actualReturnDay - expectedReturnDay) * 15);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
