package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzString2Test {

    private FizzString2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FizzString2();
    }

    @Test
    public void testcase1() {

        final int num = 1;

        final String expected = "1!";

        final String actual = fixture.fizzString2(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int num = 2;

        final String expected = "2!";

        final String actual = fixture.fizzString2(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int num = 3;

        final String expected = "Fizz!";

        final String actual = fixture.fizzString2(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int num = 5;

        final String expected = "Buzz!";

        final String actual = fixture.fizzString2(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase5() {

        final int num = 15;

        final String expected = "FizzBuzz!";

        final String actual = fixture.fizzString2(num);

        assertThat(actual).isEqualTo(expected);
    }
}
