package io.codejournal.hackerrank.thirtydaysofcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class Day00HelloWorldTest {

    @Test
    public void main_PrintsInputString_WhenInputStringIsReadFromStdIn() {

        final String input = "Welcome to 30 Days of Code!";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Day00HelloWorld.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual).contains("Hello, World.").contains(input);
    }
}
