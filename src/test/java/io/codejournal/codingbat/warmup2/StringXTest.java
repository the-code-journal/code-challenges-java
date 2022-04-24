package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringXTest {

    private StringX fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringX();
    }

    @Test
    public void testcase1() {

        final String str = "xxHxix";

        final String expected = "xHix";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "abxxxcd";

        final String expected = "abcd";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "xabxxxcdx";

        final String expected = "xabcdx";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputStringIsEmpty() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenInputStringLenghtIsLessThan3() {

        final String str1 = "a";
        final String str2 = "x";

        final String str3 = "aa";
        final String str4 = "ax";
        final String str5 = "xa";
        final String str6 = "xx";

        final String expected1 = "a";
        final String expected2 = "x";

        final String expected3 = "aa";
        final String expected4 = "ax";
        final String expected5 = "xa";
        final String expected6 = "xx";

        final String actual1 = fixture.stringX(str1);
        final String actual2 = fixture.stringX(str2);
        final String actual3 = fixture.stringX(str3);
        final String actual4 = fixture.stringX(str4);
        final String actual5 = fixture.stringX(str5);
        final String actual6 = fixture.stringX(str6);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
        assertThat(actual5).isEqualTo(expected5);
        assertThat(actual6).isEqualTo(expected6);
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3NoX() {

        final String str = "abcdefgh";

        final String expected = "abcdefgh";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInMid() {

        final String str = "abcxxxfgh";

        final String expected = "abcfgh";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInStart() {

        final String str = "xabcfgh";

        final String expected = "xabcfgh";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInEnd() {

        final String str = "abcfghx";

        final String expected = "abcfghx";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnModifiedStringWhenInputStringLenghtIsGreaterThan3XInAll() {

        final String str = "xxxxxxxxxxxxx";

        final String expected = "xx";

        final String actual = fixture.stringX(str);

        assertThat(actual).isEqualTo(expected);
    }
}
