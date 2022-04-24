package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Reverse3Test {

    private Reverse3 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Reverse3();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 3, 2, 1 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 5, 11, 9 };

        final int[] expected = new int[] { 9, 11, 5 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 7, 0, 0 };

        final int[] expected = new int[] { 0, 0, 7 };

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumIsNull() {

        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumIsEmpty() {

        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.reverse3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
