package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlarmClockTest {

    private AlarmClock fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AlarmClock();
    }

    @Test
    public void shouldReturnOffWhenVacationAndWeekend() {

        final int day1 = 6;
        final int day2 = 0;
        final boolean vacation = true;

        final String expected = AlarmClock.ALARM_OFF;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnOffWhenVacationAndWeekday() {

        final int day = 2;
        final boolean vacation = true;

        final String expected = AlarmClock.ALARM_10AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnOffWhenNotVacationAndWeekend() {

        final int day1 = 0;
        final int day2 = 6;
        final boolean vacation = false;

        final String expected = AlarmClock.ALARM_10AM;

        final String actual1 = fixture.alarmClock(day1, vacation);
        final String actual2 = fixture.alarmClock(day2, vacation);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnOffWhenNotVacationAndWeekday() {

        final int day = 4;
        final boolean vacation = false;

        final String expected = AlarmClock.ALARM_7AM;

        final String actual = fixture.alarmClock(day, vacation);

        assertThat(actual).isEqualTo(expected);
    }
}
