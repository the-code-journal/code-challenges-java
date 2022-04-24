package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstLast6Test {

    private FirstLast6 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FirstLast6();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 6 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 6, 1, 2, 3 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 13, 6, 1, 2, 3 };

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumIsNull() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumIsEmpty() {

        final int[] nums = null;

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumHasSingleElement6() {

        final int[] nums = new int[] { 6 };

        final boolean expected = true;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnFalseWhenNumHasSingleElementNon6() {

        final int[] nums = new int[] { 1 };

        final boolean expected = false;

        final boolean actual = fixture.firstLast6(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
