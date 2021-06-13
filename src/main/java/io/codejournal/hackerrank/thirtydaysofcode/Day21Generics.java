package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Day21Generics {

    public static void main(final String args[]) {

        final String input = "3 1 2 3 2 Hello World";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int intArrayLength = scanner.nextInt();

        final Integer[] intArray = new Integer[intArrayLength];

        for (int i = 0; i < intArrayLength; i++) {
            intArray[i] = scanner.nextInt();
        }

        final int stringArrayLength = scanner.nextInt();

        final String[] stringArray = new String[stringArrayLength];

        for (int i = 0; i < stringArrayLength; i++) {
            stringArray[i] = scanner.next();
        }

        scanner.close();

        new Day21Generics().run(intArray, stringArray);
    }

    public void run(final Integer[] intArray, final String[] stringArray) {

        final Printer<Integer> intPrinter = new Printer<Integer>();
        final Printer<String> stringPrinter = new Printer<String>();

        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
    }
}

class Printer<T> {

    public void printArray(final T[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }
}
