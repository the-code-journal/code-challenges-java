package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Day07ArraysTest {

    @Test
    public void defaultCase() throws IOException {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "2 3 4 1";

        Day07Arrays.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

}
