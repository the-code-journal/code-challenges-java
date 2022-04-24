package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WithoutEnd2Test {

    private WithoutEnd2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new WithoutEnd2();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "ell";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "abc";

        final String expected = "b";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsSingleChar() {

        final String str = "a";

        final String expected = "";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsDoubleChar() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.withouEnd2(str);

        assertThat(actual).isEqualTo(expected);
    }
}
