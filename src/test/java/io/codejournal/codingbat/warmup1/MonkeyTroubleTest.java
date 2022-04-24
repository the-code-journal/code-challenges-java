package io.codejournal.codingbat.warmup1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MonkeyTroubleTest {

    private MonkeyTrouble fixture;

    @BeforeEach
    public void setUp() {
        fixture = new MonkeyTrouble();
    }

    @Test
    public void shouldBeInTroubleIfBothAreSmiling() {

        final boolean shouldBeInTrouble = true;

        final boolean monkeyASmiling = true;
        final boolean monkeyBSmiling = true;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    public void shouldBeInTroubleIfBothAreNotSmiling() {

        final boolean shouldBeInTrouble = true;

        final boolean monkeyASmiling = false;
        final boolean monkeyBSmiling = false;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    public void shouldNotBeInTroubleIfASmilingAndBNotSmiling() {

        final boolean shouldBeInTrouble = false;

        final boolean monkeyASmiling = true;
        final boolean monkeyBSmiling = false;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }

    @Test
    public void shouldNotBeInTroubleIfANotSmilingAndASmiling() {

        final boolean shouldBeInTrouble = false;

        final boolean monkeyASmiling = false;
        final boolean monkeyBSmiling = true;

        final boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble).isEqualTo(areWeInTrouble);
    }
}
