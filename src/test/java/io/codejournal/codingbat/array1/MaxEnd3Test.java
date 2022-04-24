package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxEnd3Test {

    private MaxEnd3 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MaxEnd3();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 3, 3, 3 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 11, 5, 9 };

        final int[] expected = new int[] { 11, 11, 11 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 2, 11, 3 };

        final int[] expected = new int[] { 3, 3, 3 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumIsNull() {

        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumIsEmpty() {

        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumIsSingleElement() {

        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.maxEnd3(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
