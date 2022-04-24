package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TheEndTest {

    private TheEnd fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TheEnd();
    }

    @Test
    public void testcase1() {
        final String str = "Hello";
        final boolean front = true;

        final String expected = "H";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {
        final String str = "Hello";
        final boolean front = false;

        final String expected = "o";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {
        final String str = "oh";
        final boolean front = true;

        final String expected = "o";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsNull() {
        final String str = null;
        final boolean front = true;

        final String expected = "";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStrIsEmpty() {
        final String str = "";
        final boolean front = true;

        final String expected = "";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleCharAndFrontIsTrue() {
        final String str = "a";
        final boolean front = true;

        final String expected = "a";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStrIsSingleCharAndFrontIsFalse() {
        final String str = "a";
        final boolean front = false;

        final String expected = "a";

        final String actual = fixture.theEnd(str, front);

        assertThat(actual).isEqualTo(expected);
    }
}
