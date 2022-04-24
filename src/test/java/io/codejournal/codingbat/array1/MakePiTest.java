package io.codejournal.codingbat.array1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MakePiTest {

    private MakePi fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MakePi();
    }

    @Test
    public void testcase1() {

        final int[] expected = new int[] { 3, 1, 4 };

        final int[] actual = fixture.makePi();

        assertThat(actual).isEqualTo(expected);
    }
}
