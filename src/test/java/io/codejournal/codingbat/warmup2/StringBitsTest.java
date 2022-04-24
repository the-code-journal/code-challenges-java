package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringBitsTest {

    public StringBits fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringBits();
    }

    @Test
    public void testScenario1() {

        final String str = "Hello";

        final String expected = "Hlo";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testScenario2() {

        final String str = "Hi";

        final String expected = "H";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testScenario3() {

        final String str = "Heeololeo";

        final String expected = "Hello";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBlankStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBlankStringWhenStringIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.stringBits(str);

        assertThat(actual).isEqualTo(expected);
    }
}
