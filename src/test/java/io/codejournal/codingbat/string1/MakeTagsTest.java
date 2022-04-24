package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MakeTagsTest {

    private MakeTags fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MakeTags();
    }

    @Test
    public void testcase1() {

        final String tag = "i";
        final String word = "Yay";

        final String expected = "<i>Yay</i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String tag = "i";
        final String word = "Hello";

        final String expected = "<i>Hello</i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String tag = "cite";
        final String word = "Yay";

        final String expected = "<cite>Yay</cite>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final String tag = null;
        final String word = null;

        final String expected = "";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final String tag = null;
        final String word = null;

        final String expected = "";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNullAndWordIsNotNull() {

        final String tag = null;
        final String word = "Hi";

        final String expected = "";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenTagIsEmptyAndWordIsNotNull() {

        final String tag = "";
        final String word = "Hi";

        final String expected = "";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNotEmptyAndWordIsNull() {

        final String tag = "i";
        final String word = null;

        final String expected = "<i></i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenTagIsNotEmptyAndWordIsEmpty() {

        final String tag = "i";
        final String word = "";

        final String expected = "<i></i>";

        final String actual = fixture.makeTags(tag, word);

        assertThat(actual).isEqualTo(expected);
    }
}
