package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BiggerTwoTest {

    private BiggerTwo fixture;

    @BeforeEach
    public void setUp() {
        fixture = new BiggerTwo();
    }

    @Test
    public void testcase1() {

        final int[] a = new int[] { 1, 2 };
        final int[] b = new int[] { 3, 4 };

        final int[] expected = new int[] { 3, 4 };

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] a = new int[] { 3, 4 };
        final int[] b = new int[] { 1, 2 };

        final int[] expected = new int[] { 3, 4 };

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] a = new int[] { 1, 1 };
        final int[] b = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final int[] a = null;
        final int[] b = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final int[] a = new int[] {};
        final int[] b = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenOneIsNullAndOtherIsEmpty() {

        final int[] a1 = null;
        final int[] b1 = new int[] {};

        final int[] a2 = new int[] {};
        final int[] b2 = null;

        final int[] expected = new int[] {};

        final int[] actual1 = fixture.biggerTwo(a1, b1);
        final int[] actual2 = fixture.biggerTwo(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnNonEmptyWhenOneIsEmptyAndOtherIsNotEmpty() {

        final int[] a1 = new int[] { 1 };
        final int[] b1 = new int[] {};

        final int[] a2 = new int[] {};
        final int[] b2 = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual1 = fixture.biggerTwo(a1, b1);
        final int[] actual2 = fixture.biggerTwo(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnAWhenSumIsSame() {

        final int[] a = new int[] { 1, 1 };
        final int[] b = new int[] { 2, 0 };

        final int[] expected = new int[] { 1, 1 };

        final int[] actual = fixture.biggerTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
