package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WithoutEndTest {

    private WithoutEnd fixture;

    @BeforeEach
    public void setUp() {
        fixture = new WithoutEnd();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "ell";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "java";

        final String expected = "av";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "coding";

        final String expected = "odin";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsDoubleChar() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.withoutEnd(str);

        assertThat(actual).isEqualTo(expected);
    }
}
