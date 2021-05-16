package io.codejournal.hackerrank.java.intro;

import static java.lang.Math.random;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoopsOneTest {

    private ByteArrayOutputStream output;

    private LoopsOne fixture = new LoopsOne();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() throws IOException {

        LoopsOne.main(null);

        final String actual = output.toString(UTF_8);

        verify(actual, 2);
    }

    @Test
    public void run_PrintsMultipleTable_ForGivenNumber() {

        final int number = (int) (random() * 100);

        fixture.run(number);

        final String actual = output.toString(UTF_8);

        verify(actual, number);
    }

    private void verify(final String actual, final int number) {
        for (int i = 1; i <= 10; i++) {
            assertThat(actual).contains(String.format("%d x %d = %d", number, i, (number * i)));
        }
    }
}
