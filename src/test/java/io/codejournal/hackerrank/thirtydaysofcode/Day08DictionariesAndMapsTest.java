package io.codejournal.hackerrank.thirtydaysofcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.Test;

public class Day08DictionariesAndMapsTest {

    @Test
    public void defaultCase() {

        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        final String expected = "sam=99912222\nNot found\nharry=12299933";

        Day08DictionariesAndMaps.main(null);

        final String actual = output.toString(StandardCharsets.UTF_8);

        assertThat(actual.trim()).isEqualTo(expected);
    }
}
