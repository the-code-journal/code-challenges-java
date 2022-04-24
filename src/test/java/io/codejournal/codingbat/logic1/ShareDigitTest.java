package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShareDigitTest {

    private ShareDigit fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ShareDigit();
    }

    @Test
    public void testcase1() {

        final int a = 12;
        final int b = 23;

        final boolean expected = true;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 12;
        final int b = 43;

        final boolean expected = false;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 12;
        final int b = 44;

        final boolean expected = false;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 3333;
        final int b = 1111;

        final boolean expected = false;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 3322233;
        final int b = 1144411;

        final boolean expected = false;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase6() {

        final int a = 3322237;
        final int b = 1144417;

        final boolean expected = true;

        final boolean actual = fixture.shareDigit(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
