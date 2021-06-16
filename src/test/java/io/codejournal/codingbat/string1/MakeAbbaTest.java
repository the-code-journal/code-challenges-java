package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.codejournal.codingbat.string1.MakeAbba;

public class MakeAbbaTest {

    private MakeAbba fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MakeAbba();
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {

        final String a = null;
        final String b = null;

        final String expected = "";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {

        final String a = "";
        final String b = "";

        final String expected = "";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNullAndBIsNotNull() {

        final String a = null;
        final String b = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsEmptyAndBIsNotNull() {

        final String a = "";
        final String b = "B";

        final String expected = "BB";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnAAWhenAIsNotNullAndBIsNull() {

        final String a = "A";
        final String b = null;

        final String expected = "AA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNull() {

        final String a = "A";
        final String b = "";

        final String expected = "AA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullUpper() {

        final String a = "A";
        final String b = "B";

        final String expected = "ABBA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullLower() {

        final String a = "a";
        final String b = "b";

        final String expected = "abba";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullMixed() {

        final String a = "A";
        final String b = "b";

        final String expected = "AbbA";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnBBWhenAIsNotNullAndBIsNotNullMultiChar() {

        final String a = "Abc";
        final String b = "Xyz";

        final String expected = "AbcXyzXyzAbc";

        final String actual = fixture.makeAbba(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
