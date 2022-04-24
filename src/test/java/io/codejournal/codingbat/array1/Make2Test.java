package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Make2Test {

    private Make2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Make2();
    }

    @Test
    public void testcase1() {

        final int[] a = new int[] { 4, 5 };
        final int[] b = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 4, 5 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] a = new int[] { 4 };
        final int[] b = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 4, 1 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] a = new int[] {};
        final int[] b = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.make2(a, b);

        assertThat(actual).isEqualTo(expected);
    }
}
