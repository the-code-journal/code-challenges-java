package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Unlucky1Test {

    private Unlucky1 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Unlucky1();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 2, 1, 3, 4, 5 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 1, 1, 1 };

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsIsEmpty() {

        final int[] nums = new int[] {};

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumsLengthIsOne() {

        final int[] nums = new int[] { 1 };

        final boolean expected = false;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumsLengthIsGreaterThan2AndUnluck1AtLastPosition() {

        final int[] nums = new int[] { 1, 2, 3, 1, 3 };

        final boolean expected = true;

        final boolean actual1 = fixture.unlucky1(nums);
        final boolean actual2 = fixture.unlucky1NonPredicate(nums);

        assertThat(actual1).isEqualTo(expected);
        assertThat(actual2).isEqualTo(expected);
    }
}
