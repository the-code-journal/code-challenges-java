package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleTwoTest {

    private MiddleTwo fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MiddleTwo();
    }

    @Test
    public void testcase1() {

        final String str = "string";

        final String expected = "ri";

        final String actual = fixture.middleTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "code";

        final String expected = "od";

        final String actual = fixture.middleTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Practice";

        final String expected = "ct";

        final String actual = fixture.middleTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.middleTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.middleTwo(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsOddLength() {
        assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(() -> fixture.middleTwo("a"));
    }

}
