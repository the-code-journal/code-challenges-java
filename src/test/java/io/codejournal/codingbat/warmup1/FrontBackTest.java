package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrontBackTest {

    private FrontBack fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FrontBack();
    }

    @Test
    public void shouldReturnEmptyWhenStringIsEmpty() {

        final String str = "";
        final String expected = "";

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStringIsSingleChar() {

        final String str = "a";
        final String expected = "a";

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFrontBackStringWhenStringMultiChar() {

        final String str = "code";
        final String expected = "eodc";

        final String actual = fixture.frontBack(str);

        assertThat(actual).isEqualTo(expected);
    }
}
