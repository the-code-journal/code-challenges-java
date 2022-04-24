package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxMod5Test {

    private MaxMod5 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MaxMod5();
    }

    @Test
    public void testcase1() {

        final int a = 2;
        final int b = 3;

        final int expected = 3;

        final int actual = fixture.maxMod5(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 6;
        final int b = 2;

        final int expected = 6;

        final int actual = fixture.maxMod5(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 3;
        final int b = 2;

        final int expected = 3;

        final int actual = fixture.maxMod5(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 2;
        final int b = 7;

        final int expected = 2;

        final int actual = fixture.maxMod5(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 3;
        final int b = 3;

        final int expected = 0;

        final int actual = fixture.maxMod5(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
