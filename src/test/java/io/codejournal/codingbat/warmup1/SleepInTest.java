package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SleepInTest {

    private SleepIn fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SleepIn();
    }

    @Test
    public void shouldNotSleepIfWeekdayAndNotVacation() {

        final boolean shouldSleep = false;

        final boolean isWeekday = true;
        final boolean isVacation = false;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    public void shouldSleepIfNotWeekdayAndNotVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = false;
        final boolean isVacation = false;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    public void shouldSleepIfNotWeekdayAndVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = false;
        final boolean isVacation = true;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }

    @Test
    public void shouldSleepIfWeekdayAndVacation() {

        final boolean shouldSleep = true;

        final boolean isWeekday = true;
        final boolean isVacation = true;

        final boolean isSleeping = fixture.sleepIn(isWeekday, isVacation);

        assertThat(shouldSleep).isEqualTo(isSleeping);
    }
}
