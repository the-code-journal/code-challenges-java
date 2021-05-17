package io.codejournal.hackerrank.java.intro;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DataTypes {

    public static void main(final String[] args) {

        String input = "5\n-150\n150000\n1500000000\n213333333333333333333333333333333333\n-100000000000000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);
        final int totalInputs = scanner.nextInt();

        scanner.nextLine();

        final DataTypes object = new DataTypes();

        for (int i = 0; i < totalInputs; i++) {

            final String inputValue = scanner.nextLine();

            object.checkType(inputValue);
        }

        scanner.close();
    }

    public void checkType(final String inputValue) {

        try {

            final long value = Long.parseLong(inputValue);

            System.out.println(value + " can be fitted in:");

            canFitInTypeByte(value);
            canFitInTypeShort(value);
            canFitInTypeInteger(value);

            System.out.println("* long");

        } catch (final NumberFormatException e) {
            System.out.println(inputValue + " can't be fitted anywhere.");
        }
    }

    private void canFitInTypeByte(final long value) {
        if (value >= -128 && value <= 127) {
            System.out.println("* byte");
        }
    }

    private void canFitInTypeShort(final long value) {
        if (value >= -32768 && value <= 32767) {
            System.out.println("* short");
        }
    }

    private void canFitInTypeInteger(final long value) {
        if (value >= -2147483648 && value <= 2147483647) {
            System.out.println("* int");
        }
    }
}
