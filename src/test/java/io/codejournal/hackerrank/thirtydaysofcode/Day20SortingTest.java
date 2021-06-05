package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day20SortingTest {

    private ByteArrayOutputStream output;

    private final Day20Sorting fixture = new Day20Sorting();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        // @formatter:off
        final String expected = "Array is sorted in 3 swaps.\n"
                              + "First Element: 1\n"
                              + "Last Element: 3";
        // @formatter:on

        Day20Sorting.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void run_ThrowsIllegalArgumentException_WhenArrayIsEmpty() {

        // @formatter:off
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.run(new int[] {}))
                .withMessage("Array is empty");
        // @formatter:on
    }
}
