package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoCharTest {

    private TwoChar fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TwoChar();
    }

    @Test
    public void testcase1() {

        final String str = "java";
        final int index = 0;

        final String expected = "ja";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "java";
        final int index = 2;

        final String expected = "va";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "java";
        final int index = 3;

        final String expected = "ja";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;
        final int index = 0;

        final String expected = "";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";
        final int index = 0;

        final String expected = "";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenIndexIsLessThanZero() {

        final String str = "abc";
        final int index = -1;

        final String expected = "ab";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsLessThan2() {

        final String str = "a";
        final int index = 0;

        final String expected = "";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenIndexIsOutOfRange() {

        final String str = "abcd";
        final int index = 6;

        final String expected = "ab";

        final String actual = fixture.twoChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }
}
