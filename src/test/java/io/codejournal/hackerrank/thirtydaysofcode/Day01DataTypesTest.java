package io.codejournal.hackerrank.thirtydaysofcode;

import static io.codejournal.hackerrank.thirtydaysofcode.Day01DataTypes.DEFAULT_DOUBLE;
import static io.codejournal.hackerrank.thirtydaysofcode.Day01DataTypes.DEFAULT_INTEGER;
import static io.codejournal.hackerrank.thirtydaysofcode.Day01DataTypes.DEFAULT_STRING;
import static java.lang.Math.random;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day01DataTypesTest {

    private ByteArrayOutputStream output;

    private Day01DataTypes fixture = new Day01DataTypes();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        Day01DataTypes.main(null);

        final String actual = output.toString(UTF_8);

        // @formatter:off
        assertThat(actual)
                .contains("16")
                .contains("8.0")
                .contains("HackerRank is the best place to learn and practice coding!");
        // @formatter:on
    }

    @Test
    public void run_PrintsOutput_ForGivenValues() {

        final int inputIntegerValue = (int) (random() * 100);
        final double inputDoubleValue = random() * 100;
        final String inputStringValue = randomUUID().toString();

        fixture.run(inputIntegerValue, inputDoubleValue, inputStringValue);

        final String actual = output.toString(UTF_8);

        // @formatter:off
        assertThat(actual)
                .contains(String.valueOf(DEFAULT_INTEGER + inputIntegerValue))
                .contains(String.valueOf(DEFAULT_DOUBLE + inputDoubleValue))
                .contains(DEFAULT_STRING + inputStringValue);
        // @formatter:on
    }

}
