package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NonStartTest {

    private NonStart fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NonStart();
    }

    @Test
    public void testcase1() {

        final String strA = "Hello";
        final String strB = "There";

        final String expected = "ellohere";

        final String actual = fixture.nonStart(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String strA = "java";
        final String strB = "code";

        final String expected = "avaode";

        final String actual = fixture.nonStart(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String strA = "shotl";
        final String strB = "java";

        final String expected = "hotlava";

        final String actual = fixture.nonStart(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final String strA = null;
        final String strB = null;

        final String expected = "";

        final String actual = fixture.nonStart(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final String strA = "";
        final String strB = "";

        final String expected = "";

        final String actual = fixture.nonStart(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenOneIsEmptyAndOtherIsNull() {

        final String strA1 = null;
        final String strA2 = "";
        final String strB1 = "";
        final String strB2 = null;

        final String expected = "";

        final String actual1 = fixture.nonStart(strA1, strB1);
        final String actual2 = fixture.nonStart(strA2, strB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

}
