package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day04ClassVsInstanceTest {

    private ByteArrayOutputStream output;

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultUseCase() {

        // @formatter:off
        final String expected = "Age is not valid, setting age to 0.\n"
                              + "You are young.\n"
                              + "You are young.\n\n"
                              + "You are young.\n"
                              + "You are a teenager.\n\n"
                              + "You are a teenager.\n"
                              + "You are old.\n\n"
                              + "You are old.\n"
                              + "You are old.\n\n";
        // @formatter:on

        Day04ClassVsInstance.main(null);
        new Day04ClassVsInstance();

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo(expected);
    }
}
