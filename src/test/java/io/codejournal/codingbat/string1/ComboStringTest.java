package io.codejournal.codingbat.string1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComboStringTest {

    private ComboString fixture;

    @BeforeEach
    public void setUp() {
        fixture = new ComboString();
    }

    @Test
    public void testcase1() {

        final String strA = "Hello";
        final String strB = "hi";

        final String expected = "hiHellohi";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String strA = "hi";
        final String strB = "Hello";

        final String expected = "hiHellohi";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String strA = "aaa";
        final String strB = "b";

        final String expected = "baaab";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreNull() {

        final String strA = null;
        final String strB = null;

        final String expected = "";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothAreEmpty() {

        final String strA = "";
        final String strB = "";

        final String expected = "";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenBothOneIsEmptyAndOtherIsNull() {

        final String strA1 = "";
        final String strA2 = null;
        final String strB1 = null;
        final String strB2 = "";

        final String expected = "";

        final String actual1 = fixture.comboString(strA1, strB1);
        final String actual2 = fixture.comboString(strA2, strB2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final String strA = "a";
        final String strB = "b";

        final String expected = "aba";

        final String actual = fixture.comboString(strA, strB);

        assertThat(actual).isEqualTo(expected);
    }
}
