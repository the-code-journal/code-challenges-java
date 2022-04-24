package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Front3Test {

    private Front3 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Front3();
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsLessThan3() {

        final String expected = "aaa";
        final String str = "a";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsGreaterThan3() {

        final String expected = "ChoChoCho";
        final String str = "Chocolate";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectStringWhenStringLengthIsEqualTo3() {

        final String expected = "JavJavJav";
        final String str = "Jav";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCorrectStringWhenStringIsBlank() {

        final String expected = "";
        final String str = "";
        final String actual = fixture.front3(str);

        assertThat(actual).isEqualTo(expected);
    }
}
