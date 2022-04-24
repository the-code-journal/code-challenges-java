package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateFashionTest {

    private DateFashion fixture;

    @BeforeEach
    public void setUp() {
        fixture = new DateFashion();
    }

    @Test
    public void shouldReturnZeroWhenNoneOfUsAreNotStylish() {

        final int you = 0;
        final int date = 1;

        final int expected = 0;

        final int actual = fixture.dateFashion(you, date);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnZeroWhenOneOfUsStylishAndOtherIsNot() {

        final int you1 = 8;
        final int you2 = 2;
        final int date1 = 1;
        final int date2 = 8;

        final int expected = 0;

        final int actual1 = fixture.dateFashion(you1, date1);
        final int actual2 = fixture.dateFashion(you2, date2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturn1WhenWeAreInBetween() {

        final int you1 = 3;
        final int you2 = 7;
        final int date1 = 7;
        final int date2 = 3;

        final int expected = 1;

        final int actual1 = fixture.dateFashion(you1, date1);
        final int actual2 = fixture.dateFashion(you2, date2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturn2WhenWeAreStylish() {

        final int you1 = 8;
        final int you2 = 3;
        final int date1 = 3;
        final int date2 = 9;

        final int expected = 2;

        final int actual1 = fixture.dateFashion(you1, date1);
        final int actual2 = fixture.dateFashion(you2, date2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
