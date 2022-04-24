package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LastCharsTest {

    private LastChars fixture;

    @BeforeEach
    public void setUp() {
        fixture = new LastChars();
    }

    @Test
    public void testcase1() {

        final String a = "last";
        final String b = "chars";

        final String expected = "ls";

        final String actual = fixture.lastChars(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String a = "yo";
        final String b = "java";

        final String expected = "ya";

        final String actual = fixture.lastChars(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String a = "hi";
        final String b = "";

        final String expected = "h@";

        final String actual = fixture.lastChars(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDoubleAtWhenBothAreNull() {

        final String a = null;
        final String b = null;

        final String expected = "@@";

        final String actual = fixture.lastChars(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDoubleAtWhenBothAreEmpty() {

        final String a = "";
        final String b = "";

        final String expected = "@@";

        final String actual = fixture.lastChars(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnDoubleAtWhenOneIsNullAndOtherIsEmpty() {

        final String a1 = "";
        final String b1 = null;
        final String a2 = null;
        final String b2 = "";

        final String expected = "@@";

        final String actual1 = fixture.lastChars(a1, b1);
        final String actual2 = fixture.lastChars(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
