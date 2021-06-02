package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Day05LoopsTest {

    @Test
    public void defaultCase() {

        // @formatter:off
        final String expected = "3 x 1 = 3\n"
                              + "3 x 2 = 6\n"
                              + "3 x 3 = 9\n"
                              + "3 x 4 = 12\n"
                              + "3 x 5 = 15\n"
                              + "3 x 6 = 18\n"
                              + "3 x 7 = 21\n"
                              + "3 x 8 = 24\n"
                              + "3 x 9 = 27\n"
                              + "3 x 10 = 30";
        // @formatter:on

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Day05Loops.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
