package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleWayTest {

    private MiddleWay fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MiddleWay();
    }

    @Test
    public void testcase1() {

        final int[] a = new int[] { 1, 2, 3 };
        final int[] b = new int[] { 4, 5, 6 };

        final int[] expected = new int[] { 2, 5 };

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] a = new int[] { 7, 7, 7 };
        final int[] b = new int[] { 3, 8, 0 };

        final int[] expected = new int[] { 7, 8 };

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] a = new int[] { 5, 2, 9 };
        final int[] b = new int[] { 1, 4, 5 };

        final int[] expected = new int[] { 2, 4 };

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreNull() {

        final int[] a = null;
        final int[] b = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenBothAreEmpty() {

        final int[] a = new int[] {};
        final int[] b = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenOneIsEmptyAndOtherIsNull() {

        final int[] a1 = null;
        final int[] b1 = new int[] {};

        final int[] a2 = new int[] {};
        final int[] b2 = null;

        final int[] expected = new int[] {};

        final int[] actual1 = fixture.middleWay(a1, b1);
        final int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldThrowExceptionWhenBothAreInvalidLengths1() {

        final int[] a = new int[] { 2, 4 };
        final int[] b = new int[] { 1, 2, 3, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    public void shouldThrowExceptionWhenBothAreInvalidLengths2() {

        final int[] a = new int[] { 1, 2, 3, 4 };
        final int[] b = new int[] { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    public void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength1() {

        final int[] a = new int[] { 1 };
        final int[] b = new int[] { 2, 4 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    public void shouldThrowExceptionWhenOneIsValidAndOtherIsInvalidLength2() {

        final int[] a = new int[] { 2, 4 };
        final int[] b = new int[] { 1 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.middleWay(a, b));
    }

    @Test
    public void shouldReturnValidArrayWhenBothAreValidAndSingleLength() {

        final int[] a = new int[] { 1 };
        final int[] b = new int[] { 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnValidArrayWhenBothAreValidAndMultipleLength() {

        final int[] a = new int[] { 1, 2, 3 };
        final int[] b = new int[] { 1, 2, 3, 4, 5 };

        final int[] expected = new int[] { 2, 3 };

        final int[] actual = fixture.middleWay(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnValidArrayWhenOneIsEmptyAndOtherIsValidLength() {

        final int[] a1 = new int[] { 1 };
        final int[] b1 = new int[] {};

        final int[] a2 = new int[] {};
        final int[] b2 = new int[] { 1, 2, 3 };

        final int[] expected1 = new int[] { 1 };
        final int[] expected2 = new int[] { 2 };

        final int[] actual1 = fixture.middleWay(a1, b1);
        final int[] actual2 = fixture.middleWay(a2, b2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
