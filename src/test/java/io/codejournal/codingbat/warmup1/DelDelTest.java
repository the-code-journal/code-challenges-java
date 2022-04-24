package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DelDelTest {

    private DelDel fixture;

    @BeforeEach
    public void setUp() {
        fixture = new DelDel();
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThan4() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsGreatherThanEqualTo4AndDoesntContainDel() {

        final String str = "abcd";

        final String expected = "abcd";

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnUpdatedStringWhenStringLengthIsGreatherThanEqualTo4AndContainDel() {

        final String str = "adel";

        final String expected = "a";

        final String actual = fixture.delDel(str);

        assertThat(actual).isEqualTo(expected);
    }
}
