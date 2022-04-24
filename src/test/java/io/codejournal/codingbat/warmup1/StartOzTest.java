package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartOzTest {

    private StartOz fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StartOz();
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStringIsSingleChar() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsMultiCharAndDoesntStartWithOZ() {

        final String str = "ab";

        final String expected = "";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndStartWithOAndNoZAtSecondPlace() {

        final String str = "obvious";

        final String expected = "o";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndDoesntStartWithOAndZAtSecondPlace() {

        final String str = "aztec";

        final String expected = "z";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnStringOWhenStringIsMultiCharAndStartWithOZ() {

        final String str = "oznic";

        final String expected = "oz";

        final String actual = fixture.startOz(str);

        assertThat(actual).isEqualTo(expected);
    }
}
