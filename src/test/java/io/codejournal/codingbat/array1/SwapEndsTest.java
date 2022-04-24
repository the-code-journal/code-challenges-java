package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SwapEndsTest {

    private SwapEnds fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SwapEnds();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3, 4 };

        final int[] expected = new int[] { 4, 2, 3, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 3, 2, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 8, 6, 7, 9, 5 };

        final int[] expected = new int[] { 5, 6, 7, 9, 8 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNullOrEmpty() {

        final int[] nums1 = null;
        final int[] nums2 = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual1 = fixture.swapEnds(nums1);
        final int[] actual2 = fixture.swapEnds(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnSameWhenNumsIsSingleElement() {

        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEndsSwappedWhenNumsIsMultiElement() {

        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 2, 1 };

        final int[] actual = fixture.swapEnds(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
