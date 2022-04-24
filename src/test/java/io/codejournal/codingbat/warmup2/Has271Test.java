package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Has271Test {

    private Has271 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Has271();
    }

    @Test
    public void testcase1() {

        final int[] nums = { 1, 2, 7, 1 };

        final boolean expected = true;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = { 1, 2, 8, 1 };

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = { 2, 7, 1 };

        final boolean expected = true;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final int[] nums = { 1, 2, 7, 5 };

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenArrayIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenArrayIsEmpty() {

        final int[] nums = {};

        final boolean expected = false;

        final boolean actual = fixture.has271(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenArrayLengthIsLessThanEqualTo2() {

        final int[] nums1 = { 1 };
        final int[] nums2 = { 1, 2 };

        final boolean expected = false;

        final boolean actual1 = fixture.has271(nums1);
        final boolean actual2 = fixture.has271(nums2);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
