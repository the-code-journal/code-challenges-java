package io.codejournal.hackerrank.java.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class StdInStdOutTest {

    private StdInStdOut fixture = new StdInStdOut();

    @Test
    public void main_LogsNumbersAsInput() {

        final String number1 = String.valueOf(42);
        final String number2 = String.valueOf(100);
        final String number3 = String.valueOf(125);

        final String input = String.join("\n", number1, number2, number3);
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        StdInStdOut.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(number1).contains(number2).contains(number3);
    }

    @Test
    public void run_LogsNumbersAsInput() {

        final String number1 = String.valueOf(42);
        final String number2 = String.valueOf(100);
        final String number3 = String.valueOf(125);

        final String input = String.join("\n", number1, number2, number3);

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(number1).contains(number2).contains(number3);
    }
}
