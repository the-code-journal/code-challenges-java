package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumDoubleTest {

    private SumDouble fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SumDouble();
    }

    @Test
    public void shouldReturnSumWhenFirstIsGreatherThanSecond() {

        final int first = 1;
        final int second = 2;

        final int expected = 3;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSumWhenSecondIsGreatherThanFirst() {

        final int first = 3;
        final int second = 2;

        final int expected = 5;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDoubleWhenBothAreSame() {

        final int first = 2;
        final int second = 2;

        final int expected = 8;

        final int actual = fixture.sumDouble(first, second);

        assertThat(actual).isEqualTo(expected);
    }
}
