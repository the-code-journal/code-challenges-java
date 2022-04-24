package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Love6Test {

    private Love6 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Love6();
    }

    @Test
    public void shouldReturnTrueWhenAIs6() {

        final int a = 6;
        final int b = 0;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenBIs6() {

        final int a = 0;
        final int b = 6;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueNoValueIs6AndSumIs6() {

        final int a = 4;
        final int b = 2;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueNoValueIs6AndSumIsNot6AndDifferenceIs6() {

        final int a = 10;
        final int b = 4;

        final boolean expected = true;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseNoValueIs6AndSumIsNot6AndDifferenceIsNot6() {

        final int a = 2;
        final int b = 3;

        final boolean expected = false;
        final boolean actual = fixture.love6(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
