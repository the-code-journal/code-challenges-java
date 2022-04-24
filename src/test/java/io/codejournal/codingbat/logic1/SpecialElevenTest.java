package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpecialElevenTest {

    private SpecialEleven fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SpecialEleven();
    }

    @Test
    public void shouldReturnTrueWhenNumberIsAMultipleOf11() {

        final int n = 22;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumberIs1MoreThanMultipleOf11() {

        final int n = 23;

        final boolean expected = true;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsNotASpecialNumber() {

        final int n = 24;

        final boolean expected = false;

        final boolean actual = fixture.specialEleven(n);

        assertThat(actual).isEqualTo(expected);
    }
}
