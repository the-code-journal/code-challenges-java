package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Max1020Test {

    private Max1020 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Max1020();
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsLessThan10AndBIsLessThan10() {

        final int a = 9;
        final int b = 9;

        final int expected = 0;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo10() {

        final int a = 9;
        final int b = 10;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan10() {

        final int a = 9;
        final int b = 19;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsEqualTo20() {

        final int a = 9;
        final int b = 20;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsLessThan10AndBIsGreaterThan20() {

        final int a = 9;
        final int b = 21;

        final int expected = 0;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsLessThan10() {

        final int a = 10;
        final int b = 9;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo10() {

        final int a = 10;
        final int b = 10;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsGreaterThan10() {

        final int a = 10;
        final int b = 19;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo10AndBIsEqualTo20() {

        final int a = 10;
        final int b = 20;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo10AndBIsGreaterThan20() {

        final int a = 10;
        final int b = 21;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsLessThan10() {

        final int a = 19;
        final int b = 9;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsEqualTo10() {

        final int a = 19;
        final int b = 10;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsGreaterThan10() {

        final int a = 19;
        final int b = 19;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan10AndBIsEqualTo20() {

        final int a = 19;
        final int b = 20;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsGreaterThan10AndBIsGreaterThan20() {

        final int a = 19;
        final int b = 21;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsLessThan10() {

        final int a = 20;
        final int b = 9;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsEqualTo10() {

        final int a = 20;
        final int b = 10;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsGreaterThan10() {

        final int a = 20;
        final int b = 19;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsEqualTo20AndBIsEqualTo20() {

        final int a = 20;
        final int b = 20;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsAWhenAIsEqualTo20AndBIsGreaterThan20() {

        final int a = 20;
        final int b = 21;

        final int expected = a;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsLessThan10() {

        final int a = 21;
        final int b = 9;

        final int expected = 0;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo10() {

        final int a = 21;
        final int b = 10;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsGreaterThan10() {

        final int a = 21;
        final int b = 19;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAsBWhenAIsGreaterThan20AndBIsEqualTo20() {

        final int a = 21;
        final int b = 20;

        final int expected = b;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnMaxAs0WhenAIsGreaterThan20AndBIsGreaterThan20() {

        final int a = 21;
        final int b = 21;

        final int expected = 0;

        final int actual = fixture.max1020(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
