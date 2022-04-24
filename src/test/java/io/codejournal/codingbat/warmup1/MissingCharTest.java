package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MissingCharTest {

    private MissingChar fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MissingChar();
    }

    @Test
    public void shouldReturnStringWithMissingCharAtStart() {

        final String str = "kitten";
        final int index = 0;
        final String expected = "itten";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringWithMissingCharAtEnd() {

        final String str = "kitten";
        final int index = 5;
        final String expected = "kitte";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringWithMissingCharAtMid() {

        final String str = "kitten";
        final int index = 1;
        final String expected = "ktten";

        final String actual = fixture.missingChar(str, index);

        assertThat(actual).isEqualTo(expected);
    }
}
