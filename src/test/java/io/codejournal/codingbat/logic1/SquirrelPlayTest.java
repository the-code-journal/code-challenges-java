package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SquirrelPlayTest {

    private SquirrelPlay fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SquirrelPlay();
    }

    @Test
    public void shouldReturnFalseWhenTempIsLessThanLowerLimitAndIsNotSummer() {

        final int temp = 59;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempIsLessThanLowerLimitAndIsSummer() {

        final int temp = 59;
        final boolean isSummer = true;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempIsInRangeAndIsNotSummer() {

        final int temp = 60;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempIsInRangeAndIsSummer() {

        final int temp = 60;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempEqualToUpperLimitAndIsNotSummer() {

        final int temp = 90;
        final boolean isSummer = false;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempEqualToUpperLimitAndIsSummer() {

        final int temp = 100;
        final boolean isSummer = true;

        final boolean expected = true;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempGreaterThanUpperLimitAndIsNotSummer() {

        final int temp = 95;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenTempGreaterThanUpperLimitAndIsSummer() {

        final int temp = 101;
        final boolean isSummer = false;

        final boolean expected = false;

        final boolean actual = fixture.squirrelPlay(temp, isSummer);

        assertThat(actual).isEqualTo(expected);
    }
}
