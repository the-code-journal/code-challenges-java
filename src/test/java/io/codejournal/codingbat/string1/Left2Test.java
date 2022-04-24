package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Left2Test {

    private Left2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Left2();
    }

    @Test
    public void testcase1() {

        final String str = "Hi";

        final String expected = "Hi";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "java";

        final String expected = "vaja";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Hello";

        final String expected = "lloHe";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsDoubleChar() {

        final String str = "ab";

        final String expected = "ab";

        final String actual = fixture.left2(str);

        assertThat(actual).isEqualTo(expected);
    }
}
