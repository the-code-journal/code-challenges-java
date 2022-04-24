package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleXTest {

    private DoubleX fixture;

    @BeforeEach
    public void setUp() {
        fixture = new DoubleX();
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInFront() {

        final String str = "xxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInEnd() {

        final String str = "axx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenFirstTwoXAreNextToEachOtherInMiddle() {

        final String str = "axxbb";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNoXExists() {

        final String str = "abcdef";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenXExistsAlone() {

        final String str = "axcxefx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenFirstXIsAlone() {

        final String str = "xcxx";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenAllX() {

        final String str = "xxx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenSingleX() {

        final String str = "x";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenTwoX() {

        final String str = "xx";

        final boolean expected = true;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenEmpty() {

        final String str = "";

        final boolean expected = false;

        final boolean actual = fixture.doubleX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
