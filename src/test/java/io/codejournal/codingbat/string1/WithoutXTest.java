package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WithoutXTest {

    private WithoutX fixture;

    @BeforeEach
    public void setUp() {
        fixture = new WithoutX();
    }

    @Test
    public void testcase1() {

        final String str = "xHix";

        final String expected = "Hi";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "xHi";

        final String expected = "Hi";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Hxix";

        final String expected = "Hxi";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharNotX() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharX() {

        final String str = "x";

        final String expected = "";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharLeftX() {

        final String str = "xxAbxcD";

        final String expected = "xAbxcD";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharRightX() {

        final String str = "AbxcDxx";

        final String expected = "AbxcDx";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharLeftRightX() {

        final String str = "xxAbxcDxx";

        final String expected = "xAbxcDx";

        final String actual = fixture.withoutX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
