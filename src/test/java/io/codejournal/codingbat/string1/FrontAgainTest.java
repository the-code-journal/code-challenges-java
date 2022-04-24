package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrontAgainTest {

    private FrontAgain fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FrontAgain();
    }

    @Test
    public void testcase1() {

        final String str = "edited";

        final boolean expected = true;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "edit";

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "ed";

        final boolean expected = true;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringIsNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringIsEmpty() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringIsSingleChar() {

        final String str = "a";

        final boolean expected = false;

        final boolean actual = fixture.frontAgain(str);

        assertThat(actual).isEqualTo(expected);
    }
}
