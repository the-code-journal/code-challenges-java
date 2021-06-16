package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.codejournal.codingbat.warmup1.NotString;

public class NotStringTest {

    private NotString fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NotString();
    }

    @Test
    public void shouldReturnStringWithNotPrefixWhenStringDoesntStartWithNot() {

        final String expected = "not candy";

        final String str = "candy";

        final String actual = fixture.notString(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringAsItIsWhenStringStartWithNot() {

        final String expected = "not bad";

        final String str = "not bad";

        final String actual = fixture.notString(str);

        assertThat(actual).isEqualTo(expected);
    }
}
