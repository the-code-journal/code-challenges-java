package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartHiTest {

    private StartHi fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StartHi();
    }

    @Test
    public void shouldReturnTrueWhenStartsWithHi() {

        final String str = "hi there";
        final boolean expected = true;
        final boolean actual = fixture.startHi(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenDoesntStartsWithHi() {

        final String str = "hello";
        final boolean expected = false;
        final boolean actual = fixture.startHi(str);

        assertThat(actual).isEqualTo(expected);
    }
}
