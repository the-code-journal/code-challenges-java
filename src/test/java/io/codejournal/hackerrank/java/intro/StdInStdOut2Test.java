package io.codejournal.hackerrank.java.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class StdInStdOut2Test {

    @Test
    void main_LogsValuesAsInput() {

        final String intValue = String.valueOf(42);
        final String doubleValue = String.valueOf(3.1415);
        final String stringValue = "Welcome to HackerRank's Java tutorials!";

        final String input = String.join("\n", intValue, doubleValue, stringValue);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        StdInStdOut2.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(intValue).contains(doubleValue).contains(stringValue);
    }
}
