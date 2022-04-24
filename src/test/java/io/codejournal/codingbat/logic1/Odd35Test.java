package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Odd35Test {

    private Odd35 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Odd35();
    }

    @Test
    public void shouldReturnTrueWhenNIsDivisibleBy3ButNotDivisibleBy5() {

        final int n = 3;

        final boolean expected = true;

        final boolean actual = fixture.old35(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNIsNotDivisibleBy3ButDivisibleBy5() {

        final int n = 5;

        final boolean expected = true;

        final boolean actual = fixture.old35(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNIsDivisibleBy3AndDivisibleBy5() {

        final int n = 15;

        final boolean expected = false;

        final boolean actual = fixture.old35(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNIsNotDivisibleBy3AndNotDivisibleBy5() {

        final int n = 7;

        final boolean expected = false;

        final boolean actual = fixture.old35(n);

        assertThat(actual).isEqualTo(expected);
    }
}
