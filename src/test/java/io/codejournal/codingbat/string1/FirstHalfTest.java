package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstHalfTest {

    private FirstHalf fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FirstHalf();
    }

    @Test
    public void testcase1() {

        final String str = "WooHoo";

        final String expected = "Woo";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "HelloThere";

        final String expected = "Hello";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "abcdef";

        final String expected = "abc";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFirstCharWhenStrIsDoubleChar() {

        final String str = "ab";

        final String expected = "a";

        final String actual = fixture.firstHalf(str);

        assertThat(actual).isEqualTo(expected);
    }
}
