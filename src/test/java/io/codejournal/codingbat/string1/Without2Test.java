package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Without2Test {

    private Without2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Without2();
    }

    @Test
    public void testcase1() {

        final String str = "HelloHe";

        final String expected = "lloHe";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "HelloHi";

        final String expected = "HelloHi";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Hi";

        final String expected = "";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.without2(str);

        assertThat(actual).isEqualTo(expected);
    }
}
