package io.codejournal.hackerrank.thirtydaysofcode;

public class Day27Testing {

    public int minimumIndex(final int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }

        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }
}
