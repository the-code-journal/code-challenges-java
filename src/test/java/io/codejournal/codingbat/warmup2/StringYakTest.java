package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringYakTest {

    private StringYak fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringYak();
    }

    @Test
    public void testcase1() {

        final String str = "yakpak";

        final String expected = "pak";

        final String actual = fixture.stringYak(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "pakyak";

        final String expected = "pak";

        final String actual = fixture.stringYak(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "yak123ya";

        final String expected = "123ya";

        final String actual = fixture.stringYak(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.stringYak(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.stringYak(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThan3() {

        final String str1 = "y";
        final String str2 = "ya";

        final String expected1 = "y";
        final String expected2 = "ya";

        final String actual1 = fixture.stringYak(str1);
        final String actual2 = fixture.stringYak(str2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsGreaterThan3AndNoReplacement() {

        final String str1 = "abc";
        final String str2 = "abcdefgh";

        final String expected1 = "abc";
        final String expected2 = "abcdefgh";

        final String actual1 = fixture.stringYak(str1);
        final String actual2 = fixture.stringYak(str2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    public void shouldReturnModifiedStringWhenStringLengthIsGreaterThan3AndReplacement() {

        final String str1 = "yakabc";
        final String str2 = "abcdyakefgh";
        final String str3 = "abcdefghyak";
        final String str4 = "yakyakyak";
        final String str5 = "yakybkyck";

        final String expected1 = "abc";
        final String expected2 = "abcdefgh";
        final String expected3 = "abcdefgh";
        final String expected4 = "";
        final String expected5 = "";

        final String actual1 = fixture.stringYak(str1);
        final String actual2 = fixture.stringYak(str2);
        final String actual3 = fixture.stringYak(str3);
        final String actual4 = fixture.stringYak(str4);
        final String actual5 = fixture.stringYak(str5);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
        assertThat(actual3).isEqualTo(expected3);
        assertThat(actual4).isEqualTo(expected4);
        assertThat(actual5).isEqualTo(expected5);
    }
}
