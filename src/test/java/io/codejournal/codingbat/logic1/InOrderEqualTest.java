package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InOrderEqualTest {

    private InOrderEqual fixture;

    @BeforeEach
    public void setUp() {
        fixture = new InOrderEqual();
    }

    @Test
    public void testcase1() {

        final int a = 2;
        final int b = 5;
        final int c = 11;
        final boolean equalOk = false;

        final boolean expected = true;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 5;
        final int b = 7;
        final int c = 6;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 7;
        final int b = 5;
        final int c = 6;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 7;
        final int b = 6;
        final int c = 5;
        final boolean equalOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 5;
        final int b = 5;
        final int c = 7;
        final boolean equalOk = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase6() {

        final int a = 5;
        final int b = 5;
        final int c = 5;
        final boolean equalOk = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase7() {

        final int a = 5;
        final int b = 7;
        final int c = 5;
        final boolean equalOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase8() {

        final int a = 7;
        final int b = 5;
        final int c = 5;
        final boolean equalOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrderEqual(a, b, c, equalOk);

        assertThat(actual).isEqualTo(expected);
    }
}
