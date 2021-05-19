package io.codejournal.hackerrank.java.intro;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DateAndTimeTest {

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        DateAndTime.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual.trim()).isEqualTo("WEDNESDAY");
    }
}
