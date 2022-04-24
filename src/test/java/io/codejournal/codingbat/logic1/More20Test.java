package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class More20Test {

    private More20 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new More20();
    }

    @Test
    public void shoulReturnFalseWhenNIsAMultipleOf20() {

        final int n = 20;

        final boolean expected = false;

        final boolean actual = fixture.more20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnTrueWhenNIsOneGreatherThanMultipleOf20() {

        final int n = 21;

        final boolean expected = true;

        final boolean actual = fixture.more20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnTrueWhenNIsTwoGreatherThanMultipleOf20() {

        final int n = 22;

        final boolean expected = true;

        final boolean actual = fixture.more20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnFalseWhenNIsMoreGreatherThanMultipleOf20() {

        final int n = 23;

        final boolean expected = false;

        final boolean actual = fixture.more20(n);

        assertThat(actual).isEqualTo(expected);
    }
}
