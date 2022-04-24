package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlusTwoTest {

    private PlusTwo fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PlusTwo();
    }

    @Test
    public void testcase1() {

        final int[] a = new int[] { 1, 2 };
        final int[] b = new int[] { 3, 4 };

        final int[] expected = new int[] { 1, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] a = new int[] { 4, 4 };
        final int[] b = new int[] { 2, 2 };

        final int[] expected = new int[] { 4, 4, 2, 2 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] a = new int[] { 9, 2 };
        final int[] b = new int[] { 3, 4 };

        final int[] expected = new int[] { 9, 2, 3, 4 };

        final int[] actual = fixture.plusTwo(a, b);

        assertThat(actual).isEqualTo(expected);
    }

}
