package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Double23Test {

    private Double23 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Double23();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 2, 2 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 3, 3 };

        final boolean expected = true;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {

        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsSingleElementAndNot2Or3() {

        final int[] nums = new int[] { 5 };

        final boolean expected = false;

        final boolean actual = fixture.double23(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
