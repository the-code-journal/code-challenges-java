package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortaSumTest {

    private SortaSum fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SortaSum();
    }

    @Test
    public void shouldReturnSumIfSumIsLessThan10() {

        final int a = 3;
        final int b = 4;

        final int expected = 7;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn20IfSumIsEqualTo10() {

        final int a = 3;
        final int b = 7;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan10AndLessThan19() {

        final int a = 9;
        final int b = 4;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn20IfSumIsEqualTo19() {

        final int a = 9;
        final int b = 10;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan19() {

        final int a = 10;
        final int b = 10;

        final int expected = 20;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturn20IfSumIsGreaterThan20() {

        final int a = 10;
        final int b = 11;

        final int expected = 21;

        final int actual = fixture.sortaSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
