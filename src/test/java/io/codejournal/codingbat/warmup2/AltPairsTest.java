package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AltPairsTest {

    private AltPairs fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AltPairs();
    }

    @Test
    public void testcase1() {

        final String str = "kitten";

        final String expected = "kien";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String str = "Chocolate";

        final String expected = "Chole";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String str = "CodingHorror";

        final String expected = "Congrr";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsNull() {

        final String str = null;

        final String expected = "";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyStringWhenStringIsEmpty() {

        final String str = "";

        final String expected = "";

        final String actual = fixture.altPairs(str);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameStringWhenStringLengthIsLessThanEqual2() {

        final String str1 = "a";
        final String str2 = "ab";

        final String expected1 = "a";
        final String expected2 = "ab";

        final String actual1 = fixture.altPairs(str1);
        final String actual2 = fixture.altPairs(str2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
