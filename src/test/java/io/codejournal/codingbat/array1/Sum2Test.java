package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Sum2Test {

    private Sum2 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Sum2();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 1, 1 };

        final int expected = 2;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 1, 1, 1, 1 };

        final int expected = 2;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnZeroWhenNumIsNull() {

        final int[] nums = null;

        final int expected = 0;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnZeroWhenNumIsEmpty() {

        final int[] nums = new int[] {};

        final int expected = 0;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSumWhenNumIsSingleElement() {

        final int[] nums = new int[] { 1 };

        final int expected = 1;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSumWhenNumIsMultipleElement() {

        final int[] nums = new int[] { 1, 2 };

        final int expected = 3;

        final int actual = fixture.sum2(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
