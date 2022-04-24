package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumLimitTest {

    private SumLimit fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SumLimit();
    }

    @Test
    public void testcase1() {

        final int a = 2;
        final int b = 3;

        final int expected = 5;

        final int actual = fixture.sumLimit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 8;
        final int b = 3;

        final int expected = 8;

        final int actual = fixture.sumLimit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 8;
        final int b = 1;

        final int expected = 9;

        final int actual = fixture.sumLimit(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
