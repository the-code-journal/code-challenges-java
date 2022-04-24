package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HasBadTest {

    private HasBad fixture;

    @BeforeEach
    public void setUp() {
        fixture = new HasBad();
    }

    @Test
    public void testcase1() {

        final String str = "badxx";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "xbadxx";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "xxbadxx";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrIsNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrIsEmpty() {

        final String str = "";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrLengthIsLess3() {

        final String str = "ab";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrLengthIsEqualTo3AndNotBad() {

        final String str = "abc";

        final boolean expected = false;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenStrLengthIsEqualTo3AndIsBad() {

        final String str = "bad";

        final boolean expected = true;

        final boolean actual = fixture.hasBad(str);

        assertThat(actual).isEqualTo(expected);
    }
}
