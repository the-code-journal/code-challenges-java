package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day20Sorting {

    public static void main(String[] args) {

        String input = "3\n3 2 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int arrayLength = scanner.nextInt();

        final int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        new Day20Sorting().run(array);
    }

    public void run(final int[] array) {

        final int arrayLength = array.length;

        // Track number of elements swapped during a single array traversal
        int totalSwaps = 0;

        for (int i = 0; i < arrayLength; i++) {

            int currentSwaps = 0;

            for (int j = 0; j < arrayLength - 1; j++) {

                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {

                    final int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    currentSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (currentSwaps == 0) {
                break;
            } else {
                totalSwaps += currentSwaps;
            }
        }

        if (arrayLength != 0) {
            System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
            System.out.println("First Element: " + array[0]);
            System.out.println("Last Element: " + array[arrayLength - 1]);
        } else {
            throw new IllegalArgumentException("Array is empty");
        }
    }
}
