package io.codejournal.hackerrank.java.intro;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class CurrencyFormatterTest {

    @Test
    public void defaultCase() {

        // @formatter:off
        final String expected = "US: $12,324.13\n"
                              + "India: ₹12,324.13\n"
                              + "China: ¥12,324.13\n"
                              + "France: 12 324,13 €";
        // @formatter:on

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        CurrencyFormatter.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
