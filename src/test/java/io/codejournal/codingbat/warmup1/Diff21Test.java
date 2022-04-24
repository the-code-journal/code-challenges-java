package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Diff21Test {

    private Diff21 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Diff21();
    }

    @Test
    public void shouldReturnDiffIfNumberIsGreaterThan21() {

        final int number = 22;
        final int expected = 2;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDiffIfNumberIsEqualTo21() {

        final int number = 21;
        final int expected = 0;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDiffIfNumberIsLessTo19() {

        final int number = 19;
        final int expected = 2;

        final int actual = fixture.diff21(number);

        assertThat(actual).isEqualTo(expected);
    }
}
