package io.codejournal.hackerrank.java.intro;

import static java.lang.Math.random;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StdInStdOutTest {

    private ByteArrayOutputStream output;

    private StdInStdOut fixture = new StdInStdOut();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void main_LogsNumbersAsInput() {

        final String number1 = String.valueOf(42);
        final String number2 = String.valueOf(100);
        final String number3 = String.valueOf(125);

        final String input = String.join("\n", number1, number2, number3);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StdInStdOut.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(number1).contains(number2).contains(number3);
    }

    @Test
    public void run_LogsNumbersAsInput() {

        final String number1 = String.valueOf((int) (random() * 100));
        final String number2 = String.valueOf((int) (random() * 100));
        final String number3 = String.valueOf((int) (random() * 100));

        final String input = String.join("\n", number1, number2, number3);

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains(number1).contains(number2).contains(number3);
    }
}
