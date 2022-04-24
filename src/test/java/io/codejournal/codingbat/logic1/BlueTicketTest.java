package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlueTicketTest {

    private BlueTicket fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BlueTicket();
    }

    @Test
    public void testcase1() {

        final int a = 9;
        final int b = 1;
        final int c = 0;

        final int expected = 10;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 9;
        final int b = 2;
        final int c = 0;

        final int expected = 0;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 6;
        final int b = 1;
        final int c = 4;

        final int expected = 10;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 1;
        final int b = 6;
        final int c = 4;

        final int expected = 10;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 14;
        final int b = 0;
        final int c = 4;

        final int expected = 5;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase6() {

        final int a = 0;
        final int b = 14;
        final int c = 4;

        final int expected = 5;

        final int actual = fixture.blueTicket(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }
}
