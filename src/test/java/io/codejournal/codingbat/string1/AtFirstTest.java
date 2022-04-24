package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AtFirstTest {

    private AtFirst fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AtFirst();
    }

    @Test
    public void testcase1() {

        final String str = "hello";

        final String expected = "he";

        final String actual = fixture.atFirst(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "hi";

        final String expected = "hi";

        final String actual = fixture.atFirst(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "h";

        final String expected = "h@";

        final String actual = fixture.atFirst(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "@@";

        final String actual = fixture.atFirst(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "@@";

        final String actual = fixture.atFirst(str);

        assertThat(actual).isEqualTo(expected);
    }
}
