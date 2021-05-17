package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StaticBlockInitializerTest {

    private ByteArrayOutputStream output;

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void main_PrintsArea_WhenBreadthAndHeightArePositive() {

        final String input = "1\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StaticBlockInitializer.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).isEqualTo("3");

        new StaticBlockInitializer();
    }
}
