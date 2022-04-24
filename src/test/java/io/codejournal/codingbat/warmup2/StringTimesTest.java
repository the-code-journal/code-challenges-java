package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTimesTest {

    private StringTimes fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringTimes();
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsEmpty() {

        final String str = "";
        final int n = 1;

        final String expected = "";

        final String actual = fixture.stringTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringCount1WhenInputStringIsNonEmptyAndCountIs1() {

        final String str = "Hi";
        final int n = 1;

        final String expected = "Hi";

        final String actual = fixture.stringTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringCountMultipleWhenInputStringIsNonEmptyAndCountIsGreaterThan1() {

        final String str = "Hi";
        final int n1 = 2;
        final int n2 = 3;

        final String expected1 = "HiHi";
        final String expected2 = "HiHiHi";

        final String actual1 = fixture.stringTimes(str, n1);
        final String actual2 = fixture.stringTimes(str, n2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
