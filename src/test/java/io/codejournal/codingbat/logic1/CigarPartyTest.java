package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CigarPartyTest {

    private CigarParty fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CigarParty();
    }

    @Test
    public void shouldReturnFalseWhenWeekendAndCigarsLessThan40() {

        final boolean isWeekend = true;
        final int cigars = 39;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenWeekendAndCigarsGreaterThanOrEqualTo40() {

        final boolean isWeekend = true;
        final int cigars1 = 40;
        final int cigars2 = 80;

        final boolean expected = true;

        final boolean actual1 = fixture.cigarParty(cigars1, isWeekend);
        final boolean actual2 = fixture.cigarParty(cigars2, isWeekend);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNotAWeekendAndCigarsLessThan40() {

        final boolean isWeekend = false;
        final int cigars = 39;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsEqualTo40() {

        final boolean isWeekend = false;
        final int cigars = 40;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsEqualTo60() {

        final boolean isWeekend = false;
        final int cigars = 60;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNotAWeekendAndCigarsGreaterThan40AndLessThan60() {

        final boolean isWeekend = false;
        final int cigars = 50;

        final boolean expected = true;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNotAWeekendAndCigarsGreaterThan60() {

        final boolean isWeekend = false;
        final int cigars = 61;

        final boolean expected = false;

        final boolean actual = fixture.cigarParty(cigars, isWeekend);

        assertThat(actual).isEqualTo(expected);
    }
}
