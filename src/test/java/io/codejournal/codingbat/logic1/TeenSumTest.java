package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeenSumTest {

    private TeenSum fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TeenSum();
    }

    @Test
    public void testcase1() {

        final int a = 3;
        final int b = 4;

        final int expected = 7;

        final int actual = fixture.teenSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 10;
        final int b = 13;

        final int expected = 19;

        final int actual = fixture.teenSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 13;
        final int b = 2;

        final int expected = 19;

        final int actual = fixture.teenSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 20;
        final int b = 20;

        final int expected = 40;

        final int actual = fixture.teenSum(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
