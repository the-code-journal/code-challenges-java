package io.codejournal.codingbat.logic1;

public class AnswerCell {

    public boolean answerCell(final boolean isMorning, final boolean isMom, final boolean isAsleep) {

        if (isAsleep) {
            return false;
        } else if (isMorning && !isMom) {
            return false;
        }

        return true;
    }
}
