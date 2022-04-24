package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Less20Test {

    private Less20 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Less20();
    }

    @Test
    public void shoulReturnFalseWhenNIsAMultipleOf20() {

        final int n = 20;

        final boolean expected = false;

        final boolean actual = fixture.less20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnTrueWhenNIsOneLessThanMultipleOf20() {

        final int n = 19;

        final boolean expected = true;

        final boolean actual = fixture.less20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnTrueWhenNIsTwoLessThanMultipleOf20() {

        final int n = 18;

        final boolean expected = true;

        final boolean actual = fixture.less20(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shoulReturnFalseWhenNIsMoreLessThanMultipleOf20() {

        final int n = 17;

        final boolean expected = false;

        final boolean actual = fixture.less20(n);

        assertThat(actual).isEqualTo(expected);
    }

}
