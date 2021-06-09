package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day24MoreLinkedListTest {

    private ByteArrayOutputStream output;

    private Day24MoreLinkedList fixture = new Day24MoreLinkedList();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase1() {

        final String expected = "1 2 3 4";

        Day24MoreLinkedList.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void defaultCase2() {

        // @formatter:off
        final int[] values = new int[] {
                                3, 9, 9, 11, 11, 11, 11, 89, 89, 100, 100,
                                101, 102, 103, 108, 200, 250 ,250, 250, 250
                             };
        // @formatter:on

        final String expected = "3 9 11 89 100 101 102 103 108 200 250";

        fixture.run(values);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void display_DoesNotPrintAnything_WhenListIsEmpty() {

        fixture.run(new int[] {});

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEmpty();
    }
}
