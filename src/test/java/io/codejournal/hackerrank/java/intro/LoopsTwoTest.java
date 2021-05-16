package io.codejournal.hackerrank.java.intro;

import static java.lang.Math.random;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopsTwoTest {

    private ByteArrayOutputStream output;

    private LoopsTwo fixture = new LoopsTwo();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        final String line1 = "2";
        final String line2 = "0 2 10";
        final String line3 = "5 3 5";

        final String input = String.join("\n", line1, line2, line3);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        LoopsTwo.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(getOutputLine(0, 2, 10)).contains(getOutputLine(5, 3, 5));
    }

    @Test
    public void getSequence_GeneratesSequence_ForGivenValues() {

        final int a = (int) (random() * 50);
        final int b = (int) (random() * 50);
        final int iterations = (int) (random() * 15);

        final String actual = fixture.getSequence(a, b, iterations);

        assertThat(actual).contains(getOutputLine(a, b, iterations));
    }

    private String getOutputLine(final int a, final int b, final int iterations) {

        final StringBuilder result = new StringBuilder();

        int value = a + b;

        for (int i = 1; i < iterations; i++) {
            value = value + ((int) Math.pow(2, i) * b);
            result.append(value + " ");
        }

        return result.toString().trim();
    }
}
