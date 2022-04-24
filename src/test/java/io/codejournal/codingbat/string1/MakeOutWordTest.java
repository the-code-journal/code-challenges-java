package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MakeOutWordTest {

    private MakeOutWord fixture;

    @BeforeEach
    public void setUp() {
        this.fixture = new MakeOutWord();
    }

    @Test
    public void testcase1() {

        final String out = "<<>>";
        final String word = "Yay";

        final String expected = "<<Yay>>";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String out = "<<>>";
        final String word = "WooHoo";

        final String expected = "<<WooHoo>>";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String out = "[[]]";
        final String word = "word";

        final String expected = "[[word]]";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenWordIsNull() {

        final String out = "[[]]";
        final String word = null;

        final String expected = "";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenWordIsEmpty() {

        final String out = "[[]]";
        final String word = "";

        final String expected = "";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenOutIsNull() {

        final String out = null;
        final String word = "Yay";

        final String expected = "Yay";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenOutIsEmpty() {

        final String out = "";
        final String word = "Yay";

        final String expected = "Yay";

        final String actual = fixture.makeOutWord(out, word);

        assertThat(actual).isEqualTo(expected);
    }
}
