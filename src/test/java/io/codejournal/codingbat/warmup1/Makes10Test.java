package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Makes10Test {

    private Makes10 fixture;

    @BeforeEach
    public void setUp() {
        fixture = new Makes10();
    }

    @Test
    public void shouldReturnTrueWhenFirstNumberIs10() {

        final boolean shouldMake10 = true;

        final int a = 10;
        final int b = 20;

        final boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    public void shouldReturnTrueWhenSecondNumberIs10() {

        final boolean shouldMake10 = true;

        final int a = 20;
        final int b = 10;

        final boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    public void shouldReturnTrueWhenSumIs10() {

        final boolean shouldMake10 = true;

        final int a = 7;
        final int b = 3;

        final boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }

    @Test
    public void shouldReturnFalseWhenOtherwise() {

        final boolean shouldMake10 = false;

        final int a = 11;
        final int b = 9;

        final boolean isMakes10 = fixture.makes10(a, b);

        assertThat(isMakes10).isEqualTo(shouldMake10);
    }
}
