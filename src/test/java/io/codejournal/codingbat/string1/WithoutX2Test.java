package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WithoutX2Test {

    private WithoutX2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new WithoutX2();
    }

    @Test
    public void testcase1() {

        final String str = "xHi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "Hxi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "Hi";

        final String expected = "Hi";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharAndNoX() {

        final String str = "a";

        final String expected = "a";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsSingleCharAndX() {

        final String str = "x";

        final String expected = "";

        final String actual = fixture.withoutX2(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndNoX() {

        final String str1 = "ab";
        final String str2 = "abc";
        final String str3 = "abcd";

        final String expected1 = "ab";
        final String expected2 = "abc";
        final String expected3 = "abcd";

        final String actual1 = fixture.withoutX2(str1);
        final String actual2 = fixture.withoutX2(str2);
        final String actual3 = fixture.withoutX2(str3);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndSingleX() {

        final String str1 = "xb";
        final String str2 = "xbc";
        final String str3 = "xbcd";
        final String str4 = "ax";
        final String str5 = "axc";
        final String str6 = "axcd";

        final String expected1 = "b";
        final String expected2 = "bc";
        final String expected3 = "bcd";
        final String expected4 = "a";
        final String expected5 = "ac";
        final String expected6 = "acd";

        final String actual1 = fixture.withoutX2(str1);
        final String actual2 = fixture.withoutX2(str2);
        final String actual3 = fixture.withoutX2(str3);
        final String actual4 = fixture.withoutX2(str4);
        final String actual5 = fixture.withoutX2(str5);
        final String actual6 = fixture.withoutX2(str6);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
        assertThat(actual5).isEqualTo(expected5);
        assertThat(actual6).isEqualTo(expected6);
    }

    @Test
    public void shouldReturnEmptyWhenStrIsMultiCharAndBothX() {

        final String str1 = "xx";
        final String str2 = "xxc";
        final String str3 = "xxcd";

        final String expected1 = "";
        final String expected2 = "c";
        final String expected3 = "cd";

        final String actual1 = fixture.withoutX2(str1);
        final String actual2 = fixture.withoutX2(str2);
        final String actual3 = fixture.withoutX2(str3);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
    }
}
