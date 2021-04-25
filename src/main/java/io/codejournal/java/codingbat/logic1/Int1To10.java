package io.codejournal.java.codingbat.logic1;

import java.util.function.Predicate;

public class Int1To10 {

    private static final int LOWER_LIMIT = 1;

    private static final int UPPER_LIMIT = 10;

    public boolean in1To10(final int n, final boolean outsideMode) {

        final Predicate<Integer> process = (outsideMode) ? processExclusiveMode() : processInclusiveMode();

        return process.test(n);
    }

    private Predicate<Integer> processInclusiveMode() {
        return n -> (n >= LOWER_LIMIT && n <= UPPER_LIMIT);
    }

    private Predicate<Integer> processExclusiveMode() {
        return n -> (n <= LOWER_LIMIT || n >= UPPER_LIMIT);
    }
}
