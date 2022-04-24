package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringMatchTest {

    private StringMatch fixture;

    @BeforeEach
    public void setUp() {
        fixture = new StringMatch();
    }

    @Test
    public void testcase1() {

        final String a = "xxcaazz";
        final String b = "xxbaaz";

        final int expectedCount = 3;

        final int actualCount = fixture.stringMatch(a, b);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    public void testcase2() {

        final String a = "abc";
        final String b = "abc";

        final int expectedCount = 2;

        final int actualCount = fixture.stringMatch(a, b);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    public void testcase3() {

        final String a = "abc";
        final String b = "axc";

        final int expectedCount = 0;

        final int actualCount = fixture.stringMatch(a, b);

        assertThat(actualCount).isEqualTo(expectedCount);

    }

    @Test
    public void shouldReturnZeroWhenStringIsNull() {

        final String A1 = null;
        final String B1 = "abc";

        final String A2 = "abc";
        final String B2 = null;

        final String A3 = null;
        final String B3 = null;

        final int expectedCount = 0;

        final int actualCount1 = fixture.stringMatch(A1, B1);
        final int actualCount2 = fixture.stringMatch(A2, B2);
        final int actualCount3 = fixture.stringMatch(A3, B3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }

    @Test
    public void shouldReturnZeroWhenStringIsEmpty() {

        final String A1 = "";
        final String B1 = "abc";

        final String A2 = "abc";
        final String B2 = "";

        final String A3 = "";
        final String B3 = "";

        final int expectedCount = 0;

        final int actualCount1 = fixture.stringMatch(A1, B1);
        final int actualCount2 = fixture.stringMatch(A2, B2);
        final int actualCount3 = fixture.stringMatch(A3, B3);

        assertThat(actualCount1).isEqualTo(expectedCount);
        assertThat(actualCount2).isEqualTo(expectedCount);
        assertThat(actualCount3).isEqualTo(expectedCount);
    }
}
