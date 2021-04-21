package io.codejournal.java.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixStartTest {

    private MixStart fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MixStart();
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsLessThan3() {

        final String str = "ab";

        final boolean expected = false;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStringLengthIsGreaterThanOrEqualTo3AndDoesntContainsIXAt2ndAnd3rdPosition() {

        final String str = "abcd";

        final boolean expected = false;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenStringLengthIsGreaterThanOrEqualTo3AndContainsIXAt2ndAnd3rdPosition() {

        final String str = "aixd";

        final boolean expected = true;

        final boolean actual = fixture.mixStart(str);

        assertThat(actual).isEqualTo(expected);
    }
}
