package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day26NestedLogicTest {

    private ByteArrayOutputStream output;

    private Day26NestedLogic fixture = new Day26NestedLogic();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void outputPrintedIs0_WhenNoDelay() {

        final String actualReturnDate = "2 1 2021";
        final String expectedReturnDate = "2 1 2021";

        final String expected = "0";

        fixture.run(actualReturnDate, expectedReturnDate);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void outputPrintedIs0_WhenNoDelayYearIsSmaller() {

        final String actualReturnDate = "2 1 2020";
        final String expectedReturnDate = "2 1 2021";

        final String expected = "0";

        fixture.run(actualReturnDate, expectedReturnDate);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void outputPrintedIs0_WhenNoDelayMonthIsSmaller() {

        final String actualReturnDate = "2 1 2021";
        final String expectedReturnDate = "2 2 2021";

        final String expected = "0";

        fixture.run(actualReturnDate, expectedReturnDate);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void outputPrintedIs45_WhenDelayBy3Days() {

        final String expected = "45";

        Day26NestedLogic.main(null);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void outputPrintedIs1000_WhenDelayBy2Months() {

        final String actualReturnDate = "1 3 2021";
        final String expectedReturnDate = "1 1 2021";

        final String expected = "1000";

        fixture.run(actualReturnDate, expectedReturnDate);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void outputPrintedIs10000_WhenDelayBy1Year() {

        final String actualReturnDate = "1 1 2022";
        final String expectedReturnDate = "1 1 2021";

        final String expected = "10000";

        fixture.run(actualReturnDate, expectedReturnDate);

        final String actual = output.toString(UTF_8).trim();

        assertThat(actual).isEqualTo(expected);
    }
}
