package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Close10Test {

    private Close10 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Close10();
    }

    @Test
    public void shouldReturnNum1WhenNum1IsClose() {

        final int a = 8;
        final int b = 13;

        final int expected = a;

        final int actual = fixture.close10(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnNum2WhenNum2IsClose() {

        final int a = 13;
        final int b = 8;

        final int expected = b;

        final int actual = fixture.close10(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn0WhenBothAreEquallyClose() {

        final int a = 7;
        final int b = 13;

        final int expected = 0;

        final int actual = fixture.close10(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
