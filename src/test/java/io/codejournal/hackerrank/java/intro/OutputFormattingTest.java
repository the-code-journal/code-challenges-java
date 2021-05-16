package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OutputFormattingTest {

    private ByteArrayOutputStream output;

    private OutputFormatting fixture = new OutputFormatting();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void main_FormatsOutputAsExpected() {

        final String expectedLine1 = "java           100";
        final String expectedLine2 = "cpp            065";
        final String expectedLine3 = "python         050";

        final String input = "java 100\ncpp 65\npython 50";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        OutputFormatting.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(expectedLine1).contains(expectedLine2).contains(expectedLine3);
    }

    @Test
    public void run_FormatsOutputAsExpected() {

        final String expectedLine1 = "random-value1  001";
        final String expectedLine2 = "random-value2  010";
        final String expectedLine3 = "random-value3  100";

        final String input = "random-value1 1\nrandom-value2 10\nrandom-value3 100";

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(expectedLine1).contains(expectedLine2).contains(expectedLine3);
    }
}
