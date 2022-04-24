package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxTripleTest {

    private MaxTriple fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MaxTriple();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int expected = 3;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 1, 5, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 5, 2, 3 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldThrowExceptionWhenNull() {

        final int[] nums = null;

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    public void shouldThrowExceptionWhenEmpty() {

        final int[] nums = new int[] {};

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    public void shouldThrowExceptionWhenEvenLength() {

        final int[] nums = new int[] { 5, 2 };

        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.maxTriple(nums));
    }

    @Test
    public void shouldReturnSameWhenSingleElement() {

        final int[] nums = new int[] { 5 };

        final int expected = 5;

        final int actual = fixture.maxTriple(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
