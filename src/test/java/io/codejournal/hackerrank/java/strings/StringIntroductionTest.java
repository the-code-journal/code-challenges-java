package io.codejournal.hackerrank.java.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringIntroductionTest {

    private ByteArrayOutputStream output;

    private StringIntroduction fixture = new StringIntroduction();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        final String expected = "9\nNo\nHello Java";

        StringIntroduction.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    public void run_PrintsComparisonResultAsYes_WhenFirstWordIsLexicographicallyGreatherThanSecondWord() {

        final String firstWord = "hello";
        final String secondWord = "cat";

        final String expected = "8\nYes\nHello Cat";

        fixture.run(firstWord, secondWord);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
