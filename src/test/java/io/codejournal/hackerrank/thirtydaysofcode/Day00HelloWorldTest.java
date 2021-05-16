package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day00HelloWorldTest {

    private ByteArrayOutputStream output;

    private Day00HelloWorld fixture = new Day00HelloWorld();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultUseCase() {

        Day00HelloWorld.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("Hello, World.").contains("Welcome to 30 Days of Code!");
    }

    @Test
    public void run_PrintsInputString_WhenInputStringIsReadFromStream() {

        final String input = randomUUID().toString();

        fixture.run(new ByteArrayInputStream(input.getBytes()));

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("Hello, World.").contains(input);
    }
}
