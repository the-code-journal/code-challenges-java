package io.codejournal.codingbat.warmup2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NoTriplesTest {

    private NoTriples fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NoTriples();
    }

    @Test
    public void testcase1() {

        final int[] nums = { 1, 1, 2, 2, 1 };

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = { 1, 1, 2, 2, 2, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = { 1, 1, 1, 2, 2, 2, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumIsNull() {

        final int[] nums = null;

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumIsEmpty() {

        final int[] nums = {};

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumsHasLessThan3Elements() {

        final int[] nums = { 1, 1 };

        final boolean expected = true;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnTrueWhenNumsHas3Elements() {

        final int[] nums = { 1, 1, 1 };

        final boolean expected = false;

        final boolean actual = fixture.noTriples(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
