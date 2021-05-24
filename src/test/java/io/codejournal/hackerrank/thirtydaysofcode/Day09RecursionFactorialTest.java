package io.codejournal.hackerrank.thirtydaysofcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class Day09RecursionFactorialTest {

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "6";

        Day09RecursionFactorial.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
