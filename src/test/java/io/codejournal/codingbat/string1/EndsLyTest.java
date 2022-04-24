package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EndsLyTest {

    private EndsLy fixture;

    @BeforeEach
    public void setUp() {
        fixture = new EndsLy();
    }

    @Test
    public void testcase1() {

        final String str = "oddly";

        final boolean expected = true;

        final boolean actual = fixture.endsLy(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "y";

        final boolean expected = false;

        final boolean actual = fixture.endsLy(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "oddy";

        final boolean expected = false;

        final boolean actual = fixture.endsLy(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrIsNull() {

        final String str = null;

        final boolean expected = false;

        final boolean actual = fixture.endsLy(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenStrIsEmpty() {

        final String str = "";

        final boolean expected = false;

        final boolean actual = fixture.endsLy(str);

        assertThat(actual).isEqualTo(expected);
    }
}
