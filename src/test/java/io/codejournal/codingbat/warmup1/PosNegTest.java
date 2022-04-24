package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PosNegTest {

    private PosNeg fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PosNeg();
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagUnsetAndFirstIsNegative() {

        final boolean expected = true;

        final int a = -1;
        final int b = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagUnsetAndSecondIsNegative() {

        final boolean expected = true;

        final int a = 1;
        final int b = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagUnsetAndBothAreNegative() {

        final boolean expected = false;

        final int a = -1;
        final int b = -1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagUnsetAndBothArePositive() {

        final boolean expected = false;

        final int a = 1;
        final int b = 1;
        final boolean negativeFlag = false;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndFirstIsNegative() {

        final boolean expected = false;

        final int a = -1;
        final int b = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndSecondIsNegative() {

        final boolean expected = false;

        final int a = 1;
        final int b = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNegativeFlagIsSetAndBothArePositive() {

        final boolean expected = false;

        final int a = 1;
        final int b = 1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNegativeFlagIsSetAndBothAreNegative() {

        final boolean expected = true;

        final int a = -1;
        final int b = -1;
        final boolean negativeFlag = true;

        final boolean actual = fixture.posNeg(a, b, negativeFlag);

        assertThat(actual).isEqualTo(expected);
    }
}
