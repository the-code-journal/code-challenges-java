package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SameFirstLastTest {

    private SameFirstLast fixture;

    @BeforeEach
    public void setUp() {
        fixture = new SameFirstLast();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 1, 2, 3, 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 1, 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {

        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumsIsSingleElement() {

        final int[] nums = new int[] { 1 };

        final boolean expected = true;

        final boolean actual = fixture.sameFirstLast(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
