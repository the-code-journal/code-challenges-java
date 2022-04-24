package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeaPartyTest {

    private TeaParty fixture;

    @BeforeEach
    public void setUp() {
        fixture = new TeaParty();
    }

    @Test
    public void testcase1() {

        final int tea = 6;
        final int candy = 8;

        final int expected = 1;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int tea = 3;
        final int candy = 8;

        final int expected = 0;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int tea = 20;
        final int candy = 6;

        final int expected = 2;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int tea = 3;
        final int candy = 2;

        final int expected = 0;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int tea = 8;
        final int candy = 2;

        final int expected = 0;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase6() {

        final int tea = 6;
        final int candy = 18;

        final int expected = 2;

        final int actual = fixture.teaParty(tea, candy);

        assertThat(actual).isEqualTo(expected);
    }
}
