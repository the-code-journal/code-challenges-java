package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtraEndTest {

    private ExtraEnd fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ExtraEnd();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "lololo";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "ab";

        final String expected = "ababab";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Hi";

        final String expected = "HiHiHi";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringWhenStrLengthIsEqualTo1() {

        final String str = "a";

        final String expected = "aaa";

        final String actual = fixture.extraEnd(str);

        assertThat(actual).isEqualTo(expected);
    }
}
