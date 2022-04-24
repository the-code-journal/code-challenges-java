package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrontTimesTest {

    private FrontTimes fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FrontTimes();
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;
        final int n = 5;

        final String expected = "";

        final String actual = fixture.frontTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";
        final int n = 5;

        final String expected = "";

        final String actual = fixture.frontTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthLessThan3() {

        final String str = "a";
        final int n = 3;

        final String expected = "aaa";

        final String actual = fixture.frontTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndHasLengthGreaterThan3() {

        final String str = "abcd";
        final int n = 2;

        final String expected = "abcabc";

        final String actual = fixture.frontTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFrontStringWhenStringIsNotEmptyAndNumberIsZero() {

        final String str = "abcd";
        final int n = 0;

        final String expected = "";

        final String actual = fixture.frontTimes(str, n);

        assertThat(actual).isEqualTo(expected);
    }
}
