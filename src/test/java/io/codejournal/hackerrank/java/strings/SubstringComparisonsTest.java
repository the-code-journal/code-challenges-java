package io.codejournal.hackerrank.java.strings;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SubstringComparisonsTest {

    private ByteArrayOutputStream output;

    private final SubstringComparisons fixture = new SubstringComparisons();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        final String expected = "ava\nwel";

        SubstringComparisons.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    public void defaultCase2() {

        final String string = "helloworld";

        final String expected = "ell\nwor";

        fixture.run(string, 3);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }

    @Test
    public void run_PrintsStringAsMinAndMax_WhenSplitSizeIsGreaterThanStringLength() {

        final String string = "hello";

        final String expected = "hello\nhello";

        fixture.run(string, 10);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
