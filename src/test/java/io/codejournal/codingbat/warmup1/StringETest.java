package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringETest {

    private StringE fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringE();
    }

    @Test
    public void shouldReturnFalseWhenStringIsEmpty() {

        final String str = "";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotEmptyAndHasZeroE() {

        final String str = "a";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasOneE() {

        final String str = "ae";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasTwoE() {

        final String str = "aee";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenStringIsNotEmptyAndHasThreeE() {

        final String str = "aebece";

        final boolean expected = true;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringIsNotEmptyAndHasFourE() {

        final String str = "aebecede";

        final boolean expected = false;

        final boolean actual = fixture.stringE(str);

        assertThat(actual).isEqualTo(expected);
    }
}
