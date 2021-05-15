package io.codejournal.hackerrank.java.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class OutputFormattingTest {

    @Test
    void main_FormatsOutputAsExpected() {

        final String expectedLine1 = "java           100";
        final String expectedLine2 = "cpp            065";
        final String expectedLine3 = "python         050";

        final String input = "java 100\ncpp 65\npython 50";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        OutputFormatting.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(expectedLine1).contains(expectedLine2).contains(expectedLine3);
    }
}
