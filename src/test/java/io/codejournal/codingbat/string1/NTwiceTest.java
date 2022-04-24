package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NTwiceTest {

    private NTwice fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NTwice();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";
        final int n = 2;

        final String expected = "Helo";

        final String actual = fixture.nTwice(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "Chocolate";
        final int n = 3;

        final String expected = "Choate";

        final String actual = fixture.nTwice(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Chocolate";
        final int n = 1;

        final String expected = "Ce";

        final String actual = fixture.nTwice(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;
        final int n = 1;

        final String expected = "";

        final String actual = fixture.nTwice(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";
        final int n = 1;

        final String expected = "";

        final String actual = fixture.nTwice(str, n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldThrowExceptionWhenStrLengthIsSmallThanN() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.nTwice("abc", 5));
    }
}
