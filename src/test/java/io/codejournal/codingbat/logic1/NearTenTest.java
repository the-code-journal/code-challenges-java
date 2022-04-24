package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NearTenTest {

    private NearTen fixture;

    @BeforeEach
    public void setUp() {
        fixture = new NearTen();
    }

    @Test
    public void testcase1() {

        final int num = 12;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final int num = 17;

        final boolean expected = false;

        final boolean actual = fixture.nearTen(num);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final int num = 19;

        final boolean expected = true;

        final boolean actual = fixture.nearTen(num);

        assertThat(actual).isEqualTo(expected);
    }
}
