package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day10BinaryNumbersTest {

    private ByteArrayOutputStream output;

    private Day10BinaryNumbers fixture = new Day10BinaryNumbers();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        final String expected = "1";

        Day10BinaryNumbers.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void runSolutionSingleLoop_ReturnsAnswerAs2_WhenInputNumberIs6() {

        final int input = 6;
        final int expected = 2;

        final int actual = fixture.runSolutionSingleLoop(input);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void runSolutionWithGeneratedBinary_ReturnsAnswerAs3_WhenInputNumberIs7() {

        final int input = 6;
        final int expected = 2;

        final int actual = fixture.runSolutionWithGeneratedBinary(input);

        assertThat(actual).isEqualTo(expected);
    }
}
