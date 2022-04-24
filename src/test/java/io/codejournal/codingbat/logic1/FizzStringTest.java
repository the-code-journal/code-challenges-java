package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzStringTest {

    private FizzString fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FizzString();
    }

    @Test
    public void testcase1() {

        final String string1 = "fig";
        final String string2 = "Fig";

        final String expected = "Fizz";

        final String actual1 = fixture.fizzString(string1);
        final String actual2 = fixture.fizzString(string2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final String string1 = "dib";
        final String string2 = "diB";

        final String expected = "Buzz";

        final String actual1 = fixture.fizzString(string1);
        final String actual2 = fixture.fizzString(string2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final String string1 = "fib";
        final String string2 = "fiB";
        final String string3 = "Fib";
        final String string4 = "FiB";

        final String expected = "FizzBuzz";

        final String actual1 = fixture.fizzString(string1);
        final String actual2 = fixture.fizzString(string2);
        final String actual3 = fixture.fizzString(string3);
        final String actual4 = fixture.fizzString(string4);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
        assertThat(actual3).isEqualTo(expected);
        assertThat(actual4).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final String string1 = "";
        final String string2 = null;

        final String expected = "";

        final String actual1 = fixture.fizzString(string1);
        final String actual2 = fixture.fizzString(string2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final String string = "a";

        final String expected = "a";

        final String actual = fixture.fizzString(string);

        assertThat(actual).isEqualTo(expected);
    }
}
