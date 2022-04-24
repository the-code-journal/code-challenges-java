package io.codejournal.codingbat.logic1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnswerCellTest {

    private AnswerCell fixture;

    @BeforeEach
    public void setUp() {
        fixture = new AnswerCell();
    }

    @Test
    public void testcase1() {

        final boolean isMorning = false;
        final boolean isMom = false;
        final boolean isAsleep = false;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase2() {

        final boolean isMorning = false;
        final boolean isMom = false;
        final boolean isAsleep = true;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase3() {

        final boolean isMorning = true;
        final boolean isMom = false;
        final boolean isAsleep = false;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testcase4() {

        final boolean isMorning = true;
        final boolean isMom = true;
        final boolean isAsleep = false;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual).isEqualTo(expected);
    }
}
