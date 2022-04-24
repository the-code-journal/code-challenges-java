package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LastTwoTest {

    private LastTwo fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LastTwo();
    }

    @Test
    public void testcase1() {

        final String str = "coding";

        final String expected = "codign";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "cat";

        final String expected = "cta";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "ab";

        final String expected = "ba";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.lastTwo(str);

        assertThat(actual).isEqualTo(expected);
    }
}
