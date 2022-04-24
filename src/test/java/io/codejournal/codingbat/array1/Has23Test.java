package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Has23Test {

    private Has23 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Has23();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 2, 5 };

        final boolean expected = true;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 4, 3 };

        final boolean expected = true;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 4, 5 };

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumIsEmpty() {

        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumIsSingleElementAndHas2Or3() {

        final int[] nums1 = new int[] { 2 };
        final int[] nums2 = new int[] { 3 };

        final boolean expected = true;

        final boolean actual1 = fixture.has23(nums1);
        final boolean actual2 = fixture.has23(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumIsSingleElementAndDoesntHave2Or3() {

        final int[] nums = new int[] { 4 };

        final boolean expected = false;

        final boolean actual = fixture.has23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
