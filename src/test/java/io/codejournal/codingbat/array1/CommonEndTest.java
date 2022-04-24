package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommonEndTest {

    private CommonEnd fixture;

    @BeforeEach
    public void setUp() {
        fixture = new CommonEnd();
    }

    @Test
    public void testcase1() {

        final int[] nums1 = new int[] { 1, 2, 3 };
        final int[] nums2 = new int[] { 7, 3 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums1 = new int[] { 1, 2, 3 };
        final int[] nums2 = new int[] { 7, 3, 2 };

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums1 = new int[] { 1, 2, 3 };
        final int[] nums2 = new int[] { 1, 3 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenBothNull() {

        final int[] nums1 = null;
        final int[] nums2 = null;

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenBothAreEmpty() {

        final int[] nums1 = new int[] {};
        final int[] nums2 = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenOneIsNullAndOtherIsEmpty() {

        final int[] nums1_1 = null;
        final int[] nums2_1 = new int[] {};

        final int[] nums1_2 = new int[] {};
        final int[] nums2_2 = null;

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        final boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    public void shouldReturnTrueWhenBothAreSingleElementAndSameValue() {

        final int[] nums1 = new int[] { 1 };
        final int[] nums2 = new int[] { 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenBothAreSingleElementAndNotSameValue() {

        final int[] nums1 = new int[] { 1 };
        final int[] nums2 = new int[] { 2 };

        final boolean expected = false;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenEndsAreSameValue() {

        final int[] nums1 = new int[] { 1, 1 };
        final int[] nums2 = new int[] { 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenFirstAreSameValue() {

        final int[] nums1 = new int[] { 1, 2 };
        final int[] nums2 = new int[] { 1, 1 };

        final boolean expected = true;

        final boolean actual = fixture.commonEnd(nums1, nums2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenFirstAndLastAreSame() {

        final int[] nums1_1 = new int[] { 1, 2 };
        final int[] nums2_1 = new int[] { 3, 1 };

        final int[] nums1_2 = new int[] { 2, 1 };
        final int[] nums2_2 = new int[] { 1, 3 };

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        final boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }

    @Test
    public void shouldReturnFalseWhenOneIsEmptyAndOtherIsNot() {

        final int[] nums1_1 = new int[] {};
        final int[] nums2_1 = new int[] { 3, 1 };

        final int[] nums1_2 = new int[] { 2, 1 };
        final int[] nums2_2 = new int[] {};

        final boolean expected1 = false;
        final boolean expected2 = false;

        final boolean actual1 = fixture.commonEnd(nums1_1, nums2_1);
        final boolean actual2 = fixture.commonEnd(nums1_2, nums2_2);

        assertThat(actual1).isEqualTo(expected1);
        assertThat(actual2).isEqualTo(expected2);
    }
}
