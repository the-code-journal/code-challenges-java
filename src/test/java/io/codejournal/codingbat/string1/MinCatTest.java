package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinCatTest {

    private MinCat fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MinCat();
    }

    @Test
    public void testcase1() {

        final String a = "Hello";
        final String b = "Hi";

        final String expected = "loHi";

        final String actual = fixture.minCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String a = "Hello";
        final String b = "java";

        final String expected = "ellojava";

        final String actual = fixture.minCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String a = "java";
        final String b = "Hello";

        final String expected = "javaello";

        final String actual = fixture.minCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final String a = null;
        final String b = null;

        final String expected = "";

        final String actual = fixture.minCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final String a = "";
        final String b = "";

        final String expected = "";

        final String actual = fixture.minCat(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenOneIsNullAndOtherIsNotNull() {

        final String a1 = null;
        final String b1 = "";
        final String a2 = "";
        final String b2 = null;
        final String a3 = null;
        final String b3 = "a";
        final String a4 = "a";
        final String b4 = null;

        final String expected = "";

        final String actual1 = fixture.minCat(a1, b1);
        final String actual2 = fixture.minCat(a2, b2);
        final String actual3 = fixture.minCat(a3, b3);
        final String actual4 = fixture.minCat(a4, b4);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
        assertThat(actual4).isEqualTo(expected);
    }

    @Test
    public void shouldReturnConcatWhenBothAreSameLength() {

        final String a = "a";
        final String b = "b";

        final String expected = "ab";

        final String actual1 = fixture.minCat(a, b);

        assertThat(actual1).isEqualTo(expected);
    }
}
