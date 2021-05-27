package io.codejournal.hackerrank.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Day11Array2D {

    public static void main(final String[] args) {

        // @formatter:off
        final String input = "1 1 1 0 0 0\n"
                           + "0 1 0 0 0 0\n"
                           + "1 1 1 0 0 0\n"
                           + "0 0 2 4 4 0\n"
                           + "0 0 0 2 0 0\n"
                           + "0 0 1 2 4 0\n";
        // @formatter:on

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final Scanner scanner = new Scanner(System.in);

        final int array[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(new Day11Array2D().getResult(array, new HourGlassProcessor()));

        scanner.close();
    }

    public int getResult(final int[][] array, final ArrayProcessor processor) {
        return processor.getResult(array);
    }
}

interface ArrayProcessor {
    int getResult(final int[][] array);
}

interface ArrayValueSelector {
    int[] select(final int[][] array, final int row, final int column);
}

interface ArrayValueReducer {
    int reduce(final int[] values);
}

interface ArrayResultMerger {
    int merge(final Integer previousValue, final Integer currentValue);
}

class HourGlassProcessor implements ArrayProcessor {

    private final ArrayValueSelector valueSelector;

    private final ArrayValueReducer valueReducer;

    private final ArrayResultMerger resultMerger;

    public HourGlassProcessor() {

        this.valueSelector = (array, row, column) -> {

            if (row < array.length - 2 && column < array[row].length - 2) {

                // @formatter:off
                    return new int[] {
                            array[row][column],     array[row][column + 1],         array[row][column + 2],
                                                    array[row + 1][column + 1],
                            array[row + 2][column], array[row + 2][column + 1],     array[row + 2][column + 2]
                    };
                    // @formatter:on
            }

            return new int[] {};
        };

        this.valueReducer = values -> Arrays.stream(values).reduce(0, Integer::sum);
        this.resultMerger = (previousValue,
                currentValue) -> (previousValue != null) ? Math.max(previousValue, currentValue) : currentValue;
    }

    @Override
    public int getResult(final int[][] array) {

        Integer result = null;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {

                final int[] selectedValues = valueSelector.select(array, row, column);

                if (selectedValues.length > 0) {
                    final int currentResult = valueReducer.reduce(selectedValues);
                    result = resultMerger.merge(result, currentResult);
                }
            }
        }

        return result;
    }
}
