package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LastDigitTest {

    private LastDigit fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LastDigit();
    }

    @Test
    public void testcase1() {

        final int a = 23;
        final int b = 19;
        final int c = 13;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 23;
        final int b = 19;
        final int c = 12;

        final boolean expected = false;

        final boolean actual = fixture.lastDigit(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 23;
        final int b = 19;
        final int c = 3;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 19;
        final int b = 23;
        final int c = 3;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 19;
        final int b = 9;
        final int c = 3;

        final boolean expected = true;

        final boolean actual = fixture.lastDigit(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }
}
