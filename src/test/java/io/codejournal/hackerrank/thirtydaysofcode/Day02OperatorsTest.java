package io.codejournal.hackerrank.thirtydaysofcode;

import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Day02OperatorsTest {

    private ByteArrayOutputStream output;

    private Day02Operators fixture = new Day02Operators();

    @BeforeEach
    public void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    public void defaultCase() {

        Day02Operators.main(null);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("15");
    }

    @Test
    public void solve_PrintsTheCorrectTotalRoundingDown_ForGivenInput() {

        final double mealCost = 10.0;
        final int tipPercent = 1;
        final int taxPercent = 1;

        fixture.solve(mealCost, tipPercent, taxPercent);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("10");
    }

    @Test
    public void solve_PrintsTheCorrectTotalRoundingUp_ForGivenInput() {

        final double mealCost = 10.0;
        final int tipPercent = 5;
        final int taxPercent = 2;

        fixture.solve(mealCost, tipPercent, taxPercent);

        final String actual = output.toString(UTF_8);

        assertThat(actual).contains("11");
    }
}
