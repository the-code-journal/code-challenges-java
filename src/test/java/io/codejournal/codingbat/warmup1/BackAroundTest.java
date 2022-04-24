package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BackAroundTest {

    private BackAround fixture;

    @BeforeEach
    public void test() {
        fixture = new BackAround();
    }

    @Test
    public void shouldBackAroundWhenMultiCharString() {

        final String str = "cat";
        final String expected = "tcatt";
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldBackAroundWhenSingleCharString() {

        final String str = "a";
        final String expected = "aaa";
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldBackAroundWhenEmptyString() {

        final String str = "";
        final String expected = "";
        final String actual = fixture.backAround(str);

        assertThat(actual).isEqualTo(expected);
    }
}
