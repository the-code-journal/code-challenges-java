package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountXxTest {

    private CountXX fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CountXX();
    }

    @Test
    public void shouldReturnZeroWhenStringIsNull() {

        final String str = null;

        final int expected = 0;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {

        final String str = "";

        final int expected = 0;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnZeroWhenStringIsNotEmptyAndNoOccurrence() {

        final String str = "abcd";

        final int expected = 0;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndSingleOccurrence() {

        final String str = "axxd";

        final int expected = 1;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceNonOverlapping() {

        final String str = "abxxcdxx";

        final int expected = 2;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnCountOneWhenStringIsNotEmptyAndMultipleOccurrenceOverlapping() {

        final String str = "xxxx";

        final int expected = 3;

        final int actual = fixture.countXX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
