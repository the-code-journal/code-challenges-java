package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LessBy10Test {

    private LessBy10 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LessBy10();
    }

    @Test
    public void testcase1() {

        final int a = 1;
        final int b = 7;
        final int c = 11;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 1;
        final int b = 7;
        final int c = 10;

        final boolean expected = false;

        final boolean actual = fixture.lessBy10(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 11;
        final int b = 1;
        final int c = 7;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 7;
        final int b = 1;
        final int c = 11;

        final boolean expected = true;

        final boolean actual = fixture.lessBy10(a, b, c);

        assertThat(actual).isEqualTo(expected);
    }
}
