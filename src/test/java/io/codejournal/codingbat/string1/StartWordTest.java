package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StartWordTest {

    private StartWord fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StartWord();
    }

    @Test
    public void testcase1() {

        final String str = "hippo";
        final String word = "hi";

        final String expected = "hi";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "hippo";
        final String word = "xip";

        final String expected = "hip";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "hippo";
        final String word = "i";

        final String expected = "h";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final String str = "xxxxxxx";
        final String word = "yyyyyyy";

        final String expected = "";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final String str = null;
        final String word = null;

        final String expected = "";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final String str = "";
        final String word = "";

        final String expected = "";

        final String actual = fixture.startWord(str, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenOneIsNullAndOtherIsEmpty() {

        final String str1 = null;
        final String word1 = "";
        final String str2 = "";
        final String word2 = null;

        final String expected = "";

        final String actual1 = fixture.startWord(str1, word1);
        final String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsGreaterThanEqualTo1AndWordIsEmpty() {

        final String str1 = "h";
        final String word1 = "";
        final String str2 = "hh";
        final String word2 = "";

        final String expected = "";

        final String actual1 = fixture.startWord(str1, word1);
        final String actual2 = fixture.startWord(str2, word2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsLessThanWordLength() {

        final String str = "h";
        final String word = "ix";

        final String expected = "";

        final String actual1 = fixture.startWord(str, word);

        assertThat(actual1).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenStrLengthIsEqualToWordLength() {

        final String str = "h";
        final String word = "i";

        final String expected = "h";

        final String actual1 = fixture.startWord(str, word);

        assertThat(actual1).isEqualTo(expected);
    }
}
