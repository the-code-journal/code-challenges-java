package io.codejournal.hackerrank.thirtydaysofcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

public class Day27TestingTest {

    private Day27Testing fixture = new Day27Testing();

    @Test
    public void minimumIndex_ThrowsException_WhenArrayIsEmpty() {

        final int[] array = new int[] {};

        // @formatter:off
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> fixture.minimumIndex(array))
                .withMessageContaining("Cannot get the minimum value index from an empty sequence");
        // @formatter:on
    }

    @Test
    public void minimumIndex_ReturnsFirstIndex_WhenSingleElementArray() {

        final int[] array = new int[] { 2 };

        final int expected = 0;

        final int actual = fixture.minimumIndex(array);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void minimumIndex_ReturnsMinimumIndex_WhenMultiElementArray() {

        final int[] array = new int[] { 2, 3, 1, 5 };

        final int expected = 2;

        final int actual = fixture.minimumIndex(array);

        assertThat(actual).isEqualTo(expected);
    }
}
