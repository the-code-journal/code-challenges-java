package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeeColorTest {

    private SeeColor fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SeeColor();
    }

    @Test
    public void testcase1() {

        final String str = "redxx";

        final String expected = "red";

        final String actual = fixture.seeColor(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "xxred";

        final String expected = "";

        final String actual = fixture.seeColor(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "blueTimes";

        final String expected = "blue";

        final String actual = fixture.seeColor(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.seeColor(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.seeColor(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsLessThan2() {

        final String str1 = "a";
        final String str2 = "ab";

        final String expected = "";

        final String actual1 = fixture.seeColor(str1);
        final String actual2 = fixture.seeColor(str2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
