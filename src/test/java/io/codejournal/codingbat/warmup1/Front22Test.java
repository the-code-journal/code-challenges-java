package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Front22Test {

    private Front22 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Front22();
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsGreaterThan2() {

        final String str = "cat";
        final String expected = "cacatca";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsEqualTo2() {

        final String str = "ca";
        final String expected = "cacaca";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsLessThan2() {

        final String str = "c";
        final String expected = "ccc";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldPrefixSuffixWhenStringLengthIsEmpty() {

        final String str = "";
        final String expected = "";
        final String actual = fixture.front22(str);

        assertThat(actual).isEqualTo(expected);
    }
}
