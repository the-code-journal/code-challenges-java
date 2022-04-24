package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WithoutDoublesTest {

    private WithoutDoubles fixture;

    @BeforeEach
    public void setUp() {
        fixture = new WithoutDoubles();
    }

    @Test
    public void testcase1() {

        final int die1 = 2;
        final int die2 = 3;
        final boolean noDoubles = true;

        final int expected = 5;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int die1 = 3;
        final int die2 = 3;
        final boolean noDoubles = true;

        final int expected = 7;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int die1 = 3;
        final int die2 = 3;
        final boolean noDoubles = false;

        final int expected = 6;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int die1 = 6;
        final int die2 = 6;
        final boolean noDoubles = true;

        final int expected = 7;

        final int actual = fixture.withoutDoubles(die1, die2, noDoubles);

        assertThat(actual).isEqualTo(expected);
    }
}
