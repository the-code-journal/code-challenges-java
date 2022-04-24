package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoAsOneTest {

    private TwoAsOne fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TwoAsOne();
    }

    @Test
    public void testcase1() {

        final int a = 1;
        final int b = 2;
        final int c = 3;

        final boolean expected = true;

        final boolean actual = fixture.twoAsOne(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 3;
        final int b = 1;
        final int c = 2;

        final boolean expected = true;

        final boolean actual = fixture.twoAsOne(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 1;
        final int b = 3;
        final int c = 2;

        final boolean expected = true;

        final boolean actual = fixture.twoAsOne(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 3;
        final int b = 2;
        final int c = 2;

        final boolean expected = false;

        final boolean actual = fixture.twoAsOne(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }
}
