package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExtraFrontTest {

    private ExtraFront fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ExtraFront();
    }

    @Test
    public void testcase1() {

        final String str = "Hello";

        final String expected = "HeHeHe";

        final String actual = fixture.extraFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "ab";

        final String expected = "ababab";

        final String actual = fixture.extraFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "H";

        final String expected = "HHH";

        final String actual = fixture.extraFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.extraFront(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.extraFront(str);

        assertThat(actual).isEqualTo(expected);
    }
}
