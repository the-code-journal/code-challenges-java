package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InOrderTest {

    private InOrder fixture;

    @BeforeEach
    public void setUp() {
        fixture = new InOrder();
    }

    @Test
    public void testcase1() {

        final int a = 1;
        final int b = 2;
        final int c = 4;

        final boolean bOk = false;

        final boolean expected = true;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int a = 1;
        final int b = 2;
        final int c = 1;

        final boolean bOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int a = 1;
        final int b = 1;
        final int c = 2;

        final boolean bOk = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int a = 3;
        final int b = 1;
        final int c = 2;

        final boolean bOk = true;

        final boolean expected = true;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int a = 3;
        final int b = 2;
        final int c = 1;

        final boolean bOk = false;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase6() {

        final int a = 3;
        final int b = 2;
        final int c = 1;

        final boolean bOk = true;

        final boolean expected = false;

        final boolean actual = fixture.inOrder(a, b, c, bOk);

        assertThat(actual).isEqualTo(expected);
    }
}
