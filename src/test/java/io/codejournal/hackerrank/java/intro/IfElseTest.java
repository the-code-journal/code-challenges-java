package io.codejournal.hackerrank.java.intro;

import static io.codejournal.hackerrank.java.intro.IfElse.NOT_WEIRD;
import static io.codejournal.hackerrank.java.intro.IfElse.WEIRD;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IfElseTest {

    @BeforeEach
    public void setUp() {
        main_LogsWierd_WhenInputStringIsOdd();
    }

    @Test
    void main_LogsWierd_WhenInputStringIsOdd() {

        final String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void main_LogsNotWierd_WhenInputStringIs2() {

        final String input = "2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void main_LogsNotWierd_WhenInputStringIs4() {

        final String input = "4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void main_LogsWierd_WhenInputStringIs6() {

        final String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void main_LogsWierd_WhenInputStringIs20() {

        final String input = "20";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void main_LogsNotWierd_WhenInputStringIs22() {

        final String input = "22";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(NOT_WEIRD);
    }

    @Test
    void main_LogsWierd_WhenInputStringIsNegativeOdd() {

        final String input = "-3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(WEIRD);
    }

    @Test
    void main_LogsNotWierd_WhenInputStringIsNegativeEven() {

        final String input = "-2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        IfElse.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains(NOT_WEIRD);
    }
}
