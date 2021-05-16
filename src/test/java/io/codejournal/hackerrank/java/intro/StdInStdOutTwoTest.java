package io.codejournal.hackerrank.java.intro;

import static java.lang.Math.random;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StdInStdOutTwoTest {

    private ByteArrayOutputStream output;

    private StdInStdOutTwo fixture = new StdInStdOutTwo();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void main_LogsValuesAsInput() {

        final String intValue = String.valueOf(42);
        final String doubleValue = String.valueOf(3.1415);
        final String stringValue = "Welcome to HackerRank's Java tutorials!";

        final String input = String.join("\n", intValue, doubleValue, stringValue);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StdInStdOutTwo.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(intValue).contains(doubleValue).contains(stringValue);
    }

    @Test
    public void run_LogsValuesAsInput() {

        final String intValue = String.valueOf((int) (random() * 100));
        final String doubleValue = String.valueOf(random() * 100);
        final String stringValue = randomUUID().toString();

        final String input = String.join("\n", intValue, doubleValue, stringValue);

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(intValue).contains(doubleValue).contains(stringValue);
    }
}
