package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleThreeTest {

    private MiddleThree fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MiddleThree();
    }

    @Test
    public void testcase1() {

        final String str = "Candy";

        final String expected = "and";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "and";

        final String expected = "and";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "solving";

        final String expected = "lvi";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEvenLength() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.middleThree(str);

        assertThat(actual).isEqualTo(expected);
    }
}
