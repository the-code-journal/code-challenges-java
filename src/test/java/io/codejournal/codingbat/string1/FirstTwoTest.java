package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstTwoTest {

    private FirstTwo fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FirstTwo();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "He";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "abcdefg";

        final String expected = "ab";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "ab";

        final String expected = "ab";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringWhenStrLengthIsEqualTo1() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.firstTwo(str);

        assertThat(actual).isEqualTo(expected);
    }
}
