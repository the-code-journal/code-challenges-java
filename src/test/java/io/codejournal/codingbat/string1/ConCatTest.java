package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConCatTest {

    private ConCat fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ConCat();
    }

    @Test
    public void testcase1() {

        final String a = "abc";
        final String b = "cat";

        final String expected = "abcat";

        final String actual = fixture.conCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String a = "dog";
        final String b = "cat";

        final String expected = "dogcat";

        final String actual = fixture.conCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String a = "abc";
        final String b = "";

        final String expected = "abc";

        final String actual = fixture.conCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {

        final String a = null;
        final String b = null;

        final String expected = "";

        final String actual = fixture.conCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {

        final String a = "";
        final String b = "";

        final String expected = "";

        final String actual = fixture.conCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenOneIsNullAndOtherIsEmpty() {

        final String a1 = "";
        final String b1 = null;
        final String a2 = null;
        final String b2 = "";

        final String expected = "";

        final String actual1 = fixture.conCat(a1, b1);
        final String actual2 = fixture.conCat(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
