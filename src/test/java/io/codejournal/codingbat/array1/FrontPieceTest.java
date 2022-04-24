package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FrontPieceTest {

    private FrontPiece fixture;

    @BeforeEach
    public void setUp() {
        fixture = new FrontPiece();
    }

    @Test
    public void testcase1() {

        final int[] nums = new int[] { 1, 2, 3 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int[] nums = new int[] { 1, 2 };

        final int[] expected = new int[] { 1, 2 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int[] nums = new int[] { 1 };

        final int[] expected = new int[] { 1 };

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsNull() {

        final int[] nums = null;

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void shouldReturnEmptyWhenNumsIsEmpty() {

        final int[] nums = new int[] {};

        final int[] expected = new int[] {};

        final int[] actual = fixture.frontPiece(nums);

        assertThat(actual).isEqualTo(expected);
    }
}
