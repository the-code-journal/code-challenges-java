package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringSplosionTest {

    private StringSplosion fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringSplosion();
    }

    @Test
    public void scenario1() {

        final String str = "Code";

        final String expected = "CCoCodCode";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void scenario2() {

        final String str = "abc";

        final String expected = "aababc";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void scenario3() {

        final String str = "ab";

        final String expected = "aab";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.stringSplosion(str);

        assertThat(actual).isEqualTo(expected);
    }
}
