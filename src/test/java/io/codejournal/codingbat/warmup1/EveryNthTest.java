package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EveryNthTest {

    private EveryNth fixture;

    @BeforeEach
    public void setUp() {
        fixture = new EveryNth();
    }

    @Test
    public void shouldReturnFirstCharWhenStringLengthIsLessThanN() {

        final String str = "ab";

        final int n = 3;

        final String expected = "a";

        final String actual = fixture.everyNth(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSingleCharWhenStringLengthIsGreaterThanNAndSingleHit() {

        final String str = "abc";

        final int n = 2;

        final String expected = "ac";

        final String actual = fixture.everyNth(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSingleCharWhenStringLengthIsGreaterThanNAndMultipleHit() {

        final String str = "abcdefg";

        final int n = 2;

        final String expected = "aceg";

        final String actual = fixture.everyNth(str, n);

        assertThat(actual).isEqualTo(expected);
    }
}
