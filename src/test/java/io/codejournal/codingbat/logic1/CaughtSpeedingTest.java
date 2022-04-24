package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaughtSpeedingTest {

    private CaughtSpeeding fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CaughtSpeeding();
    }

    @Test
    public void shouldReturn0WhenSpeedIsLessThanLowerLimitAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 59;

        final int expected = 0;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn0WhenSpeedIsLessThanLowerLimitAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 64;

        final int expected = 0;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 61;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 66;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeUpperAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 80;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsInRangeUpperAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 85;

        final int expected = 1;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsHigherAndNotBirthday() {

        final boolean isBirthday = false;
        final int speed = 81;

        final int expected = 2;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenSpeedIsHigherAndBirthday() {

        final boolean isBirthday = true;
        final int speed = 86;

        final int expected = 2;

        final int actual = fixture.caughtSpeeding(speed, isBirthday);

        assertThat(actual).isEqualTo(expected);
    }
}
