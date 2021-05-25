package io.codejournal.hackerrank.thirtydaysofcode;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Day07Arrays {

    public static void main(final String[] args) throws IOException {

        final String input = "4\n1 4 3 2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(bufferedReader.readLine().trim());

        // @formatter:off
        final List<Integer> numbers = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                            .map(Integer::parseInt)
                                            .collect(toList());
        // @formatter:on

        new Day07Arrays().run(numbers);

        bufferedReader.close();
    }

    public void run(final List<Integer> numbers) {

        final StringBuilder output = new StringBuilder();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            output.append(numbers.get(i) + " ");
        }

        System.out.println(output.toString().trim());
    }
}
