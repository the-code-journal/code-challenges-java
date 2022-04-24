package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeFrontTest {

    private DeFront fixture;

    @BeforeEach
    public void setUp() {
        fixture = new DeFront();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "llo";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "java";

        final String expected = "va";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "away";

        final String expected = "aay";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharA() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharNotA() {

        final String str = "b";

        final String expected = "";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharAB() {

        final String str = "ab";

        final String expected = "ab";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharANotB() {

        final String str = "ax";

        final String expected = "a";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharNotAB() {

        final String str = "xb";

        final String expected = "b";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleCharNotANotB() {

        final String str = "xx";

        final String expected = "";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAB() {

        final String str = "abx";

        final String expected = "abx";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharANotB() {

        final String str = "axx";

        final String expected = "ax";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharNotAB() {

        final String str = "xbx";

        final String expected = "bx";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharNotANotB() {

        final String str = "xxx";

        final String expected = "x";

        final String actual = fixture.deFront(str);

        assertThat(actual).isEqualTo(expected);
    }
}
